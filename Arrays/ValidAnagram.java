/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class ValidAnagram {

    public static void main(String[] args) {
        String s="carrace";
        String t="racecar";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        int[] freq=new int[26];
        if(slen!=tlen) 
        {
            return false;
        }
        for(int i=0;i<slen;i++)
        {
         freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
        }
        for(int count:freq)
        {
            if(count!=0)
            {
                return false;
            }
           
        }
        return true;
    }
}
    
   
