/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class MajorityElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] a={2,2,1,1,1,2,2};
        System.out.println(majorityElement(a));
       }
    public static int majorityElement(int[] a) {
       int count=0;
       int major=0;
        for(int i=0;i<a.length;i++)
        {
            if(count==0)
            {
                major=a[i];
            }
            if(major==a[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            
            
        }
        return major;
    }
    
}
