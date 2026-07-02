//238. Product of Array Except Self  https://leetcode.com/problems/product-of-array-except-self/description/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.PrefixSum;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ProductExcpptItself {

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
        int [] ans=new int[n];
         ans=productExceptSelf(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
            
        }
      
    }
    
     public static  int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }   
        int rightProd=1;
        for(int i=n-1;i>=0;i--){
            
            ans[i]*=rightProd;
            rightProd*=nums[i];
            
        }
        return ans;
    }
    
        }

   
      