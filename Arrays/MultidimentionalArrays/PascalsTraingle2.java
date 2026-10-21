//Leetcode 119 Pascal's Triangle https://leetcode.com/problems/pascals-triangle/description/
package dsa.multdimarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTraingle2 {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows of Pascal's Traingle");
        int n=sc.nextInt();
        
           System.out.println(getRow(n));
           
           }
   
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i) row.add(1);
                else{
                    List<Integer> prev=pascal.get(i-1);
                    row.add(prev.get(j-1)+prev.get(j));
                }
                
            }
            pascal.add(row);
        }
        List<Integer> res=pascal.get(pascal.size()-1);
        return res;
    }
}