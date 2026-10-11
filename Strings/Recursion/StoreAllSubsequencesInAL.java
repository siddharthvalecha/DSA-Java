
package dsa.Recursion.String;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreAllSubsequencesInAL {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        
        ArrayList<String> ans=storeAllSubsequences(str);
          for(String ss: ans){
              System.out.println(ss);
          }
         
          
    }                   

    public static ArrayList<String> storeAllSubsequences(String s){
                ArrayList<String> result=new ArrayList<>();
                int n=s.length();
                if(n==0){
                    result.add("");
                    return result;
                }
                char curr=s.charAt(0);
                ArrayList<String> ans=storeAllSubsequences(s.substring(1));
                for(String ss: ans){
                    result.add(ss);
                    result.add(curr+ss);
                }
                return result;
    }
}


 