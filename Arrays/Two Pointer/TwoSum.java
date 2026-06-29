//LeetCode 1  https://leetcode.com/problems/two-sum/description/
package dsa.twosum;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TwoSum {

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
             
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }    
            }     
    }
        return new int[]{-1,-1};
}
    }
     
