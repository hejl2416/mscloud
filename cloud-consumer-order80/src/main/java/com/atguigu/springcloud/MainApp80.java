package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: hjle
 * @Date: 2021/09/09/10:26
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class MainApp80
{
    public static void main(String[] args)
    {
        SpringApplication.run(MainApp80.class,args);
    }
}
