import java.awt.*;
import java.awt.event.*;
public class  AWTFrameWithAButton extends Frame  implements ActionListener,WindowListener
{
	public static void main(String[] args) 
	{
		AWTFrameWithAButton frameWithButton = new AWTFrameWithAButton();//新建一个框架；
	}
	public AWTFrameWithAButton()
    {
		Button  closeButton = new Button("close");//创剑Close按钮；
		this.setLayout(new FlowLayout());//使用了FlowLayout的布局管理器；
		this.add(closeButton);//将新创建的Close按钮添加到框架之中；
		this.setSize(300,150);//设置框架的大小，像素为单位；
		this.setTitle("AWT Frame With A Button");//设置框架的标题；
		this.setVisible(true);//设置是否框架是可见的；
		closeButton.addActionListener(this);//设置框架为close button的事件侦听器；
		this.addWindowListener(this);
	}

	public void actionPerformed(ActionEvent e)//事件被桢听后启动该方法；
	{
		shutDown();
	}
	public void windowClosing(WindowEvent event)//window需要覆盖；
	{
		shutDown();
	}
	public void windowClosed(WindowEvent event){}//所有的window接口都需要重写；
	public void windowDeiconified(WindowEvent event){}
	public void windowIconified(WindowEvent event){}
	public void windowActivated(WindowEvent event){}
	public void windowDeactivated(WindowEvent event){}
	public void windowOpened(WindowEvent event){}
	
	
	
	public void shutDown()
	{
		this.dispose();
		System.exit(0);

	}


}   


//第一类使用接口；
//第二类使用扩充适配器；
//第三类使用匿名的内部类；
