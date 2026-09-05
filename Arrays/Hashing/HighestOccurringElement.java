//TUF Highest Occurring Element in an Array https://takeuforward.org/plus/dsa/problems/highest-occurring-element-in-an-array?source=strivers-a2z-dsa-track


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
public class HighestOccurringElement {

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
        int ans=mostFrequentElement(nums);
        System.out.println(ans);
        
}
public static    int mostFrequentElement(int[] nums) {
     int n=nums.length;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     }
     Integer max=Integer.MIN_VALUE;
     int ans=0;
     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        Integer key=entry.getKey();
        Integer value=entry.getValue();
        if(value>max){
                max=value;
                ans=key;
            }
          else if(value==max){
            if(key<ans){
                max=value;
                ans=key;
            }
          }  
            
        }    
         return ans;
         }
        
    }
