//public class PowerBoat extends Boat //��ͧ��
public class PowerBoat extends Boat //��ͧ��
{
	private int noEngines;
	private String fuelType;
	public PowerBoat(String aStateRegistrationNo,double aLength
		            ,String aManufacturer,int aYear,int aNoEngines,
		             String aFuelType)
	{
		super(aStateRegistrationNo,aLength,aManufacturer,aYear);
        setNoEngines(aNoEngines);
		setFuelType(aFuelType);
	}
   public void  setNoEngines(int aNoEngines)
	{
		noEngines = aNoEngines;
    }
   public void setFuelType(String aFuelType)
	{
	   fuelType = aFuelType;
    }
	public int getNoEngines()
	{
		return noEngines;
	}
	public String getFuelType()
	{
		return fuelType;
	}   
}  
