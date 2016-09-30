import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public  class SwingFrameAndComponents  extends JFrame implements ActionListener 
{
	
		JButton displayButton,clearButton,closeButton;
		JTextField messageTextField;

    public static void main(String[] args) 
	{
		SwingFrameAndComponents frameAndComponents = new SwingFrameAndComponents();
	}

	public  SwingFrameAndComponents()
	{
         displayButton = new JButton("display");
		 clearButton = new JButton("clear");
		 closeButton = new JButton("close");
		 JLabel messageLabel = new JLabel("Message:");
		 messageTextField = new JTextField(15);
		 JPanel upperPanel = new JPanel();
		 JPanel lowerPanel = new JPanel();
		 upperPanel.add(messageLabel);
		 upperPanel.add(messageTextField);
		 lowerPanel.add(displayButton);
		 lowerPanel.add(clearButton);
		 lowerPanel.add(closeButton);
		 Container c = this.getContentPane();
		 c.add("North",upperPanel);
		 c.add("South",lowerPanel);
		 displayButton.addActionListener(this);
		 clearButton.addActionListener(this);
		 closeButton.addActionListener(this);
		 this.setSize(320,150);
		 this.setTitle("Swing Frame and Components");
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
		if (e.getSource()==displayButton)
		{
			displayMessage();
		}
		if (e.getSource()==clearButton)
		{
			clearMessage();
		}
		if (e.getSource()==closeButton)
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
