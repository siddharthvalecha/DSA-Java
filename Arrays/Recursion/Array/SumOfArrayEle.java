
package dsa.Recursion.Array;

import java.util.Scanner;

public class SumOfArrayEle {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
            int ans=findSum(arr,0);
            System.out.println("Sum of Elements :"+ans);
    }
    public static int findSum(int[] nums,int idx) {
                int n=nums.length;
                if(idx==n)
                        return 0;
                
                int sum=findSum(nums,idx+1);
                return nums[idx]+sum;
    }
}


 