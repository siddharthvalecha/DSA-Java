/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class GoodPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] nums={1,2,3,1,1,3};
      int ans=numIdenticalPairs(nums);
        System.out.println(ans);
    }
    public static int numIdenticalPairs(int[] nums) {
        int[] freq=new int[101];
        int pairs=0;
        for(int num:nums)
        {
            pairs+=freq[num];
            freq[num]++;
        }
        return pairs;

    }
//    public static int numIdenticalPairs(int[] nums) {
//        int count=0;
//        int n=nums.length;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=n-1;j>=0;j--)
//            {
//                if(nums[i]==nums[j] && i<j)
//                {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
    
}
