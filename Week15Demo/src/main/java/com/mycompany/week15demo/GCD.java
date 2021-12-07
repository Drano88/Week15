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
public class GCD {
     static int gcd(int num1, int num2){
        System.out.println ("In-Pass Num = "+ num1 + " " + num2); 
        if (num1 == num2)
            return num2; 
        else if (num1 > num2)
            return gcd (num1-num2,num2); 
        else 
             return gcd(num1, num2-num1);
            
        }
         
    public static void main (String[] args) { 
        gcd(4);
    }
}

