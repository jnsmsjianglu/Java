public class  CatchEx
{
	public static void main(String[] args) 
	{
		Slip firstSlip = null;
		try
		{
			firstSlip = new Slip(150,15,25);
			System.out.println(firstSlip.tellAboutSelf());
		}
		catch (Exception n)
		{
			System.out.println(n);
		}
		finally
		{
			System.out.println("\nfinally block is always executed!\n");
		}
	}
}
