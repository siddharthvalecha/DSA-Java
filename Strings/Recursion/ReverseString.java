
package dsa.Recursion.String;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
          String ans=reverse(str,0);
          
          System.out.println("Answer:"+ans);
          
    }                   

    public static String reverse(String s,int idx) {
                    int n=s.length();
                    if(idx==n) return "";
                    
                    String smallAns=reverse(s, idx+1);
                    
                    return smallAns+s.charAt(idx);
    }    
}


 