import java.util.Vector;
public  class  Customer
{
	private String name;
	private String address;
	private String phoneNo;
	//private Boat boat;//��Customer�м���boat���һ������
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
	
	public Customer(String aName,String anAddress,String aPhoneNo)//��������1��
    {	
		//customers = new Vector();
		setName(aName);
		setAddress(anAddress);
		setPhoneNo(aPhoneNo);
		//setBoat(null);
		customers.add(this);
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

	public static void initialize()
	{
		//customers = new Vector();
		Customer aCustomer;
		aCustomer = new Customer("��·","�Ͼ�","15996367250");
		aCustomer = new Customer("��Ӣ��","�Ͼ�","15895952213");
		aCustomer = new Customer("��ӳ��","����","13270803603");
		aCustomer = new Customer("�","�Ͼ�","15195895896");
	}

	public  static Vector getAll()
	{
		//Vector aCustomers = new Vector();
		//aCustomers = customers;
		//return aCustomers;

		return customers;
	}
	
}






 
	

