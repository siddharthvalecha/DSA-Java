/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class FirstRepeat {

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
       
        int ans=firstReapeat(arr);
        System.out.println("Firstly Repeated Number is "+ans);
           
    }
    static int firstReapeat(int[] arr)
    {
        int ans=-1;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]==arr[j]) {
                    ans=arr[i];
                    break;
                }
            }
        }
        
        return ans;
    }
}