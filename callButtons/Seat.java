package callButtons;

/**
 * @author Christian Lundblad
 *
 */
public class Seat
{
	private int seatNumber; //seat number in the row
	private boolean callLight = false; //is the light on
	
	//Constructor
	public Seat(int seatNum)
	{
		seatNumber = seatNum;
	}
	
	//public accessors
	public int getSeatNumber()
	{
		return seatNumber;
	}
	
	public boolean getLightStatus()
	{
		if(callLight)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void toggleLight()
	{
		if(callLight)
		{
			callLight = false; //toggle to off
			System.out.println(String.format("The light for seat %s is off.", seatNumber)); //display new status
		}
		else
		{
			callLight = true; //toggle to on
			System.out.println(String.format("The light for seat %s is on.", seatNumber)); //display new status
		}
	}
}
