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
public class CourseController {
    private final StudentMapper sm;
    private final CourseMapper cm;
    private final MajorMapper mm;
    private final GradeMapper gm;
    
    public CourseController(StudentMapper sm, CourseMapper cm, MajorMapper mm, GradeMapper gm) {
        this.sm=sm;
        this.cm=cm;
        this.mm=mm;
        this.gm=gm;
    }
    
    @RequestMapping("/createcourse")
    public String createcourse(String cname){
        cm.createcourse(cname);
        return "success";
    }
    
    @RequestMapping("/setcoursemajor")
    public String setcoursemajor(String cname, String mname){
        Major m = mm.selectmajorbyname(mname);
        cm.setcoursemajor(cname, m.getMid());
        return "success";
    }
    
    @RequestMapping("/selectcoursebyname")
    public Course selectcoursebyname(String cname){
        return cm.selectcoursebyname(cname);
    }
    
    @RequestMapping("/selectcoursebymajor")
    public List<Course> selectcoursebymajor(String mname){
        return cm.selectcoursebymajor(mname);
    }
    
    @RequestMapping("/selectcoursebystudent")
    public List<Course> selectcoursebystudent(String sname){
        return cm.selectcoursebystudent(sname);
    }
    
    @RequestMapping("/selectcoursebygrade")
    public List<Course> selectcoursebygrade(String sname){
        Student s = sm.selectstudentbyname(sname);
        return cm.selectcoursebygrade(s.getSid());
    }
    
    
    @RequestMapping("/selectcourseall")
    public Course selectcourseall(String cname){
        return cm.selectcourseall(cname);
    }
    
}
