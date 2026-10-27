//LeetCode 1  https://leetcode.com/problems/two-sum/description/
package dsa.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TrappingRainWater {

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
       int  result=trap(arr);
          System.out.println("Max Water stored is"+result);
           int  result1=trapOpt(arr);
          System.out.println("Max Water stored is"+result1);
        }
        
                
            

    public static int trap(int[] height) {
        int n=height.length;
        int[] lMax=new int[n];
        int[] rMax=new int[n];
        lMax[0]=height[0];
        rMax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            lMax[i]=Math.max(lMax[i-1],height[i]);
        }
        for(int j=n-2;j>=0;j--){
            rMax[j]=Math.max(rMax[j+1],height[j]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(lMax[i],rMax[i])-height[i];
        }
        return sum;
    }
    
     public static int trapOpt(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int lMax=0;
        int rMax=0;
        int ans=0;
        while(left<right){
            lMax=Math.max(lMax,height[left]);
            rMax=Math.max(rMax,height[right]);

            if(lMax<rMax){
                ans+=(lMax-height[left]);
                left++;
            }
            else{
                ans+=(rMax-height[right]);
                right--;
            }
            
        }
        return ans;
     }
    
}
                
    
        

         
