package com.oldquan.eurekaserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : zhanyang.quan
 * @description :
 * @create : 2019/8/14  15:48
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringbootApplicationEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplicationEurekaServer.class, args);
    }
}
