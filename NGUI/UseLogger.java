class  UseLogger
{
	public static void main(String[] args) throws Exception
	{
		Logger logger1,logger2;
		logger1 = new Logger();
		logger1.log();
		logger2 = new Logger();
		logger2.logWithTZ();
		
	}
}
