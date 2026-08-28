//70. Climbing Stairs https://leetcode.com/problems/climbing-stairs/

package dsa.DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;


public class ClimbingStairs {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the steps:");
      int n=sc.nextInt();
      
            int ans=climbStairsMemoization(n);
            System.out.println("No of ways to climb is : "+ans);
    }
    public static int climbStairsMemoization(int n) {
        int[] dp=new int[n+1];
            Arrays.fill(dp,-1);
        //return climbDPMemo(n,dp);
        return climbDPTabulation(n,dp);
    }
    public static int climbDP(int n,int[] dp){
        if(n==0 || n==1) return 1;

        if(dp[n]!=-1){
            return dp[n];
        }
        int left=climbDP(n-1,dp);
        int right=climbDP(n-2,dp);

        dp[n]=left+right;
        return dp[n];
    }
    public static int climbDPTabulation(int n,int[] dp){
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
}


 