package com.haier.btb.demo.controller;

import com.haier.btb.demo.DemoService;
import com.haier.btb.demo.domain.User;
import com.haier.btb.demo.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * Title: API示例
 * Author: interconn
 * Mailto:interx@haier.com
 * On: 2017-12-18  9:51
 */
@Controller
public class DemoController implements DemoService {

    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private UserServiceImpl userService;

    @Override
    public String sayHello(Map<String, Object> map) {
        String userName = userService.getUserInfo("1");
        map.put("userName",userName);
        return "index";
    }

    @Override
    public String createUser(@RequestBody User user) {
        logger.info("user.username {}", user.getUsername());
        logger.info("user.password {}", user.getPassword());
        logger.info("user.id {}", user.getId());
        return "create user :" + user.getUsername() + " success !";
    }
}
