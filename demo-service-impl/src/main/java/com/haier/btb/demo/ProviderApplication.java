package com.haier.btb.demo;

import com.haier.interconn.boot.mybatis.mysql.MyBatisConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Import;
@Import({MyBatisConfig.class})
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.haier.btb.demo.mapper")
public class ProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderApplication.class).web(true).run(args);
    }

}
