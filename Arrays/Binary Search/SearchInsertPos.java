
//35. Search Insert Position https://leetcode.com/problems/search-insert-position/description/





import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class SearchInsertPos {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target");
        int target=sc.nextInt();
        System.out.println(searchInsert(arr,target));
    }
    static public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int possibleAns=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                possibleAns=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return possibleAns;
    }
}
