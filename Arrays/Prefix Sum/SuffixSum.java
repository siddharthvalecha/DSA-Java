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
public class SuffixSum {

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
         int[] suffix=makeSuffixSumArr(arr);
            //int[] suffix=makeSuffixSumSameArr(arr);
            System.out.println("Prefix Array is");
            for (int j = 0; j <  suffix.length; j++) {
                System.out.print( suffix[j]+"  ");
                
            }
        }

        static int[] makeSuffixSumArr(int [] arr){
            int n=arr.length-1;
            int[] suffix=new int[n];
            suffix[n]=arr[n];
             for (int i = n-1; i >=0; i--) {
                 suffix[i]=suffix[i+1]+arr[i];
                
            }
             return suffix;
        }

     static int[] makePrefixSumSameArr(int[] arr) {
            int n=arr.length;
            for (int i = 1; i < n; i++) {
             arr[i]=arr[i-1]+arr[i];
             
             
         }
            return arr;
    }
           
    }
      