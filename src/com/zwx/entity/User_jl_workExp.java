package com.zwx.entity;

public class User_jl_workExp {
    private String companyName;
    private String positionName;
    private String startYear;
    private String startMonth;
    private String endYear;
    private String endMonth;
    private String expid;
    private String email;

    public User_jl_workExp(String companyName, String positionName, String startYear, String startMonth, String endYear, String endMonth, String expid, String email) {
        this.companyName = companyName;
        this.positionName = positionName;
        this.startYear = startYear;
        this.startMonth = startMonth;
        this.endYear = endYear;
        this.endMonth = endMonth;
        this.expid = expid;
        this.email = email;
    }

    public User_jl_workExp(){

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getExpid() {
        return expid;
    }

    public void setExpid(String expid) {
        this.expid = expid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User_jl_workExp{" +
                "companyName='" + companyName + '\'' +
                ", positionName='" + positionName + '\'' +
                ", startYear='" + startYear + '\'' +
                ", startMonth='" + startMonth + '\'' +
                ", endYear='" + endYear + '\'' +
                ", endMonth='" + endMonth + '\'' +
                ", expid='" + expid + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
