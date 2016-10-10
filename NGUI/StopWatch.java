import java.util.*;
/*-------------------------------------------------------
这个案例主要是为了实现秒表功能的设计，因此定义了两个long
变量sartTime,currentTime.在这个过程中，主要是使用了Date类
中用于计算从1970年1月1日起到现在程序获取计算机时间锁进过的
时间（单位为毫秒）。由于，startTime,currentTime均是在不同
的方法之中的局部变量，具有良好的独立性，因此在第二个方法
之中startTime是一定会被改写的，所以并不能进行变量之间的值
的传递，所以为了解决这个问题在这里引入了实例变量的概念
-------------------------------------------------------*/

/*
class StopWatch 
{
	public vooid startTime()
	{
		GregorianCalendar now = new GregorianCalendar();
		long startTime = now.getTimeInMillis();
	}
	public void ShowElapsedTime()
	{
		GregorianCalendar now = new GregorianCalendar();
		long currentTime = now.getTimeInMillis();
		long startTime;

		long difference = (currentTime - startTime)/1000;
		System.out.println(difference);
		System.out.println(" seconds have elapsed!");
	}
}
*/


/*
实例变量：能够在类中的所有方法均可以使用的变量。
*/
class StopWatch
{	
	private long startTime;//这个就是一个实力变量;
	
	public void start()
	{
		GregorianCalendar now = new GregorianCalendar();
		startTime = now.getTimeInMillis();
	}
	
	public void ShowElapsedTime()
	{
		GregorianCalendar now = new GregorianCalendar();
		long currentTime = now.getTimeInMillis();

		long difference = (currentTime - startTime)/1000;
		System.out.println(difference);
		System.out.println(" seconds have elapsed!");
	}

	
}
