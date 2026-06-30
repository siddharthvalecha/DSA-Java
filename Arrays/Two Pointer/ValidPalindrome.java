
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
public class ValidPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String input=sc.nextLine();
        //boolean ans=isPalindrome(input);
        boolean ans=optimalIsPalindrome(input);
        System.out.println(ans);
           
    }
    static public boolean isPalindrome(String s) {
        char[] a=s.toLowerCase().toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(!((a[i]>='a' && a[i]<='z') || (a[i]>='0' && a[i]<='9'))){
                i++;
                continue;
            }else if(!((a[j]>='a' && a[j]<='z') || (a[j]>='0' && a[j]<='9'))){
                j--;
                continue;
            }
            if(a[i]!=a[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;      
    }
    static public boolean optimalIsPalindrome(String s) {
        int i=0;
     int j=s.length()-1;

     while(i<j){
        char left=Character.toLowerCase(s.charAt(i));
        char right=Character.toLowerCase(s.charAt(j));

        if(!Character.isLetterOrDigit(left)){
            i++;
            continue;
        }else if(!Character.isLetterOrDigit(right)){
            j--;
            continue;
        }else if(left!=right){
            return false;
        }
        i++;
        j--;
     } 
     return true;  
    }
}