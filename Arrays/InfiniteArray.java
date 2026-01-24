

import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class InfiniteArray {

   
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int[] arr={3,5,7,9,10,90,100,130,140,160,170};
      System.out.println("Target:");
      int target=sc.nextInt();
      int ans=searchInInfiniteArray(arr,target);
        System.out.println(ans);
    }
    public static int searchInInfiniteArray(int[] arr,int target)
    {
       int  start=0;
       int end=1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
               return mid; 
            }
            start=1;
            end=4;
            
        }
    }
}
