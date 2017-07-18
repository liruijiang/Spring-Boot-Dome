package com.example.thymeleaf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SpringBootWebSecurityConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lrj on 2017-7-17.
 */
@Controller
public class userConntroller {

    @RequestMapping("/login")
    public String login(HttpSession session) {
        return "login";
    }


    @RequestMapping(value = "/loginPost",method = RequestMethod.POST)
    String loginPost(String userName, String password, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        if (!"123456".equals(password)) {
            session.setAttribute("message","密码错误");
            return "login";
        }

        // 设置session
        session.setAttribute("user", userName);

        return "index";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // 移除session
        session.removeAttribute("user");
        return "redirect:/login";
    }


}
