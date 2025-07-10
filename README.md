# MotorPH Payroll System

This is a desktop-based payroll system built with Java Swing.

## Getting Started

To run the application:

1. Clone or download the repository.
2. Open the project in your Java IDE (NetBeans, IntelliJ, Eclipse, etc.).
3. Build the project if required.
4. **Run the `LoginFrame` class** — this is the entry point and contains the `main` method.

```java
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> new LoginFrame().setVisible(true));
}

Features
Employee registration and login (credentials stored securely with BCrypt)

CRUD operations for employee data

CSV-based storage using OpenCSV

Payroll computation with government deductions

Clean and user-friendly interface

File Structure Overview
LoginFrame.java — Main class to run the system

MainFrame.java — Dashboard displaying employee data

Employee.java — Employee model and CSV integration

UserAccount.java — Handles login, registration, and password hashing

Dependencies
OpenCSV — for CSV file handling

JBCrypt — for password encryption

Notes
Make sure users.csv and employees.csv exist in your project directory (they will be created if missing).

To register a new account, use the REGISTER button on the login screen.

Author
Rovie Matubang
