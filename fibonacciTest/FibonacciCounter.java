package fibonacciTest;

/**
 * The FibonacciCounter class is the base class for both iterative and recursive Fibonacci methods
 * 
 * @author Christian Lundblad
 *
 */
public abstract class FibonacciCounter
{
	/**
	 * The number of iterations of the fibonacci sequence requested
	 */
	private int fibNumber;
	/**
	 *  The result of sequence once completed
	 */
	private long result = 0;
	/**
	 * The time the process started
	 */
	private long startTime;
	/**
	 * The time the process ended
	 */
	private long endTime;
	/**
	 * The total time the method took to process
	 */
	private long duration = 0;

	/**
	 * Default constructor
	 * 
	 * @param fibNum
	 *            - number of iterations of Fibonacci sequence
	 */
	public FibonacciCounter(int fibNum)
	{
		fibNumber = fibNum;
		// run the Fibonacci sequence method
		startTime = System.nanoTime();
		result = calcFibonacci(fibNumber);
		endTime = System.nanoTime();
		// calculate time the process took to run
		duration = (endTime - startTime);
	}

	/**
	 * Abstract method for for Fibonacci Counter types
	 * 
	 * @param fibNum - the number of Fibonacci sequences to calculate
	 * @return - completed sequence
	 */
	protected abstract long calcFibonacci(int fibNum);

	/**
	 * Getter for duration
	 * 
	 * @return duration
	 */
	protected long getDuration()
	{
		return duration;
	}
	
	/**
	 * Getter for result
	 * 
	 * @return result
	 */
	protected long getResult()
	{
		return result;
	}

	/**
	 *  Trace method for use in debugging
	 * @param fib - Fibonacci number
	 * @param cnt - current count
	 */
	protected void traceFib(long fib, int cnt)
	{
		System.out.println(
				"Current Sequence: " + cnt + " and current FibNumber: " + fib);
	}
}
