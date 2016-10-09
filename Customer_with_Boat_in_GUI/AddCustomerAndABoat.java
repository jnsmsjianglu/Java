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
	JButton addButton,clearButton,closeButton;
	Customer aCustomer;
	String customerName,customerAddress,customerPhoneNo;
	MainMenu parentMenu;
	
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
		c.add(logoLabel);
        
		customerNameText = new JTextField();
		customerAddressText = new JTextField();
		customerPhoneText = new JTextField();
		centerPanel.add(new JLabel("Name:",SwingConstants.RIGHT));
		centerPanel.add(customerNameText);
		centerPanel.add(new JLabel("Address:",SwingConstants.RIGHT));
		centerPanel.add(customerAddressText);
		centerPanel.add(new JLabel("PhoenNo:",SwingConstants.RIGHT));
		centerPanel.add(customerPhoneText);
		c.add(centerPanel);

		addButton = new JButton("Add Boat");
		clearButton = new JButton("Clear");
		closeButton = new JButton("Close");
		lowerPanel.add(addButton);
		lowerPanel.add(clearButton);
		lowerPanel.add(closeButton);
		c.add(lowerPanel);

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
		if (e.getSource()==addButton)
		{
			addCustomer();
		}
		if (e.getSource()==clearButton)
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
		this.setVisible(false);
		AddBoat frame = new AddBoat(this,aCustomer);
        addCustomerFrame.setSize(320,200);
		addCustomerFrame.setTitle("Add A Boat");
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


