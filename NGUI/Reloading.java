import java.text.*;
public class   Reloading 
{   Slip slips[] =null;
	public static void main(String[] args) 
	{   
		
		Slip slips[] = new Slip[4];
		slips[0] = new Slip(1,12,24);
		slips[1] = new Slip(2,14,30);
		slips[2] = new Slip(3);
		slips[3] = new Slip(4);
		System.out.println("Now this is Reloading the shipInfomation!");
        for (int i = 0;i < 4 ;i++ )
        {
			System.out.println(slips[i].tellAboutSelf());
        }
		System.out.println("\n");
        System.out.println("Now just display the fee of ship!");
        
		for (int k = 0;k < 4 ;k++ )
		{
			System.out.println("Fee is "+slips[k].leaseShip()+ " of shipId "+slips[k].getSlipId());
		}
		System.out.println("\n");
        System.out.println("Now Reloading the function leaseShip(double aDiscountPercent!)");
		for (int j = 0;j < 4 ;j++ )
		{
			System.out.println("the fee after the discount is :\n"+"ShipId: "+slips[j].getSlipId()+",discountedFee: "+slips[j].leaseShip(20));
		}
        System.out.println("\n");
        System.out.println("Now is NumberFormat and Reloading the function leaseShip(double aDiscountPercent)!");
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		for (int m = 0;m < slips.length ; m++ )
		{
			System.out.println("Currency Fee is :"+currencyFormat.format(slips[m].leaseShip(20))+",ShipId: "+slips[m].getSlipId());
		}
		
	}
}
