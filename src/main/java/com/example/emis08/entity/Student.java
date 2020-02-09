package com.example.emis08.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("student")
public class Student {
    @TableId
    String xh;
    String xm;
    String xb;
    String password;
    Integer nl;
    String dno;//dep的主键
    Dep dep;
}
