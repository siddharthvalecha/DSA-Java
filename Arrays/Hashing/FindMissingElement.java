//3731. Find Missing Elements  https://leetcode.com/problems/find-missing-elements/description/


package dsa.Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class FindMissingElement {

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
        List<Integer> ans=findMissingElements(nums);
        for(int x:ans){
            System.out.println(x);
        }
        
}
        public static List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>(); 
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           min=Math.min(min,nums[i]);
           max=Math.max(max,nums[i]);
           set.add(nums[i]);
        }
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
