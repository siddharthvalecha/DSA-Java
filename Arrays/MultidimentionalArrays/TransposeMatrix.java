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
public class TransposeMatrix {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        int [][] nums=new int[r][c];
        System.out.println("Enter the Elements of the  matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
           printMatrix(arr);
//          int[][] res=transpose(arr,r,c);
            transposeInPlace(arr,r,c);
           
            
        
    }
    public static void printMatrix(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
                     System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
       
        
    }
    public static int[][] transpose(int[][]arr,int r,int c){
          int[][] res=new int[c][r];
          for (int i = 0; i < c; i++) {
              for (int j = 0; j < r; j++) {
                  
                  res[i][j]=arr[j][i];
                    }
            
        }
         
          return res;
    }
    public static void transposeInPlace(int[][]arr,int r,int c){
           int temp=0;
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                if(i<=j){
                    temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }   
            }
        }
        printMatrix(arr);
    }
}
