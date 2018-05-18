package callButtons;
/**
 * @author Christian Lundblad
 *
 */
import java.util.Scanner;

public class TestCallButton
{	 
	public static void main(String[] args)
	{
		//create row of seats
		SeatRow row1 = new SeatRow(1);
		
		//menu choice
		char choice = ' ';
		
		//create scanner for reading input
		Scanner input = new Scanner(System.in);
		
		do
		{
			//show menu in console
			System.out.println("");
			System.out.println("To toggle the light for a seat, enter a seat number 1 through 5.");
			System.out.println("To press the attendant button, enter 'a'.");
			System.out.println("To exit, enter 'n'.");
			choice = input.next().charAt(0);
		
			//choice logic
			switch(choice)
			{
				case '1':
				{
					row1.toggleSeat(1);
					break;
				}

				case '2':
				{
					row1.toggleSeat(2);
					break;
				}
				case '3':
				{
					row1.toggleSeat(3);
					break;
				}
				case '4':
				{
					row1.toggleSeat(4);
					break;
				}
				case '5':
				{
					row1.toggleSeat(5);
					break;
				}
				case 'a':
				case 'A':
				{
					row1.pressAttButton();
					break;
				}
				case 'n':
				case 'N':
				{
					input.close();
					System.exit(0);
				}
				default:
					break;
			}
		}
		while(true);
	}
}
