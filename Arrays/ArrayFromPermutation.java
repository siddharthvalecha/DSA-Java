/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class ArrayFromPermutation {

    
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        int[] ans=buildArray(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
    public static int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
      for(int i=0;i<nums.length;i++)
      {
        ans[i]=nums[nums[i]];
      }
      return ans;
    }
    
}
