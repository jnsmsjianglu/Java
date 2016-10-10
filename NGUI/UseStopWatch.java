import java.util.*;
import java.io.*;
class UseStopWatch 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));
		StopWatch sw = new StopWatch();
		System.out.println("Hit Enter on your way out!");
		keyboard.readLine();
		sw.start();
		System.out.println("Don't forget to hit Enter when you gie back!");
		keyboard.readLine();
		System.out.println("Go take a Shower.");
		sw.ShowElapsedTime();
		
	}
}
