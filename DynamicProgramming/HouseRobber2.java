//213. House Robber II   https://leetcode.com/problems/house-robber-ii/description/

package dsa.DynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class HouseRobber2 {

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
            //int ans1=robberTabu();
            int ans2=robSpaceOpti(arr);
            System.out.println("Max Amount of money  "+ans);
            //System.out.println("Max Amount of money  "+ans1);
            System.out.println("Max Amount of money  "+ans2);
    }
     public static int rob(int[] nums) {
       int n=nums.length;
                if (n == 1) {
            return nums[0];
        }
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0) arr1.add(nums[i]);
            if(i!=n-1) arr2.add(nums[i]);
        }
        //int ans1=robberRecur(arr1,arr1.size()-1);
        //int ans2=robberRecur(arr2,arr2.size()-1);
        /*int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int ans1=robberMemo(arr1,arr1.size()-1,dp);
        Arrays.fill(dp,-1);
        int ans2=robberMemo(arr2,arr2.size()-1,dp);
        return Math.max(ans1,ans2);*/
        int[] dp=new int[n];
        int ans1=robberTabu(arr1);
        Arrays.fill(dp,-1);
        int ans2=robberTabu(arr2);
        return Math.max(ans1,ans2);
        
    }
      public static  int robberRecur(List<Integer> arr,int i){

            if(i==0) return arr.get(0);
            if(i<0) return 0;

            int pick=arr.get(i)+robberRecur(arr,i-2);
            int notPick=0+robberRecur(arr,i-1);
            
            return Math.max(pick,notPick);
        }       
      public static int robberMemo(List<Integer> arr,int i,int[] dp){

            if(i==0) return arr.get(0);
            if(i<0) return 0;
            if(dp[i]!=-1) return dp[i];
            int pick=arr.get(i)+robberMemo(arr,i-2,dp);
            int notPick=0+robberMemo(arr,i-1,dp);
            return dp[i]=Math.max(pick,notPick);
        }       
    
      public static int robberTabu(List<Integer> arr) {

        int n = arr.size();

        int[] dp = new int[n];

        dp[0] = arr.get(0);

        for (int i = 1; i < n; i++) {

            int pick = arr.get(i);

            if (i > 1) {
                pick += dp[i - 2];
            }

            int notPick = dp[i - 1];

            dp[i] = Math.max(pick, notPick);
        }

        return dp[n - 1];
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


 