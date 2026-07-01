//680. Valid Palindrome II  https://leetcode.com/problems/valid-palindrome-ii/description/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.twosum;

import dsa.*;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ValidPalindromeII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String input=sc.nextLine();
        //boolean ans=isPalindrome(input);
        boolean ans=validPalindrome(input);
        System.out.println(ans);
           
    }
     public static boolean validPalindrome(String s) {
        int left=0;
       int right=s.length()-1;
        while(left<right){
            char i=s.charAt(left);
            char j=s.charAt(right);
            if(i!=j){
                if(isPalindrome(s,left+1,right)){
                    return true;
                }else if(isPalindrome(s,left,right-1)){
                    return true;
                }
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    public static boolean isPalindrome(String s,int left,int right){
        while(left<right){
            char i=s.charAt(left);
            char j=s.charAt(right);
            if(i!=j){
            return false;
        }
        left++;
        right--;
        }
        
        return true;
    }
    
}