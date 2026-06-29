//LeetCode 26. Remove Duplicates from Sorted Array 
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
package dsa.twosum;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class RemoveDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
   
            int ans=removeDuplicates(arr);
            System.out.println("Answer  is"+ans);
           
        }

          public static int removeDuplicates(int[] nums) {
      int n=nums.length;
      int officer=0;
      int cm=1;
      int res=1;
      while(cm<n){
        if(nums[cm]==nums[cm-1])
        {
            cm++;
            continue;
        }
        nums[officer+1]=nums[cm];
        officer++;
        cm++;
        res++;
      }
       return res;
      }  
     
    }
     
