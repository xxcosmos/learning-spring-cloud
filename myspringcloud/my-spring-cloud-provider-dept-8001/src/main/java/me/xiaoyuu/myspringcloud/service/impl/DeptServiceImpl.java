package me.xiaoyuu.myspringcloud.service.impl;

import me.xiaoyuu.myspringcloud.dao.DeptDao;
import me.xiaoyuu.myspringcloud.entity.Dept;
import me.xiaoyuu.myspringcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }
}
