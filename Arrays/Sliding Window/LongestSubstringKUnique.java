//GFGLongest Substring with K Uniques https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

package dsa.SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class LongestSubstringKUnique {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
          System.out.println("Enter The String ");
        String str=sc.next();
        System.out.println("Enter k");
        int k=sc.nextInt();
        
        int ans=longestKSubstr(str, k);
        System.out.println("Answer is :"+ ans);
    }
    public static int  longestKSubstr(String s, int k) {
       HashMap<Character,Integer> freq=new HashMap<>();
       int n=s.length();
       int high=0;
       int low=0;
       int res=-1;
       for(high=0;high<n;high++){
           char ch=s.charAt(high);
           freq.put(ch, freq.getOrDefault(ch, 0) + 1);
           while(freq.size()>k){
              char charAtLow=s.charAt(low);
              freq.put(charAtLow,freq.get(charAtLow)-1);
              
              if(freq.get(charAtLow)==0){
                  freq.remove(charAtLow);   
              }
              low++;
           }
              if(freq.size()==k){
                  int len=high-low+1;
                    res=Math.max(len,res);  
              }
              
           
       }
       return res;
        
    }    
}
