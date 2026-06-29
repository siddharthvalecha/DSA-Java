
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
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String input=sc.nextLine();
        char[] arr=input.toCharArray();
        System.out.println("Reversed Character Array  is ");
        reverseString(arr);
        for (int i = 0; i <arr.length; i++) {
        System.out.print(arr[i]+ " ");    
        }
        
           
    }
    static public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;

        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;        
            i++;
            j--;
        }
    }
}