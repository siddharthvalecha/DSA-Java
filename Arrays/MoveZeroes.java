/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class MoveZeroes {

    public static void main(String[] args) {
       int[] nums={0,1,0,3,12};
      nums= moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            
        }
    }
    public static  int[] moveZeroes(int[] nums) {
        int pos=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {   
            if(nums[i]!=0)
            {
                nums[pos]=nums[i];
                pos++;  
            }
            
        }
        for(int j=pos;j<n;j++)
        {
            nums[j]=0;
        }
        return nums;
    }
 }