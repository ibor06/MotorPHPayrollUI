/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MotorPHPayrollUI;


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
    
    public String toFileString() {
        return id + "," + firstname + "," + lastname + "," + birthday + "," + position + "," + hourlyRate + "," + status;
    }
    public static Employee fromFileString(String line) {
    String[] parts = line.split(",");
    
    // Check if the line contains exactly 4 parts (ID, Name, Position, Salary)
    if (parts.length != 7) {
        System.out.println("Skipping invalid employee record: " + line);
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
        return new Employee(id, firstName, lastName, birthday, position, hourlyRate, status);
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

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            Employee emp = Employee.fromFileString(line);
            if (emp != null) { // ✅ Only add valid employees
                employees.add(emp);
            }
        }
    } catch (IOException e) {
        System.out.println("Error loading employees: " + e.getMessage());
    }
}
    
    public void addEmployee(Employee emp) {
        employees.add(emp);  
        saveEmployeesToCSV();
    }
    
     public static void saveEmployeesToCSV() {
        if (employees == null) {
        employees = new ArrayList<>(); // ✅ Ensures employees is never null
        return;
    }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
             for (Employee emp : employees) {
                  if (emp != null) { // Prevent writing null values
                      bw.write(emp.toFileString());
                      bw.newLine();
                 }
              }
          } 
        catch (IOException e) {
        
        }
    }
     
    public static String readCsvAsText(String filePath) {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                builder.append(line).append("\n");
            }

        } catch (IOException e) {
           
        }

        return builder.toString();
    }
    
    public static void editEmployee(int id, String newFirstname, String newLastname,
                                    String newBirthday,String newPosition,
                                    double newHourlyRate, String newStatus){
        for (Employee e : employees){
            if (e.getId()== id) {
                e.setFirstname(newFirstname);
                e.setLastname(newLastname);
                e.setBirthday(newBirthday);
                e.setPosition(newPosition);
                e.setHourlyRate(newHourlyRate);
                e.setStatus(newStatus);
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



