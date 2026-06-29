    //16. 3Sum Closest https://leetcode.com/problems/3sum-closest/description/
package dsa.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;   


public class ThreeSumClosest {

    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
          
          }
          System.out.println("Enter the target element");
          int target=sc.nextInt();
          
          int ans=threeSumClosest(arr,target);
          
          System.out.println("Answer is "+ans);
        
            }

    public static int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int n=nums.length;
            int max_diff=Integer.MAX_VALUE;
                int resSum=0;
            for(int i=0;i<n-2;i++){
                int left=i+1;
                int right=n-1;
                
                while(left<right){
                    int sum=nums[i]+nums[left]+nums[right];

                    if(sum==target){
                        return sum;
                    }
                    else if(sum<target){
                        int diff=Math.abs(sum-target);
                        if(diff<max_diff){
                            max_diff=diff;
                            resSum=sum;
                        }
                        left++;
                    }
                    else{
                        int diff=Math.abs(sum-target);
                        if(diff<max_diff){
                            max_diff=diff;
                            resSum=sum;
                        }
                        right--;
                    }
                }
            }
            return resSum;
        }
        
                
    }
        

         
