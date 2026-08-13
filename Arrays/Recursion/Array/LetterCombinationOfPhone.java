//17. Letter Combinations of a Phone Number https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

package dsa.Recursion.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinationOfPhone {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the digits");
        String digits=sc.nextLine();
           List<String> ans=letterCombinations(digits);
            for(String s:ans){
                System.out.println(s);
            }
    }
    public static List<String> letterCombinations(String digits){
                String kp[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
                
                return combination(digits,kp,"");
                
    }
     public static List<String> combination(String digits,String[] kp,String res){
                    List<String> ans=new ArrayList<>();
                    if(digits.length()==0){
                        ans.add(res);
                        return ans;
                    }
                int currNum=digits.charAt(0)-'0';
                String currChoices=kp[currNum];
                
                for (int i = 0; i <currChoices.length(); i++) {
                    List<String> temp=combination(digits.substring(1),kp,res+currChoices.charAt(i));
                    ans.addAll(temp);
         }
                return ans;
     }
}


 