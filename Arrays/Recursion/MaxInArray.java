
package dsa.Recursion;

import java.util.Scanner;

public class MaxInArray {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
            int ans=maxElement(arr,0);
            System.out.println("Max Element is:"+ans);
    }
    public static int maxElement(int[] nums,int idx) {
                int n=nums.length;
                if(idx==n-1)
                        return nums[idx];
                
                int smallAns=maxElement(nums,idx+1);
                return Math.max(smallAns,nums[idx]);
    }
}


 