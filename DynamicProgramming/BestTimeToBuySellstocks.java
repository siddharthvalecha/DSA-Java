//121. Best Time to Buy and Sell Stock https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
package dsa.DynamicProgramming;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import dsa.*;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class BestTimeToBuySellstocks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Max Profit:"+maxProfit(arr));
    }
    static public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int minPrice=prices[0];
        for(int i=1;i<n;i++){
        int cost=prices[i]-minPrice;
        profit=Math.max(profit,cost);
        minPrice=Math.min(minPrice,prices[i]);    
        }
        return profit;
    }
}
