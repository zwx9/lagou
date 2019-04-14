package com.zwx.entity;

public class User_jlname {
    private String email;
    private String jlname;

    public User_jlname(String email, String jlname) {
        this.email = email;
        this.jlname = jlname;
    }

    public User_jlname() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJlname() {
        return jlname;
    }

    public void setJlname(String jlname) {
        this.jlname = jlname;
    }

    @Override
    public String toString() {
        return "User_jlname{" +
                "email='" + email + '\'' +
                ", jlname='" + jlname + '\'' +
                '}';
    }
}
