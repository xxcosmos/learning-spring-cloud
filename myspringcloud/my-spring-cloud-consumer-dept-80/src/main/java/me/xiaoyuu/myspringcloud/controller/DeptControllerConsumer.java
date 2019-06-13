package me.xiaoyuu.myspringcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class DeptControllerConsumer {

    public static final String REST_URL_PREFIX = "http://MYSPRINGCLOUD-DEPT";
    @Resource
    private RestTemplate restTemplate;
}
