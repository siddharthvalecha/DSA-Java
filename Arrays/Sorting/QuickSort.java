
package dsa.sorting;

import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i <nums.length; i++) {
                nums[i]=sc.nextInt();
        }
         int low=0;
        int high=n-1;
        quickSort(nums,low,high);
        System.out.println("Sorted Array");
        for (int i = 0; i <nums.length; i++) {
                System.out.print(nums[i]+" ");
        }
       
        
}
        public static void  quickSort(int[] nums,int low,int high) {
            if(low<high){
              int partitionIdx=partition(nums,low,high);
             quickSort(nums, low,partitionIdx-1);
             quickSort(nums, partitionIdx+1, high);  
            }
        }
        public static int partition(int[] nums,int low,int high){
            int pivot=nums[low];
            int i=low;
            int j=high;
            while(i<j){
                while(i<high && nums[i]<=pivot){
                    i++;
                }
                while(j>low && nums[j]>pivot){
                    j--;
                }
                if(i<j) swap(nums,i,j);
            }
            swap(nums,low,j);
            return j;
        }
        public static void swap(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
}
