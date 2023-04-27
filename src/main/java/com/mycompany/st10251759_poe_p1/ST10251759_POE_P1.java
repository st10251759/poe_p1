/*
=====================================Student Information=================================================
Student Number:     st10251759
Student Name:       Cameron Chetty
Course:             BCAD PROG5112
Group:              1
==========================================================================================================
*/

package com.mycompany.st10251759_poe_p1;
//import the joptionpane to project => used for user input and output messages
import javax.swing.JOptionPane;

    /*
    =============Code Attribution====================
    Author: Alex Lee
    Date: 13 April 2023
    Website: https://www.youtube.com/watch?v=XNWvF-xsCoY
    Date of Access: 22 April 2023
    =============Code Attribution====================
    */    

public class ST10251759_POE_P1 {//begin public class

    public static void main(String[] args) {//begin main method
        
     //variable declaration
     String firstName, lastName;
     
     //Geting the user Input using JOptionPane    
    firstName = JOptionPane.showInputDialog(null, "Please enter your first name/s");
    lastName = JOptionPane.showInputDialog(null, "Please enter your last name");
    
    
    
    //instantiation of object where the login constructor passess the parameters
   Login login = new Login(firstName, lastName);
   
   //UserName method Calls
   login.getUsername();//prompt user with j option pane
   login.checkUserName();//checks is the userName is valid ---> true / false
   login.userNameResult();// return appropreiate method valid/invalid or reprompt user for the UserName
   
   //Password method calls
   login.getpassword();//prompt user with j option pane
   login.checkPasswordComplexity();//checks is the userPassword is valid ---> true / false
   login.passwordResult(); // return appropreiate method valid/invalid or reprompt user for the UserPassword
   
   //Show the registration status by calling the registration validation method
   JOptionPane.showMessageDialog(null, login.registerUser());
   
   login.getLoginInfor();//prompt user to enter login details after successful registration
   login.loginUser();//vhecks if login creds matches register creds
   login.returnLoginStatus();//return appropreiate login message
   
   //Code to exit the system
   System.exit(0);
   
   
  }//end main method  
}//end public class
