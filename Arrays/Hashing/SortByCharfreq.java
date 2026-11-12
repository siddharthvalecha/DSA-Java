/*//451. Sort Characters By Frequency https://leetcode.com/problems/sort-characters-by-frequency/description/
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Siddharth Valecha
 */
public class SortByCharfreq {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            pq.offer(entry);
        }

        StringBuilder sb=new StringBuilder();
        
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();

            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }
            
        }
        return sb.toString();
    }
}
    
   
