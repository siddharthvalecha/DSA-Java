
package dsa.Recursion;

import java.util.Scanner;


public class GCD {
            
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the value of x");
                int x=sc.nextInt();
                System.out.println("Enter value of y ");
               int y=sc.nextInt();
               //int ans=gcdBrute(x,y);
               int ans=gcdIter(x,y);
               System.out.println(ans);
    }
            public static int gcdBrute(int x,int y){
               int n=Math.min(x, y);
               int ans=0;
                for (int i = 1; i < n; i++) {
                   if(x%i==0 && y%i==0){
                       ans=Math.max(ans, i);
                   }
                }
                return ans;
            
            }
            
            public static int gcdIter(int x,int y){{
                    while(x%y!=0){
                       int rem;
                        rem = x%y;
                       x=y;
                       y=rem;
                    }
                    return y;
            }
            }
}
            
