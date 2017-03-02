package com.jianglei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jianglei on 17-2-24.
 */
@Controller
@RequestMapping("/hello")
public class Hello {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public void index(HttpServletRequest request, HttpServletResponse response){

    //    User user = userService.getUserByName("jianglei");

        try {
            //response.getWriter().write(user.getName()+"  "+user.getAge());
            response.getWriter().write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
