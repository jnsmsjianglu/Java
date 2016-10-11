import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AddCustomerAndABoat extends JFrame implements ActionListener 
{
	/*public static void main(String[] args) 
	{
		AddCustomer  frame = new AddCustomer();
	}*/
    
	JTextField customerNameText,customerAddressText,customerPhoneText;
	JButton addBoatButton,resetButton,closeButton;
	Customer aCustomer;
	String customerName,customerAddress,customerPhoneNo;
	MainMenu parentMenu;//用来返回MainMenu;
	
	public AddCustomerAndABoat(MainMenu menu)
	{   
		parentMenu = menu;
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(3,1));
		JPanel centerPanel = new JPanel(new GridLayout(3,2));
		JPanel lowerPanel = new JPanel(new FlowLayout());
		
		JLabel logoLabel = new JLabel(" ",SwingConstants.CENTER);
		logoLabel.setForeground(Color.red);
		logoLabel.setFont(new Font("TimesRoman",Font.ITALIC,36));
		logoLabel.setText("BradShaw Marina");
		c.add(logoLabel);//此处是对Logo的设计;
        
		customerNameText = new JTextField();
		customerAddressText = new JTextField();
		customerPhoneText = new JTextField();
		centerPanel.add(new JLabel("Name:",SwingConstants.RIGHT));
		centerPanel.add(customerNameText);
		centerPanel.add(new JLabel("Address:",SwingConstants.RIGHT));
		centerPanel.add(customerAddressText);
		centerPanel.add(new JLabel("PhoenNo:",SwingConstants.RIGHT));
		centerPanel.add(customerPhoneText);
		c.add(centerPanel);//中间面板的设置，主要是标签和文本框;

		addBoatButton = new JButton("Add Customer");
		resetButton = new JButton("Reset");
		closeButton = new JButton("Close");
		lowerPanel.add(addBoatButton);
		lowerPanel.add(resetButton);
		lowerPanel.add(closeButton);
		c.add(lowerPanel);//下方面板的设置;

		addButton.addActionListener(this);
		clearButton.addActionListener(this);
		closeButton.addActionListener(this);

		this.setSize(400,230);
		this.setTitle("Add A Customer and A Boat");
		this.setVisible(true);
		
		this.addWindowListener
			(  
			 new WindowAdapter()
			
				{
					public void windowClosing(WindowEvent event)
						{
							shutDown();
						}
				}
			);
      
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==addBoatButton)
		{
			addCustomer();
		}
		if (e.getSource()==resetButton)
		{
			clearCustomer();
		}
		if (e.getSource()==closeButton)
		{
			shutDown();
		}
	}


	public void addCustomer()
	{
		customerName = customerNameText.getText();
		customerAddress = customerAddressText.getText();
		customerPhoneNo = customerPhoneText.getText();
		if (customerName.length()==0||customerAddress.length()==0||customerPhoneNo.length()==0)
		{
			JOptionPane.showMessageDialog(this,"Please Enter All Data!");
		}
		else
		{
			Customer aCustomer = new Customer(customerName,customerAddress,customerPhoneNo);
			JOptionPane.showMessageDialog(this,"Customer Added!");
			clearCustomer();
		}

		JOptionPane.showMessageDialog(this,"Please Add Boat information for the customer you have just added!");
		AddBoat frame = new AddBoat(this,aCustomer);//转入到AddBoat的框架之中;
		this.setVisible(false);//并且设置当前的窗口不可显示;
        addCustomerFrame.setSize(320,200);
		addCustomerFrame.setTitle("Add customer and Boat");
		addCustomerFrame.setVisible(true);


	}

	public void clearCustomer()
	{
		customerNameText.setText("                     ");
		customerAddressText.setText("                       ");
		customerPhoneText.setText("                        ");
	}

	public void shutDown()
	{
		parentMenu.setVisible(true);
		this.dispose();
		
	}

	
}


