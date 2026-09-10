
package dsa.sorting;

import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class MergeSort {

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
        mergeSort(nums,low,high);
        System.out.println("Sorted Array");
        for (int i = 0; i <nums.length; i++) {
                System.out.print(nums[i]+" ");
        }
}
            public static void  mergeSort(int[] nums,int low,int high) {
                if(low>=high) return;
                int mid=(low+high)/2;
                mergeSort(nums,low,mid);
                mergeSort(nums,mid+1, high);
                merge(nums,low,mid,high);
            }

  public  static void merge(int[] nums, int low, int mid, int high) {
        int[] temp=new int[nums.length];
        int left=low;
        int right=mid+1;
        int i=0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[i]=nums[left];
                i++;
                left++;
            }
            else{
                temp[i]=nums[right];
                i++;
                right++;
            }
        }
        while(left<=mid){
            temp[i]=nums[left];
            left++;
            i++;
        }
        while(right<=high){
            temp[i]=nums[right];
            right++;
            i++;
        }
        for (int j = low; j <=high; j++) {
            nums[j]=temp[j-low];
        }
        
    }
}
        

