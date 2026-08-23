//78. Subsets https://leetcode.com/problems/subsets/description/
package dsa.Recursion.Array;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
           System.out.println(subsets(arr));
    }
   public static List<List<Integer>> subsets(int[] nums) {
        return findSubSets(nums,0);
    }

    public static List<List<Integer>> findSubSets(int[] nums,int idx){
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        if(idx==n){
            result.add(new ArrayList<>());
            return result;
        }

        List<List<Integer>> ans=findSubSets(nums,idx+1);

        for(List li:ans){
            result.add(li);
        }

        int currEle=nums[idx];
        
        for(List<Integer> list:ans){
            List<Integer> newSubSets=new ArrayList<>(list);
            newSubSets.add(currEle);
            result.add(newSubSets);
        }
        return result;
    }
}


 