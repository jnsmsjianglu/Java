import java.util.*;
public class TestLease 
{
	public static void main(String[] args) 
	{
		Calendar  aCalendar = Calendar.getInstance();
		aCalendar.set(2016,Calendar.SEPTEMBER,22);
		Date date1 = aCalendar.getTime();
		aCalendar.add(Calendar.MONTH,1);
		Date date2 = aCalendar.getTime();
		aCalendar.add(Calendar.DATE,10);
		Date date3 = aCalendar.getTime();


		Lease firstLease = new Lease(date1);
		Lease secondLease = new Lease(date2);
		Lease thirdLease = new Lease(date3);


		System.out.println("Lease 1 information is: "
			               +firstLease.getAmount()+" "
						   +firstLease.getStartDate()+" "
						   +firstLease.getEndDate());

		System.out.println("Lease 2 information is: "
			               +secondLease.getAmount()+" "
						   +secondLease.getStartDate()+" "
						   +secondLease.getEndDate());
		System.out.println("Lease 3 information is: "
			               +thirdLease.getAmount()+" "
						   +thirdLease.getStartDate()+" "
						   +thirdLease.getEndDate());

	}
}
