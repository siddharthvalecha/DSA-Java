/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.io.ObjectInputFilter;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class StarPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        System.out.println("Enter number of columns");
        int c=sc.nextInt();
//        rectanglePattern(r,c);
//        hollowRectanglePattern(r,c);
//          incrTraingularPattern(r);
            pyramid(r);
//            decrTraingularPattern(r);
//        trainglePattern(r);
//        
//        
//          
    }
    public static void trainglePattern(int r)
    {
        for (int i = 1; i <=r; i++) {
            //for space
            for (int j = 1; j<=r-i; j++) {
                System.out.print(" ");
            }
            //for star
                for (int k =1; k <=2*i-1; k++) {
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }
    
   public static void rectanglePattern(int r,int c){
       for (int i = 1; i <=r; i++) {
           for (int j = 1; j <=c; j++) {
               System.out.print("*"); 
           }
             System.out.println();
       }
   }
   public static void hollowRectanglePattern(int r,int c){
       for (int i = 1; i <=r; i++) {
           for (int j = 1; j <=c; j++) {
               if (i==1 || i==r || j==1 || j==c) {
                   System.out.print("*"); 
               }
               else
                   System.out.print(" ");
           }
             System.out.println();
       }
   }
   public static void incrTraingularPattern(int r){
       for (int i = 1; i <=r; i++) {
           for (int j = 1; j <=i; j++) {
               System.out.print("*"); 
           }
             System.out.println();
       }
   }
   public static void decrTraingularPattern(int r){
       for (int i = 1; i <=r; i++) {
           for (int j =1; j <=r+1-i; j++) {
               System.out.print("*"); 
           }
             System.out.println();
       }
   }
   public static void pyramid(int r){
       for (int i = 1; i <=r; i++) {
           for (int j = 1; j <=r-i; j++) {
               System.out.print(" "); 
           }
           for (int k = 1; k <=2*i-1; k++) {
               System.out.print("*");
           }
        System.out.println();     
       }
       
   }
 }
    
