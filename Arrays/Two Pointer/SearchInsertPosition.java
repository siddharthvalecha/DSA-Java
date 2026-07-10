//LeetCode 1  https://leetcode.com/problems/two-sum/description/
package dsa.twosum;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SearchInsertPosition {

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

            int ans=searchInsert(arr,target);
            System.out.println("Answer  is: "+ans);
            
        }

        public static int  searchInsert(int[] nums, int target) {
         
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] >= target) {
                return i;
            }
        }
        
        return nums.length;

    }
}
     
