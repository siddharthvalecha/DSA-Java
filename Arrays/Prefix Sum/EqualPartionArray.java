package dsa.PrefixSum;

import java.util.Scanner;

public class EqualPartionArray {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        boolean res=equalPartition(arr);
        if(res){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
                
            }
    static int findTotalSum(int[] arr){
          int totalSum=0;
          int n=arr.length;
          for (int i = 0; i < n; i++) {
            totalSum+=arr[i];
        }
          return totalSum;
    }
    static boolean equalPartition(int [] arr){
          int totalSum=findTotalSum(arr);
          int prefixSum=0;
          int n=arr.length;
          for (int i = 0; i < n; i++) {
            prefixSum+=arr[i];
        
          int suffixSum=totalSum-prefixSum;
          if(suffixSum==prefixSum)
              return true ;
       
          
            
          
          }    
            return false;
    }
        }

    

      