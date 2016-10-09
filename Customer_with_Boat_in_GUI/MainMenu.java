import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainMenu extends JFrame implements ActionListener  
{

    JButton findCustomerButton,addCustomerButton,closeButton;
    static MainMenu frame;
	public static void main(String[] args) 
	{
		frame = new MainMenu();
		frame.setVisible(true);
	}

	public MainMenu()
	{   
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(2,1));
		JPanel lowerPanel = new JPanel(new FlowLayout());
        
		Font defaultFont = c.getFont();
		
		JLabel logoLabel = new JLabel(" ",SwingConstants.CENTER);
		logoLabel.setForeground(Color.red);
		logoLabel.setFont(new Font("TimesRoman",Font.ITALIC,36));
		logoLabel.setText("BradShaw Marina");
		c.add(logoLabel);

		findCustomerButton = new JButton("Find a Customer & a boat");
		addCustomerButton = new JButton("Add a Customer & a Boat");
		closeButton = new JButton("Close");

		lowerPanel.add(findCustomerButton);
		lowerPanel.add(addCustomerButton);
		lowerPanel.add(closeButton);
		c.add(lowerPanel);

		this.setSize(320,200);
		this.setTitle("MainMenu");

		Customer.initialize();//��ʼ�����ݿ⣻

		findCustomerButton.addActionListener(this);
		addCustomerButton.addActionListener(this);
		closeButton.addActionListener(this);
		this.addWindowListener(
			new WindowAdapter()
		{
			public void  WindowClosing(WindowEvent event)
			{
				shutDown();
			}
		});

		
	}


	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == findCustomerButton)
		{
			findCustomer();
		}
		if (e.getSource() == addCustomerButtonAndABoat)
		{
			addCustomerAndABoat();
		}
		if (e.getSource() == closeButton)
		{
			shutDown();
		}
	}

	public void shutDown()
	{
		this.dispose();
	    System.exit(0);
	}

	public void findCustomerAndABoat()
	{
		System.out.println("findCustomer...");
		this.setVisible(false);
		FindCustomerAndABoat findCustomerFrame = new FindCustomerAndABoat(this);
		findCustomerFrame.setSize(320,200);
		findCustomerFrame.setTitle("Find A Customer");
		findCustomerFrame.setVisible(true);
		
	}

	public void addCustomerAndABoat()
	{
		System.out.println("addCustomer...");
		this.setVisible(false);
		AddCustomerAndABoat addCustomerFrame = new AddCustomerAndABoat(this);
		addCustomerFrame.setSize(320,200);
		addCustomerFrame.setTitle("Add A Customer");
		addCustomerFrame.setVisible(true);
		
	}

}



