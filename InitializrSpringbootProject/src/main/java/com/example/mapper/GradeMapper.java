/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.mapper;

import com.example.domain.Grade;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author root
 */
@Mapper
public interface GradeMapper {
    List<Grade> selectgradebystudent(String sname);
    List<Grade> selectgradebycourse(String cname);
}
