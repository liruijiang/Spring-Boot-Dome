package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-5-19.
 */
@RestController
public class UserController {
    @Autowired
    ConfigBean ConfigBean;

    @RequestMapping(method = RequestMethod.POST)
    public String say(){
        return ConfigBean.getName()+ConfigBean.getWant();
    }
}
