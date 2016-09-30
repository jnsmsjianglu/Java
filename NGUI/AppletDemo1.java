//使用Applet类----------------------------------------------------------------------------------------------------------------------------------

//applet是由嵌入在另一个程序（通常是Web浏览器）中的JVM执行的一个Java程序。通常要将applet下载到客户端系统来执行。因为安全起见applet
//不能访问客户端系统上的文件，也不能在网络上启动与其他系统的通信链接。applet通常作为图形用户界面的一部分来显示；
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.applet.Applet;
public class AppletDemo1 extends Applet  //extends表明了AppletDemo1成为了Applet类的一个子类，也就意味着AppletDemo1可以继承Applet和Panel的无数个方法；
{ 
	public void paint(Graphics g)//paint加载、实例化和显示了Java小程序之后JVM（在浏览器里运行）调用的一个特殊方法。
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



/*要运行applet，Web浏览器中的JVM必须执行以下操作；
1.将该applet加载到内存中；
2.将它实例化，以便创建一个Panel实例；
3.使该Panel实例可见化；
4.调用一个名为paint的特殊方法。
*/








