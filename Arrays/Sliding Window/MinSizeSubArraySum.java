//LeetCode 209. Minimum Size Subarray Sum https://leetcode.com/problems/minimum-size-subarray-sum/description/
 

package dsa.SlidingWindow;

import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class MinSizeSubArraySum {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
          }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" "); 
   }
        int ans=minSubArrayLen(target, arr);
        System.out.println("Answer is :"+ans);
  }
     public static int minSubArrayLen(int target, int[] nums) {
          int n=nums.length;
          int sum=0;
          int len=0;
          int low=0;
          int high=0;
          int res=Integer.MAX_VALUE;
          while(high<n){
           sum+=nums[high];//hire
           while(sum>=target){//check
               len=high-low+1;
               if(len<res){
                   res=len;//note
               }
               sum-=nums[low];//fire
               low++;
           }   
           high++;
          }
          if(res==Integer.MAX_VALUE){
              res=0;
          }
          return res;
    }
    
}
