/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class Major {
    private int mid;
    private String mname;
    private List<Course> mcourse = new ArrayList<Course>();
    private List<Student> mstudent = new ArrayList<Student>();

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public List<Course> getMcourse() {
        return mcourse;
    }

    public void setMcourse(List<Course> mcourse) {
        this.mcourse = mcourse;
    }

    public List<Student> getMstudent() {
        return mstudent;
    }

    public void setMstudent(List<Student> mstudent) {
        this.mstudent = mstudent;
    }
    
    
    
}
