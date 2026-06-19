
package dsa;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Siddharth Valecha
 */
public class ContainsDuplicateOptimal {

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
       
    }
    
     public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }
        return false;
   }
    
 
}
