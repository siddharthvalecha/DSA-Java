/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Siddharth Valecha
 */
public class EvenDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] nums={12,345,2,6,7896};
        findNumbers(nums);
                     
              }
    static int findNumbers(int[] nums)// hom many even digit number
    {
        int count=0;
        for(int num:nums)
        {
        if(evenDigits(num))
                {
                    count++;
                }
        }
        return count;
    }
    static boolean evenDigits(int num)//to check even digits or not
    {
        
//        if(digits(num)%2==0)
//        {
//           return true;
//        }
//        return false;
        return digits(num)%2==0;    
    }
    static int digits(int num)//count number of digits
    {
        int count=0;
        while(num>0)
        {
           count++;
           num=num/10;
        }
        return count;
    }
}
