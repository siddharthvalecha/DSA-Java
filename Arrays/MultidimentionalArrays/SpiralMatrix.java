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
public class SpiralMatrix {

   
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
           
           printSpiralMatrix(arr,r,c);
           }
    public static void printMatrix(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
                     System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
       
        
    }
        public static void printSpiralMatrix(int[][]arr,int r,int c){
          int topRow=0;
          int bottomRow=r-1;
          int leftCol=0;
          int rightCol=c-1;
          int count=0;
          int totalEle=r*c;
          while(count!=totalEle){
              //topRow
             for(int i=leftCol;i<=rightCol && count!=totalEle;i++){
                    System.out.print(arr[topRow][i]+" ");
                    count++;
             } 
             topRow++;
             //RigthCol
              for (int i = topRow; i <= bottomRow && count!=totalEle; i++) {
                    System.out.print(arr[i][rightCol]+" ");
                    count++;
              }
              rightCol--;
              //BottomRow
              for (int i = rightCol; i >=leftCol && count!=totalEle; i--) {
                    System.out.print(arr[bottomRow][i]+" ");
                    count++;
              }
              bottomRow--;
              //Left col
              for (int i = bottomRow; i >=topRow && count!=totalEle; i--) {
                 System.out.print(arr[i][leftCol]+" ");
                    count++;
              }
              leftCol++;
          }
        }
  
}
