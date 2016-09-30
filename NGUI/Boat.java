public class Boat 
{
	private String stateRegistrationNo;
	private double length;
	private String manufacturer;
	private int year;
	private Customer customer;
	private Slip slip;

	public Boat(String aSateRegistrationNo,double aLength,String aManufacturer,int aYear /*,Customer customer*/)//这个Customer是后来才加上去的，用来与Boat的信息进行绑定；
	{
		setStateRegistrationNo(aSateRegistrationNo);
		setLength(aLength);
		setManufacturer(aManufacturer);
		setYear(aYear);
		//assignBoatToCustomer(customer);
		//该方法会设置Boat的customer属性并请求Customer设置其属性；
		//setSlip(null);
	}
	public void setStateRegistrationNo(String aStateRegistrationNo)
	{
		stateRegistrationNo = aStateRegistrationNo;
	}
	public void setLength(double aLength)
	{
		length = aLength;
	}
	public void setManufacturer(String aManufacturer)
	{
		manufacturer = aManufacturer;
	}
	public void setYear(int aYear)
	{
		year = aYear;
	}
	public void setCustomer(Customer aCustomer)
	{
		customer = aCustomer;
	}
	public void setSlip(Slip aSlip)
	{
		slip = aSlip;
	}
	
	public void assignBoatToCustomer(Customer aCustomer)
	{
		setCustomer(aCustomer);
		customer.setBoat(this);//rewritting (setBoat(null);)
	}
	public void assignBoatToSlip(Slip aSlip)
	{
		setSlip(aSlip);
		slip.setBoat(this);
	}
	public String getStateRegistrationNo()
	{
		return stateRegistrationNo;
	}
	public double getLength()
	{
		return length;
	}
	public String getManufacturer()
	{
		return manufacturer;
	}
	public int getYear()
	{
		return year;
	}
	public Customer getCustomer()
	{
		return customer;
	}
	public Slip getSlip()
	{
		return slip;
	}

	public String tellAboutSelf1()
	{
		String info;
		info = "Boat Registration Number: "+getStateRegistrationNo()
			   +" Boat Length: "+getLength()
			   +" Boat Manufacturer: "+getManufacturer()
			   +" Boat Year: "+getYear();
		return info;
	}

	public String tellAboutSelf()
	{
		String boatDetails="I am Boat "+"state reg number "+getStateRegistrationNo()
			               +" Length "+getLength()+" Manufacturer "+getManufacturer()
			               +" Year "+getYear();
		String customerDetails="\n and Owner is "+customer.getName()+" living in "+customer.getAddress()
			                    +" with phone "+customer.getPhoneNo();
        return boatDetails + customerDetails;
	}

}



