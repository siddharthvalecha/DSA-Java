
package dsa.sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class SelectionSort {

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
        selectionSort(nums);
        System.out.println("Sorted Array");
        for (int i = 0; i <nums.length; i++) {
                System.out.print(nums[i]+" ");
        }
}
        public static void  selectionSort(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for (int j = i+1; j < n; j++) {
                if(nums[j]<nums[min_idx]){
                    min_idx=j;
                }
            }
            if(min_idx!=i){
            int temp=nums[i];
            nums[i]=nums[min_idx];
            nums[min_idx]=temp;    
            }
            
        }
        
        }
        
}
