package me.xiaoyuu.myspringcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class DeptControllerConsumer {

    @Autowired
    private RestTemplate restTemplate;
}
