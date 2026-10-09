
package dsa.cyclicsort;

import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class CyclicSort {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i <nums.length; i++) {
                nums[i]=sc.nextInt();
        }
        cyclicSort(nums,n);
        System.out.println("Sorted Array");
        for (int i = 0; i <nums.length; i++) {
                System.out.print(nums[i]+" ");
        }
        
        
}
        public static void  cyclicSort(int[] nums,int n) {
            int i=0;
            while(i<n){
                int correctIdx=nums[i]-1;
                if(nums[i]!=nums[correctIdx])
                    swap(nums,i,correctIdx);
                else
                    i++;
            }
        }
        public static void swap(int[] arr,int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
}
