import java.util.*;
/*-------------------------------------------------------
���������Ҫ��Ϊ��ʵ������ܵ���ƣ���˶���������long
����sartTime,currentTime.����������У���Ҫ��ʹ����Date��
�����ڼ����1970��1��1�������ڳ����ȡ�����ʱ����������
ʱ�䣨��λΪ���룩�����ڣ�startTime,currentTime�����ڲ�ͬ
�ķ���֮�еľֲ��������������õĶ����ԣ�����ڵڶ�������
֮��startTime��һ���ᱻ��д�ģ����Բ����ܽ��б���֮���ֵ
�Ĵ��ݣ�����Ϊ�˽���������������������ʵ�������ĸ���
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
ʵ���������ܹ������е����з���������ʹ�õı�����
*/
class StopWatch
{	
	private long startTime;//�������һ��ʵ������;
	
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
