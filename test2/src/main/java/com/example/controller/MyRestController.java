package com.example.controller;

import com.example.domain.ConfigBean;
import com.example.domain.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lrj on 2017-6-22.
 */
@RestController
@RequestMapping(value = "/users")
public class MyRestController {

    @Autowired
    ConfigBean configBean;
    @Autowired
    ConfigTestBean configTestBean;

    @RequestMapping(value = "show")
    public String show(){

        return  configBean.getName()+"--"+configBean.getAge()+"||"+configTestBean.getName()+"--"+configTestBean.getAge();
    }

}
