package com.example.students;

import java.util.ArrayList;

public class Studentslist {
    public static void main(String args[])
    {
        //Creating objects of students
        Student student1 = new Student("James", "Bond", 18, "Czech");
        Student student2 = new Student("John", "Black", 17, "Polish");
        Student student3 = new Student("Jordan", "White", 18, "British");
        Student student4 = new Student("Lars", "Peterson", 18, "Danish");

        //Creating new Arraylist of Students
        ArrayList<Student> arraystudent = new ArrayList<Student>();

        //Adding values
        arraystudent.add(student1);
        arraystudent.add(student2);
        arraystudent.add(student3);
        arraystudent.add(student4);
    }

}

