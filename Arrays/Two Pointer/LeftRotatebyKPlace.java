//Take U Forward Left Rotate Array by k
//https://takeuforward.org/plus/dsa/problems/left-rotate-array?source=strivers-a2z-dsa-trackhttps://takeuforward.org/plus/dsa/problems/left-rotate-array?source=strivers-a2z-dsa-track
package dsa.TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LeftRotatebyKPlace {

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
         //rotateArray(arr,k);
         rotateArrayOptimal(arr,k);
            System.out.println("Answer  is");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            
        }
           
        }

          public static void rotateArray(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        if(k==0) return;
        ArrayList<Integer> list=new ArrayList<>();
        //adding to temp list
        for(int i=0;i<k;i++){
            list.add(nums[i]);
        }
        //shifting
        for(int i=k;i<n;i++){
            nums[i-k]=nums[i];
        }
        //putting temp at last
        int j=0;
        for(int i=n-k;i<n;i++){
            nums[i]=list.get(j);
            j++;
        }
        /*IF we dont want j
         for(int i=n-k;i<n;i++){
            nums[i]=list.get(i-(n-k));   
        }
        */
    }
        public static void rotateArrayOptimal(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        if(k==0) return;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }   
    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

          
    }
     
