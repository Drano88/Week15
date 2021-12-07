/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week15demo;

/**
 *
 * @author itlabs
 */
public class Factorial {
    
     static void factorial(int num){
        System.out.println ("In-Pass Num = "+ num); 
        if (num >=0)
        return 
        factorial(num * num - 1); 
       System.out.println("Re-Pass Num = " + num);
    } 
    public static void main (String[] args) { 
        factorial(4);
    }
}
    

