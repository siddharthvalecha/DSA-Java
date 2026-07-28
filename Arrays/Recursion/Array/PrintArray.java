// 1979. Find Greatest Common Divisor of Array https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/

package dsa.Recursion.Array;


import dsa.*;
import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
     printArr(arr,0);
    }
    public static void printArr(int[] nums,int idx) {
            int n=nums.length;
            if(idx==n)
                return;
            
            System.out.println(nums[idx]);
            printArr(nums,idx+1);
    }
}


 