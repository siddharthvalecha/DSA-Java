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
public class AdditonOf2D {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        int [][] nums=new int[r][c];
        System.out.println("Enter the Elements of the First array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Elements of the Second array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                nums[i][j]=sc.nextInt();
            }
        }
//        print2dArray(arr);
          int[][] res=addition(arr,nums,r,c);
           print2dArray(res);
            
        
    }
    public static void print2dArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
                     System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
       
        
    }
    public static int[][] addition(int[][]arr,int[][]arr1,int r,int c){
          int[][] res=new int[r][c];
          for (int i = 0; i < res.length; i++) {
              for (int j = 0; j < res[i].length; j++) {
                  
                   res[i][j]=arr[i][j]+arr1[i][j];
              }
            
        }
         
          return res;
    }
    
}
