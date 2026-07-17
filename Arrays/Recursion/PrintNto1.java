
package dsa.Recursion;

import java.util.Scanner;


public class PrintNto1 {
            
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the value of n");
                int n=sc.nextInt();
                System.out.println("Answer is: ");
                printNTo1(n);
    }
            public static void printNTo1(int n){
                    if(n==1){
                        System.out.print(1+" ");
                        return;
                    }
                    System.out.print(n+" ");
                    printNTo1(n-1);
                    
            }
}
