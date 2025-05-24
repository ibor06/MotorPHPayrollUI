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

public class Report {
    private int reportId;
    private String content;
    private Date dateGenerated;

    public Report(int reportId, String content, Date dateGenerated) {
        this.reportId = reportId;
        this.content = content;
        this.dateGenerated = dateGenerated;
    }

    public int getReportId() { return reportId; }
    public String getContent() { return content; }
    public Date getDateGenerated() { return dateGenerated; }

    public void setReportId(int reportId) { this.reportId = reportId; }
    public void setContent(String content) { this.content = content; }
    public void setDateGenerated(Date dateGenerated) { this.dateGenerated = dateGenerated; }
}

