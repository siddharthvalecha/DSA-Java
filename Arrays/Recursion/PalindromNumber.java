//LeetCode 9  https://leetcode.com/problems/palindrome-number/description/
package dsa.Recursion;


import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PalindromNumber {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int  x=sc.nextInt();
        
        boolean ans=isPalindrome(x);
        System.out.println("Answer is:"+ans);
            }
            
    public static  boolean isPalindrome(int n){
        if(n<0) return false;
        int rev=0;
        rev=reverseInt(n,rev);
        
        return (n==rev);
        
        
    }
     public static int reverseInt(int n,int rev){
            if(n==0) return rev;
            
            return reverseInt(n/10,rev*10+n%10);
     }       
    
            


}
     
