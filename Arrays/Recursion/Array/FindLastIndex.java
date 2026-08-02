
package dsa.Recursion.Array;


import java.util.Scanner;

public class FindLastIndex {

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

         int ans=findLastInd(arr,target,n-1);
          System.out.println("Answer is"+ ans);
    }

    public static int findLastInd(int[] nums,int target,int idx) {
               
               if(idx==-1){
                   return -1;
               }
               if(nums[idx]==target){
                   return idx;
               }
               
               return findLastInd(nums, target, idx-1);
               
    }
}


 