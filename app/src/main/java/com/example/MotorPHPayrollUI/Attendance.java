/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MotorPHPayrollUI;

/**
 *
 * @author rovie
 */
public class Attendance {
    private int employeeId;
    private int daysPresent;

    public Attendance(int employeeId, int daysPresent) {
        this.employeeId = employeeId;
        this.daysPresent = daysPresent;
    }

    public int getEmployeeId() { return employeeId; }
    public int getDaysPresent() { return daysPresent; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setDaysPresent(int daysPresent) { this.daysPresent = daysPresent; }
}
