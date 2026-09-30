//14. Longest Common Prefix https://leetcode.com/problems/longest-common-prefix/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.String;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LongestOddNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Strings");
        String str=sc.next();
       System.out.println(largestOddNumber(str));
           
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