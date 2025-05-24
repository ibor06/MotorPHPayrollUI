/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MotorPHPayrollUI;

/**
 *
 * @author rovie
 */
public class Employee {
    private int id;
    private String name;
    private String birthday;
    private String position;
    private double dailyRate;
    private String department;
    private String status;

    public Employee(int id, String name, String birthday, String position, double dailyRate, String department, String status) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.position = position;
        this.dailyRate = dailyRate;
        this.department = department;
        this.status = status;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getBirthday() { return birthday; }
    public String getPosition() { return position; }
    public double getDailyRate() { return dailyRate; }
    public String getDepartment() { return department; }
    public String getStatus() { return status; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setBirthday(String birthday) { this.birthday = birthday; }
    public void setPosition(String position) { this.position = position; }
    public void setDailyRate(double dailyRate) { this.dailyRate = dailyRate; }
    public void setDepartment(String department) { this.department = department; }
    public void setStatus(String status) { this.status = status; }
}

