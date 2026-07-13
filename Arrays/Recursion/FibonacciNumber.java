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
public class FibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int ans=fib(n);
        System.out.println("Answer is: "+ans);
    }
     public static int fib(int n) {
        if(n==0 || n==1)
            return n;
        
        return fib(n-1)+fib(n-2);
    }
}
