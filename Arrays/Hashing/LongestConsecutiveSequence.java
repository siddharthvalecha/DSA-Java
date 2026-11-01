//128. Longest Consecutive Sequence https://leetcode.com/problems/longest-consecutive-sequence/


package dsa.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class LongestConsecutiveSequence {

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
        int ans=longestConsecutive(nums);
        int ans1=longestConsecutiveOptimal(nums);
        System.out.println(ans+"\n"+ans1);
        
}
        public static int longestConsecutive(int[] nums) {
        int n=nums.length;
        if (n == 0) return 0;
        Arrays.sort(nums);
        int i=1;
        int count=1;
        int maxCount=1;
        while(i<n){
            if(nums[i]==nums[i-1]){
                i++;
                continue;
            } 
            else if(nums[i]-nums[i-1]==1){
                count++;
                maxCount=Math.max(maxCount,count);
                i++;
                continue;
            }
            count=1;
            i++;
        }
        return maxCount;
    }
        
    public static int longestConsecutiveOptimal(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int res=0;
        for(int ele: nums){
            set.add(ele);
        }
        for(int ele:set){
            if(set.contains(ele-1)){
                continue;
            }
            int currentLength=1;
            int nextEle=ele+1;
            while(set.contains(nextEle)){
                currentLength++;
                nextEle++;
            }
            res=Math.max(res,currentLength);
        }
        return res;
    }

}
