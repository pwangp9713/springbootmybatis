/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author root
 */
public class Grade {
    private int gid;
    private String g;
    private Course gcourse;
    private Student gstudent;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public Course getGcourse() {
        return gcourse;
    }

    public void setGcourse(Course gcourse) {
        this.gcourse = gcourse;
    }

    public Student getGstudent() {
        return gstudent;
    }

    public void setGstudent(Student gstudent) {
        this.gstudent = gstudent;
    }
    
    
}
