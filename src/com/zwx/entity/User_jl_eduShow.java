package com.zwx.entity;

public class User_jl_eduShow {
    private String schoolName;
    private String education ;
    private String professional ;
    private String startYear ;
    private String endYear ;
    private String eduid ;
    private String email ;

    public User_jl_eduShow(String schoolName, String education, String professional, String startYear, String endYear, String eduid, String email) {
        this.schoolName = schoolName;
        this.education = education;
        this.professional = professional;
        this.startYear = startYear;
        this.endYear = endYear;
        this.eduid = eduid;
        this.email = email;
    }

    public User_jl_eduShow(){

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getEduid() {
        return eduid;
    }

    public void setEduid(String eduid) {
        this.eduid = eduid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User_jl_eduShow{" +
                "schoolName='" + schoolName + '\'' +
                ", education='" + education + '\'' +
                ", professional='" + professional + '\'' +
                ", startYear='" + startYear + '\'' +
                ", endYear='" + endYear + '\'' +
                ", eduid='" + eduid + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
