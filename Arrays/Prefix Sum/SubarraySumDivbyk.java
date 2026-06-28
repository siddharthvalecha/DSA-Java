// Leetcode 974. Subarray Sums Divisible by Khttps://leetcode.com/problems/subarray-sums-divisible-by-k/description/

package dsa.PrefixSum;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SubarraySumDivbyk {

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
//            int[] prefix=makePrefixSumArr(arr);
            
            System.out.println("Answer is");
            System.out.println(subarraysDivByK(arr, k));
        }

        static public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            int freq=map.getOrDefault(rem,0);
            ans+=freq;
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
    }

           
    }
      