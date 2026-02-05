/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class SmallerNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
      int[] ans=smallerNumbersThanCurrent(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq=new int[101];
        int[] smaller=new int[101];
        int[] result=new int[nums.length];
        for(int num:nums)
        {
            freq[num]++;
        }
        smaller[0]=0;
        for(int i=1;i<101;i++)
        {
            smaller[i]=smaller[i-1]+freq[i-1];
        }
        for(int i=0;i<nums.length;i++)
        {   
            result[i]=smaller[nums[i]];
        }
        return result;
    }
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int count=0;
//        int n=nums.length;
//        int[] result=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            for(int j=n-1;j>=0;j--)
//            {
//                if(nums[i]>nums[j])
//                {
//                    count++;
//                }
//                result[i]=count;
//            }
//            count=0;
//        }
//        return result;
//    }
    
}
