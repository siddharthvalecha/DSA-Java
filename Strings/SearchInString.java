

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Siddharth Valecha
 */
public class SearchInString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String st="siddharth";
        char ch='s';
        boolean ans=search2(st,ch);
        System.out.println(ans);
    }
    static boolean search(String st,char ch)
    {
        for(int i=0;i<st.length();i++)
        {
            if(ch==st.charAt(i))
            {
                return true;
            }
        }
        return false;
        
    }
    static boolean search2(String st,char ch)
    {
        for(char c:st.toCharArray())
        {
            if(c==ch)
            {
                return true;
            }
        }
        return false;
        
    }
}
