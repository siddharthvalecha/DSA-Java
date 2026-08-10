//https://atcoder.jp/contests/dp/tasks/dp_a

package dsa.Recursion.Array;

import java.util.Scanner;

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
            int ans=best(arr,0);
            System.out.println("Best Minimum jump is "+ans);
    }
    public static int best(int[] nums,int idx) {
                int n=nums.length;
                if(idx==n-1) return 0;
                
                int op1=best(nums,idx+1)+Math.abs(nums[idx]-nums[idx+1]);
                if(idx==n-2) return op1;
                int op2=best(nums,idx+2)+Math.abs(nums[idx]-nums[idx+2]);
                return Math.min(op1,op2);
    }
}


 