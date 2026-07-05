//Leetcode 713. Subarray Product Less Than K   https://leetcode.com/problems/subarray-product-less-than-k/description/

package dsa.SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class SubarrayProductLessK {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
          System.out.println("Enter The Array Size ");
          int n=sc.nextInt();
          int[] arr=new int[n];
          System.out.println("Enter array elements");
          for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
          }
        System.out.println("Enter k");
        int k=sc.nextInt();
        
        int ans=numSubarrayProductLessThanK(arr,k);
        System.out.println("Answer is :"+ ans);
    }
    public static int  numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int prod=1;
        int count=0;
        int high=0;
        int low=0;
        for(high=0;high<n;high++){
            prod*=nums[high];
            while(prod>=k){
                prod/=nums[low];
                low++;
             }
            int len=high-low+1;
            count+=len;
        }
        return count;
        }
}
