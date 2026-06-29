//LeetCode 1  https://leetcode.com/problems/two-sum/description/
package dsa.twosum;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TwoSumOptimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();

            int[] ans=twoSum(arr,target);
            System.out.println("Answer  is");
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[j]+"  ");
                
            }
        }

        static int[] twoSum(int[] nums,int target){
       HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int need=0;       
        for(int i=0;i<n;i++){
            need=target-nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
}
    }
     
