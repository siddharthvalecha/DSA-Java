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
public class BinaryToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number");
        int binary_no=sc.nextInt();
        int ans=0;//Convert Decimal Number
        int pw=1;//2^0=1power of 2
        
        while (binary_no>0) {
        int unitDigit=binary_no%10;
        ans+=unitDigit*pw;
        binary_no/=10;
        pw*=2;
            
        }
        System.out.println("Decial Number is "+ans);
    }
    
}
