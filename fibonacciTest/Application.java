package fibonacciTest;

import java.util.Scanner;

/**
 * @author Christian Lundblad
 *
 */

public class Application
{
	/**
	 *  This is the main entry point of the application.
	 *  
	 * @param args - main method arguments
	 */
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in); //for reading input from user
		int number = 0; //number to calculate from
		
		System.out.println("This program will calculate the Fibonacci sequence of a specified number.");
		System.out.println("**WARNING: HIGHER NUMBERS WILL TAKE EXCEEDINGLY LONG TO CALCULATE**");
		System.out.print("Please enter a number between 0 and 50 to calculate the Fibonacci sequence: ");
		number = key.nextInt(); //get input
		System.out.println();
		@SuppressWarnings("unused")
		FibonacciCounter i = new IterativeFibonacciCounter(number);
		System.out.println();
		@SuppressWarnings("unused")
		FibonacciCounter r = new RecursiveFibonacciCounter(number);
		
		key.close();
	}
}
