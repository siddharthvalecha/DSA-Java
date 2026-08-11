
package dsa.sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class InsertionSort {

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
        insertionSort(nums);
        System.out.println("Sorted Array");
        for (int i = 0; i <nums.length; i++) {
                System.out.print(nums[i]+" ");
        }
}
            public static void  insertionSort(int[] nums) {
            int n=nums.length;

                for (int i = 1; i < n; i++) {
                        int j=i;

                        while(j>0 && nums[j]<nums[j-1]){
                            int temp=nums[j];
                            nums[j]=nums[j-1];
                            nums[j-1]=temp;
                            j--;
                        }
            }

            }
}
        

