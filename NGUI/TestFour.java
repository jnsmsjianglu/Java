public class   TestFour 
{
	public static void main(String[] args) 
	{
		Slip slips[] = new Slip[3];//vector
		slips[0] = new Slip(1,10,20);
		slips[1] = new Slip(2,12,25);
        slips[2] = new Slip(3,14,30);
		for (int i = 0;i < slips.length ;i++ )
		{
			System.out.println(slips[i].tellAboutSelf());
		}

       
	    System.out.println("\n");


		for (int k= 0;k < slips.length ;k++ )
		{
			//double fee = slips[k].leaseShip();
			//System.out.print(" Fee is "+fee+" for SlipId: "+slips[k].getSlipId());
			System.out.println("Fee is "+slips[k].leaseShip()+" for SlipId "+slips[k].getSlipId());
			System.out.println("\n");
		}

        Slip fourthSlip = new Slip(4);
		System.out.println("fourth Slip: "+fourthSlip.tellAboutSelf());
		Slip slipss[] = new Slip[4];
		slipss[0] = new Slip(5);
		slipss[1] = new Slip(6);
		slipss[2] = new Slip(7);
		slipss[3] = new Slip(8);
		for (int j = 0;j < slipss.length ;j++ )
		{
			System.out.println(slipss[j].tellAboutSelf());
		}
	}
}
