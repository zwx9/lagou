package com.zwx.entity;

public class User_jl_proExp {
    private String projectName;
    private String positionName;
    private String startYear;
    private String startMonth;
    private String endYear;
    private String endMonth;
    private String projectRemark;
    private String projectid;
    private String email;

    public User_jl_proExp(){

    }

    public User_jl_proExp(String projectName, String positionName, String startYear, String startMonth, String endYear, String endMonth, String projectRemark, String projectid, String email) {
        this.projectName = projectName;
        this.positionName = positionName;
        this.startYear = startYear;
        this.startMonth = startMonth;
        this.endYear = endYear;
        this.endMonth = endMonth;
        this.projectRemark = projectRemark;
        this.projectid = projectid;
        this.email = email;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public String getProjectRemark() {
        return projectRemark;
    }

    public void setProjectRemark(String projectRemark) {
        this.projectRemark = projectRemark;
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User_jl_proExp{" +
                "projectName='" + projectName + '\'' +
                ", positionName='" + positionName + '\'' +
                ", startYear='" + startYear + '\'' +
                ", startMonth='" + startMonth + '\'' +
                ", endYear='" + endYear + '\'' +
                ", endMonth='" + endMonth + '\'' +
                ", projectRemark='" + projectRemark + '\'' +
                ", projectid='" + projectid + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
