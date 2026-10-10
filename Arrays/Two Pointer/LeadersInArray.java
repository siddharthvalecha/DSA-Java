//TUF
package dsa.TwoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeadersInArray {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();          
          }
        
          List<Integer> ans=leaders(arr);
          System.out.println("Answer is:");
          System.out.println(ans);
            }
            public static  List<Integer> leaders(int[] a) {
        int n=a.length;
        List<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(a[i]>max){
                 max=a[i];
                 list.add(a[i]);
            }

        }
        return list;
  }
    }
        
                
    
        

         
