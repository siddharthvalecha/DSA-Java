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
public class PrefixSumBetLandR {

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
//            int[] prefix=makePrefixSumArr(arr);
            int[] prefix=makePrefixSumSameArr(arr);
            System.out.println("Prefix Array is");
            for (int j = 0; j < prefix.length; j++) {
                System.out.print(prefix[j]+"  ");
                
            }
            System.out.println("Enter no of queries");
            int quer=sc.nextInt();
            while(quer-->0){
                System.out.println("Enter L anf R ");
                int l=sc.nextInt();
                int r=sc.nextInt();
                int sum=prefix[r]-prefix[l-1];
                System.out.println("Sum is "+sum);
               
            }
            
        }

      

     static int[] makePrefixSumSameArr(int[] arr) {
            int n=arr.length;
            for (int i = 1; i < n; i++) {
             arr[i]=arr[i-1]+arr[i];
               
         }
            return arr;
    }
           
    }
      