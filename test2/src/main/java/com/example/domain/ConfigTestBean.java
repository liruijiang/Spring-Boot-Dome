package com.example.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author lrj on 2017-6-22.
 */
//使用Configuration配合PropertySource指定Properties资源的位置
@Configuration
@ConfigurationProperties(prefix = "com.lrj")
@PropertySource("classpath:test.properties")
public class ConfigTestBean {
    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
