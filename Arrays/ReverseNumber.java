/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n=sc.nextInt();
        int ans=0;
        while(n>0)
        {
            ans=ans*10+n%10;
            n/=10;
        }
        System.out.println("Reverse is:"+ans);
    }
    
}
