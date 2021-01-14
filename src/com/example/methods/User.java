package com.example.methods;

public class User {
    private int user_ID, age;
    private String gender, occupation, zip_code;

    public User(int user_ID, int age, String gender, String occupation, String zip_code) {
        this.user_ID = user_ID;
        this.age = age;
        this.zip_code = zip_code;
        this.gender = gender;
        this.occupation = occupation;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public int getAge() {
        return age;
    }

    public String getZip_code() {
        return zip_code;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }
}
