package com.example.pilotlecture.dao;

import com.example.pilotlecture.pojo.Student;

import java.util.*;

public class Repository {
    private static Map<Integer, Student> map = new Hashtable<>();
    //静态代码块 CLASS LEVEL
    static {
        Student s1 = new Student();
        s1.setId(1);

    }

    public Set<Student> getSortedByNameAll(){

    }


 }
