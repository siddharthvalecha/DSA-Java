//3498. Reverse Degree of a String https://leetcode.com/problems/reverse-degree-of-a-string/description/
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
public class ReverseDegree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Strings");
        String s=sc.next();
       System.out.println(reverseDegree(s));
           
    }
    static public int reverseDegree(String s) {
       int n=s.length();
        int result=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int reversePosition='z'-ch+1;
            result+=(reversePosition*(i+1));
        }
        return result;
    }
}