package com.jianglei.mapper;

import com.jianglei.BaseTest;
import com.jianglei.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by jianglei on 17-3-2.
 */
public class UserMapperTest extends BaseTest{
    @Resource
    UserMapper userMapper;

    @Test
    public void test(){
        User user = userMapper.getUser("jianglei");
        System.out.println(user.getName()+"  "+user.getAge());
    }
}
