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
public class RotateMatrix {

   
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

           rotateMatrix(arr,r,c);
    }
   
    public static void printMatrix(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
                     System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
       
        
    }
   
        public static void transposeInPlace(int[][]arr,int r,int c){
               int temp=0;
            for (int i = 0; i < c; i++) {
                for (int j = i; j < r; j++) {
                    {
                        temp=arr[i][j];
                        arr[i][j]=arr[j][i];
                        arr[j][i]=temp;
                    }   
                }
            }
            printMatrix(arr);
        }
     public static void rotateMatrix(int[][]arr,int r,int c){
         int left=0;
         int right=0;
         int temp=0;
         transposeInPlace(arr,r,c);
          for (int i =  0; i < r; i++) {
              left=0;
              right=c-1;
              while(left<right){
             temp=arr[i][left];
             arr[i][left]=arr[i][right];
             arr[i][right]=temp;
             left++;
             right--;     
              }
              /*Or we can make a revrse fun i.e. reverse(arr[i])
              and in rev(){
              int i=0 j=arr.len-1;
              while(i<j){swap(arr[i--],arr[j++])
              */
         }
     printMatrix(arr);    
    }
}
