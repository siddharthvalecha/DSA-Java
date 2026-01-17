/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Siddharth Valecha
 */
public class MinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr={11,33,2,42,12};
        int min=findMin(arr);
        int max=findMax(arr);
        System.out.println("Min is"+min+"     Max is"+max);
    }
    static int findMin(int[] arr)
    {
       int min=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<min)
            {
                min=arr[i];
            }
           
        }
         return min;
    }
    static int findMax(int[] arr)
    {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
         }
        return max;
    }
}
