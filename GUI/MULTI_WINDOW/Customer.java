import java.util.Vector;
public  class  Customer
{
	private String name;
	private String address;
	private String phoneNo;
	//private Boat boat;//在Customer中加入boat类的一个量；
    //Vector customers = new Vector();
	static Vector customers;
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
	/*public Boat  getBoat()
	{
		return boat;
	}*/

	
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
	/*public void setBoat(Boat aBoat)
	{
		boat = aBoat;
	}*/
	
	public Customer(String aName,String anAddress,String aPhoneNo)//函数方法1；
    {	
		//customers = new Vector();
		setName(aName);
		setAddress(anAddress);
		setPhoneNo(aPhoneNo);
		//setBoat(null);
		customers.add(this);
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

	public static void initialize()
	{
		//customers = new Vector();
		Customer aCustomer;
		aCustomer = new Customer("姜路","南京","15996367250");
		aCustomer = new Customer("张英珠","南京","15895952213");
		aCustomer = new Customer("姜映舟","桂林","13270803603");
		aCustomer = new Customer("李喆","南京","15195895896");
	}

	public  static Vector getAll()
	{
		//Vector aCustomers = new Vector();
		//aCustomers = customers;
		//return aCustomers;

		return customers;
	}
	
}






 
	

