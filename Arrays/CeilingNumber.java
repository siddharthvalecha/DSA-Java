/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class CeilingNumber {

    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
      System.out.println("Target:");
      int target=sc.nextInt();
      
      int ans=ceilingNumber(arr,target);
       System.out.println(ans);
    }
    public static int ceilingNumber(int[] arr,int target)
    {
       {   
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
            start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
                return arr[mid];
               }
        return arr[start];
    }
    
    }
}