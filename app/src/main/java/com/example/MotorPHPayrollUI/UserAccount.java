/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MotorPHPayrollUI;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author rovie
 */
public final class UserAccount {
    
   
    private static final String FILE_NAME = "users.csv";
    private static final String[] HEADER = {"Username","Password"};
    private String username;
    private String password;
    
   

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
   
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    
    
    public UserAccount(){
        createUserFileIfNoExist();
    }
    
    private void createUserFileIfNoExist(){
        File file = new File(FILE_NAME);
        if(!file.exists()){
            try(CSVWriter writer = new CSVWriter(new FileWriter(FILE_NAME))){
            writer.writeNext(HEADER);
            }catch(IOException e){
            e.printStackTrace();
            }
        }
    }
    
    public boolean registerUser(String username, String password){
        if(findUser(username).isPresent()){
            return false;
        }
        
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
        
        try(CSVWriter writer = new CSVWriter(new FileWriter(FILE_NAME, true))){
            String[] record = {username, this.password};
            writer.writeNext(record);
            return true;
            
        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean login(String username, String password){
        
        Optional<String[]> userOpt = findUser(username);
        if(userOpt.isEmpty()){
            return false;
         
    }
    
        String[] user = userOpt.get();
        boolean success = BCrypt.checkpw(password, user[1]);
        return success;        
    }            
    
    private Optional<String[]> findUser(String username){
        try(CSVReader reader = new CSVReader(new FileReader(FILE_NAME))){
            List <String[]> records = reader.readAll();
            
                for (int i = 1; i < records.size(); i++){
                String[] record = records.get(i);
                if (record[0].equals(username)){
                    return Optional.of(record);
                }
            }
            
        }catch(IOException | CsvException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
}


