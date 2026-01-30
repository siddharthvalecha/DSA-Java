

import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class TwoSum {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
      System.out.println("Target:");
      int target=sc.nextInt();
      int[] ans=twoSum(arr,target);
        for (int i = 0; i <ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
            sum=nums[i]+nums[j];
            if(sum==target)
            {
                return new int[]{i,j};
            }
            }
        }
        return new int[]{-1,-1};
    }
    
}
