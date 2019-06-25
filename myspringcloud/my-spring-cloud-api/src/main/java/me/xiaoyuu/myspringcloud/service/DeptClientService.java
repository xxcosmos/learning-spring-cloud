package me.xiaoyuu.myspringcloud.service;

import me.xiaoyuu.myspringcloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "MYSPRINGCLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {


    @PostMapping("/dept/add")
    public boolean add(Dept dept);
}
