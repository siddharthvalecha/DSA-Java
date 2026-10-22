//Leetcode 73. Set Matrix Zeroes https://leetcode.com/problems/set-matrix-zeroes/description/
//Brute force in copy
package dsa.multdimarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetMatrixZeroes {

   
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
            //setZeroes(arr);
            setZeroesOptimal(arr);
            printMatrix(arr);
           }
   public static void printMatrix(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
                     System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }  
    }

    public static void setZeroes(int[][] matrix) {
            int n=matrix.length;
            int m=matrix[0].length;
            int[] row=new int[n];
            int[] col=new int[m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(matrix[i][j]==0){
                        row[i]=1;
                        col[j]=1;
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(row[i]==1 || col[j]==1){
                        matrix[i][j]=0;
                    }
                }
            }
        }
    public static void setZeroesOptimal(int[][] matrix) {
             int n=matrix.length;
        int m=matrix[0].length;
        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    //mark ith row
                    matrix[i][0]=0;
                    //mark jth col
                    if(j!=0)
                        matrix[0][j]=0;
                    else 
                        col0=0;    
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }

            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        }
}