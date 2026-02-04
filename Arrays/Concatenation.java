/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class Concatenation {

    
    public static void main(String[] args) {
         int[] nums={1,3,2,1};
        int[] ans=getConcatenation(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*(nums.length)];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
    
}
