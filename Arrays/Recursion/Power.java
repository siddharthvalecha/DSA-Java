/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.Recursion;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        double x=sc.nextDouble();
        System.out.println("Enter n");
        int n=sc.nextInt();
        double ans=myPow(x,n);
        System.out.println("Answer is: "+ans);
    }
     private static  double helper(double x, long exponent) {
        if (exponent == 0) {
            return 1.0;
        }

        double half = helper(x, exponent / 2);

        if (exponent % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
    public static double myPow(double x, int n) {
         long exponent = n;

        if (exponent < 0) {
            exponent = -exponent;
            return 1.0 / helper(x, exponent);
        }

        return helper(x, exponent);
        
        } 
}
