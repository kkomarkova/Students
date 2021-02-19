package com.example.students;

import java.io.Serializable;

public class Student implements Serializable {
        private String FirstName;
        private String LastName;
        private int Age;
        private String Nationality;

        //Empty constructor
    public Student(){
    }

      // Constructor taking 4 parametres

    public Student(String firstName, String lastName, int age, String nationality) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Nationality = Nationality;
    }

    //Methods of Student class
    public String getFirstName()
    {
        return FirstName;
    }
    public String getLastName()
    {
        return LastName;
    }
    public int getAge()
    {
        return Age;
    }
    public String getNationality()
    {
        return Nationality;
    }

    //Override method
    @Override
    public String toString() {
        return FirstName + " " + LastName + " " + Age + " " + Nationality;
    }



}
