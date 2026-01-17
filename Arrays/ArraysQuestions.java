/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class ArraysQuestions {
    public static void main(String[] args) {
        ArraysQuestions aq=new ArraysQuestions();
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of Array Elements");
//        int n=sc.nextInt();
//        int [] a=new int [n];
//    System.out.println("Enter Array Elements");
//    for(int i=0;i<n;i++)
//    {
//        a[i]=sc.nextInt();
//    }
//   
    int [] arr={12,33,55,66,77};
     System.out.println("Array Elements are ");
    for(int i=0;i<5;i++)
    {
        System.out.println(arr[i]);
    }
//     aq.swap(arr,2,4);
    for(int i=0;i<5;i++)
    {
//        System.out.println(arr[i]);
    }
//    aq.max(arr);
    aq.reverse(arr);
    }
    public void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
               
    }
    public void max(int [] a)
    {
        int max=a[0];
        for(int i=0;i<5;i++)
        {
          if(a[i]>max)
          {
              max=a[i];
          }
        }
        System.out.println("Max"+" "+max);
    }
    public void reverse(int a[])
    {
        int start=0;
        int end=a.length-1;
        while(start<end)
        {
            swap(a,start,end);
            start++;
            end--;
        }
        System.out.println("Revrsed Array :");
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
        
    }
   
}

