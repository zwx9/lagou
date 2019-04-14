package com.zwx.entity;

public class User_jl_expect {
    private String city;
    private String positionType ;
    private String positionName;
    private String salarys;
    private String email;

    public User_jl_expect(String city, String positionType, String positionName, String salarys, String email) {
        this.city = city;
        this.positionType = positionType;
        this.positionName = positionName;
        this.salarys = salarys;
        this.email = email;
    }

    public User_jl_expect() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getSalarys() {
        return salarys;
    }

    public void setSalarys(String salarys) {
        this.salarys = salarys;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User_jl_expect{" +
                "city='" + city + '\'' +
                ", positionType='" + positionType + '\'' +
                ", positionName='" + positionName + '\'' +
                ", salarys='" + salarys + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
