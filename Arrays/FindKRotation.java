
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class FindKRotation {

   
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
       int ans=findKRotation(arr);
        System.out.println(ans);
    }
    public static int findKRotation(int arr[]) {
        int pivot=findPivot(arr);
        if(pivot != -1)
        {
            return pivot+1;
        }
        else
        {
            return 0;
        }
    }
       public static int findPivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[start]<=arr[mid])
            {
                start=mid+1;
            }
            else if(arr[start]>arr[mid])
            {
                end=mid-1;
            }
            
        }
        return -1;
    }
        
    }


