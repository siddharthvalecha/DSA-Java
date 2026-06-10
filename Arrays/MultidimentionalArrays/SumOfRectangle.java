/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.multdimarray;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SumOfRectangle {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        System.out.println("Enter the Elements of the  matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter th boundaries l1  r1  l2 r2 ");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
           printMatrix(arr);
         
          int ans1=findSum1(arr,l1,r1,l2,r2);
//          int ans2=findSum2(arr,l1,r1,l2,r2);
          int ans3=findSum3(arr,l1,r1,l2,r2);
           System.out.println("Sum is "+ ans1);
//           System.out.println("Sum is "+ ans2);
           System.out.println("Sum is "+ ans3);
 
    
    }
    public static void printMatrix(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
                     System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
       
        
    }
    public static void makePrefixSumMatrix(int[][] arr){
            int r=arr.length;
            int c=arr[0].length;
        
        for (int i = 0; i < r; i++) {
            for(int j=1;j<c;j++){
              arr[i][j]+=arr[i][j-1];
            }
        }
          
    }
//    BRUTE FORCE APPROACH
        public static int findSum1(int[][]arr,int l1,int r1,int l2,int r2){
            int sum=0;
            
            for (int i = l1; i <= l2; i++) {
                for (int j = r1; j <= r2; j++) {
                    sum+=arr[i][j];
                    
                }
                
            }
            return sum;
            
            
        }
//  BETTER APPROACH PRE CALC THE HORIZONTAL SUM
    public static int findSum2(int[][]arr,int l1,int r1,int l2,int r2){
            int sum=0;
            makePrefixSumMatrix(arr);
            printMatrix(arr);
            for (int i = l1; i <=l2; i++) {
                //if r1 is 0
                if(r1>=1){
                sum+=arr[i][r2]-arr[i][r1-1];
                    }
                else{
                    sum+=arr[i][r2];
                }
            }
        return sum;
    }
//            Best Approach by Prefix Sum over Col and rows Both
             public static int findSum3(int[][]arr,int l1,int r1,int l2,int r2){
                 int sum=0;
                 int up=0;
                 int left=0;
                 int leftUp=0;
                 int ans=0;
                 makePrefixSumOverBoth(arr);
                 printMatrix(arr);
                 
                 sum=arr[l2][r2];
               if(r1>=1)
                 left=arr[l2][r1-1];
               if(l1>=1)
                    up=arr[l1-1][r2];
               if(l1>=1 && r1>=1)
                 leftUp=arr[l1-1][r1-1];
               ans=sum-left-up+leftUp;
                 return ans; 
             }
          public static void  makePrefixSumOverBoth(int[][]arr){
               int r=arr.length;
            int c=arr[0].length;
        
        for (int i = 0; i < r; i++) {
            for(int j=1;j<c;j++){
              arr[i][j]+=arr[i][j-1];
            }
        }
        for (int j=0;j<c;j++) {
            for(int i=1;i<r;i++){
              arr[i][j]+=arr[i-1][j];        
             }
           }
          }
 }

