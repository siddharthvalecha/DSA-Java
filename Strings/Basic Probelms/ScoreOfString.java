//205. Isomorphic Strings https://leetcode.com/problems/isomorphic-strings/description/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.String;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ScoreOfString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Strings");
        String s=sc.next();
       System.out.println(scoreOfString(s));
           
    }
    static public int scoreOfString(String s) {
        int score = 0;
        
        
        for (int i = 0; i < s.length()-1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        
        return score; 
    }
}