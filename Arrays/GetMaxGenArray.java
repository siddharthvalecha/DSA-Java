/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class GetMaxGenArray{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        
        int ans=getMaximumGenerated(n);
        System.out.println("Answer is :"+ ans);
        }
        
     public static  int getMaximumGenerated(int n) {
       int[] arr=new int[n+1];
       
       if(n==0){
        return 0;
       } 
       if(n==1){
        return 1;
       }
       
        arr[0]=0;
        arr[1]=1;
        int max=1;
        for(int i=1;i<=n;i++){
            if((i*2) <= n){
                arr[i*2]= arr[i];
                max=Math.max(max,arr[i*2]);
            }
            if((i*2+1) <=n){
                arr[i*2+1]=arr[i]+arr[i+1];
                max=Math.max(max,arr[i*2+1]);
            }    
       }

       return max;

    }
    }
    

