package dsa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class CountPrimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
       
        System.out.println("No of primes are:");
        System.out.println(countPrimes(n));
    }
 public   static int countPrimes(int n) {
        if (n <= 2) return 0;

        
        boolean[] isComposite = new boolean[n];
        int count = 0;

        for (int i = 2; (long) i * i < n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) count++;
        }

        return count;
    }
}
