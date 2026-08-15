//LeetCode 9  https://leetcode.com/problems/palindrome-number/description/
package dsa.TwoPointers;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PalindromNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int  x=sc.nextInt();
        //boolean ans=isPalindromeBrute(x);
        boolean ans=isPalindrome(x);
        System.out.println("Answer is:"+ans);
            }
            
    public static  boolean isPalindrome(int x){
        if(x<0)
            return false;
        int original=x;
        int rev=0;
        while(x!=0){
            int rem=x%10;
           rev=rev*10+rem;
            x/=10;     
        }
        if(rev==original)
            return true;
        return false;
    }
            
    public static  boolean isPalindromeBrute(int x) {
        String num=String.valueOf(x);
        int n=num.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(num.charAt(i)!=num.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
            


}
     
