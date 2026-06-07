//GFG Max Sum Subarray of size K  https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

package dsa.SlidingWindow;

import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class MaxSumSumArray {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
          }
        System.out.println("Enter the k");
        int k=sc.nextInt();
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" "); 
   }
        int ans=maxSubarraySum(arr,k);
        System.out.println("Anser is :"+ans);
  }
     public static int maxSubarraySum(int[] arr, int k) {
        int n=arr.length;
        int sum=0;
        int res=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int low=0;
        int high=k-1;
        while(high<n){
            if(sum>res){
                res=sum;
            }
        low++;
        high++;
        sum-=arr[low-1];
        if(high==n){
            break;
        }
        sum+=arr[high];
            
        }
        return res;
    }
    
}
