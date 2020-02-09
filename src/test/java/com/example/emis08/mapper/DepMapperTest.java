package com.example.emis08.mapper;

import com.example.emis08.entity.Dep;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepMapperTest {
    @Autowired
    DepMapper depMapper;

    @Test
    public void testDep(){
        Dep dep=depMapper.selectById("1001");
        System.out.println(dep.getDno());
    }
}