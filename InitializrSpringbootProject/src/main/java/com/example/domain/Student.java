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
public class Student {
    private int sid;
    private String sname;
    private Major smajor;
    private List<Course> scourse = new ArrayList<Course>();
    private List<Grade> sgrade = new ArrayList<Grade>();

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Major getSmajor() {
        return smajor;
    }

    public void setSmajor(Major smajor) {
        this.smajor = smajor;
    }

    public List<Course> getScourse() {
        return scourse;
    }

    public void setScourse(List<Course> scourse) {
        this.scourse = scourse;
    }

    public List<Grade> getSgrade() {
        return sgrade;
    }

    public void setSgrade(List<Grade> sgrade) {
        this.sgrade = sgrade;
    }
    
    
}
