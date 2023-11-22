/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nameandinitials;

/**
 *
 * @author orlandomarin
 */
public class NameAndInitials {

    public static void main(String[] args) 
    {
        // declare 3 string variables for first, middle, and last name
        String firstName = "Orlando";
        String middleName = "Jermaine";
        String lastName = "Marin";
        
        // declare 3 character variables for first, middle, and last initial
        char firstInitial = 'O';
        char middleInitial = 'J';
        char lastInitial = 'M';
        
        // print out my full name and initials
        System.out.println("Hello, my full name is " + firstName + " " + 
        middleName + " " + lastName + ". My initials are " 
        + firstInitial + middleInitial + lastInitial + ".");
    }
} 
