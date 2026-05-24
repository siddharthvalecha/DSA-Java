//LeetCode 167   https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
package dsa.twosum;

import dsa.PrefixSum.*;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TwoSum2 {

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

            int[] ans=twoSum2(arr,target);
            System.out.println("Answer  is");
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[j]+"  ");
                
            }
        }

        static int[] twoSum2(int[] numbers,int target){
            int n=numbers.length;
                
        int i = 0;
        int j = n-1;
        while(i<j){
            if((numbers[i]+numbers[j])==target)
                return new int[]{i+1,j+1};
            if((numbers[i]+numbers[j])<target)
                i++;
            if((numbers[i]+numbers[j])>target)
                j--;    
        }
     return new int[]{i+1,j+1};
    }
     
}