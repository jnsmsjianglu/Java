public class TestSix
{
	public static void main(String[] args) 
	{
		SailBoat firstBoat = new SailBoat("MO34567",28,"Tartan",1998,4.11,2,"Inboard Diesel");
		SailBoat secondBoat = new SailBoat("MO45678",29,"S2 Yachts",1994,3.9,4,"Outboard Gas");
		SailBoat thirdBoat = new SailBoat("MO56789",30,"Catalina",2001,5.5,3,"Inboard Diesel");

		System.out.println("Boat 1 information is :\n"+
			               firstBoat.getStateRegistrationNo()+","
			               +firstBoat.getLength()+","
			               +firstBoat.getManufacturer()+","
			               +firstBoat.getYear()+","
			               +firstBoat.getKeelDepth()+","
						   +firstBoat.getNoSail()+","
			               +firstBoat.getMotorType());
		System.out.println("\n");
        System.out.println("Boat 2 information is :\n"+
			               secondBoat.getStateRegistrationNo()+","
			               +secondBoat.getLength()+","
			               +secondBoat.getManufacturer()+","
			               +secondBoat.getYear()+","
			               +secondBoat.getKeelDepth()+","
						   +secondBoat.getNoSail()+","
			               +secondBoat.getMotorType());
		System.out.println("\n");
		System.out.println("Boat 3 information is :\n"+
			               thirdBoat.getStateRegistrationNo()+","
			               +thirdBoat.getLength()+","
			               +thirdBoat.getManufacturer()+","
			               +thirdBoat.getYear()+","
			               +thirdBoat.getKeelDepth()+","
						   +thirdBoat.getNoSail()+","
			               +thirdBoat.getMotorType());


	}
}
