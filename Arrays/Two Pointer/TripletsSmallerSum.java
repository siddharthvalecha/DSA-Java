// Triplets with Smaller Sum https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1
package dsa.TwoPointers;

import java.util.Arrays;
import java.util.Scanner;   


public class TripletsSmallerSum {

    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
          
          }
          System.out.println("Enter the sum element");
          int sum=sc.nextInt();
          
          int ans=countTriplets(sum,arr);
          
          System.out.println("Answer is "+ans);
        
            }

    public static int countTriplets(int sum,int[] arr) {
            int n=arr.length;
	    Arrays.sort(arr);
	    int ans=0;
	    for(int i=0;i<n-2;i++){
	        int left=i+1;
	        int right=n-1;
	        while(left<right){
	            int res=arr[i]+arr[left]+arr[right];
	            if(res<sum){
	                ans+=(right-left);
	                left++;
	            }
	           
	            else if(res>=sum){
	                right--;
	            }
	        }
	    }
	 return ans;   
	}
                
    }


         
