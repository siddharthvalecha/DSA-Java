/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Siddharth Valecha
 */
public class SearchInRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int st=2;//Starting of Range
        int ed=4;//Ending of Range
        int target=24;
       int ans= rangeSearch(arr,st,ed,target);
        System.out.println(ans);
    }
    static int rangeSearch(int[] arr,int s,int e,int target)
    {
        for(int i=s;i<=e;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
