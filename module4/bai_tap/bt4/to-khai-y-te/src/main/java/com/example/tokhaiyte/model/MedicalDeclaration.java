package com.example.tokhaiyte.model;

public class MedicalDeclaration {
    private String fullName;
    private Integer yearBob;
    private String gender;
    private String nationality;
    private Integer passportNumber;
    private String information;

    public MedicalDeclaration() {

    }
    public MedicalDeclaration(String fullName, Integer yearBob, String gender, String nationality, Integer passportNumber, String information) {
        this.fullName = fullName;
        this.yearBob = yearBob;
        this.gender = gender;
        this.nationality = nationality;
        this.passportNumber = passportNumber;
        this.information = information;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Integer getYearBob() {
        return yearBob;
    }
    public void setYearBob(Integer yearBob) {
        this.yearBob = yearBob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public Integer getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(Integer passportNumber) {
        this.passportNumber = passportNumber;
    }
    public String getInformation() {
        return information;
    }
    public void setInformation(String information) {
        this.information = information;
    }
}
