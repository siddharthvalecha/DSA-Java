//LC 31. Next Permutation  https://leetcode.com/problems/next-permutation/
package dsa.TwoPointers;

import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class NextPermutation {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        nextPermutation(arr);
        System.out.println("Next Permutation");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
  }
     public static  void nextPermutation(int[] nums) {
      int n=nums.length;
      int idx=-1;
      for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            idx=i;
            break;
        }
      }
      if(idx==-1){
        reverse(nums,0,n-1);
        return;
      }
      for(int i=n-1;i>idx;i--){
        if(nums[i]>nums[idx]){
            swap(nums,i,idx);
            break;
        }
      }
      reverse(nums,idx+1,n-1);
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
     public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
