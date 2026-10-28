//Leetcode 1299 Replace Elements with Greatest Element on Right Side https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
package dsa.TwoPointers;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ReplacreEleWithGreaterRight {

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
        
          replaceElements(arr);
          System.out.println("Answer is:");
          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i]+" ");
            
        }
            }
    
            public static  int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=0;
        int actualMax=arr[n-1];
        arr[n-1]=-1;
        if(n==1) return arr;
        for(int i=n-2;i>=0;i--){
            max=arr[i];
            arr[i]=actualMax;
            if(max>actualMax){
                actualMax=max;
            }
        }
        return arr;
    }
    }
        
                
    
        

         
