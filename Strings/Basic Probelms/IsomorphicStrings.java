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
public class IsomorphicStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Strings");
        String s=sc.next();
        String t=sc.next();
       System.out.println(isIsomorphic(s,t));
           
    }
    static public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map1.containsKey(ch1)){
                if(map1.get(ch1)!=ch2) return false; 
            }
            if(map2.containsKey(ch2)){
                if(map2.get(ch2)!=ch1) return false;
            }
           map1.put(ch1, ch2);
           map2.put(ch2, ch1);
        }
            return true;
    }
}