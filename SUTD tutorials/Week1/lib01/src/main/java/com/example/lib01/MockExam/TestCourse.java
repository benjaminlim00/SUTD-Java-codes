package com.example.lib01.MockExam;

// package com.example.libexams;

public class TestCourse {

    public static void main(String[] args){

        Course course = new Course("Java");

        course.addStudent("Alpha");
        course.addStudent("Beta");
        course.dropStudent("Alpha");
        System.out.println("Number of Students:" + course.getNumberOfStudents());
        //this should display Number of Students: 1
    }
}
