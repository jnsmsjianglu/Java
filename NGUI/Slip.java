public   class  Slip
{
	private int slipId;
	private int width;
	private double slipLength;
	private static final int MAXIMUM_NUMBER_OF_SLIPS = 50;
	private static final int VALID_SLIP_WIDTH[] = {10,12,14,16};
	private static int numberOfSlip = 0;
	private Dock dock;
	private Boat boat;
//------------------------MASK THE EXCEPTOINS---------------------------------
	public void setId(int aId)  //throws Exception
	{
		slipId = aId;
		/*if (aId <1 || aId >MAXIMUM_NUMBER_OF_SLIPS)
		{
			Exception e = new Exception ("Slip ID is not between 1&"+ MAXIMUM_NUMBER_OF_SLIPS);//add the exception;
			throw e;
		}
		else slipId = aId;*/
	}

	public void setWidth(int aWidth)  //throws Exception
	{
		/*boolean validWidth = false;
		for (int i = 0;i < VALID_SLIP_WIDTH.length&&!validWidth ;i++ )
		{
             if (aWidth==VALID_SLIP_WIDTH[i])
             {
				validWidth = true;
             }
		}
				if (validWidth)
				{*/
					width = aWidth;
				/*}
				else  
			{
				Exception e = new Exception ("Invalid Slip Wdith!");
				throw e;
			}*/
        
		
	}

	public void setSlipLength(double aSlipLength)
	{
		slipLength = aSlipLength;
	}

	public int getSlipId()
	{
		return slipId;
	}
	public int getWidth()
	{
		return width;
	}
    public double getSlipLength()
	{
		return slipLength;
	}
	public Dock getDock()
	{
		return dock;
	}
    public void setDock(Dock aDock)
	{
		dock = aDock;
	}
	public void setBoat(Boat aBoat)
	{
		boat = aBoat;
	}

	public Slip(int Id,int Width,int Length,Dock aDock)  //throws Exception
	{
		setId(Id);
		setWidth(Width);
		setSlipLength(Length);
		setDock(aDock);
		dock.addSlipToDock(this);//Connector;
		setBoat(null);
		numberOfSlip++;

	}         


	public String tellAboutSelf()
	{
		String info;
		info = "Slip ID: "+getSlipId()+",WIDTH = "+getWidth()+",LENGTH = "+getSlipLength();
		return info;
	}


	public double leaseShip()  
	{
		double fee;
		switch(width)
		{
			case 10:fee = 800;
			break;
			case 12:fee = 900;
			break;
			case 14:fee = 1100;
			break;
			case 16:fee = 1500;
			break;
			default: fee = 0;
		}

		return fee;
	}


//这边是重载的方法（注意区分重写方法，以及多态性），对于属性之中经常出现的数据可以设置为静态的常量，减少代码量和存储的空间。
//在同一个类中，使用同一个名称但是参数列表不同的方法就是重载方法。
	private static final int DEFAULT_WIDTH = 12;
	private static final int DEFAULT_LENGTH = 25;
	/*public Slip(int anId) //throws Exception
	{
		this (anId,DEFAULT_WIDTH,DEFAULT_LENGTH,dock);//使用this("此"，相当于另一个的Slip方法)可以将Id参数加载到已经构造好的参数之中去。
	}*/


    public  double leaseShip(double aDiscountPercent)
	{
		double fee = this.leaseShip();
		double discountFee = fee*(100-aDiscountPercent)/100;
		return discountFee;
	}
}


