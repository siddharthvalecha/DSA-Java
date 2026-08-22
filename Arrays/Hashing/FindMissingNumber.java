//268. Missing Number https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=sorting


package dsa.Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class FindMissingNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i <nums.length; i++) {
                nums[i]=sc.nextInt();
        }
        int ans=missingNumber(nums);
        int ans1=missingNumberOptimal(nums);
        System.out.println(ans+"\n"+ans1);
        
}
        public static int missingNumber(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<=n;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
        public static int missingNumberOptimal(int[] nums) {
       int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int ele:nums){
            actualSum+=ele;
        }
        return expectedSum-actualSum;
    }
}
