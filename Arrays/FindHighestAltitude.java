/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class FindHighestAltitude {

    public static void main(String[] args) {
        int[] gain={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));

    }
     public static int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] alt=new int[n+1];
        alt[0]=0;
        int max=alt[0];
        for(int i=0;i<n;i++)
        {
            alt[i+1]=alt[i]+gain[i];
            if(alt[i+1]>max)
            {
                max=alt[i+1];
            }
        }
        return max;
    }
}
