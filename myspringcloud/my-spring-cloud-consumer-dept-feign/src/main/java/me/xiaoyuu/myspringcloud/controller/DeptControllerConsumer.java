package me.xiaoyuu.myspringcloud.controller;

import me.xiaoyuu.myspringcloud.service.DeptClientService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DeptControllerConsumer {

    @Resource
    DeptClientService deptClientService;
}
