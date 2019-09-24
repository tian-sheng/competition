package com.ipdp.bond.serviceprovider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiceApplication {
    private final static Logger logger = LoggerFactory.getLogger(ProductServiceApplication.class);
    public static void main(String[] args) {
        logger.info("产品微服务开始注册");
        SpringApplication.run(ProductServiceApplication.class, args);
        logger.info("产品微服务注册成功!!");
    }

}
