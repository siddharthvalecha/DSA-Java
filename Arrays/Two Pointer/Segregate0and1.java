// GFG          https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
package dsa.twosum;

import dsa.PrefixSum.*;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Segregate0and1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
            segregate0and1(arr);
            System.out.println("Answer  is");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+"  ");
                
            }
        }

       static void segregate0and1(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
        if(arr[i]==1 && arr[j]==0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        if(arr[i]==0)
            i++;
        if(arr[j]==1)
            j--;
            
        }
        
    }
     
}