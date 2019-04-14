package com.zwx.entity;

public class User_jianli {
    private String userId;
    private String name;
    private String gender;
    private String topDegree;
    private String workyear;
    private String tel;
    private String email;
    private String currentState;

    public User_jianli(String userId, String name, String gender, String topDegree, String workyear, String tel, String email, String currentState) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.topDegree = topDegree;
        this.workyear = workyear;
        this.tel = tel;
        this.email = email;
        this.currentState = currentState;

    }


    public User_jianli(){
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTopDegree() {
        return topDegree;
    }

    public void setTopDegree(String topDegree) {
        this.topDegree = topDegree;
    }

    public String getWorkyear() {
        return workyear;
    }

    public void setWorkyear(String workyear) {
        this.workyear = workyear;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "User_jianli{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", topDegree='" + topDegree + '\'' +
                ", workyear='" + workyear + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", currentState='" + currentState + '\'' +
                '}';
    }
}

