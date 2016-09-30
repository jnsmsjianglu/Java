import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class  SwingFrameWithMenus  extends JFrame  implements ActionListener
  
{   JTextField  messageTextField;
    JMenuItem displayMenu,clearMenu,closeMenu;
    
	public static void main(String[] args) 
	{
		SwingFrameWithMenus frame = new SwingFrameWithMenus();
	}
	public SwingFrameWithMenus()
	{
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu helpMenu = new JMenu("Help");
        displayMenu = new JMenuItem("Display");
		clearMenu = new JMenuItem("Clear");
		closeMenu = new JMenuItem("Close");
		fileMenu.setMnemonic('F');
		helpMenu.setMnemonic('H');
		this.setJMenuBar(menuBar);

		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		fileMenu.add(displayMenu);
		fileMenu.add(clearMenu);
		fileMenu.add(closeMenu);


		JLabel messageLabel = new JLabel("Message:");
		messageTextField = new JTextField(15);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(messageLabel);
		c.add(messageTextField);
		displayMenu.addActionListener(this);
		clearMenu.addActionListener(this);
		closeMenu.addActionListener(this);

		this.setSize(1600,900);
		this.setTitle("Swing Frame with Menus");
		this.setVisible(true);
		this.addWindowListener
			 (
				new WindowAdapter()
				{
					public void WindowClosing(WindowEvent event)
					{
						shutDown();
					}
				}
			 );
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==displayMenu)
		{
			displayMessage();
		}
		if (e.getSource()==clearMenu)
		{
			clearMessage();
		}
		if (e.getSource()==closeMenu)
		{
			shutDown();
		}
	}
	
	
	
	public void displayMessage()
	{
		messageTextField.setText("Hello World!");
	}

	public void clearMessage()
	{
		messageTextField.setText("                    ");
	}
	public void shutDown()
	{
		this.dispose();
		System.exit(0);
	}
}


