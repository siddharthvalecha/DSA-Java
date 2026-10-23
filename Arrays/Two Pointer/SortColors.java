//Also Known as DUTCH Flag Problem  LeetCode 75 https://leetcode.com/problems/sort-colors/description/
package dsa.TwoPointers;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SortColors {

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
        
          sortColors(arr);
          System.out.println("Answer is:");
          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i]+" ");
            
        }
            }
//          MY Approach 
//            public  static void sortColors(int[] nums) {
//        int n=nums.length;
//        int freq[]=new int[3];
//        for(int i=0;i<n;i++){
//            freq[nums[i]]++;
//        }
//        int zero=freq[0];
//        int one=freq[1];
//        int two=freq[2];
//        for(int i=0;i<zero;i++){
//            nums[i]=0;
//        }
//        for(int i=zero;i<zero+one;i++){
//            nums[i]=1;
//        }
//        for(int i=zero+one;i<n;i++){
//            nums[i]=2;
//        }
//    }
//    By Dutch Flag Algo
          public static  void sortColors(int[] nums) {
        int temp=0;
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            
        }
    
    }
    
    }
        
                
    
        

         
