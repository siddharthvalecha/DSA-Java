/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class SingleNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int candid=0;
        for(int i=0;i<nums.length;i++)
        {   
           candid^=nums[i];
        }
        return candid;
    }
    
}
