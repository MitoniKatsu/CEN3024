package fibonacciTest;

/** This is an iterative Fibonacci Counter
 * @author Christian Lundblad
 *
 */
public class IterativeFibonacciCounter extends FibonacciCounter
{

	/** An iterative Fibonacci Counter
	 * @param fibNum - number of iterations of Fibonacci sequence
	 */
	public IterativeFibonacciCounter(int fibNum)
	{
		super(fibNum);
		System.out.println("Fibonacci sequence was calculated using an iterative method.");
		System.out.println("The process took " + getDuration() + " nanoseconds to complete.");
		System.out.println("The Fibonacci number for " + fibNum + " is " + getResult() + ".");
	}

	/* (non-Javadoc)
	 * @see fibonacciTest.FibonacciCounter#calcFibonacci(int)
	 */
	@Override
	protected long calcFibonacci(int fibNum)
	{
		if(fibNum == 0) //no calculation needed
		{
			return 0;
		}
		
		long temp = 1;			//temporarily holds a number for prevFib
		long prevFib = 1;		//previous iteration
		long currentFib = 0; 	//current iteration
		int fibCount = 0; 		//count number of sequence iterations
		
		while(fibCount < fibNum)
		{
			temp = currentFib;
			currentFib += prevFib;
			prevFib = temp;
			fibCount++; //iterate counter
			//traceFib(currentFib, fibCount);
		}
		
		
		return currentFib;
	}
	
}
