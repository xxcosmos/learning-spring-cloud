package me.xiaoyuu.myspringcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import me.xiaoyuu.myspringcloud.entity.Dept;
import me.xiaoyuu.myspringcloud.service.DeptService;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processGet")
    public Dept get(@PathVariable("id") int id) {
        Dept dept = deptService.get(id);

        if (dept == null) {
            throw new RuntimeException("id" + id + "没有信息");
        }
        return dept;
    }

    public Dept processGet(@PathVariable("id") int id) {
        return new Dept();
    }
}
