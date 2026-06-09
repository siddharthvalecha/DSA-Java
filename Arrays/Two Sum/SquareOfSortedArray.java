// Leetcode 977. Squares of a Sorted Array  https://leetcode.com/problems/squares-of-a-sorted-array/description/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.twosum;

import static dsa.twosum.TwoSum.twoSum;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SquareOfSortedArray {

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
        

            int[] ans=sortedSquares(arr);
            System.out.println("Answer  is");
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[j]+"  ");
            }
     
            
    }
    public static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int i=0;
        int j=n-1;
        int k=n-1;
        while(k>=0){
            if(Math.abs(nums[i])>=Math.abs(nums[j])){
            ans[k]=nums[i]*nums[i];
            k--;
            i++;
        }
        else if(Math.abs(nums[i])<Math.abs(nums[j])){
            ans[k]=nums[j]*nums[j];
            k--;
            j--;
        }
        }
        
        
        return ans;
    }
}
    

