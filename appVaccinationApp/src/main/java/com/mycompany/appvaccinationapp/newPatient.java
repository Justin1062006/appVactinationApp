package com.mycompany.appvaccinationapp;

import java.time.LocalDate;

public class newPatient {
    private int patientID;
    private String name;
    private int age;
    private String gender;
    private String vaccDay;
    private String secondVaccDay;
    private String vaccStatus;

    public newPatient(int patientID, String name, int age, String gender, String vaccDay) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.vaccDay = vaccDay;
        this.secondVaccDay = vaccDay + 7;
        
        try {
            LocalDate firstDose = LocalDate.parse(vaccDay);
            LocalDate secondDose = firstDose.plusDays(7);
            this.secondVaccDay = secondDose.toString();
        } catch (Exception e) {
            this.secondVaccDay = "Invalid Date";
        }
        this.vaccStatus = "Pending";
    }

    public int getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getVaccDay() {
        return vaccDay;
    }
    
    public String getSecondVaccDay(){
        return secondVaccDay;
    }
    
    public String getVaccStatus(){
        return vaccStatus;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setVaccDay(String vaccDay) {
        this.vaccDay = vaccDay;
    }
    
    public void setSecondVaccDay(String secondVaccDay){
        this.secondVaccDay = secondVaccDay;
    }
    
    public void setVaccStatus(String vaccStatus){
        this.vaccStatus = vaccStatus;
    }
    
    
    
}
