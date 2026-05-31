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
public class PrefixSum {

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
        }

        static int[] makePrefixSumArr(int [] arr){
            int n=arr.length;
                int[] pref=new int[n];
            pref[0]=arr[0];
            for (int i = 1; i < n; i++) {
                pref[i]=pref[i-1]+arr[i];
            }
            return pref;
        }

     static int[] makePrefixSumSameArr(int[] arr) {
            int n=arr.length;
            for (int i = 1; i < n; i++) {
             arr[i]=arr[i-1]+arr[i];
             
             
         }
            return arr;
    }
           
    }
      