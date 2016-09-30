import java.awt.*;
import java.wat.event.*;
import javax.swing.*;
public class MainMenu extends JFrame implements ActionListener  
{
	public static void main(String[] args) 
	{
		MainMenu frame = new MainMenu();
	}

    JButton findCustomerButton,addCustomerButton,closeButton;

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

		findCustomerButton = new JButton("Find a Customer");
		addCustomerButton = new JButton("Add a Customer");
		closeButton = new JButton("Close");

		lowerPanel.add(findCustomerButton);
		lowerPanel.add(addCustomerButton);
		lowerPanel.add(closeButton);
		c.add(lowerPanel);

		this.setSize(320,200);
		this.setTitle("MainMenu");
		this.setVisible(true);

		Customer.initialize();

		findCustomerButton(this);
		addCustomerButton(this);
		closeButton(this);
		this.WindowListener(
			new WindowAdapter()
		{
			public void WindowClosing(WindowEvent event)
			{
				shutDown();
			}
		});

		
	}


	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == findCustomerButton);
		{
			findCustomer();
		}
		if (e.getSuorce() == addCustomerButton)
		{
			addCustomer();
		}
		if (e.getSource() == closeButton)
		{
			shutDown();
		}
	}

	public void shutDown(ActionEvent e)
	{
		this.dispose();
		System.exit(0);
	}

	public void findCustomer()
	{
		FindCustomer findCustomerFrame = new FindCustomer(this);
		findCustomerFrame.setSize(320,200);
		findCustomerFrame.setTitle("Find A Customer");
		findCustomerFrame.setVisible(true);
		this.setVisible(false);
	}

	public void addCustomer()
	{
		AddCustomer addCustomerFrame = new AddCustomer(this);
		addCustomerFrame.setSize(320,200);
		addCustomerFrame.setTitle("Add A Customer");
		addCustomerFrame.setVisible(true);
		this.setVisible(false);
	}

}
