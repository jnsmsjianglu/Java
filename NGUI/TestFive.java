public class  TestFive  
{
	public static void main(String[] args) 
	{
		Boat firstBoat = new Boat("MO34567",28,"Tartantu",1998);
		Boat secondBoat = new Boat("MO45678",27,"S2 Yachts",1994);
		Boat thirdBoat = new Boat("MO56789",30,"Catalian",2001);
        System.out.println("first boat: "+firstBoat.tellAboutSelf());
		System.out.println("seconf boat: "+secondBoat.tellAboutSelf());
		System.out.println("third boat: "+thirdBoat.tellAboutSelf());
	}
}
