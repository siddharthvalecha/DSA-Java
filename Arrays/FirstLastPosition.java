
import java.util.Scanner;


/**
 *
 * @author Siddharth Valecha
 */
public class FirstLastPosition {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
      System.out.println("Target:");
      int target=sc.nextInt();
        int[] ans=searchRange(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
            
        }
        
    }
public static int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int firstoccur=-1;
        int lastoccur=-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
           
            else if(target==nums[mid]){
                firstoccur=mid;
                end=mid-1;
            }
            
          }
          start=0;
         end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
           
            else if(target==nums[mid]){
               lastoccur=mid;
                start=mid+1;
            }
            
            
          }
        return new int[]{firstoccur,lastoccur};
        }
}
    

