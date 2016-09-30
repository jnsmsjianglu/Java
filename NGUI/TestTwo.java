public class  TestTwo
{
	public static void main(String[] args) 
	{
		Customer firstCustomer,secondCustomer,thirdCustomer;
		//String customerName1,customerName2,customerName3;
		firstCustomer = new Customer();
		secondCustomer = new Customer();
		thirdCustomer = new Customer();
		firstCustomer.setName("xiao hong");
		firstCustomer.setAddress("st.Louis");
		firstCustomer.setPhoneNo("11-5263");
		secondCustomer.setName("xiao wang");
		secondCustomer.setAddress("Washton D.C.");
		secondCustomer.setPhoneNo("00-1234");
		thirdCustomer.setName("xiao li");
		thirdCustomer.setAddress("Boston");
		thirdCustomer.setPhoneNo("17-9876");
		System.out.println("the first customer name is "+firstCustomer.getName());
		System.out.println("the first customer address is "+firstCustomer.getAddress());
		System.out.println("the first customer phonenumber is "+firstCustomer.getPhoneNo());
		System.out.println("the second customer name is "+secondCustomer.getName());
		System.out.println("the second cuwtomer address is "+secondCustomer.getAddress());
		System.out.println("the second customer phonenumber is "+secondCustomer.getPhoneNo());
		System.out.println("the third customer name is "+thirdCustomer.getName());
        System.out.println("the third customer address is "+thirdCustomer.getAddress());
		System.out.println("the third customer phonenumber is "+thirdCustomer.getPhoneNo());




	}
}
