/*//409. Longest Palindromehttps://leetcode.com/problems/longest-palindrome/description/
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        int n=s.length();
        HashMap<Character,Integer> freq=new HashMap<>();
        int res=0;
        boolean odd=false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            char ch=entry.getKey();
            int val=entry.getValue();
            //EVEN HE direct plus
            if(val%2==0){
                res+=val;
            }
            // Odd he to flag change
            else{
                odd=true;
            }

        }
        //odd not exist
        if(!odd){
            return res;
        }
        for(Map.Entry<Character,Integer> entry: freq.entrySet()){
            int val=entry.getValue();
            if(val%2==1){
                res+=val-1;
            }

        }
            return res+1;
    }
}
    
   
