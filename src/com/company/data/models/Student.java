package com.company.data.models;

import java.util.Date;

public class Student {
    public String firstName;
    public String lastName;
    public float score;
    public int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = 0;
        this.age = age;
    }
}
