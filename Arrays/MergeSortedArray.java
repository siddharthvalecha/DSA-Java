/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] a={1,2,3,0,0,0};
        int[] b={2,5,6};
        int m=3;
        int n=3;
        merge(a,m,b,n);
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]); 
   }
  }
     public static  void merge(int[] a, int m, int[] b, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(i>=0 && j>=0)
        {
            if(b[j]>a[i])
            {
                a[k]=b[j];
                
                j--;
            }
            else
            {
                a[k]=a[i];
                // a[i]=b[j];
                i--;
            }
        k--;
        }
        while(j>=0)
        {
            a[k]=b[j];
            j--;
            k--;
        }
        
    }
    
}
