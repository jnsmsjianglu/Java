public class  TestSeven  
{
	public static void main(String[] args) 
	{
		PowerBoat firstBoat = new PowerBoat("MO34567",28,"Tartan",1998,2,"Gas");
		SailBoat secondBoat = new SailBoat("MO45678",29,"S2 Yachts",1994,3.9,4,"Outboard Gas");
        System.out.println("Boat 1 information is :\n"+firstBoat.toString()+//返回了类的名称；
			               firstBoat.getStateRegistrationNo()+","
			               +firstBoat.getLength()+","
			               +firstBoat.getManufacturer()+","
			               +firstBoat.getYear()+","
			               +firstBoat.getNoEngines()+","
						   +firstBoat.getFuelType());
		System.out.println("\n");
        System.out.println("Boat 2 information is :\n"+secondBoat.toString()+//返回了类的名称；
			               secondBoat.getStateRegistrationNo()+","
			               +secondBoat.getLength()+","
			               +secondBoat.getManufacturer()+","
			               +secondBoat.getYear()+","
			               +secondBoat.getKeelDepth()+","
						   +secondBoat.getNoSail()+","
			               +secondBoat.getMotorType());
	}
}


