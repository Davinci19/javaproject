/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;
import java.util.Scanner;
/**
 *
 * @author WICKED
 */
public class Primenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int snake;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number for check:");
	//the input in an integer
        
	int num=scan.nextInt();
	for(int i=2;i<=num/2;i++)
	{
           snake=num%i;
	   if(snake==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
    }
    
}
