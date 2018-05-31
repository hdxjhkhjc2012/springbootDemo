package com.haier.btb.demo.controller;

import com.haier.btb.demo.TestService;
import com.haier.btb.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Map;

/**
 * @Created by wx on 2018/5/30.
 * @description:.
 */
@Controller
public class TestController implements TestService {
    @Override
    public String sayHello(Map<String, Object> map) {
        System.out.print(1111111);
        File f = new File("a.txt");
        try {
            OutputStream fop = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 构建FileOutputStream对象,文件不存在会自动新建
        return "/test/test";
    }

    @Override
    public String createUser(@RequestBody User user) {
        return null;
    }
}
