//59. LeetCode Spiral Matrix II  https://leetcode.com/problems/spiral-matrix-ii/description/

package dsa.multdimarray;

import java.util.Scanner;


public class SpiralMatrix2 {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
           int[][] ans=generateSpiralMatrix(n);
           
           printMatrix(ans);
           }
    public static void printMatrix(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
                     System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
       
        
    }
        public static int[][]generateSpiralMatrix(int n){
           int r=n,c=n;
        int[][] ans=new int[r][c];

        int topRow=0;
        int bottomRow=r-1;
        int leftCol=0;
        int rightCol=c-1;
        int curr=1;
        while(curr<=(n*n)){
            for(int i=leftCol;i<=rightCol;i++){
                ans[topRow][i]=curr;
                curr++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow;i++){
                ans[i][rightCol]=curr;
                curr++;
            }
            rightCol--;
            for(int i=rightCol;i>=leftCol;i--){
                ans[bottomRow][i]=curr;
                curr++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow;i--){
                ans[i][leftCol]=curr;
                curr++;
            }
            leftCol++;
        }
        return ans;
        }  
}
