package com.example.emis08.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.emis08.entity.Student;
import com.example.emis08.entity.Teacher;
import org.apache.ibatis.annotations.*;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
    @Select("select * from teacher where gh=#{gh} and password=#{password}")
    @Results({
            @Result(column = "dno" ,property = "dno"),
            @Result(property = "dep",column = "dno",one=@One(select = "com.example.emis08.mapper.DepMapper.selectById"))
    })
    public Student selectTeacher(@Param("gh")String gh, @Param("password")String password);

}
