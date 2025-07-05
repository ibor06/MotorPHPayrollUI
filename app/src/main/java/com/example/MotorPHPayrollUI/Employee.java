/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MotorPHPayrollUI;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.util.*;
import java.io.*;
/**
 *
 * @author rovie
 */
public class Employee {
    private static List<Employee> employees = new ArrayList<>();
    private static final String FILE_NAME = "employees.csv";

        
    private int id;
    private String firstname, lastname;
    private String birthday;
    private String position;
    private double hourlyRate;
    private String status;
    private String sssNum, phNum, tinNum, piNum;
    

    public Employee(int id, String firstname, String lastname, String birthday, 
            String position, double hourlyRate, String status, String sssNum, 
            String phNum, String tinNum, String piNum) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.position = position;
        this.hourlyRate = hourlyRate;
        this.status = status;
        this.sssNum = sssNum;
        this.phNum = phNum;
        this.tinNum = tinNum;
        this.piNum = piNum;
    }

   
    public int getId() { return id; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public String getBirthday() { return birthday; }
    public String getPosition() { return position; }
    public double getHourlyRate() { return hourlyRate; }
    public String getStatus() { return status; }
    public String getSssNum() { return sssNum; }
    public String getPhNum() { return phNum; }
    public String getTinNum() { return tinNum; }
    public String getPiNum() { return piNum; }

    public void setId(int id) { this.id = id; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public void setBirthday(String birthday) { this.birthday = birthday; }
    public void setPosition(String position) { this.position = position; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }
    public void setStatus(String status) { this.status = status; }
    public void setSssNum(String sssNum) { this.sssNum = sssNum; }
    public void setPhNum(String phNum) { this.phNum = phNum; }
    public void setTinNum(String tinNum) { this.tinNum = tinNum; }
    public void setPiNum(String piNum) { this.piNum = piNum; }
    
    public String toFileString() {
        return  id + "," +  firstname + "," + lastname + "," + birthday + "," + 
                position + "," + hourlyRate + "," + status + "," + sssNum + "," + 
                phNum + "," + tinNum + "," + piNum;
    }
    public static Employee fromFileString(String line) {
    String[] parts = line.split(",");
    
  
    if (parts.length != 11) {
        
        return null; // Return null if the data format is incorrect
    }

    try {
        int id = Integer.parseInt(parts[0]);
        String firstName = parts[1];
        String lastName = parts[2];
        String birthday = parts [3];
        String position = parts[4];
        double hourlyRate = Double.parseDouble(parts[5]);
        String status = parts[6];
        String sssNum = parts[7];
        String phNum = parts[8];
        String tinNum = parts[9];
        String piNum = parts[10];
        return new Employee(id, firstName, lastName, birthday, position, 
                hourlyRate, status, sssNum, phNum, tinNum, piNum);
    } catch (NumberFormatException e) {
        System.out.println("Error parsing employee record: " + line);
        return null;
    }
    
}
    
    public Employee() {
    if (Employee.employees == null) { // Prevents null list issue
        Employee.employees = new ArrayList<>();
    }
    loadEmployeesFromFile();
}
    
     public void loadEmployeesFromFile() {
    employees.clear();
    File file = new File(FILE_NAME);
    if (!file.exists()) return;

    try (CSVReader reader = new CSVReader (new FileReader(file))) {
        String [] data;
        while ((data = reader.readNext()) != null) {
            if (data.length < 11 || data[0].equalsIgnoreCase("id")) continue;

            id = Integer.parseInt(data[0].trim());
            firstname = data[1];
            lastname = data[2];
            birthday = data[3];
            position = data[4];
            hourlyRate = Double.parseDouble(data[5].trim());
            status = data[6];
            sssNum = data[7];
            phNum = data[8];
            tinNum = data[9];
            piNum = data[10];

            Employee emp = new Employee(id, firstname, lastname, birthday, position,
                                        hourlyRate, status, sssNum, phNum, tinNum, piNum);
                employees.add(emp);
            
        }
    } catch (Exception e) {
        System.out.println("Error reading CSV: " + e.getMessage());
    }
}
    
    public void addEmployee(Employee emp) {
        employees.add(emp);  
        saveEmployeesToCSV();
    }
    
    public static void saveEmployeesToCSV() {
    if (employees == null) {
        employees = new ArrayList<>();
        return;
    }

    try (CSVWriter writer = new CSVWriter(new FileWriter(FILE_NAME))) {
        
        String[] header = {
            "ID", "First Name", "Last Name", "Birthday", "Position",
            "Hourly Rate", "Status", "SSS Number", "PhilHealth Number", "TIN", "Pag-IBIG"
        };
        writer.writeNext(header);

        for (Employee emp : employees) {
            if (emp != null) {
                String[] data = {
                    String.valueOf(emp.getId()),
                    emp.getFirstname(),
                    emp.getLastname(),
                    emp.getBirthday(),
                    emp.getPosition(),
                    String.valueOf(emp.getHourlyRate()),
                    emp.getStatus(),
                    emp.getSssNum(),
                    emp.getPhNum(),
                    emp.getTinNum(),
                    emp.getPiNum()
                };
                writer.writeNext(data);
            }
        }
    } catch (IOException e) {
        System.out.println("Error saving CSV: " + e.getMessage());
    }
}
     
    public static String readCsvAsText(String filePath){
    StringBuilder builder = new StringBuilder();

    try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
        List<String[]> allRows = reader.readAll();

        for (String[] row : allRows) {
            builder.append(String.join(", ", row)).append("\n");
        }

    } catch (IOException | CsvException e) {
        System.out.println("Error reading CSV: " + e.getMessage());
    }

    return builder.toString();
}
    
    public static void editEmployee(int id, String newFirstname, String newLastname,
                                    String newBirthday,String newPosition,
                                    double newHourlyRate, String newStatus,
                                    String newSssNum, String newPhNum, String newTinNum,
                                    String newPiNum){
        for (Employee e : employees){
            if (e.getId()== id) {
                e.setFirstname(newFirstname);
                e.setLastname(newLastname);
                e.setBirthday(newBirthday);
                e.setPosition(newPosition);
                e.setHourlyRate(newHourlyRate);
                e.setStatus(newStatus);
                e.setSssNum(newSssNum);
                e.setPhNum(newPhNum);
                e.setTinNum(newTinNum);
                e.setPiNum(newPiNum);
                saveEmployeesToCSV();
                return;
            }
        }
    }
    
    public void deleteEmployee(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getId()== id) {
                iterator.remove();
                
                saveEmployeesToCSV();
                
                return;
            }
        }
       
    }
    
    public List<Employee> getEmployees() {
        return employees;
    }

   
}



