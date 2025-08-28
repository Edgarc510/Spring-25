package com.eac.model;

import com.eac.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;


public class Mentor {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;

    // ✅ Default (no-args) constructor
    public Mentor() {
    }

    // ✅ All-args constructor
    public Mentor(String firstName, String lastName, Gender gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    // ✅ Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    // ✅ Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


