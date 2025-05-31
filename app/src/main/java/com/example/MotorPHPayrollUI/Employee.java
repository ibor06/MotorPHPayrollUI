/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MotorPHPayrollUI;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rovie
 */
public class Employee {

    private int id;
    private String firstname, lastname;
    private String birthday;
    private String position;
    private double hourlyRate;
    
    private String status;

    public Employee(int id, String firstname, String lastname, String birthday, String position, double hourlyRate, String status) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.position = position;
        this.hourlyRate = hourlyRate;
        this.status = status;
    }

    public int getId() { return id; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public String getBirthday() { return birthday; }
    public String getPosition() { return position; }
    public double getHourlyRate() { return hourlyRate; }
    public String getStatus() { return status; }

    public void setId(int id) { this.id = id; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public void setBirthday(String birthday) { this.birthday = birthday; }
    public void setPosition(String position) { this.position = position; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }
    public void setStatus(String status) { this.status = status; }
    

    public void addEmployee(Employee emp) {
        employees.add(emp);  
        saveEmployeesToCSV();
    }
    

}



