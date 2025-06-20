/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.MotorPHPayrollUI;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author rovie
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        
        initComponents();
        loadEmployeesFromCSV();
    }
    private static final List<Employee> employees = new ArrayList<>();
    
    public static void loadEmployeesFromCSV() {
        File file = new File("employees.csv");
        if (!file.exists()) {
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {
            fileScanner.nextLine(); 
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String firstname = data[1];
                String lastname = data[2];
                String birthday = data[3];
                String position = data[4];
                double rate = Double.parseDouble(data[5]);
                String status = data[6];
                String sssNum = data[7];
                String phNum = data[8];
                String tinNum = data[9];
                String piNum = data[10];

                employees.add(new Employee(id, firstname, lastname, birthday, 
                        position, rate, status, sssNum, phNum, tinNum, piNum));
            }
            
        } catch (Exception e) {
            
            System.out.println("Error reading CSV: " + e.getMessage());
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addEmployeeBtn = new javax.swing.JButton();
        viewEmployeeBtn = new javax.swing.JButton();
        editEmployeeBtn = new javax.swing.JButton();
        deleteEmployeeBtn = new javax.swing.JButton();
        calculateSalaryBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Motor PH Payroll System");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(450, 500));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Motor PH");

        addEmployeeBtn.setText("Add New Employee");
        addEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeBtnActionPerformed(evt);
            }
        });

        viewEmployeeBtn.setText("View Employees");
        viewEmployeeBtn.setPreferredSize(new java.awt.Dimension(134, 40));
        viewEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmployeeBtnActionPerformed(evt);
            }
        });

        editEmployeeBtn.setText("Edit Employees");
        editEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeBtnActionPerformed(evt);
            }
        });

        deleteEmployeeBtn.setText("Delete Employee");
        deleteEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeBtnActionPerformed(evt);
            }
        });

        calculateSalaryBtn.setText("Calculate Salary");
        calculateSalaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateSalaryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculateSalaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(addEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculateSalaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        addEmployeeBtn.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployeeBtnActionPerformed
       
       String csvContent = Employee.readCsvAsText("employees.csv");
        JTextArea textArea = new JTextArea(csvContent, 20, 40);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
      JOptionPane.showMessageDialog(this, scrollPane, "CSV Contents", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_viewEmployeeBtnActionPerformed

    private void addEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeBtnActionPerformed
     
        AddNewEmployee addEmployee = new AddNewEmployee();
       addEmployee.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_addEmployeeBtnActionPerformed

    private void editEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeBtnActionPerformed
        
        EditEmployee editEmployee = new EditEmployee();
        editEmployee.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_editEmployeeBtnActionPerformed

    private void deleteEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeBtnActionPerformed

        DeleteEmployee deleteEmployee = new DeleteEmployee();
       deleteEmployee.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_deleteEmployeeBtnActionPerformed

    private void calculateSalaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateSalaryBtnActionPerformed

        CalculateSalary calculateSalary = new CalculateSalary();
       calculateSalary.setVisible(true);
       this.dispose();

    }//GEN-LAST:event_calculateSalaryBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        loadEmployeesFromCSV();
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeBtn;
    private javax.swing.JButton calculateSalaryBtn;
    private javax.swing.JButton deleteEmployeeBtn;
    private javax.swing.JButton editEmployeeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewEmployeeBtn;
    // End of variables declaration//GEN-END:variables
}
