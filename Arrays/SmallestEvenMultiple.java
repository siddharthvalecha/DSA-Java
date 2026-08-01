//2413. Smallest Even Multiple https://leetcode.com/problems/smallest-even-multiple/description/

package dsa;

import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class SmallestEvenMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n=sc.nextInt();
        int ans=smallestEvenMultiple(n);
        System.out.println("Answer "+ans);
    }
        public static int smallestEvenMultiple(int n) {
        if(n%2==0)
            return n;
        else
            return 2*n;
    }
    
}
