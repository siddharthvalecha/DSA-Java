//Code 360 nuaukri  frog jump https://www.naukri.com/code360/problems/frog-jump_3621012

package dsa.DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;


public class FrogJump {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
            int ans=frogJump(n,arr);
            System.out.println("Best Minimum jump  is "+ans);
    }
     public static int frogJump(int n, int heights[]) {
        
         int energy=0;
        //return jumpRec(n,heights,energy,n-1);
         int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        //return jumpMemo(n,heights,n-1,dp);
        //return jumpTabu(n-1,heights,dp);
        return jumpOptimized(n-1,heights);
    }
    public static int jumpRec(int n, int h[],int energy,int i){
        if(i==0) return 0;
        if(i==1) return Math.abs(h[i]-h[i-1]);
        int diff=0; 
        diff=Math.abs(h[i]-h[i-1]);
        int oneStep=diff+jumpRec(n,h,energy,i-1);
        diff=Math.abs(h[i]-h[i-2]);
        int twoStep=diff+jumpRec(n,h,energy,i-2);
        energy=Math.min(oneStep,twoStep);
        return energy;
      }
    public static int jumpMemo(int n, int h[],int i,int[] dp){
        if(i==0) return 0;
        if(i==1) return Math.abs(h[i]-h[i-1]);
        int diff=0; 
        int oneStep=0;
        int twoStep=0;
        int energy;
        diff=Math.abs(h[i]-h[i-1]);
        if(dp[i]!=-1){
        return dp[i]; 
        }
        oneStep=diff+jumpMemo(n,h,i-1,dp);
        diff=Math.abs(h[i]-h[i-2]);
        twoStep=diff+jumpMemo(n,h,i-2,dp);
        energy=Math.min(oneStep,twoStep);
        dp[i]=energy;
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


 