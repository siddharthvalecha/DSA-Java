// Leetcode 3. Longest Substring Without Repeating Characters https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

package dsa.SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class LongestSubstringWoutRepeating {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
          System.out.println("Enter The String ");
        String str=sc.next();
      
        
        int ans=lengthOfLongestSubstring(str);
        System.out.println("Answer is :"+ ans);
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
