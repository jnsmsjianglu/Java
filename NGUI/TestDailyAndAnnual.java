import java.util.*;
public class  TestDailyAndAnnual
{
	public static void main(String[] args) 
	{
		Calendar aCalendar = Calendar.getInstance();
		aCalendar.set(2016,Calendar.MARCH,3);
		Date date1 = aCalendar.getTime();
		aCalendar.set(2016,Calendar.MAY,7);
		Date date2 = aCalendar.getTime();
		aCalendar.set(2016,Calendar.MAY,18);
		Date date3 = aCalendar.getTime();
		AnnualLease firstLease = new AnnualLease(date1,14,true);
		AnnualLease secondLease = new AnnualLease(date2,16,false);
		DailyLease thirdLease = new DailyLease(date1,date2,14);
		DailyLease fourthLease = new DailyLease(date2,date3,16);
        System.out.println("AnnualLease 1 information is: "+firstLease.getAmount()+" "
		                   +firstLease.getStartDate()+" "+firstLease.getEndDate()+" "
						   +firstLease.getBalanceDue()+" "+firstLease.getPayMonthly());
		System.out.println("AnnualLease 2 information is: "+secondLease.getAmount()+" "
		                   +secondLease.getStartDate()+" "+secondLease.getEndDate()+" "
						   +secondLease.getBalanceDue()+" "+secondLease.getPayMonthly());
		System.out.println("DailyLease 1 information is: "+thirdLease.getAmount()+" "
		                   +thirdLease.getStartDate()+" "+thirdLease.getEndDate()+" "
						   +thirdLease.getNumberOfDays());
		System.out.println(thirdLease.tellAboutSelf());
		System.out.println("\n");
		System.out.println("DailyLease 2 information is: "+fourthLease.getAmount()+" "
		                   +fourthLease.getStartDate()+" "+fourthLease.getEndDate()+" "
						   +fourthLease.getNumberOfDays());
		System.out.println(fourthLease.tellAboutSelf());
	  
	}
}


