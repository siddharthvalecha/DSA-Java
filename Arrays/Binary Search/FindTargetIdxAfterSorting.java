package dsa.searchbinary;
//35. Search Insert Position https://leetcode.com/problems/search-insert-position/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class FindTargetIdxAfterSorting {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target");
        int target=sc.nextInt();
        System.out.println(targetIndices(arr,target));
        System.out.println(targetIndicesOptimal(arr,target));
    }
    static public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==target) res.add(i);
        }
        return res;
    }
    static public List<Integer> targetIndicesOptimal(int[] nums, int target) {
        int n=nums.length;
        int small=0;
        int tarCount=0;
        List<Integer> res=new ArrayList<>();
        for(int x:nums){
            if(x<target) small++;
            else if(x==target) tarCount++;
        }
        if(tarCount==0) return res;
        while (tarCount > 0) {
            res.add(small);
            small++;
            tarCount--;
        }
        return res;
    }
}
