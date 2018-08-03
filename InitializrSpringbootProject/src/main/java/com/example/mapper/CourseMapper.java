/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.mapper;

import com.example.domain.Course;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author root
 */
@Mapper
public interface CourseMapper {
    void createcourse(String cname);
    void setcoursemajor(String cname, int mid);
    
    Course selectcoursebyname(String cname);
    
    List<Course> selectcoursebymajor(String mname);
    List<Course> selectcoursebystudent(String sname);
    List<Course> selectcoursebygrade(int sid);
    
    Course selectcourseall(String cname);
}
