package dsa.MergeIntervals;


import MergeIntervals.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MergeIntervals {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] intervals=new int[r][c];
        System.out.println("Enter the Elements of the First array");
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j <intervals[i].length; j++) {
                intervals[i][j]=sc.nextInt();
            }
        }
         int[][] result=merge(intervals);
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
                    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
         List<int[]> res=new ArrayList<>();
         int start1=intervals[0][0];
         int end1=intervals[0][1];
        int n=intervals.length;
         for(int i=1;i<n;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];

            if(end1>=start2){
                end1=Math.max(end1,end2);
                
                continue;
            }
            res.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;

         }
         res.add(new int[]{start1,end1});
         int[][] ans=res.toArray(new int[res.size()][]);
         return ans;
    }
    }