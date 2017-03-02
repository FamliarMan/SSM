package com.jianglei.service;

import com.jianglei.BaseTest;
import com.jianglei.entity.User;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by jianglei on 17-3-2.
 */
public class UserServiceTest extends BaseTest{
    @Resource
    private  UserService userService;
    @Test
    public void getUserByName() throws Exception {

        User user = userService.getUserByName("jianglei");
        System.out.println(user.getName()+"  "+user.getAge());

    }

}