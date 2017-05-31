package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2017-5-19.
 */
@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class Chapter2Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter2Application.class,args);
    }

}
