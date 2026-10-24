//LeetCode 1  https://leetcode.com/problems/two-sum/description/
package dsa.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ThreeSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
          
          }
        List<List<Integer>> result=threeSum(arr);
          for(List<Integer> l:result){
              for(int x:l){
                  System.out.print(x+" ");
              }
        }
        
                
            }

    public static List<List<Integer>> threeSum(int[] arr) {
        
           List<List<Integer>> results = new ArrayList<>();
           Arrays.sort(arr);
           int n=arr.length;
          for (int i = 0; i <n-2; i++) {
           if(i>0 &&  arr[i]==arr[i-1]){
               continue;
           }
              int left=i+1;
           int right=n-1;
           int sum=-1*arr[i];
           
           while(left<right){
            int s=arr[left]+arr[right];
            
               if(sum==s){
                   List<Integer> triplets=new ArrayList<>();
                   
                    triplets.add(arr[i]);
                    triplets.add(arr[left]);
                    triplets.add(arr[right]);
                     results.add(triplets);
                    left++;
                    right--;
                    while(left<right &&  arr[left]==arr[left-1]){
                        left++;
                    }
                    while(left<right && arr[right]==arr[right+1]){
                        right--;
                    }
               }
                    else if(sum>s){
                            left++;
                            }
                            else{
                            right--;
                            }
               }
            
           }
            return results;
        }
        
                
    }
        

         
