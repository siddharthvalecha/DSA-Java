
package dsa.Recursion.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckArrayIsSorted {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
      
       boolean ans=isSorted(arr,0);
        if(ans) System.out.println("Array is sorted");
        
        else System.out.println("Array is not sorted");
          
    }
    public static boolean isSorted(int[] nums,int idx) {
               int n=nums.length;
               if (n == 0) return true; 
               
               if(idx==n-1)
                    return true;
               
               if(nums[idx]>nums[idx+1])
                    return false;
               
               return isSorted(nums,idx+1);
    }
}


 