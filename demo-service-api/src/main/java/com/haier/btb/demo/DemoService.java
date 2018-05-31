package com.haier.btb.demo;

import com.haier.btb.demo.domain.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Title: API示例
 * Author: interconn
 * Mailto:interx@haier.com
 * On: 2017-12-18  9:51
 */
public interface DemoService {

    @RequestMapping(value = "/hello")
    String sayHello(Map<String, Object> map);

    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String createUser(@RequestBody User user);
}
