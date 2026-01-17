/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element you want to search");
        int key=sc.nextInt();
        System.out.println("Element found at index:"+linSearch(arr,n,key));
    }
    static int linSearch(int[] arr,int n,int key)
    {
        if(arr.length==0)
        {
            return -1;
        }
         for(int i=0;i<n;i++)
         {
             if(arr[i]==key)
             {
                 return i;
             }
             
         }
         return -1;
    }
}
