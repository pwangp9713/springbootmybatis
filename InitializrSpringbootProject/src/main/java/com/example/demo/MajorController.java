/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.domain.Major;
import com.example.mapper.CourseMapper;
import com.example.mapper.MajorMapper;
import com.example.mapper.StudentMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class MajorController {
    private final StudentMapper sm;
    private final CourseMapper cm;
    private final MajorMapper mm;
    
    public MajorController(StudentMapper sm, CourseMapper cm, MajorMapper mm) {
        this.sm=sm;
        this.cm=cm;
        this.mm=mm;
    }
    
    @RequestMapping("/createmajor")
    public String createmajor(String mname){
        mm.createmajor(mname);
        return "success";
    }
    
    @RequestMapping("/selectmajorbyname")
    public Major selectmajorbyname(String mname){
        return mm.selectmajorbyname(mname);
    }
    
    @RequestMapping("/selectmajorbystudent")
    public Major selectmajorbystudent(String sname){
        return mm.selectmajorbystudent(sname);
    }
    
    @RequestMapping("/selectmajorbycoures")
    public Major selectmajorbycourse(String cname){
        return mm.selectmajorbycourse(cname);
    }
    
}
