/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumber;
import java.util.Scanner;
/**
 *
 * @author WICKED
 */
public class Evennumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s;
      System.out.println("Enter an integer to check if it is odd or even ");
      Scanner in = new Scanner(System.in);
      s= in.nextInt();
 
      if ( s % 2 == 0 )
         System.out.println("You entered an even number.");
      else
         System.out.println("You entered an odd number.");
       //This prints out and shows if your number is odd or even
    }
    
}
