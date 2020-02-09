package com.example.emis08.mapper;

import com.example.emis08.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;
    @Test
    public void selectById(){
        Student student=studentMapper.selectById("1707310321");
        System.out.println(student.getXm());
    }//dep字段不匹配，涉及到外键的类要自己写

    @Test
    public void selectByXh() {
        Student student=studentMapper.selectByXh("1707310321");
        System.out.println(student.getXm());
    }

    @Test
    public void selectStudent(){//测试得多对一的一的dep总是为null，测试的depmapper selectById是null
        Student student=studentMapper.selectStudent("1707310321","123");
        System.out.println(student.getDep().getDno());
    }

    @Test
    public void test01(){
        Student student=studentMapper.selectById("1707310321");
        System.out.println(student.getDno());
    }
}