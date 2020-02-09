package com.example.emis08.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("teacher")
public class Teacher {
    @TableId
    String gh;
    String xm;
    String password;
    String xb;
    String zc;
    Date csrq;
    Integer jbgz;
    String dno;
    Dep dep;
}
