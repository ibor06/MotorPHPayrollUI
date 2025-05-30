/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MotorPHPayrollUI;

/**
 *
 * @author rovie
 */
import java.util.Date;

public class PayrollRecord {
    
    private Employee employee;
    private double dailyRate = employee.getHourlyRate()*8;
    private int daysWorked;
    private int overtimeHours;
    private double grossPay;
    private double deductions;
    private double netPay;
    private Date startDate;
    private Date endDate;

    public PayrollRecord(Employee employee, int daysWorked, int overtimeHours, Date startDate, Date endDate) {
        
        this.employee = employee;
        this.daysWorked = daysWorked;
        this.overtimeHours = overtimeHours;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void calculateGrossPay() {
        grossPay = (dailyRate * daysWorked);
    }

    public void calculateDeductions(GovernmentDeduction deduction) {
        deductions = deduction.totalDeductions(grossPay);
    }

    public void calculateNetPay() { netPay = grossPay - deductions;}

    
    public Employee getEmployee() { return employee; }
    public int getDaysWorked() { return daysWorked; }
    public int getOvertimeHours() { return overtimeHours; }
    public double getGrossPay() { return grossPay; }
    public double getDeductions() { return deductions; }
    public double getNetPay() { return netPay; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }

    
    public void setEmployee(Employee employee) { this.employee = employee; }
    public void setDaysWorked(int daysWorked) { this.daysWorked = daysWorked; }
    public void setOvertimeHours(int overtimeHours) { this.overtimeHours = overtimeHours; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }
}