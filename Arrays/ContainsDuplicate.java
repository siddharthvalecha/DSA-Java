/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.Arrays;

/**
 *
 * @author Siddharth Valecha
 */
public class ContainsDuplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
	System.out.println(hasDuplicate(nums));
    }
    
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    } 

	public static  boolean hasDuplicate(int[] a) {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    return true;
                }

            }
          
        }
	return false;
}
}
