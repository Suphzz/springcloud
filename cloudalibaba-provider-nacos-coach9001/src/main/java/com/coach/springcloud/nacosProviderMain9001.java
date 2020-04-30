package com.coach.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author superhzh
 * @version 1.0
 * @date 2020/4/28 22:39
 */
@SpringBootApplication
@EnableDiscoveryClient
public class nacosProviderMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(nacosProviderMain9001.class);
    }
}
