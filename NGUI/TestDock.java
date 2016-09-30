import java.util.*;
public class  TestDock
{
	public static void main(String[] args) 
	{
		Dock firstDock;
		Slip firstSlip;
		Slip secondSlip;
		Slip thirdSlip;
		firstDock = new Dock (1,"Main Cove",true,false);
		firstSlip = new Slip(1,10,20,firstDock);
		secondSlip = new Slip(2,12,25,firstDock);
		thirdSlip = new Slip(3,14,25,firstDock);
		Vector slips = firstDock.getSlips();
		System.out.println(slips);//getting three members of Vector slips,while slips has ten members;
		System.out.println("Dock 1 has "+slips.size()+" slips");
		System.out.println("\n");
		for (int i = 0;i < slips.size() ;i++ )
		{
			Slip aSlip = (Slip)slips.elementAt(i);
			System.out.println("Slip number "+aSlip.getSlipId()+ " has width of "+aSlip.getWidth()
				                +" has length of "+aSlip.getSlipLength());
		}
		
		System.out.println("First Slip is on Dock "+firstSlip.getDock().getId()+" with Location "+firstSlip.getDock().getLocation()+" ......");


	}
}
