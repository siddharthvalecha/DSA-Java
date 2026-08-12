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
public class ContainerWithMaxWater {

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
       int  result=maxArea(arr);
          System.out.println("Max Water stored is"+result);
        }
        
                
            

    public static int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int res=Integer.MIN_VALUE;
        while(i<j){
            int hie=Math.min(height[i],height[j]);
            int width=j-i;
            int water=width*hie;
            res=Math.max(res,water);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return res;
    }
}
                
    
        

         
