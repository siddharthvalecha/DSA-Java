//Leetcode 118 Pascal's Triangle https://leetcode.com/problems/pascals-triangle/description/
package dsa.multdimarray;

import java.util.Scanner;

public class PascalsTraingle {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows of Pascal's Traingle");
        int n=sc.nextInt();
        
           int[][] ans=pascalTraingle(n);
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
    public static int[][] pascalTraingle(int n){
          int[][] pascal=new int[n][];
        for (int i = 0; i < n; i++) {
          //Jagged array with i+1 cols in each rows 
            pascal[i]=new int[i+1]; 
          //First and Last ele of rows should be 1 
          pascal[i][0]=pascal[i][i]=1;
          //Formula of pascal no is sum of above of two
            for (int j = 1; j < i; j++) {
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
          }
          return pascal;
}
            /*As Leetcode expects List<List<Intger>> so
    List<List<Integer>> result=new ArrayList();

        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList();
            for(int j=0;j<pascal[i].length;j++){
                row.add(pascal[i][j]);
            }
            result.add(row);
        }
        return result;
    */
}