/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class RunningSum1D {

    
    public static void main(String[] args) {
        int[] nums={3,1,2,10,1};
        int[] ans=runningSum(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] runningSum(int[] nums) {
        int sum=0;
        int[] runningSum=new int[nums.length];
       for(int i=0;i<nums.length;i++)
       {
            sum+=nums[i];
            runningSum[i]=sum;
       } 
       return runningSum;
    }
   }
    

