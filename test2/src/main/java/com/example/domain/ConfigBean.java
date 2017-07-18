package com.example.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author lrj on 2017-6-22.
 */
//通过ConfigurationProperties加载properties文件中的配置,通过prefix属性指定peoperties的配置的前缀,通过
@Configuration
@ConfigurationProperties(prefix = "com.lrj")
public class ConfigBean {
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
