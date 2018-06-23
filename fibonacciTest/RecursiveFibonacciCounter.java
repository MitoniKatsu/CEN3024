package fibonacciTest;

/** This is a recursive Fibonacci Counter
 * @author Christian Lundblad
 *
 */
public class RecursiveFibonacciCounter extends FibonacciCounter
{

	/**
	 * @param fibNum - number of iterations of Fibonacci sequence
	 */
	public RecursiveFibonacciCounter(int fibNum)
	{
		super(fibNum);
		System.out.println("Fibonacci sequence was calculated using a recursive method.");
		System.out.println("The process took " + getDuration() + " nanoseconds to complete.");
		System.out.println("The Fibonacci number for " + fibNum + " is " + getResult() + ".");
	}

	/* (non-Javadoc)
	 * @see fibonacciTest.FibonacciCounter#calcFibonacci(int)
	 */
	@Override
	protected long calcFibonacci(int fibNum)
	{
		if((fibNum == 1) || (fibNum == 0)) //since fib0 and fib1 are 0 and 1 respectively
		{
			return fibNum;
		}
		
		return calcFibonacci(fibNum - 1) + calcFibonacci(fibNum - 2);
	}

}
