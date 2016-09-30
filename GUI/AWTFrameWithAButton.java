import java.awt.*;
import java.awt.event.*;
public class  AWTFrameWithAButton extends Frame  implements ActionListener,WindowListener
{
	public static void main(String[] args) 
	{
		AWTFrameWithAButton frameWithButton = new AWTFrameWithAButton();//�½�һ����ܣ�
	}
	public AWTFrameWithAButton()
    {
		Button  closeButton = new Button("close");//����Close��ť��
		this.setLayout(new FlowLayout());//ʹ����FlowLayout�Ĳ��ֹ�������
		this.add(closeButton);//���´�����Close��ť��ӵ����֮�У�
		this.setSize(300,150);//���ÿ�ܵĴ�С������Ϊ��λ��
		this.setTitle("AWT Frame With A Button");//���ÿ�ܵı��⣻
		this.setVisible(true);//�����Ƿ����ǿɼ��ģ�
		closeButton.addActionListener(this);//���ÿ��Ϊclose button���¼���������
		this.addWindowListener(this);
	}

	public void actionPerformed(ActionEvent e)//�¼��������������÷�����
	{
		shutDown();
	}
	public void windowClosing(WindowEvent event)//window��Ҫ���ǣ�
	{
		shutDown();
	}
	public void windowClosed(WindowEvent event){}//���е�window�ӿڶ���Ҫ��д��
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


//��һ��ʹ�ýӿڣ�
//�ڶ���ʹ��������������
//������ʹ���������ڲ��ࣻ
