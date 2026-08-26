//TUF https://takeuforward.org/plus/dsa/problems/count-all-subsequences-with-sum-k?source=strivers-a2z-dsa-track
package dsa.Recursion.Array;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfSubSequenceK {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
        System.out.println("Enter k");
        int k=sc.nextInt();
           System.out.println(countSubsequenceWithTargetSum(arr, k));
    }
   public static int countSubsequenceWithTargetSum(int[] nums, int k) {
        int sum=0;
        return countSubsequence(nums,k,0,sum);

    }
    public  static int countSubsequence(int[] arr, int k, int i, int sum) {
        int n = arr.length;
        
        // Base case: Reached end of array
        if (i == n) {
            return (sum == k) ? 1 : 0;
        }

        // Choice 1: Include arr[i] in the sum
        int include = countSubsequence(arr, k, i + 1, sum + arr[i]);

        // Choice 2: Exclude arr[i] from the sum
        int exclude = countSubsequence(arr, k, i + 1, sum);

        // Return total valid subsequences from both choices
        return include + exclude;
    }
}


 