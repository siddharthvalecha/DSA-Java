//GFGLongest Substring with K Uniques https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

package dsa.Stack;


import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Siddharth Valecha
 */
public class ValidParanthesis {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
          System.out.println("Enter The String ");
        String str=sc.next();
     
        boolean ans=isValid(str);
        System.out.println("Answer is :"+ ans);
    }
    public static boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack();
        for(int i=0;i<n;i++){
            char brac=s.charAt(i);
            if(brac=='[' || brac=='{' || brac=='('){
                st.push(brac);
                continue;
            }
            else{
            if(st.isEmpty()){
             return false;
            }
            else {
                if(brac==']' && st.peek()=='['){
                    st.pop();
                }
                else if(brac=='}' && st.peek()=='{' ){
                    st.pop();
                }
                else if(st.peek()=='(' && brac==')'){
                    st.pop();
                }else {
                    return false;
                }
            }            
        }
    }
            if(st.isEmpty())
                return true;
            else 
                return false;
    }
}
