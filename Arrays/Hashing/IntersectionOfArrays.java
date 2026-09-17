//349. Intersection of Two Arrays https://leetcode.com/problems/intersection-of-two-arrays/description/


package dsa.Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class IntersectionOfArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nums=new int[n];
        int[] nums1=new int[m];
        System.out.println("Enter elements of first Array");
        for (int i = 0; i <nums.length; i++) {
                nums[i]=sc.nextInt();
        }
        
        System.out.println("Enter elements of Second Array");
        for (int i = 0; i <m; i++) {
                nums1[i]=sc.nextInt();
        }
        int[]  ans=intersection(nums,nums1);
        for(int x:ans){
            System.out.println(x);
        }
        
}
        public static int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> resultSet=new HashSet<>();
        for(int ele:nums1){
            set.add(ele);
        }
        int i=0;
        while(i<m){
            if(set.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }
            i++;
        }   
        int[] ans=new int[resultSet.size()];
        int x=0;
        for(int ele:resultSet){
            ans[x++]=ele;
        }
        return ans;
    }
}
