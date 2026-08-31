//198. House Robber  https://leetcode.com/problems/house-robber/description/

package dsa.DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;


public class HouseRobber {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
            
            int ans=rob(arr);
            int ans1=robTabu(arr);
            int ans2=robSpaceOpti(arr);
            System.out.println("Max Amount of money  "+ans);
            System.out.println("Max Amount of money  "+ans1);
            System.out.println("Max Amount of money  "+ans2);
    }
     public static int rob(int[] nums) {
        int n=nums.length;
        //return robberRecur(nums,n-1);
         int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return robberMemo(nums,n-1,dp);
    }
      public static  int robberRecur(int[] nums,int i){
       if(i==0) return nums[i];
       if(i<0) return 0 ;

       int pick=nums[i]+robberRecur(nums,i-2);
       int notpick=0+robberRecur(nums,i-1);
       return Math.max(pick,notpick);
    }
      public static int robberMemo(int[] nums,int i,int[] dp){
       if(i==0) return nums[i];
       if(i<0) return 0 ;
        if(dp[i]!=-1){
            return dp[i];
        }
       int pick=nums[i]+robberMemo(nums,i-2,dp);
       int notpick=0+robberMemo(nums,i-1,dp);
       dp[i]=Math.max(pick,notpick);
       return dp[i];
    }
      public static int robTabu(int[] nums){
           int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1) pick+=dp[i-2];
            int notPick=0+dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
        return dp[n-1];
      }
      public static int robSpaceOpti(int[] nums){
          int n=nums.length;
          int prev=nums[0];
          int prev2=0;
          for(int i=1;i<n;i++){
              int take=nums[i];
              if(i>1) take+=prev2;
              int notTake=0+prev;
              int curri=Math.max(take,notTake);
              prev2=prev;
              prev=curri;
          }
          return prev;
      }
}


 