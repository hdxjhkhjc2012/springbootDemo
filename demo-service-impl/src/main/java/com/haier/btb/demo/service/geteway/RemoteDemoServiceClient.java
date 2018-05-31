package com.haier.btb.demo.service.geteway;

import com.haier.btb.demo.DemoService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Title: 远程API声明示例
 * Author: interconn
 * Mailto:interx@haier.com
 * On: 2017-12-18  9:51
 */

@FeignClient(name = "${remoteservice.name}", url = "${remoteservice.url}")
public interface RemoteDemoServiceClient /*extends RemoteService*/ {//这里的RemoteService应该是其他微服务的API

}
