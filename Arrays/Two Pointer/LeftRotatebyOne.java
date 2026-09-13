//Take U Forward Left Rotate Array by One
//https://takeuforward.org/plus/dsa/problems/left-rotate-array-by-one?source=strivers-a2z-dsa-track
package dsa.TwoPointers;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LeftRotatebyOne {

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
   
          rotateArrayByOne(arr);
            System.out.println("Answer  is");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            
        }
           
        }

          public static void rotateArrayByOne(int[] nums) {
        int n=nums.length;
        if(n==1) return;
        int temp=nums[0];
        for(int i=1;i<n;i++){
            nums[i-1]=nums[i];
        }
        nums[n-1]=temp;
    }
    }
     
