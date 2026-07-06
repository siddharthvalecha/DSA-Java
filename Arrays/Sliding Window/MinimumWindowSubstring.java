// Leetcode 76. Minimum Window Substring  https://leetcode.com/problems/minimum-window-substring/description/
 

package dsa.SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class MinimumWindowSubstring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
          System.out.println("Enter The String ");
        String str=sc.next();
      
        
        int ans=solu(str);
        System.out.println("Answer is :"+ ans);
    }
    public static int solu(String t){
         int m=t.length();
        int high=0;
        int low=0;
        HashMap<Character,Integer> freqt=new HashMap<>();
        for(int i=0;i<m;i++){
            char charAti=t.charAt(i);
            freqt.put(charAti,freqt.getOrDefault(charAti,0)+1);
            while()
            }
        System.out.println(freqt);
        return 0;
    }
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int low=0;
        int high=0;
        HashMap<Character,Integer> freq=new HashMap<>();
        int res=Integer.MIN_VALUE;
        for(high=0;high<n;high++){
            char charAtHigh=s.charAt(high);
            freq.put(charAtHigh,freq.getOrDefault(charAtHigh,0)+1);
            int k=high-low+1;
            while(freq.size()<k){
                char charAtLow=s.charAt(low);
                freq.put(charAtLow,freq.get(charAtLow)-1);
                if(freq.get(charAtLow)==0){
                    freq.remove(charAtLow);
                }
                low++;
                k=high-low+1;
            }
            int len=high-low+1;
            res=Math.max(len,res);
            
        }
        if(res==Integer.MIN_VALUE){
            res=0;
        }
        return res;
    }    
}
