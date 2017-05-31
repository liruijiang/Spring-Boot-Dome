package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2017-5-19.
 */
@ConfigurationProperties(prefix = "com.lrj")
public class ConfigBean {
    private String name;
    private String want;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
