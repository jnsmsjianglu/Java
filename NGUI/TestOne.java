public class  TestOne  
{
	public static void main(String[] args)
	{   
		String customerName,customerAddress,customerPhoneNo;
		Customer firstCustomer = new Customer();
		firstCustomer.setName("JiangLu");
		firstCustomer.setAddress("NUIST,PanCheng Street ,NanJiang,JiangSu ,China");
		firstCustomer.setPhoneNo("15996367250");
		customerName = firstCustomer.getName();
		customerAddress = firstCustomer.getAddress();
		customerPhoneNo = firstCustomer.getPhoneNo();
		System.out.println("the first customer's name is "+customerName);
		System.out.println("the first customer's address is "+customerAddress);
		System.out.println("the first customer's phonenumber is "+customerPhoneNo);
	}
}
