//LEETCODE Max Consecutive Ones https://leetcode.com/problems/max-consecutive-ones/description/

package dsa.SlidingWindow;

import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
          }
          int ans=findMaxConsecutiveOnes(arr);
        System.out.println("Answer is :"+ans);
   }
 
     public static int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                res=Math.max(res,count);
            }else if(nums[i]==0){
                count=0;
            }
        }
        return res;
    } 
}
