
package dsa.Recursion.String;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllSubsequenesStirng {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        
        String currAns="";
            printSubsequences(str,currAns);
          
    }                   

    public static void  printSubsequences(String s,String currAns){
                 int n=s.length();
                 if(n==0){
                     System.out.println(currAns);
                     return;
                 }
                char curr=s.charAt(0);
                String remaingStr=s.substring(1);
                
                // curr Char want to be part of ans
                printSubsequences(remaingStr,currAns+curr);
                // curr Char want to be part of ans
                printSubsequences(remaingStr,currAns);
        
        
    }
}


 