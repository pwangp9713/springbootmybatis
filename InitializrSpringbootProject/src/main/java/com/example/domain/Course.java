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
public class Course {
   private int cid;
   private String cname;
   private Major cmajor;
   private List<Student> cstudent = new ArrayList<Student>();
   private List<Grade> cgrade = new ArrayList<Grade>();

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Major getCmajor() {
        return cmajor;
    }

    public void setCmajor(Major cmajor) {
        this.cmajor = cmajor;
    }

    public List<Student> getCstudent() {
        return cstudent;
    }

    public void setCstudent(List<Student> cstudent) {
        this.cstudent = cstudent;
    }

    public List<Grade> getCgrade() {
        return cgrade;
    }

    public void setCgrade(List<Grade> cgrade) {
        this.cgrade = cgrade;
    }
   
   
}
