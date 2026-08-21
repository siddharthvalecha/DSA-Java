/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.Hashing;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class FristUniqueCharString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int n=s.length();
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(freq.get(ch)==1)
                return i;

        }
        return -1;
    }
}
    
   
