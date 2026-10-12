//66. Plus One https://leetcode.com/problems/plus-one/description/
package dsa;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Siddharth Valecha
 */
public class PlusOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
            int[] ans=plusOne(arr);
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i]+" ");
            
        }
        
    }
    public static int[]plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        
            int[] ans=new int[n+1];
            ans[0]=1;
            
        
        return ans;
    }
    
}
