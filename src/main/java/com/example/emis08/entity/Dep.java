package com.example.emis08.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("dep")
public class Dep {
    @TableId
    String dno;
    String dhead;
    String dname;
    Integer dpn;
}
