//TUF SecondMostFreqEle  in an Arrayhttps://takeuforward.org/practice/dsa/second-highest-occurring-element


package dsa.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class SecondMostFreqEle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i <nums.length; i++) {
                nums[i]=sc.nextInt();
        }
        int ans=secondMostFrequentElement(nums);
        System.out.println(ans);
        
}
public static  int secondMostFrequentElement(int[] nums) {
            int n=nums.length;
            HashMap<Integer,Integer> freq=new HashMap<>();
            for(int i=0;i<n;i++){
               freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            }
            int firstFreq=-1;
            int secondFreq=-1;
            int firstAns=-1;
            int secondAns=-1;
            if(freq.size()<2) return -1;
            
            for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
                    int key=entry.getKey();
                    int value=entry.getValue();
                    
                    if(value>firstFreq){
                        secondFreq=firstFreq;
                        secondAns=firstAns;
                        
                        firstFreq=value;
                        firstAns=key;
                    }
                    else if(value==firstFreq){
                        firstAns=Math.min(firstAns,key);
                    }
                    else if(value > secondFreq){
                        secondFreq=value;
                        secondAns=key;
                    }
                    else if(value==secondFreq){
                        secondAns=Math.min(secondAns,key);
                    }
            }
            return secondFreq==-1? -1 : secondAns;
    }
}
