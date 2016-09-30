import java.util.*;
public class Dock
{
	private int id;
	private String location;
	private boolean electricity;
	private boolean water;
    private Vector slips;
	public Dock(int anId,String aLocation,boolean anElectricity,boolean aWater)
    {
		setId(anId);
		setLocation(aLocation);
		setElectricity(anElectricity);
		setWater(aWater);
		slips = new Vector(10);
	}
    public void addSlipToDock(Slip aSlip)
	{
		slips.addElement(aSlip);
		aSlip.setDock(this);
	}
	public Vector getSlips()
	{
		return slips;
	}
	public void setId(int anId)
    {
		id= anId;
	}
	public void setLocation(String anLocation)
	{
		location = anLocation;
	}
	public void setElectricity(boolean anElectricity)
	{
		electricity = anElectricity;
	}
	public void setWater(boolean aWater)
	{
		water = aWater;
	}
    public int getId()
	{
		return id;
	}
	public String getLocation()
	{
		return location;
	}
	public boolean getElectricity()
	{
		return electricity;
	}
	public boolean getWater()
	{
		return water;
	}

}  

