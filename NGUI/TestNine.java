public class TestNine  
{
	public static void main(String[] args) 
	{
		Customer firstCustomer = new Customer("JiangLu","NanJing","025-52199927");
		Customer secondCustomer = new Customer("JiaoYuQi","NanJing","025-86118302");
		Boat firstBoat = new Boat("MO34567",28,"Tartan",2000,firstCustomer);
		Boat secondBoat = new Boat("MO45678",28,"Catalina",2001,secondCustomer);
		System.out.println(firstBoat.tellAboutSelf());
		System.out.println("\n");
		System.out.println(secondBoat.tellAboutSelf());

	}
}
