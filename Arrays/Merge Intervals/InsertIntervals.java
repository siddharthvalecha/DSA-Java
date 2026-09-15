//57. Insert Interval https://leetcode.com/problems/insert-interval/description/


package dsa.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class InsertIntervals {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] intervals=new int[r][c];
        System.out.println("Enter the Elements of the array");
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j <intervals[i].length; j++) {
                intervals[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] newIntevals=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i <newIntevals.length; i++) {
                newIntevals[i]=sc.nextInt();
        }
         //int[][] result=insert(intervals,newIntevals);
         int[][] result=insertOp(intervals,newIntevals);
           print2dArray(result);
        }
     
        public static void print2dArray(int [][] arr){
                    for (int i = 0; i < arr.length; i++) {
                   for (int j = 0; j < arr[i].length; j++) {
                         System.out.print(arr[i][j]+" ");
                    }
                    System.out.println("");
                    }
        }
        public static int[][] insert(int[][] intervals,int[] newIntervals) {
        List<int[]> intervalsList=new ArrayList<>();
        for(int[] i:intervals){
            intervalsList.add(i);
        }
        intervalsList.add(newIntervals);
//           for (int[] x : intervalsList) {
//    System.out.println(Arrays.toString(x));
//}
     int[][] interArr=intervalsList.toArray(new int[intervalsList.size()][]);
//            for (int i = 0; i < interArr.length; i++) {
//                for (int j = 0; j <interArr[0].length; j++) {
//                    System.out.print(interArr[i][j]+":");
//                }}
                
          return mergeIntervals(interArr);
    }
    public static int[][] mergeIntervals(int[][] arr){
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int start1=arr[0][0];
        int end1=arr[0][1];
        int n=arr.length;
        for(int i=1;i<n;i++){
            int start2=arr[i][0];
            int end2=arr[i][1];

            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
                continue;
            }
            ans.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
        }
            ans.add(new int[]{start1,end1});
            
            int[][] result=ans.toArray(new int[ans.size()][]);
            return result;
    }
    
    public static int[][] insertOp(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Phase 1: Add all intervals that end BEFORE newInterval starts
        while (i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // Phase 2: Merge overlapping intervals into newInterval
        // An interval overlaps if its start is <= newInterval's current end
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        // Add the fully merged newInterval to the list
        ans.add(newInterval);

        // Phase 3: Add all remaining intervals that start AFTER newInterval ends
        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }

        // Convert List back to 2D array
        return ans.toArray(new int[ans.size()][]);
    }
}

