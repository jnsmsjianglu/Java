import java.text.*;
public class  NumberFormatEx
{
	public static void main(String[] args) 
	{   //creat the Slip Variable;
		Slip aSlip = new Slip(4,14,30);
		double fee = aSlip.leaseShip();
		//then Format the fee;
		NumberFormat currentFormat = NumberFormat.getCurrencyInstance();
		System.out.println("Current: "+currentFormat.format(fee));
        DecimalFormat decimalFormat = new DecimalFormat("##,##0.00");
		System.out.println("Decimal: "+decimalFormat.format(fee));

		NumberFormat noDollarFormat = NumberFormat.getInstance();
		System.out.println("Number: "+noDollarFormat.format(fee));
        
	}	
}


