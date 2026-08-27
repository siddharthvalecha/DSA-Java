/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.DynamicProgramming;


import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class FibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        //int ans=fib(n);
        int ans=fibo(n);
        int answer=fibTabuOpti(n);
        System.out.println("Answer is: "+ans);
        System.out.println("Answer is: "+answer);
    }
     public static int fib(int n) {
        if(n==0 || n==1)
            return n;
        
        return fib(n-1)+fib(n-2);
    }
     public static  int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];        
    }
     public static int fibTabuOpti(int n){
         int prev=1;
         int prev2=0;
         int curri;
         for(int i=2;i<=n;i++){
             curri=prev+prev2;
             prev2=prev;
             prev=curri;
         }
         return prev;
     }
}
