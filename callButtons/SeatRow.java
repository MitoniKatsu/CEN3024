package callButtons;
/**
 * @author Christian Lundblad
 *
 */
public class SeatRow implements AttendantButton
{
	private int rowNumber; //row number
	private Seat[] seats = new Seat[5]; //create array of seats
	
	public SeatRow(int rowNum)
	{
		rowNumber = rowNum; //row number
		
		//populate seat array
		for(int i = 0; i < seats.length; i++)
		{
			seats[i] = new Seat(i + 1);
		}
	}
	
	public void toggleSeat(int seatNum)
	{
		seats[seatNum - 1].toggleLight();
	}

	@Override
	public void pressAttButton()
	{
		//show attendant button pushed in console
		System.out.println(String.format("Attendant button for row %s has been pushed", rowNumber));
		//iterate over seat array and toggle light off if it is on.
		for(int i = 0; i < seats.length; i++)
		{
			if(seats[i].getLightStatus())
			{
				seats[i].toggleLight();
			}			
		}
	}
	
}
