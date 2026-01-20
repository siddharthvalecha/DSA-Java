/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Siddharth Valecha
 */
public class NextGretestLetter {

    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Size:");
      int n=sc.nextInt();
      char[] letters=new char[n];
      System.out.println("Elements:");
        for (int i = 0; i < letters.length; i++) {
            letters[i]=sc.next().charAt(0);   
        }
      System.out.println("Target:");
        char target=sc.next().charAt(0);
      
      char ans=nextGreatestLetter(letters,target);
       System.out.println(ans);
        
}
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        if(target>=letters[end])
          {
            return letters[0];
          }
          else
          {
        while(start<=end)
        {
           int mid=start+(end-start)/2;
            if(target>=letters[mid])
           {
            start=mid+1;
           }
           else if(target<letters[mid])
           {
            end=mid-1;
           }
        }
        }
        return letters[start];
    }
    }
