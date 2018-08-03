/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.mapper;

import com.example.domain.Major;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author root
 */
@Mapper
public interface MajorMapper {
    void createmajor(String mname);
    
    Major selectmajorbyname(String mname);
    
    Major selectmajorbystudent(String sname);
    Major selectmajorbycourse(String cname);
}
