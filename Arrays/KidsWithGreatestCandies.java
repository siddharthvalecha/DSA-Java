/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Siddharth Valecha
 */
public class KidsWithGreatestCandies {

    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> result=kidsWithCandies(candies,extraCandies);
        System.out.println(result);
            
        }
    
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int totalCandies=0;
        int maxCandies=0;
        List<Boolean> result=new ArrayList();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>maxCandies)
            {
                maxCandies=candies[i];
            }
            
        }
        for(int i=0;i<candies.length;i++)
        {
            totalCandies=candies[i]+extraCandies;
            if(totalCandies>=maxCandies)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}
