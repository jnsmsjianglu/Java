import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AddBoat extends JFrame implements ActionListener
{   
	public static void main(String[] args) 
	{
		AddBoat frame = new AddBoat();
	}
	JPanel boatPanel;
	CardLayout  boatLayout;
	JTextField manufacturerText,boatLengthText,yearText,stateRegistrationText;
	JTextField numberOfSailsText,keelDepthText,numberOfEnginesText;
	JRadioButton sailboatRadioButton,powerboatRadioButton;
	JRadioButton noEnginesRadioButton,inboardEnginesButton,outboardEnginesButton;
	JRadioButton gasRadioButton,dieselRadioButton;
	JButton addButton,clearButton,closeButton;
	
	public AddBoat()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(5,1));
		JPanel upperPanel = new JPanel(new GridLayout(2,4));
		JPanel centerPanel = new JPanel(new FlowLayout());
		JPanel sailboatPanel = new JPanel(new FlowLayout());
		JPanel powerboatPanel = new JPanel(new FlowLayout());
		JPanel lowerPanel = new JPanel(new FlowLayout());

		boatLayout = new CardLayout();
		boatPanel = new JPanel();
		boatPanel.setLayout(boatLayout);

		JLabel logoLabel = new JLabel(" ",SwingConstants.CENTER);
		logoLabel.setForeground(Color.red);
		logoLabel.setFont(new Font("TimesRoman",Font.ITALIC,36));
		logoLabel.setText("BradShaw Marina");
		c.add(logoLabel);

		manufacturerText = new JTextField(15);
		boatLengthText = new JTextField(4);
		yearText = new JTextField(6);
		stateRegistrationText = new JTextField(15);
		upperPanel.add(new JLabel("Manufacturer:",SwingConstants.RIGHT));
		upperPanel.add(manufacturerText);
		upperPanel.add(new JLabel("Length:",SwingConstants.RIGHT));
		upperPanel.add(boatLengthText);
		upperPanel.add(new JLabel("Year:",SwingConstants.RIGHT));
		upperPanel.add(yearText);
		upperPanel.add(new JLabel("State Registration No:",SwingConstants.RIGHT));
		upperPanel.add(stateRegistrationText);
		c.add(upperPanel);

        sailboatRadioButton = new JRadioButton("Sailboat",true);
		powerboatRadioButton = new JRadioButton("Powerboat",false);
		ButtonGroup typeOfBoat = new ButtonGroup();
		typeOfBoat.add(sailboatRadioButton);
		typeOfBoat.add(powerboatRadioButton);

		centerPanel.add(sailboatRadioButton);
		centerPanel.add(powerboatRadioButton);
		c.add(centerPanel);

		JPanel leftSailboatPanel = new JPanel(new GridLayout(2,2));
		JPanel rightSailboatPanel = new JPanel(new FlowLayout());
		numberOfSailsText = new JTextField(4);
		keelDepthText = new JTextField(4);
		noEnginesRadioButton = new JRadioButton("NoEngines",true);
		inboardEnginesButton = new JRadioButton("Inboard",false);
		outboardEnginesButton = new JRadioButton("Outboard",false);
		ButtonGroup sailboatEngineGroup = new ButtonGroup();
		sailboatEngineGroup.add(noEnginesRadioButton);
		sailboatEngineGroup.add(inboardEnginesButton);
		sailboatEngineGroup.add(outboardEnginesButton);
		leftSailboatPanel.add(new JLabel("Number Of Sails:"));
		leftSailboatPanel.add(numberOfSailsText);
		leftSailboatPanel.add(new JLabel("Kell Depth:"));
		leftSailboatPanel.add(keelDepthText);
		rightSailboatPanel.add(noEnginesRadioButton);
		rightSailboatPanel.add(inboardEnginesButton);
		rightSailboatPanel.add(outboardEnginesButton);
		sailboatPanel.add(leftSailboatPanel);
		sailboatPanel.add(rightSailboatPanel);
		sailboatPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		boatPanel.add(sailboatPanel,"sailboat");

		numberOfEnginesText = new JTextField(4);
		gasRadioButton = new JRadioButton("Gas Fuel",true);
		dieselRadioButton = new JRadioButton("Diesel Fuel",false);
		ButtonGroup typeOfpowerboat = new ButtonGroup();
		typeOfpowerboat.add(gasRadioButton);
		typeOfpowerboat.add(dieselRadioButton);
		powerboatPanel.add(new JLabel("Number of Engines:"));
		powerboatPanel.add(numberOfEnginesText);
		powerboatPanel.add(gasRadioButton);
		powerboatPanel.add(dieselRadioButton);
		boatPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		boatPanel.add(powerboatPanel,"powerboat");
		c.add(boatPanel);

		addButton = new JButton("Add");
		clearButton = new JButton("Clear");
		closeButton = new JButton("Close");
		lowerPanel.add(addButton);
		lowerPanel.add(clearButton);
		lowerPanel.add(closeButton);
		c.add(lowerPanel);
      
		this.setSize(540,350);
		this.setTitle("Add Boat");
		this.setVisible(true);

		addButton.addActionListener(this);
		clearButton.addActionListener(this);
		closeButton.addActionListener(this);
		sailboatRadioButton.addActionListener(this);
		powerboatRadioButton.addActionListener(this);
		this.addWindowListener(
				
		
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
		if (e.getSource() == addButton)
		{
			addBoat();		
		}
		if (e.getSource() == clearButton)
		{
			clearForm();
		}
		if (e.getSource() == closeButton)
		{
			shutDown();
		}
		if (e.getSource() == sailboatRadioButton)
		{
			boatLayout.first(boatPanel);
		}
		if (e.getSource() == powerboatRadioButton)
		{
			boatLayout.last(boatPanel);
		}
	}


	public void addBoat()
	{
		try
		{
			double boatLength = Double.parseDouble(boatLengthText.getText());
			int year = Integer.parseInt(yearText.getText());
			String manufacturer = manufacturerText.getText();
			String stateRegistrationNo = stateRegistrationText.getText();
			if (manufacturer.length() == 0 || stateRegistrationNo.length() == 0)
			{
				JOptionPane.showMessageDialog(this,"Please Add All Datas!");
			}
			else
			{
				if (sailboatRadioButton.isSelected())
				{
					addSailboat(stateRegistrationNo,boatLength,manufacturer,year);
				}
				else
				{
					addPowerboat(stateRegistrationNo,boatLength,manufacturer,year);
				}
			}
		}
		catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(this,"length and year must be numbric!");
		}
	}

	public void addSailboat(String aStateRegistrationNo,double aBoatLength,String aManufacturer,int aYear)
	{
		String motorType = "";
		try
		{
			int numberOfSails = Integer.parseInt(numberOfSailsText.getText());
			double keelDepth = Double.parseDouble(keelDepthText.getText());
			if (noEnginesRadioButton.isSelected())
			{
				motorType = "None";
			}
			if (inboardEnginesButton.isSelected())
			{
				motorType = "Inboard";
			}
			if (outboardEnginesButton.isSelected())
			{
				motorType = "Outboard";
			}
            SailBoat aSailBoat = new SailBoat(aStateRegistrationNo,aBoatLength,aManufacturer,aYear,keelDepth,numberOfSails,motorType);
			JOptionPane.showMessageDialog(this,"Sailboat Added");
			clearForm();
		}     
		catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(this,"number of sails and keel depth must be numberic!");
		}
	}
	
	public void addPowerboat(String aStateRegistrationNo,double aBoatLength,String aManufacturer,int aYear)
	{
		try
		{
			int numberOfengines = Integer.parseInt(numberOfEnginesText.getText());
			String fuelType = " ";
			if (gasRadioButton.isSelected())
			{
				fuelType = "gas";
			}
			if (dieselRadioButton.isSelected())
			{
				fuelType = "diesel";
			}
			PowerBoat aPowerBoat = new PowerBoat(aStateRegistrationNo,aBoatLength,aManufacturer,aYear,numberOfengines,fuelType);
			JOptionPane.showMessageDialog(this,"Powerboat is Added!");
			clearForm();
		}
		catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(this,"number of emgines must be numberic!");
		}
	}
     

	 public void clearForm()
	{
		manufacturerText.setText("");
		boatLengthText.setText("");
		yearText.setText("");
		stateRegistrationText.setText("");
		numberOfSailsText.setText("");
		keelDepthText.setText("");
		sailboatRadioButton.doClick();
		inboardEnginesButton.doClick();
		outboardEnginesButton.doClick();
	}

	public void shutDown()
	{
		this.dispose();
		System.exit(0);
	}


}
