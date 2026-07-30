
package dsa.Recursion.Array;

import java.util.Scanner;

public class SearchEleInArray {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
            if(findEle(arr,target,0)){
                System.out.println("Found");
            }else{
                System.out.println("Not Found");
            }
    }
    public static boolean findEle(int[] nums,int target,int idx) {
                int n=nums.length;
                if(idx==n)
                        return false;
                 if(nums[idx]==target) return true;
                 
                boolean ans=findEle(nums,target,idx+1);
                return ans;
    }
}


 