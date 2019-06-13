package me.xiaoyuu.myspringcloud.controller;

import me.xiaoyuu.myspringcloud.entity.Dept;
import me.xiaoyuu.myspringcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DeptController {
    @Resource
    DeptService deptService;
    @Resource
    private DiscoveryClient discoveryClient;
    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }
}
