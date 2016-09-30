import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
public class FindCustomer extends JFrame implements ActionListener  
{ 
	Vector gettCustomers,customerNames;
	JList customerList;
	JTextField customerAddressText,customerPhoneText;
	JButton findButton,updateButton,closeButton;
	JMenuItem findMenu,updateMenu,closeMenu;
	JLabel addressLabel,phoneLabel;
	Customer aCustomer;
	MainMenu parentMenu;
	/*public static void main(String[] args) 
	{
		FindCustomer frame = new FindCustomer();
	}*/
	public FindCustomer(MainMenu menu)
	{   
		parentMenu = menu;
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(3,1));
		JPanel centerPanel = new JPanel(new GridLayout(1,3));
		JPanel centerRightPanel = new JPanel(new GridLayout(2,1));
		JPanel centerMiddlePanel = new JPanel(new GridLayout(2,1));
		JPanel lowerPanel = new JPanel(new FlowLayout());
		
		JLabel logoLabel = new JLabel(" ",SwingConstants.CENTER);
		logoLabel.setForeground(Color.red);
		logoLabel.setFont(new Font("TimesRoman",Font.ITALIC,36));
		logoLabel.setText("BradShaw Marina");
		c.add(logoLabel);

		//this.createCustomers();//创建JList；
		//new :
		gettCustomers = Customer.getAll();
		customerNames = new Vector();
		for (int i = 0;i < gettCustomers.size() ;i++ )
		{
			aCustomer = (Customer)gettCustomers.get(i);
			String customerName = aCustomer.getName();
			customerNames.add(customerName);
		}
        customerList = new JList(customerNames);
		JScrollPane scrollPaneCustomerList = new JScrollPane(customerList);
		centerPanel.add(scrollPaneCustomerList);

		addressLabel = new JLabel("Address:");
		phoneLabel = new JLabel("Phone:");
		centerMiddlePanel.add(addressLabel);
		centerMiddlePanel.add(phoneLabel);
		centerPanel.add(centerMiddlePanel);

        customerAddressText = new JTextField("      ");
		customerPhoneText = new JTextField("      "); 
		centerRightPanel.add(customerAddressText);
		centerRightPanel.add(customerPhoneText);
		centerPanel.add(centerRightPanel);
		c.add(centerPanel);
		
		findButton = new JButton("Find");
		updateButton = new JButton("Update");
		closeButton = new JButton("Close");
		lowerPanel.add(findButton);
		lowerPanel.add(updateButton);
		lowerPanel.add(closeButton);
		c.add(lowerPanel);

		this.setSize(360,200);
		this.setTitle("Find A Customer");
		this.setVisible(true);

		findButton.addActionListener(this);
		updateButton.addActionListener(this);
		closeButton.addActionListener(this);
		findMenu.addActionListener(this);
		updateMenu.addActionListener(this);
		closeMenu.addActionListener(this);
		this.addWindowListener(
		new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{
				shutDown();
			}
		}
		);
	}

	public void findCustomer()
	{
		int i = customerList.getSelectedIndex();
		aCustomer = (Customer)gettCustomers.get(i);
		customerAddressText.setText(aCustomer.getAddress());
		customerPhoneText.setText(aCustomer.getPhoneNo());

		
	}

	public void updateCustomer()
	{
		int i = customerList.getSelectedIndex();
		aCustomer = (Customer)gettCustomers.get(i);
		aCustomer.setAddress(customerAddressText.getText());
		aCustomer.setPhoneNo(customerPhoneText.getText());
	}

	/*public void createCustomers()
	{
		customers = new Vector();
		customers.add(new Customer("姜路","南京","15996367250"));
		customers.add(new Customer("张英珠","南京","15895952213"));
		customers.add(new Customer("姜映舟","桂林","13270803603"));
		customers.add(new Customer("李喆","南京","15195895896"));
		//customers.add("")
	}
*/
	public void shutDown()
	{   
		parentMenu.setVisible(true);
		this.dispose();
		//System.exit(0);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == findButton)
		{
			findCustomer();
		}
		if (e.getSource() == updateButton)
		{
			updateCustomer();
		}
		if (e.getSource() == closeButton)
		{
			shutDown();
		}
	}
}
