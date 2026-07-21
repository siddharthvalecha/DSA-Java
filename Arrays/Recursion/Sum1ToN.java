
package dsa.Recursion;

import java.util.Scanner;


public class Sum1ToN {
            
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the value of n");
                int n=sc.nextInt();
                System.out.println("Answer is: ");
                int ans=sum1ToN(n);
                System.out.println(ans);
    }
            public static int sum1ToN(int n){
                int sum=0;    
                if(n==0){
                        return 0;
                    }
                    sum=n+sum1ToN(n-1);
                    return sum;
            }
}
