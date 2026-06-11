/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ArrayListReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        System.out.println("Enter Array List Elements");
         int input=0;
         System.out.println("Press 100 to exit otherwise enter the elements");
         while(true){
             input = sc.nextInt(); 
              if(input==100){
                  break;
              }
              else{
                  al.add(input);
              }
         }
          System.out.println("Array List Elements are ");
          System.out.println(al);
          
          reverseArrayList(al);
    }
    
        public static void reverseArrayList(ArrayList<Integer> al){
            int i=0;
            int j=al.size()-1;
            int temp=0;
            while(i<j){
                temp=al.get(i);
                al.set(i,al.get(j));
                al.set(j, temp);
                i++;
                j--;
            }
            System.out.println(al);
        }
}
