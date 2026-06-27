// Leetcode 560Subarray Sum Equals K  https://leetcode.com/problems/subarray-sum-equals-k/description/

package dsa.PrefixSum;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SubarraySumEqk {

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
            System.out.println(subarraySum(arr, k));
        }

        static public int subarraySum(int[] nums, int k) {
        int sum=0;
        int res=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        freq.put(0,1);
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int que=sum-k;
            int freqe=freq.getOrDefault(que,0);
            res+=freqe;
            freq.put(sum,freq.getOrDefault(sum,0)+1);

        }
        return res;
    }

           
    }
      