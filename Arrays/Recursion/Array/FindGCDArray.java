// 1979. Find Greatest Common Divisor of Array https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/

package dsa.Recursion.Array;


import dsa.*;
import java.util.Scanner;

public class FindGCDArray {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
     
      int ans=findGCD(arr);
       System.out.println(ans);
    }
    public static int findGCD(int[] nums) {
       int max=nums[0];
       int min=nums[0];
       int n=nums.length;

       for(int i=0;i<n;i++){
        max=Math.max(max,nums[i]);
        min=Math.min(min,nums[i]);
       }
       int ans=findGcd(max,min); 
       return ans;
    }
    public static  int findGcd(int x,int y){
        if(y==0)
            return x;
        
        return findGcd(y,x%y);
    }
}


 