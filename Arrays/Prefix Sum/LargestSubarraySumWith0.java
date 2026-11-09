// Leetcode 560Subarray Sum Equals K  https://leetcode.com/problems/subarray-sum-equals-k/description/

package dsa.PrefixSum;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LargestSubarraySumWith0 {

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
        
            System.out.println("Answer is");
            System.out.println(maxLength(arr));
        }

        static public int  maxLength(int arr[]) {
        int n=arr.length;
               int res=0;
               int sum=0;
               HashMap<Integer,Integer> map=new HashMap<>();
               map.put(0,-1);
               for(int i=0;i<n;i++){
                   sum+=arr[i];
                   if(map.containsKey(sum)){
                       int idx=map.get(sum);
                       int len=i-idx;
                       res=Math.max(res,len);
                   }
                   if(!map.containsKey(sum))
                    map.put(sum,i);
               }
               return res;
        
    }      
    }
      