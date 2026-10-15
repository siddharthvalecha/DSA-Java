/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SortArray01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SortArray01 obj=new SortArray01();
        
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
       
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        obj.sort01(arr);
        obj.display(arr);
    }
    void display(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    void sort01(int[] arr){
        int  count=0;
            for (int i = 0; i < arr.length; i++) {
                    if(arr[i]==0){
                        count++;
                    }
            }
                for (int j = 0; j <arr.length; j++) {
                    if(j<count){
                        arr[j]=0;
                    }
                    else{
                        arr[j]=1;
                    }
        }
    }
         
       
       
    
}