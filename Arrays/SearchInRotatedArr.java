/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class SearchInRotatedArr {

    
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(arr,target));
        
    }
    public static int search(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        int pivot=findPivot(nums);
        if(pivot==-1)
        {
            return binarySearch(nums, target,start,end);
        }
        if(target==nums[pivot])
        {
            return pivot;
        }
        if(target>=nums[0])
        {
            return binarySearch(nums, target,0,pivot-1);
        }
        //else if(target<nums[0])
        
            return binarySearch(nums, target,pivot+1,nums.length-1);
            }
    public static int binarySearch(int[]arr,int target,int start,int end)
    {   
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
            start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
                return mid;
               }
        return -1;
    }
    public static int findPivot(int [] arr)
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
            if(arr[mid]<=arr[start])
            {
               end=mid-1; 
            }
            else if(arr[mid]>arr[start])
            {
                start=mid+1;
            }
            
        }
        return -1;
    }
}
