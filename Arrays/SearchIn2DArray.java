/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Siddharth Valecha
 */
public class SearchIn2DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arr={   {22,33,44},{55,66,77},{12,56,76},{11,54,56}
        };
        int target=54;
        int[] ans=search2D(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
            
        }
        System.out.println("Max is:" + max2D(arr));
    }
    static int[] search2D(int[][] arr,int target)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
            }
         return new int[]{-1,-1};
    }
    static int max2D(int[][] arr)
    {
        int max=arr[0][0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j]>max)
//                {
//                    max=arr[i][j];
//                }
//                
//            }
//            }
            for(int[] a:arr)
            {
                for(int x:a)
                {
                    if(x>max)
                    {
                        max=x;
                    }
                }
            }
            return max;
     }
    }
    
            
        
   

