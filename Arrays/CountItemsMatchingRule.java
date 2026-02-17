/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Siddharth Valecha
 */
public class CountItemsMatchingRule {


    public static void main(String[] args) {
    String ruleKey="color";
    String ruleValue="silver";
    List<List<String>> items = new ArrayList<>();
    List<String> item1=new ArrayList<>();
    item1.add("phone");
    item1.add("blue");
    item1.add("pixel");


    items.add(item1);
    items.add(Arrays.asList("computer", "silver", "lenovo"));
    items.add(Arrays.asList("phone", "gold", "iphone"));

        System.out.println(countMatches(items,ruleKey,ruleValue));
    
    }
//    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int count=0;
//        for(int i=0;i<items.size();i++)
//        {
//            if(ruleKey.equals("type"))
//            {
//                if(items.get(i).get(0).equals(ruleValue))
//                {
//                    count++;
//                }
//
//            }
//            else if(ruleKey.equals("color"))
//            {
//                if(items.get(i).get(1).equals(ruleValue))
//                {
//                    count++;
//                }
//            }
//            else if(ruleKey.equals("name"))
//            {
//                if(items.get(i).get(2).equals(ruleValue))
//                {
//                    count++;
//                }
//            }
//            
//        }
//        return count;
//    }
    
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int k=0;
        if(ruleKey.equals("type"))
        {
            k=0;
        }
        else if(ruleKey.equals("color"))
        {
            k=1;
        }
        else if(ruleKey.equals("name"))
        {
            k=2;
        }
        for(int i=0;i<items.size();i++)
        {
                if(items.get(i).get(k).equals(ruleValue))
                {
                    count++;
                }          
        }
        return count;
    }
}
