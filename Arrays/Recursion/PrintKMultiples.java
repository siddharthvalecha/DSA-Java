package dsa.Recursion;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PrintKMultiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter k");
        int k=sc.nextInt();
        
        System.out.println("K Multiples of n are:");
        kMultiples(n,k);
    }
     public static void kMultiples(int n,int k) {
        
          if(k==0){
              return;
          }  
          int prod=n*k;
          kMultiples(n,k-1);
          System.out.print(prod+" ");
    }
}
