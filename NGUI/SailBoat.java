public class SailBoat extends Boat 
{	
		private double keelDepth;
		private int noSail;
		private String motorType;
		public SailBoat(String aStateRegistrationNo,double aLength,
			            String aManufacturer,int aYear,double aKeelDepth,
			            int aNoSail,String aMotorType)
		{   
			super(aStateRegistrationNo,aLength,aManufacturer,aYear);//using super class to fill the paraments;
			setKeelDepth(aKeelDepth);
			setNoSail(aNoSail);
			setMotorType(aMotorType);
		}

		public void setKeelDepth(double aKeelDepth)
		{
			keelDepth = aKeelDepth;
		}
		public void setNoSail(int aNoSail)
		{
			noSail = aNoSail;
		}
		public void setMotorType(String aMotorType)
		{
			motorType = aMotorType;
		}
		public double getKeelDepth()
		{
			return keelDepth;
		}
		public int getNoSail()
		{
			return noSail;
		}
		public String getMotorType()
		{
			return motorType;
		}
	
}
