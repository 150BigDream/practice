package com.example.emis08.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.emis08.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper extends BaseMapper<Student> {
    @Select("select * from student where xh=#{xh}")
    @Results({
            @Result(column = "dno" ,property = "dno"),
            @Result(property = "dep",column = "dno",one=@One(select = "com.example.emis08.mapper.DepMapper.selectById"))
    })
    public Student selectByXh(@Param("xh")String xh);

    @Select("select * from student where xh=#{xh} and password=#{password}")
    @Results({
            @Result(column = "dno" ,property = "dno"),
            @Result(property = "dep",column = "dno",one=@One(select = "com.example.emis08.mapper.DepMapper.selectById"))
    })
    public Student selectStudent(@Param("xh")String xh,@Param("password")String password);


}
