public class TestThree 
{
	public static void main(String[] args) 
	{
		Customer customer1,customer2,customer3;
		customer1 = new Customer("xiao hong","beijing","123456");
		customer2 = new Customer("xiaoming","shanghai","654321");
		customer3 = new Customer("xiaowang","nanjing","456789");
     	System.out.println("customer1 is "+customer1.tellAboutSelf());
		System.out.println("customer2 is "+customer2.tellAboutSelf());
		System.out.println("customer3 is "+customer3.tellAboutSelf());
	}
}



