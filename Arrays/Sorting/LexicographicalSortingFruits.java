
package dsa.sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class LexicographicalSortingFruits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        String[] nums=new String[n];
        System.out.println("Enter elements");
        for (int i = 0; i <nums.length; i++) {
                nums[i]=sc.next();
        }
        lexicographicalSort(nums);
        System.out.println("Sorted Array");
        for (int i = 0; i <nums.length; i++) {
                System.out.print(nums[i]+" ");
        }
}
        public static void  lexicographicalSort(String[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for (int j = i+1; j < n; j++) {
                 String str1=nums[j];
                String str2=nums[min_idx];
                int ans=str1.compareTo(str2);
                if(ans<0){
                        min_idx=j;
                }
            }
            String temp=nums[i];
            nums[i]=nums[min_idx];
            nums[min_idx]=temp;
            }
            
        }
        
        }
        

