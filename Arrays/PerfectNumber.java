//507. Perfect Number https://leetcode.com/problems/perfect-number/description/
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
public class PerfectNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n=sc.nextInt();
       
            System.out.println(checkPerfectNumber(n));
        }
    public static boolean checkPerfectNumber(int num) {
        int sum=1;
        if(num<=1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                if(num/i!=i){
                sum+=(num/i);
            }
            }
            
        }
        return sum==num;
    }
       
    }
    

