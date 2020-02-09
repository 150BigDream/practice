package com.example.emis08.Controller;

import com.example.emis08.entity.Student;
import com.example.emis08.entity.Teacher;
import com.example.emis08.mapper.StudentMapper;
import com.example.emis08.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Map<String,Object> map,
                        HttpSession session){
        Student student=studentMapper.selectStudent(username,password);
      //  Teacher teacher =teacherMapper.selectTeacher(username,password);
        //TODO 不是重定向路径就是/user/login，返回到login，信息是有了，但是样式不对，如果重定向就没有携带字
//        System.out.println(student.getXh());
        if (student==null){
            map.put("msg","用户名密码错误");
            return "redirect:/login.html";
        }
        else{
            session.setAttribute("user",student);
            return "II";
        }

    }
}
