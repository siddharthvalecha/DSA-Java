//14. Longest Common Prefix https://leetcode.com/problems/longest-common-prefix/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.String.TwoPointer;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LargestCommonPrefix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=sc.nextInt();
        String[] strs=new String[n];
        System.out.println("Enter Strings");
        for(int i=0;i<n;i++){
            strs[i]=sc.next();
        }
        
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefixGood(strs));
           
    }
    static public String longestCommonPrefix(String[] strs) {
            if(strs.length==1) return strs[0];
            int n=strs.length;
            String str1=strs[0];
            String str2=strs[1];
            String prefix=findPrefix(str1,str2);
            for(int i=2;i<n;i++){
                prefix=findPrefix(prefix,strs[i]);
            }
            return prefix;
        }
    public static String longestCommonPrefixGood(String[] strs) {

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {

            prefix = findPrefix(prefix, strs[i]);

            if(prefix.isEmpty()) {
                return "";
            }
        }

        return prefix;
    }

    public static  String findPrefix(String s1,String s2){
        int i=0;
        int j=0;
        if(s1.isEmpty() || s2.isEmpty()) return "";
        while(i<s1.length() && j<s2.length()&& s1.charAt(i)==s2.charAt(j)){
            i++;
            j++;
        }
        return s1.substring(0,i);
    } 
}