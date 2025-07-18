/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.MotorPHPayrollUI;
import javax.swing.JOptionPane;
/**
/**
 *
 * @author rovie
 */
public class AddNewEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddNewEmployee
     */
    
    public AddNewEmployee() {
        initComponents();
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstnameTxt = new javax.swing.JTextField();
        lastnameTxt = new javax.swing.JTextField();
        birthdayTxt = new javax.swing.JTextField();
        positionTxt = new javax.swing.JTextField();
        hourlyRateTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        statusTxt = new javax.swing.JTextField();
        saveEmployeeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sssNumTxt = new javax.swing.JTextField();
        phNumTxt = new javax.swing.JTextField();
        tinNumTxt = new javax.swing.JTextField();
        piNumTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Employee");
        setPreferredSize(new java.awt.Dimension(450, 500));
        setSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Employee ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 47, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 32;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 19, 0, 0);
        getContentPane().add(idTxt, gridBagConstraints);

        jLabel2.setText("First Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 47, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Last Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 47, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Birthdate (MM-DD-YYYY):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 47, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = -16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 57, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("Position:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 47, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setText("Hourly Rate:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 47, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        firstnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 32;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 152;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(firstnameTxt, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 33;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 153;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(lastnameTxt, gridBagConstraints);

        birthdayTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 34;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 153;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 19, 0, 0);
        getContentPane().add(birthdayTxt, gridBagConstraints);

        positionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 34;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(positionTxt, gridBagConstraints);

        hourlyRateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourlyRateTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 34;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(hourlyRateTxt, gridBagConstraints);

        jLabel8.setText("Status:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 47, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        statusTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 34;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(statusTxt, gridBagConstraints);

        saveEmployeeBtn.setText("Save");
        saveEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEmployeeBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 31;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 0, 101, 0);
        getContentPane().add(saveEmployeeBtn, gridBagConstraints);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 67;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 63, 101, 0);
        getContentPane().add(backBtn, gridBagConstraints);

        jLabel9.setText("Please Provide The Informations Below.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 72;
        gridBagConstraints.ipadx = 270;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 0, 6);
        getContentPane().add(jLabel9, gridBagConstraints);

        jLabel10.setText("SSS Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 47, 0, 0);
        getContentPane().add(jLabel10, gridBagConstraints);

        jLabel11.setText("Philhealth Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 47, 0, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        jLabel12.setText("Tin Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 47, 0, 0);
        getContentPane().add(jLabel12, gridBagConstraints);

        jLabel13.setText("Pag-Ibig Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 47, 0, 0);
        getContentPane().add(jLabel13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 34;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(sssNumTxt, gridBagConstraints);

        phNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phNumTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 34;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(phNumTxt, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 34;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(tinNumTxt, gridBagConstraints);

        piNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piNumTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 37;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 34;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(piNumTxt, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
       
    }//GEN-LAST:event_idTxtActionPerformed

    private void firstnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTxtActionPerformed

    private void saveEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEmployeeBtnActionPerformed
     Employee emp = new Employee();
     emp.getEmployees();
     try{
     if (idTxt.getText().isEmpty() || 
         firstnameTxt.getText().isEmpty() || 
         lastnameTxt.getText().isEmpty() ||
         birthdayTxt.getText().isEmpty() || 
         positionTxt.getText().isEmpty() || 
         hourlyRateTxt.getText().isEmpty() ||
         statusTxt.getText().isEmpty() || 
         sssNumTxt.getText().isEmpty() ||
         phNumTxt.getText().isEmpty() ||
         tinNumTxt.getText().isEmpty() || 
         piNumTxt.getText().isEmpty()) {
    
    JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Missing Input", JOptionPane.ERROR_MESSAGE);
    return;
    }
          
       int id = Integer.parseInt(idTxt.getText());
       
       for (Employee e : emp.getEmployees()) {
            if (e.getId() == id) {
                JOptionPane.showMessageDialog(this, "Employee ID already exists. Please use a unique ID.", "Duplicate ID", JOptionPane.ERROR_MESSAGE);
                return;
            }
       }    
       String firstname = firstnameTxt.getText();
       String lastname = lastnameTxt.getText();
       
       String birthday = birthdayTxt.getText();
            if (!Employee.isValidDate(birthday)) {
            JOptionPane.showMessageDialog(null,"Invalid date format! Use MM-dd-yyyy.","Invalid Input",JOptionPane.ERROR_MESSAGE);
            return;
}
       String position = positionTxt.getText();
       double hourlyRate = Double.parseDouble(hourlyRateTxt.getText());
       String status = statusTxt.getText();
       String sssNum = sssNumTxt.getText();
       String phNum = phNumTxt.getText();
       String tinNum = tinNumTxt.getText();
       String piNum = piNumTxt.getText();
       
       
        Employee employee = new Employee(id, firstname, lastname, birthday,
                position, hourlyRate, status, sssNum, phNum, tinNum, piNum);
       employee.addEmployee(employee);
       
       String message = "New Employee Added!";
       JOptionPane.showMessageDialog(this, message);
      
          
       MainFrame mainFrame = new MainFrame();
       mainFrame.refreshTable();
       mainFrame.setVisible(true);
       this.dispose();

       } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for ID and Hourly Rate.");
       } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
              
    }     
    }//GEN-LAST:event_saveEmployeeBtnActionPerformed

    private void statusTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void hourlyRateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourlyRateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourlyRateTxtActionPerformed

    private void birthdayTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdayTxtActionPerformed

    private void positionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionTxtActionPerformed

    private void phNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phNumTxtActionPerformed

    private void piNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_piNumTxtActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField birthdayTxt;
    private javax.swing.JTextField firstnameTxt;
    private javax.swing.JTextField hourlyRateTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnameTxt;
    private javax.swing.JTextField phNumTxt;
    private javax.swing.JTextField piNumTxt;
    private javax.swing.JTextField positionTxt;
    private javax.swing.JButton saveEmployeeBtn;
    private javax.swing.JTextField sssNumTxt;
    private javax.swing.JTextField statusTxt;
    private javax.swing.JTextField tinNumTxt;
    // End of variables declaration//GEN-END:variables
}
