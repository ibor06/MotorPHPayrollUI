/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MotorPHPayrollUI;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author rovie
 */
public class Attendance {
    
    private int attendanceID;
    private Employee employee; 
    private Date date;
    private Time timeIn;
    private Time timeOut;
    private boolean isAbsent;

    
    public int getAttendanceID() {
        return attendanceID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getDate() {
        return date;
    }

    public Time getTimeIn() {
        return timeIn;
    }

    public Time getTimeOut() {
        return timeOut;
    }

    public boolean isAbsent() {
        return isAbsent;
    }

    // Setters
    public void setAttendanceID(int attendanceID) {
        this.attendanceID = attendanceID;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTimeIn(Time timeIn) {
        this.timeIn = timeIn;
    }

    public void setTimeOut(Time timeOut) {
        this.timeOut = timeOut;
    }

    public void setAbsent(boolean isAbsent) {
        this.isAbsent = isAbsent;
    }
    
    public double calculateHoursWorked() {
        if (timeIn == null || timeOut == null || isAbsent) {
            return 0.0;
        }

        double millisecondsWorked = timeOut.getTime() - timeIn.getTime();
        double hoursWorked = millisecondsWorked / (1000.0 * 60 * 60); // Convert milliseconds to hours

        return hoursWorked;
    }
    
}
