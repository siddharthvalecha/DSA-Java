
package dsa.Recursion.String;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOccurances {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
          String ans=removeA(str,0);
          String ans1=removeAwoutIdx(str);
          System.out.println("Answer:"+ans);
           System.out.println("Answer:"+ans1);
    }                   
//                              Better
    public static String removeA(String s,int idx) {
               int n=s.length();
                String ans="";
               if(idx==n) return "";
               
               if(s.charAt(idx)!='a'){
                   ans+=s.charAt(idx);
               }
               ans+=removeA(s,idx+1);
               return ans;
    }
//                                       OR
//    public static String removeA(String s,int idx) {
//               int n=s.length();
//                
//               if(idx==n) return "";
//               
//               String smallAns=removeA(s,idx+1);
//               
//               if(s.charAt(idx)!='a'){
//                    return smallAns+s.charAt(idx);
//               }
//               else
//                   return smallAns;
//           
//    }
    
    public static String removeAwoutIdx(String s) {
               int n=s.length();
                if(n==0) return "";
                
                String smallAns=removeAwoutIdx(s.substring(1));
                if(s.charAt(0)!='a'){
                        smallAns+=s.charAt(0);
                        return smallAns;
               }
                else{
                    return smallAns;
                }
    }
    
}


 