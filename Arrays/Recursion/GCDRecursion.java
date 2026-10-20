
package dsa.Recursion;

import java.util.Scanner;


public class GCDRecursion {
            
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the value of x");
                int x=sc.nextInt();
                System.out.println("Enter value of y ");
               int y=sc.nextInt();
               int ans=gcd(x,y);
               System.out.println(ans);
    }   
            public static int gcd(int x,int y){
                if(y==0){
                    return x;
                }
                return gcd(y,x%y);
            }

}

            
