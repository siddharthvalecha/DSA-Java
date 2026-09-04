//3783. Mirror Distance of an Integer https://leetcode.com/problems/mirror-distance-of-an-integer/description/
package dsa;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Siddharth Valecha
 */
public class MirrorDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter n");
      int n=sc.nextInt();
        System.out.println("Mirror Distance is :"+mirrorDistance(n));      
    }
    public static int mirrorDistance(int n) {
        int dupl=n;
        int rev=0;
        while(dupl>0){
            int rem=dupl%10;
            rev=rev*10+rem;
            dupl/=10;
        }
        return Math.abs(n-rev);
    }    
}
