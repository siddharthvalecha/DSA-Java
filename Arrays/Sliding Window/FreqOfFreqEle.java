//1838. Frequency of the Most Frequent Element https://leetcode.com/problems/frequency-of-the-most-frequent-element/

package dsa.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class FreqOfFreqEle {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);    
            System.out.println("Enter The Size");
            int n=sc.nextInt();
            int[] nums=new int[n];
            System.out.println("Entner Elements");
            for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
            System.out.println("Enter k");
            int k=sc.nextInt();
        
        int ans=maxFrequency(nums, k);
        System.out.println("Answer is :"+ ans);
    }
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int low=0;
        int high=0;
        int n=nums.length;
        long sum=0;
        int result=0;
        long windowSum=0;
        long opr=0;
        for(high=0;high<n;high++){
            int target=nums[high];
            sum+=nums[high];
            int len=high-low+1;
            windowSum=(long)target*len;
            opr=windowSum-sum;
            while(opr>k){
                sum-=nums[low];
                low++;  
                len=high-low+1;
                windowSum=(long)target*len;
                opr=windowSum-sum;
            }
            result=Math.max(result,len);
        }
        return result;
    }
}
