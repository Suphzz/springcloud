package com.coach.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author superhzh
 * @version 1.0
 * @date 2020/4/28 16:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class nacosClientMain8081 {
    public static void main(String[] args) {
        SpringApplication.run(nacosClientMain8081.class);
    }
}
