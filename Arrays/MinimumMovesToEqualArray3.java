/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MinimumMovesToEqualArray3 {

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
        System.out.println(minMoves(arr));
    }
    
    public static int minMoves(int []  nums){
             int n=nums.length;
        int max=0;
        int oper=0;
        for(int ele:nums){
            max=Math.max(ele,max);
        }
        for(int x:nums){
            int diff=max-x;
            oper+=diff;
        }
        return oper;
          } 
        
      
}