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
public class Multiplication {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns of first Array");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter the rows and columns of second Array");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][] arr=new int[r1][c1];
        int [][] nums=new int[r2][c2];
        System.out.println("Enter the Elements of the First array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Elements of the Second array");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=sc.nextInt();
            }
        }
            multiplication(arr,r1,c1,nums,r2,c2); 
        
    }
    public static void print2dArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
                     System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
       
        
    }
    public static void multiplication(int[][]a,int r1,int c1,int[][] b,int r2,int c2){
          if(c1!=r2){
              System.out.println("Invalid Dimesions Multiplication is not possible");
              return;
        }
          int [][] mul=new int[r1][c2];
          
          for (int i = 0; i < r1; i++) {
              for (int j = 0; j < c2; j++) {
                  for (int k = 0; k < c1; k++) {
                      mul[i][j]+=a[i][k]*b[k][j];
                      
                  }
              }
            
        }
          print2dArray(mul);
    }
    
}
