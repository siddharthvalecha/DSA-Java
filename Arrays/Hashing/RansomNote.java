
/*//383. Ransom Note   https://leetcode.com/problems/ransom-note/description/
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
public class RansomNote {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings");
        String s=sc.nextLine();
        String m=sc.nextLine();
        System.out.println(canConstruct(s,m));
        System.out.println(canConstructOptimal(s,m));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int m=magazine.length();
        if(n>m) return false;
        HashMap<Character,Integer> freqm=new HashMap<>();

        for(int i=0;i<m;i++){
            char ch=magazine.charAt(i);
            freqm.put(ch,freqm.getOrDefault(ch,0)+1);
        }
        int j=0;
        while(j<n){
            char ch=ransomNote.charAt(j);
            int freq=freqm.getOrDefault(ch,0);
            freq--;
            freqm.put(ch,freq);
            if(freq<0)
                return false;
            j++;    
        }
        return true;

    }
    public static boolean canConstructOptimal(String ransomNote, String magazine) {
        int[] freq=new int[26];
        int n=magazine.length();
        for(int i=0;i<n;i++){
            char ch=magazine.charAt(i);
            freq[ch-'a']++;
        }
        int m=ransomNote.length();
        for(int i=0;i<m;i++){
            char ch=ransomNote.charAt(i);
            freq[ch-'a']--;
            if(freq[ch-'a']<0)
                return false;

        }
        return true;
    }
}
    
   
