public  class  Customer
{
	private String name;
	private String address;
	private String phoneNo;
	private Boat boat;//��Customer�м���boat���һ������

	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public String getPhoneNo()
	{
		return phoneNo;
	}
	public Boat  getBoat()
	{
		return boat;
	}




    
	
	public void setName(String newName)
	{
		name = newName;
	}

	public void setAddress(String newAddress)
	{
		address = newAddress;
	}

	public void setPhoneNo(String newPhoneNo)
	{
		phoneNo = newPhoneNo;
	}
	public void setBoat(Boat aBoat)
	{
		boat = aBoat;
	}
	
	public Customer(String aName,String anAddress,String aPhoneNo)//��������1��
    {	
		setName(aName);
		setAddress(anAddress);
		setPhoneNo(aPhoneNo);
		setBoat(null);
	}   

   




	/*public Customer(String aName,String anAddress,String aPhoneNo)//��������2��
	{
		name = aName;
		address = anAddress;
		phoneNo = aPhoneNo;
		setBoat(null);
	}*/

	public String tellAboutSelf()//��ʽ��ֱ��������ֽ����˴κ����Ĺ��죻
	{
		String info;
		info = "Customer name ="+getName()+",Customer address = "+getAddress()+"Customer phoneNumber = "+getPhoneNo();
		return info;
	}
	
}






 
	

