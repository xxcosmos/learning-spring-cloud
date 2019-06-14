package myspringcloud.controller;

import me.xiaoyuu.myspringcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class DeptControllerConsumer {

    @Resource
    DeptClientService deptClientService;
}
