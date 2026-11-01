//169. Majority Element2 https://leetcode.com/problems/majority-element/description/


package dsa.Hashing;

import static dsa.MajorityElement.majorityElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class MajorityElement2 {

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
        List<Integer> ans=majorityElement(nums);
        List<Integer> ans1=majorityElementOptimal(nums);
        System.out.println(ans+"\n"+ans1);
        
}
    
        public static List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>n/3){
                res.add(key);
            }
        }
        return res;
    }
    
        public static List<Integer> majorityElementOptimal(int[] nums) {
                int n=nums.length;
        List<Integer> res=new ArrayList<>();
        int count1=0;
        int count2=0;
        int ele1=Integer.MAX_VALUE;
        int ele2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(count1==0 && nums[i]!=ele2){
                count1=1;
                ele1=nums[i];
            }
            else if(count2==0 && nums[i]!=ele1){
                count2=1;
                ele2=nums[i];
            }
            else if(nums[i]==ele1) count1++;
            else if(nums[i]==ele2) count2++;
            else{
                count1--;
                count2--;
            }

        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1) count1++;
            else if(nums[i]==ele2) count2++;
        }
        if(count1>n/3) res.add(ele1);
        if(count2>n/3) res.add(ele2);

        return res;
    }
}
