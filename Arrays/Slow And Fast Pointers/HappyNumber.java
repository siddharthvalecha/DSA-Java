//202. Happy Number https://leetcode.com/problems/happy-number/

package dsa.SlowFastPointers;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class HappyNumber {
    public  static int  findSquareOfDigits(int n){
        int d=0;
        int sum=0;
        while(n>0){
            d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
      HashSet<Integer> hash=new HashSet<>();
      int sum=0;
      while(n!=1){
        if(hash.contains(n)){
            return false;
        }
      hash.add(n);  
      sum=findSquareOfDigits(n);
      n=sum;
    }
    return true;
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter Number to Check Happy or not");
          int n=sc.nextInt();
        boolean answer=isHappy(n);
        System.out.println(answer);
    }
    
}
