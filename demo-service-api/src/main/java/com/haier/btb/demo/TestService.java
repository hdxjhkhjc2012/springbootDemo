package com.haier.btb.demo;

import com.haier.btb.demo.domain.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @Created by wx on 2018/5/30.
 * @description:.
 */
public interface TestService {
    @RequestMapping(value = "/test")
    String sayHello(Map<String, Object> map);

    @RequestMapping(value = "/testPost", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String createUser(@RequestBody User user);
}
