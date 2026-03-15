
package dsa;

import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class NumberOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n=sc.nextInt();
        int count=0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        System.out.println("The no of digits in number is:"+count);
    }
    
}
