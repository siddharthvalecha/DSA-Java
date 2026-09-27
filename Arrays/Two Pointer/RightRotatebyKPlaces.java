//189. Rotate Array LeetCode
//https://leetcode.com/problems/rotate-array/description/
package dsa.TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class RightRotatebyKPlaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k");
        int k=sc.nextInt();
         //rotate(arr,k);
         rotateOptimal(arr,k);
            System.out.println("Answer  is");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            
        }
           
        }

          public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        if(k==0 || n==0) return;
        ArrayList<Integer> list=new ArrayList<>();
        //storing in list
        for(int i=n-k;i<n;i++){
            list.add(nums[i]);
        }
        //shifting
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        //storing list back to nums
        for(int i=0;i<k;i++){
            nums[i]=list.get(i);
        }

    }
        public static void rotateOptimal(int[] nums, int k) {
        int n=nums.length;
         if (n == 0) return;
        k %= n;
        if (k == 0) return;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

          
    }
     
