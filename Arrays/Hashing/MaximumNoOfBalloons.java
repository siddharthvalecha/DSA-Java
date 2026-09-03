
/*//1189. Maximum Number of Balloons   https://leetcode.com/problems/maximum-number-of-balloons/description/
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
public class MaximumNoOfBalloons {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings");
        String s=sc.nextLine();
        System.out.println(maxNumberOfBalloons(s));
        System.out.println(maxNumberOfBalloonsOptimal(s));
    }
    public static int maxNumberOfBalloons(String text) {
        int n=text.length();
        int count=0;
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=text.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);

        }
        String s="balloon";
        int m=s.length();
        int j=0;
        while(true){
            for(int i=0;i<m;i++){
            char ch=s.charAt(i);
            int fr=freq.getOrDefault(ch,0);
            fr--;
            if(fr<0){
                return count;
            }
            freq.put(ch,fr); 
        }   
        count++;
        }
    }
    public static int maxNumberOfBalloonsOptimal(String text) {
        int[] freq=new int[26];
        int size=text.length();
        for(int i=0;i<size;i++){
            freq[text.charAt(i)-'a']++;
        }
        int b=freq['b'-'a'];
        int a=freq['a'-'a'];
        int l=freq['l'-'a']/2;
        int o=freq['o'-'a']/2;
        int n=freq['n'-'a'];
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
    
}
    
   
