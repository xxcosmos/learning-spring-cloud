package me.xiaoyuu.myspringcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {
    private Long deptNo;
    private String dname;
    private String dbSource;

}

