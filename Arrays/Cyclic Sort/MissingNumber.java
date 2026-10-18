
package dsa.cyclicsort;

import dsa.sorting.*;
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class MissingNumber {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i <nums.length; i++) {
                nums[i]=sc.nextInt();
        }
        System.out.println("Missing Number is:"+missingNumber(nums));
}
        public static int missingNumber(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==n) i++;
            else if(nums[i]!=i){
                swap(nums,nums[i],i);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j) return j;
        }
        return n;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
