//169. Majority Elementhttps://leetcode.com/problems/majority-element/description/


package dsa.Hashing;

import static dsa.MajorityElement.majorityElement;
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
public class MajorityElement {

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
        int ans=majorityElement(nums);
        int ans1=majorityElementOptimal(nums);
        System.out.println(ans+"\n"+ans1);
        
}
    
        public static int MajorityElement(int[] nums){
                int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num=entry.getKey();
            int val=entry.getValue();
            if(val>(n/2)) return num;
        }
        return 0;
        }
    
        public static int majorityElementOptimal(int[] nums) {
            int n=nums.length;
        int count=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ele=nums[i];
            }
            else if(ele==nums[i]) count++;
            else count--;
        }
        return ele;
    }
}
