
package dsa.Recursion.Array;


import java.util.Scanner;

public class PrintSumOfSubsets {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
            int sum=0;
            int idx=0;
            printSumSubsets(arr,sum,idx);
    }
    public static void  printSumSubsets(int[] arr,int sum,int idx){
                int n=arr.length;
                if(idx==n){
                    System.out.println(sum);
                    sum=0;
                    idx-=1;
                    return;
                }
                
                int currEle=arr[idx];
                
                //currEle is included
                printSumSubsets(arr, sum+currEle, idx+1);
                
                //currEle is not included
                printSumSubsets(arr, sum, idx+1);
    }
}


 