//14. Longest Common Prefix https://leetcode.com/problems/longest-common-prefix/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.String.TwoPointer;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MaxNestingDepth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Strings");
        String str=sc.next();
       System.out.println(maxDepth(str));
           
    }
    static public int maxDepth(String s) {
        int n=s.length();
        int depth=0;
        int res=0;
        for (int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                depth++;
                res=Math.max(res,depth);
            }else if(s.charAt(i)==')'){
                depth--;
            }
        }
        return res;
    }
}