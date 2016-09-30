public class  TestEight 
{
	public static void main(String[] args) 
	{
		Customer firstCustomer = new Customer("Eleanor","Atlanta","123-4567");
		Boat firstBoat = new Boat("MO34567",28,"Tartan",2002);//loading
		firstCustomer.setBoat(firstBoat);
		Boat aBoat = firstCustomer.getBoat();//关联的调用，Customer中关联了Boat；
		firstBoat.assignBoatToCustomer(firstCustomer);//双向的set，比setter寄存器更容易实现双向数据交换；
		
		System.out.println("Customer information is "+firstCustomer.getName()+" "
		                                             +firstCustomer.getAddress()+" "
		                                             +firstCustomer.getPhoneNo());
		
		System.out.println("Customer boat information is "+
			               aBoat.getStateRegistrationNo()+" "
		                  +aBoat.getManufacturer()+" "+aBoat.getLength()+" "+aBoat.getYear());
        
		System.out.println("Boat owner information is "+firstBoat.getCustomer().getName()+" "
		                                               +firstBoat.getCustomer().getAddress()+" "
													   +firstBoat.getCustomer().getPhoneNo());
		
		System.out.println("Boat information is "+firstBoat.getStateRegistrationNo()+" "
		                                         +firstBoat.getManufacturer()+" "
		                                         +firstBoat.getLength()+" "+firstBoat.getYear());
		
		System.out.println("Customer's Boat information is "+firstCustomer.getBoat().getStateRegistrationNo()+" "
		                                                    +firstCustomer.getBoat().getManufacturer()+" "
															+firstCustomer.getBoat().getLength()+" "
															+firstCustomer.getBoat().getYear());
	}
}


