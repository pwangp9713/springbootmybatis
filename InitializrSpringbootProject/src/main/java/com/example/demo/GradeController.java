/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.domain.Grade;
import com.example.mapper.CourseMapper;
import com.example.mapper.GradeMapper;
import com.example.mapper.StudentMapper;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class GradeController {
    private final StudentMapper sm;
    private final CourseMapper cm;
    private final GradeMapper gm;
    
    public GradeController(StudentMapper sm, CourseMapper cm, GradeMapper gm) {
        this.sm=sm;
        this.cm=cm;
        this.gm=gm;
    }
    
    @RequestMapping("/selectgradebystudent")
    public List<Grade> selectgradebystudent(String sname){
        return gm.selectgradebystudent(sname);
    }
    
    @RequestMapping("/selectgradebycourse")
    public List<Grade> selectgradebycourse(String cname){
        return gm.selectgradebycourse(cname);
    }
    
}
