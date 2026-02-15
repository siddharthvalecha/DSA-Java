/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Siddharth Valecha
 */
public class PangramSentence {

    
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans=checkIfPangram(sentence);
        System.out.println(ans);
}
   public static boolean checkIfPangram(String sentence) {
        boolean[] check=new boolean[26];
        int index=0;
        for(int i=0;i<sentence.length();i++)
        {
            index=sentence.charAt(i)-'a';
            check[index]=true;
        }
            for (int j = 0; j < check.length; j++) {
            if(check[j]==false)
            {
                return false;
            }
            
        }
        return true;
}
}
