package com.example.students;

public class Students {
    private static final Student[] students = new Student[]{
            new Student("John", "Anders", 17,"Danish"),
            new Student("Peter", "Dom", 19,"Czech"),
            new Student("Michael", "Hopes", 20,"Slovak")
    };

    public static Student[] getAllStudents() {
        return students;
    }

    public static Student getstudentByName(String firstName) {
        for (Student s : students) {
            if (s.getFirstName() == firstName ) return s;
        }
        return null;
    }
}
