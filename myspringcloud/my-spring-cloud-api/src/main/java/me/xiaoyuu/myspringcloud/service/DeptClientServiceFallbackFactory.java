package me.xiaoyuu.myspringcloud.service;

import feign.hystrix.FallbackFactory;
import me.xiaoyuu.myspringcloud.entity.Dept;
import org.springframework.stereotype.Component;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
