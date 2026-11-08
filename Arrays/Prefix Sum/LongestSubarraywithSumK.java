// GFG Longest Subarray with Sum K  https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

package dsa.PrefixSum;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LongestSubarraywithSumK {

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
            System.out.println(longestSubarray(arr, k));
        }

        static public int longestSubarray(int[] nums, int k) {
        int n=nums.length;
              int res=0;
              int sum=0;
              HashMap<Integer,Integer> map=new HashMap<>();
              for(int i=0;i<n;i++){
               sum+=nums[i];
               if (sum == k) res = i + 1;
               int ques=sum-k;
               if(map.getOrDefault(ques,-1)!=-1){
                   int idx=map.get(ques);
                   int len=i-idx;
                   res=Math.max(res,len);
               }
               if(!map.containsKey(sum))
               map.put(sum,i);
              }
              return res;
        }
              
}