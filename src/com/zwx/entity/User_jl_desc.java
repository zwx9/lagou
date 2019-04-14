package com.zwx.entity;

public class User_jl_desc {
    private String myRemark;
    private String email;

    public User_jl_desc(String myRemark, String email) {
        this.myRemark = myRemark;
        this.email = email;
    }

    public User_jl_desc(){

    }

    public String getMyRemark() {
        return myRemark;
    }

    public void setMyRemark(String myRemark) {
        this.myRemark = myRemark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User_jl_desc{" +
                "myRemark='" + myRemark + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
