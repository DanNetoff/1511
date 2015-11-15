package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by uitschool JV on 11/15/2015.
 */
public class Group {

    private String name;

    private class Student{
        Integer i;
        String name;

        public Student(Integer i, String name) {
            this.i = i;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "i=" + i +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    private Set<Student> myList = new HashSet<>();


    public void add(Student a) {
        myList.add(a);
    }





}
