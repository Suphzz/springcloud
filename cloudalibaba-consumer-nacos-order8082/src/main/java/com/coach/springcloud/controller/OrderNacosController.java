package com.coach.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author superhzh
 * @version 1.0
 * @date 2020/4/28 21:37
 */
@RestController
@Slf4j
public class OrderNacosController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "coach/comsumer/nacos/{id}")
    public String coach(@PathVariable("id") Long id){

        return restTemplate.getForObject(serverURL+"/coach/nacos/"+id,String.class);
    }

    @GetMapping(value = "coach")
    public String test(){

        return "yes";
    }

}
