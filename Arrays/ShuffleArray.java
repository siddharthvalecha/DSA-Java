/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class ShuffleArray {

    
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] ans=shuffle(nums,n);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
        public static int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
        }
        return ans;
    
    }
    
}
