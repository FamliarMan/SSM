package com.jianglei.service;

import com.jianglei.mapper.UserMapper;
import com.jianglei.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by jianglei on 17-2-25.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userDao;

    public User getUserByName(String name) {
        return userDao.getUser(name);
    }
}
