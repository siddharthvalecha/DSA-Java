
package dsa.Recursion.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

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
//            int ans=findEle(arr,target,0);
//                if(ans!=-1)
//                        System.out.println("Found At :"+ans );
//                else
//                System.out.println("Not Found");
//            
//    }
          ArrayList<Integer> ans=findEle(arr,target,0);
          for (int i : ans) {
              System.out.print(i+" ");
        }
    }
//    public static ArrayList<Integer> findEle(int[] nums,int target,int idx) {
//               int n=nums.length;
//               if(idx==n){
//                   return -1;
//               }
//               if(nums[idx]==target){
//                   return idx;
//               }
//               return findEle(nums,target,idx+1);
//    }
    public static ArrayList<Integer> findEle(int[] nums,int target,int idx) {
               int n=nums.length;
               
               ArrayList<Integer> ans=new ArrayList<>();
               if(idx==n) return ans;
               
               if(nums[idx]==target) ans.add(idx);
               
               ArrayList<Integer> smallAns= findEle(nums,target,idx+1);
               ans.addAll(smallAns);
               
               return ans;
    }
}


 