import java.util.*;
public  abstract class Lease
{
	private double amount;
	private Date startDate;
	private Date endDate;
	public Lease(Date aStartDate)
	{
		setStartDate(aStartDate);
		setEndDate(null);
		setAmount(0);
	}
   
	public void setAmount(double anAmount)
	{
		amount = anAmount;
	}
	public void setStartDate(Date aStartDate)
	{
		startDate = aStartDate;
	}
	public void setEndDate(Date anEndDate)
	{
		endDate = anEndDate;
	}
	public double getAmount()
	{
		return amount;
	}
	public Date getStartDate()
	{
		return startDate;
	}
	public Date getEndDate()
	{
		return endDate;
	}

}  

