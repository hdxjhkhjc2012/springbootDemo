package com.haier.btb.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.haier.btb.demo.mapper.AreaMapper;
import com.haier.btb.demo.model.Area;
import com.haier.btb.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Title: 本地Service示例
 * Author: interconn
 * Mailto:interx@haier.com
 * On: 2017-12-18  9:51
 */
@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Value("${user.area}")
    private String area;
    @Autowired
    private AreaMapper areaMapper;

    @Override
    public String getUserInfo(String userName) {
        logger.info("Hi {}", userName);
        PageHelper.startPage(0, 8);
        // 获取
        List<Area> a =  areaMapper.selectByPage();
        return "hah";
    }
}
