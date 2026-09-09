
import java.util.Scanner;

//1752. Check if Array Is Sorted and Rotated  https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
/**
 *
 * @author Siddharth Valecha
 */
public class ArraySortedAndRotated {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter size"); 
       int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            }
        System.out.println("Answer:"+check(arr));
    }
    public static boolean check(int[] nums) {
        int n=nums.length;
        if(n==1)return true;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]) count++;

        }
        if(count<=1) return true;
        else return false;
    }
    
}
