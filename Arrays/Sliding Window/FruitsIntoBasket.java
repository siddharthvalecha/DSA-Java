//Leetcode 904. Fruit Into Baskets https://leetcode.com/problems/fruit-into-baskets/

package dsa.SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class FruitsIntoBasket {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        int n=sc.nextInt();
        int [] fruits=new int[n];
        System.out.println("Enter the Array Elements");
            for (int i = 0; i <n; i++) {
            fruits[i]=sc.nextInt();
        }
        
        int ans=totalFruit(fruits);
        System.out.println("Answer is :"+ ans);
    }
    public static  int totalFruit(int[] fruits) {
        int n=fruits.length;
        int low=0;
        int high=0;
        int res=-1;
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(high=0;high<n;high++){
            int fruitAtHigh=fruits[high];
            freq.put(fruitAtHigh,freq.getOrDefault(fruitAtHigh,0)+1);

            while(freq.size()>2){
                int fruitAtLow=fruits[low];
                freq.put(fruitAtLow,freq.get(fruitAtLow)-1);
                if(freq.get(fruitAtLow)==0){
                    freq.remove(fruitAtLow);
                    
                }
                low++;
            }
            int len=high-low+1;
            res=Math.max(res,len);

        }
        return res;
    }
}
