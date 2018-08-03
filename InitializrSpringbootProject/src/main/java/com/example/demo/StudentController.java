/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.domain.Course;
import com.example.domain.Major;
import com.example.domain.Student;
import com.example.mapper.CourseMapper;
import com.example.mapper.GradeMapper;
import com.example.mapper.MajorMapper;
import com.example.mapper.StudentMapper;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class StudentController {
    private final StudentMapper sm;
    private final CourseMapper cm;
    private final MajorMapper mm;
    private final GradeMapper gm;
    
    public StudentController(StudentMapper sm, CourseMapper cm, MajorMapper mm, GradeMapper gm) {
        this.sm=sm;
        this.cm=cm;
        this.mm=mm;
        this.gm=gm;
    }
    
    @RequestMapping("/createstudent")
    public String createstudent(String sname){
        sm.createstudent(sname);
        return "success";
    }
    
    @RequestMapping("/setstudentmajor")
    public String setstudentmajor(String sname, String mname){
        Major m = mm.selectmajorbyname(mname);
        sm.setstudentmajor(sname, m.getMid());
        return "success";
    }
    
    @RequestMapping("/setstudentcourse")
    public String setstudentcourse(String sname, String cname){
        Student s = sm.selectstudentbyname(sname);
        Course c = cm.selectcoursebyname(cname);
        sm.setstudentcourse(c.getCid(), s.getSid());
        return "success";
    }
    
    @RequestMapping("/setstudentgrade")
    public String setstudentgrade(String sname, String cname, String grade){
        Student s = sm.selectstudentbyname(sname);
        Course c = cm.selectcoursebyname(cname);
        sm.setstudentgrade(c.getCid(), s.getSid(), grade);
        return "success";
    }
    
    @RequestMapping("/selectstudentbyname")
    public Student selectstudentbyname(String sname){
        return sm.selectstudentbyname(sname);
    }
    
    @RequestMapping("/selectstudentbymajor")
    public List<Student> selectstudentbymajor(String mname){
        return sm.selectstudentbymajor(mname);
    }
    
    @RequestMapping("/selectstudentbycourse")
    public List<Student> selectstudentbycourse(String cname){
        return sm.selectstudentbycourse(cname);
    }
    
    @RequestMapping("/selectstudentbygrade")
    public List<Student> selectstudentbygrade(String cname){
        Course c = cm.selectcoursebyname(cname);
        return sm.selectstudentbygrade(c.getCid());
    }
    
    
    
    @RequestMapping("/selectstudentall")
    public Student selectstudentall(String sname){
        return sm.selectstudentall(sname);
    }
    
    @RequestMapping("/selectstudentbycourse2")
    public List<Student> selectstudentbycourse2(String cname){
        return sm.selectstudentbycourse2(cname);
    }
}
