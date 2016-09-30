public  class  Customer
{
	private String name;
	private String address;
	private String phoneNo;
	private Boat boat;//在Customer中加入boat类的一个量；

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
	
	public Customer(String aName,String anAddress,String aPhoneNo)//函数方法1；
    {	
		setName(aName);
		setAddress(anAddress);
		setPhoneNo(aPhoneNo);
		setBoat(null);
	}   

   




	/*public Customer(String aName,String anAddress,String aPhoneNo)//函数方法2；
	{
		name = aName;
		address = anAddress;
		phoneNo = aPhoneNo;
		setBoat(null);
	}*/

	public String tellAboutSelf()//格式化直接输出，又进行了次函数的构造；
	{
		String info;
		info = "Customer name ="+getName()+",Customer address = "+getAddress()+"Customer phoneNumber = "+getPhoneNo();
		return info;
	}
	
}






 
	

