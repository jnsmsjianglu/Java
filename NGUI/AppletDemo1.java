//ʹ��Applet��----------------------------------------------------------------------------------------------------------------------------------

//applet����Ƕ������һ������ͨ����Web��������е�JVMִ�е�һ��Java����ͨ��Ҫ��applet���ص��ͻ���ϵͳ��ִ�С���Ϊ��ȫ���applet
//���ܷ��ʿͻ���ϵͳ�ϵ��ļ���Ҳ����������������������ϵͳ��ͨ�����ӡ�appletͨ����Ϊͼ���û������һ��������ʾ��
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.applet.Applet;
public class AppletDemo1 extends Applet  //extends������AppletDemo1��Ϊ��Applet���һ�����࣬Ҳ����ζ��AppletDemo1���Լ̳�Applet��Panel��������������
{ 
	public void paint(Graphics g)//paint���ء�ʵ��������ʾ��JavaС����֮��JVM��������������У����õ�һ�����ⷽ����
	{
		 g.setColor(Color.red);
		 Font f = new Font("TimesRoman",Font.ITALIC,28);
		 g.setFont(f);
		 g.drawString("Hello World Wide Web !",20,30);
		 g.setColor(Color.green);
		 g.fillOval(50,50,50,50);
		 g.setColor(Color.blue);
		 g.fillRect(150,50,50,50);

	}

}



/*Ҫ����applet��Web������е�JVM����ִ�����²�����
1.����applet���ص��ڴ��У�
2.����ʵ�������Ա㴴��һ��Panelʵ����
3.ʹ��Panelʵ���ɼ�����
4.����һ����Ϊpaint�����ⷽ����
*/








