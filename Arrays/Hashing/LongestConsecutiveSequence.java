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
        System.out.println(ans);
        
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

}
