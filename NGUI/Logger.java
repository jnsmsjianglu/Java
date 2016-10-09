import java.util.*;
import java.io.*;
class Logger 
{
	public void log() throws Exception
	{
		PrintStream logps;
		GregorianCalendar now;
		logps = new PrintStream(new FileOutputStream("log1.txt"));
		now = new GregorianCalendar();
		logps.println(now.getTime());
		System.out.println(now.getTime());
		
	}
	
	public void logWithTZ() throws Exception
	{
		PrintStream logps;
		GregorianCalendar now;
		logps = new PrintStream(new FileOutputStream("log2.txt"));
		now = new GregorianCalendar();
		logps.print(now.getTimeZone().getDisplayName()+" ");
		logps.println(now.getTime());
		System.out.println(now.getTimeZone().getDisplayName());
	}

}
