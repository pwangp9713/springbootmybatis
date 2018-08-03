/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.mapper;

import com.example.domain.Student;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author root
 */
@Mapper
public interface StudentMapper {
    void createstudent(String sname);
    void setstudentmajor(String sname, int mid);
    void setstudentcourse(int ccid, int csid);
    void setstudentgrade(int cid, int sid, String g);
    
    Student selectstudentbyname(String sname);
    
    List<Student> selectstudentbymajor(String mname);
    List<Student> selectstudentbycourse(String cname);
    List<Student> selectstudentbygrade(int cid);
    
    Student selectstudentall(String sname);
    List<Student> selectstudentbycourse2(String cname);
}
