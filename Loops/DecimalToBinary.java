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
public class DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int decimal_no=sc.nextInt();
        int ans=0;//Convert Binary Number
        int pw=1;//power of 10
        
        while (decimal_no>0) {
        int parity=decimal_no%2;
        ans+=parity*pw;
        pw*=10;
        decimal_no/=2;
        }
        System.out.println("Binary Number is "+ans);
    }
    
}
