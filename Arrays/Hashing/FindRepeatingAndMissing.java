//TUF Missing and Repeating https://takeuforward.org/practice/dsa/find-the-repeating-and-missing-number?tab=problem


package dsa.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class FindRepeatingAndMissing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements of first Array");
        for (int i = 0; i <nums.length; i++) {
                nums[i]=sc.nextInt();
        }
        
        int[] ans=findMissingRepeatingNumbers(nums);
      // int[] ans=findMissingRepeatingNumbersOptimal(nums)
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        
}
        public static int[] findMissingRepeatingNumbers(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        int repeating=-1;
        int missing=-1;
        for(int i=1;i<=n;i++){
            if(freq.getOrDefault(i,0)==0){
                missing=i;
            }
            else if(freq.getOrDefault(i,0)>1){
                repeating=i;
            }
        }
        
        return new int[]{repeating,missing};
    }
        public static int[] findMissingRepeatingNumbersOptimal(int[] nums) {
            
        }
            
}
