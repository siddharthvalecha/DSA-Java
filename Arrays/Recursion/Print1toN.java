
package dsa.Recursion;

import java.util.Scanner;


public class Print1toN {
            
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the value of n");
                int n=sc.nextInt();
                System.out.println("Answer is: ");
                print1ToN(n);
    }
            public static void print1ToN(int n){
                    if(n==1){
                        System.out.print(1+" ");
                        return;
                    }
                    print1ToN(n-1);
                    System.out.print(n+" ");
            }
}
