/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class CreateTargetArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans=createTargetArray(nums,index);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
            
        }
    }
    
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        int pos=0;
        for(int i=0;i<nums.length;i++)
        {
            pos=index[i];
//            if(pos<i)
//            {
                for(int k=i;k>pos;k--){
                target[k]=target[k-1];
                
            }
           target[pos]=nums[i];
            }
        
        return target;
    }
}
