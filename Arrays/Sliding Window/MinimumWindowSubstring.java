// Leetcode 76. Minimum Window Substring  https://leetcode.com/problems/minimum-window-substring/description/
 

package dsa.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class MinimumWindowSubstring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
          System.out.println("Enter The String ");
        String str1=sc.next();
        String str2=sc.next();
        
       String ans=minWindow(str1,str2);
        System.out.println("Answer is :"+ ans);
    }
    public static String minWindow(String s,String t){
            
            int low=0;
            int start=0;
            int high=0;
            int n=s.length();
            int res=Integer.MAX_VALUE;
            
            HashMap<Character,Integer> freqs=new HashMap<>();
            HashMap<Character,Integer> freqt=makeFreqt(t);
            for(high=0;high<n;high++){
                char charAtHigh=s.charAt(high);
                freqs.put(charAtHigh, freqs.getOrDefault(charAtHigh,0)+1);
                while(isValid(freqs,freqt)){
                    int len=high-low+1;
                    if(res>len){
                        res=len;
                        start=low;
                    }
                    char charAtLow=s.charAt(low);
                    freqs.put(charAtLow,freqs.getOrDefault(charAtLow,0)-1);
                    if(freqs.get(charAtLow)==0){
                        freqs.remove(charAtLow);
                    }
                    low++;
                }
                
            }
            if(res==Integer.MAX_VALUE) return "";
            
            return s.substring(start,start+res);
        
    }
        public static HashMap<Character,Integer> makeFreqt(String t){
                HashMap<Character,Integer> freqt=new HashMap<>();
                int n=t.length();
                for (int i = 0; i < n; i++) {
                char ch=t.charAt(i);
                freqt.put(ch,freqt.getOrDefault(ch, 0)+1);
                }
                return freqt;
        }
        public static boolean isValid(HashMap<Character,Integer> freqs,HashMap<Character,Integer> freqt){
            for(Map.Entry<Character,Integer> entry : freqt.entrySet()){
                char ch=entry.getKey();
                int reqfreq=entry.getValue();
                if(freqs.getOrDefault(ch, 0)<reqfreq){
                    return false;
                }
            }
            return true;
        }
}
