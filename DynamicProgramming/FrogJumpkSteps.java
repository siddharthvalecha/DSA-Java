//TUF  frog jump with k dist https://takeuforward.org/plus/dsa/problems/frog-jump-with-k-distances

package dsa.DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;


public class FrogJumpkSteps {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
        System.out.println("Enter k");
        int k=sc.nextInt();
            int ans=frogJump(arr,k);
            System.out.println("Best Minimum jump  is "+ans);
    }
     public static int frogJump( int heights[],int k) {
          int n=heights.length;
        //return kJump(heights,k,n-1);
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return kjumpMemo(heights,k,n-1,dp);
    }
    public static int kJump(int[] h,int k,int i){
        if(i==0) return 0;
        int minStep=Integer.MAX_VALUE;

        for(int j=1;j<=k;j++){
            if(i-j>=0){
                int energy=kJump(h,k,i-j)+Math.abs(h[i]-h[i-j]);
                minStep=Math.min(minStep,energy);
            }
            }
        return minStep;
    }
    public static int kjumpMemo(int h[],int k,int i,int[] dp){
        if(i==0) return 0;
        int minStep=Integer.MAX_VALUE;
        if(dp[i]!=-1) return dp[i];
        for(int j=1;j<=k;j++){
            if(i-j>=0){
                
                int energy=kjumpMemo(h,k,i-j,dp)+Math.abs(h[i]-h[i-j]);
                minStep=Math.min(minStep,energy);
            }
            }
        dp[i]=minStep;
        return dp[i];
      }
    public static int jumpTabu(int n,int[] h,int[] dp){
        dp[0]=0;
        dp[1]=Math.abs(h[1]-h[0]);
        
        for(int i=2;i<=n;i++){
            int oneStep=Math.abs(h[i]-h[i-1])+dp[i-1];
            int twoStep=Math.abs(h[i]-h[i-2])+dp[i-2];
            dp[i]=Math.min(oneStep,twoStep);
        }
            return dp[n];
    }
    public static int jumpOptimized(int  n,int[] h){
        
        if (n <= 1) return 0;
        
            int prev=Math.abs(h[1]-h[0]);
            int prev2=0;
            for (int i = 2; i <n; i++) {
            int oneStep=Math.abs(h[i]-h[i-1])+prev;
            int twoStep=Math.abs(h[i]-h[i-2])+prev2;
            int curri=Math.min(oneStep,twoStep);
            prev2=prev;
            prev=curri;
            
        }
            return prev;
    }
}


 