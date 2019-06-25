package me.xiaoyuu.myspringcloud.service;

import me.xiaoyuu.myspringcloud.entity.Dept;

public interface DeptService {
    boolean add(Dept dept);

    Dept get(int id);
}
