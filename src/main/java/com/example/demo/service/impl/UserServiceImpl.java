package com.example.demo.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public int addUser(User user) {
        if (!StringUtils.isEmpty(user.getName())) {
            return userMapper.insert(user);
        }
        return 0;
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAllUser();
    }
}
