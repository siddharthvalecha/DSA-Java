//1903. Largest Odd Number in String https://leetcode.com/problems/largest-odd-number-in-string/description/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.TwoPointers;

import dsa.*;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LargestOddNoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String input=sc.nextLine();
        System.out.println("Largest Odd no is ");
        System.out.println(largestOddNumber(input));
           
    }
    static public String largestOddNumber(String num) {
        int n=num.length();
        int j=n-1;
        while(j>=0){
            if(num.charAt(j)%2==0){
               j--; 
            }
            else if(num.charAt(j)%2!=0){
                return num.substring(0,j+1);
            }
        }

        return "";
    }
}