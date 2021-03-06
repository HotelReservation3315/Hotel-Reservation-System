import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MainFrame extends JFrame implements ActionListener{
	
	public static final int WIDTH = 450;
	public static final int HEIGHT = 400;
	public static final int XCOORD = 100;
	public static final int YCOORD = 80;
	
	JLabel checkInTitle;
	JLabel checkInLabel;
	JLabel checkOutLabel;
	JLabel typeOfRoomLabel;
	JLabel specificRoomLabel;
	JLabel locationOfRoomLabel;
	JLabel numberOfPeopleLabel;
	JLabel additionalChargesLabel;
	
	JLabel checkOutTitle;
	JLabel roomNumberLabel;
	
	JComboBox <String> typeOfRoom;
	JComboBox <String> specificRoom;
	JComboBox <String> locationOfRoom;
	JComboBox <Integer> numberOfPeople;

	final JTextField checkInTextField;
	final JTextField checkOutTextField;
	final JTextField roomNumberTextField;
	final JTextField telephoneTextField;
	final JTextField roomServiceTextField;
	final JTextField equestrianAdventureTextField;
	final JTextField restaurantTextField;
	
	JButton CheckAvailabilityButton;
	JButton CheckInOption;
	JButton CheckOutOption;
	JButton toMainScreenButton;
	JButton proceedToCheckout;
	JButton generateBill;
	
	JCheckBox telephoneCheckBox;
	JCheckBox roomServiceCheckBox;
	JCheckBox equestrianAdventureCheckBox;
	JCheckBox restaurantCheckBox;
	
	
	public MainFrame(){
			
		checkInTitle = new JLabel("CHECK-IN:");
		checkInTitle.setFont(new Font("Courier", Font.BOLD, 17));
		checkInTitle.setBounds(10, 0, 100, 50);
		checkInTitle.setVisible(false);
				
		 checkInLabel = new JLabel("Check-in Date:"); 
		 checkInTextField = new JTextField(10);
		 
		 	checkInLabel.setBounds(10, 30, 100, 50);
		 	checkInLabel.setVisible(false);
		 	checkInTextField.setBounds(100,45,100,20);
		 	checkInTextField.setVisible(false);
	 
		 checkOutLabel = new JLabel("Check-out Date:"); 
		 checkOutTextField = new JTextField(10);
		 
		 	checkOutLabel.setBounds(10, 60, 100, 50);
		 	checkOutLabel.setVisible(false);
		 	checkOutTextField.setBounds(110,75,100,20);
		 	checkOutTextField.setVisible(false);
		 
		 typeOfRoomLabel = new JLabel("Type of Room:");
		 typeOfRoom = new JComboBox <String> ();
		 			 
		 	typeOfRoomLabel.setBounds(10, 90, 130, 50);
		 	typeOfRoomLabel.setVisible(false);
		 	typeOfRoom.setBounds(100,105,80,20);
		 	typeOfRoom.setVisible(false);
			 
		 		typeOfRoom.addItem("Luxury");
		 		typeOfRoom.addItem("Cottage");
		 		//typeOfRoom.addItem("Any");
		 		typeOfRoom.setSelectedItem(null); // Doesn't select any option by default in the ComboBox.
		 		
		 		specificRoomLabel = new JLabel("Characteristics:");
		 		specificRoom = new JComboBox <String> ();
		 		specificRoomLabel.setBounds(10, 120, 130, 50);
		 		specificRoomLabel.setVisible(false);
	 			specificRoom.setBounds(110,135,120,20);
	 			specificRoom.setVisible(false);
		 
	 			typeOfRoom.addItemListener(new ItemListener() {

		            @Override
		            public void itemStateChanged(ItemEvent arg0) {
		            	specificRoom.removeAllItems(); // Clears the ComboBox
		            	String toR = typeOfRoom.getSelectedItem().toString(); // Gets the selected option from Type of Room.
				 		 
					 	if(toR == "Luxury"){
					 		specificRoom.addItem("1 Queen bed");
					 		specificRoom.addItem("2 Queen beds");
					 		specificRoom.addItem("Two room");
					 		specificRoom.addItem("Three room");
					 		specificRoom.addItem("Bridal");
					 		
					 	} else if(toR == "Cottage"){
					 		specificRoom.addItem("Two Room");
					 		specificRoom.addItem("Three Room");
					 		specificRoom.addItem("Four room");
					 	} 
		            }
		        });

	 	locationOfRoomLabel = new JLabel("Location of Room:");
	 	locationOfRoom = new JComboBox <String> ();
	 						 
	 		locationOfRoomLabel.setBounds(10, 150, 130, 50);
	 		locationOfRoomLabel.setVisible(false);
	 		locationOfRoom.setBounds(120,165,75,20);
	 		locationOfRoom.setVisible(false);
	 				 
	 			locationOfRoom.addItem("Patio");
	 			locationOfRoom.addItem("Forest");
	 			//locationOfRoom.addItem("Any");
	 			locationOfRoom.setSelectedItem(null); // Doesn't select any option by default in the ComboBox.
		 	 				 	
		numberOfPeopleLabel = new JLabel("Number of People:");
		numberOfPeople = new JComboBox <Integer> ();
		 
		 	numberOfPeopleLabel.setBounds(10, 180, 130, 50);
		 	numberOfPeopleLabel.setVisible(false);
		 	numberOfPeople.setBounds(120,195,45,20);
		 	numberOfPeople.setVisible(false);
		 
		 		numberOfPeople.addItem(1);
		 		numberOfPeople.addItem(2);
		 		numberOfPeople.addItem(3);
		 		numberOfPeople.addItem(4);
		 		numberOfPeople.addItem(5);
		 		numberOfPeople.addItem(6);
		 		numberOfPeople.addItem(7);
		 		numberOfPeople.setSelectedItem(null); // Doesn't select any option by default in the ComboBox.
		 		
		 CheckAvailabilityButton = new JButton("Check Availability");
		 CheckAvailabilityButton.setBounds(20, 240, 150, 25);
		 CheckAvailabilityButton.setVisible(false);
		 CheckAvailabilityButton.addActionListener(this);
		 
		 toMainScreenButton = new JButton("To Main Screen");
		 toMainScreenButton.setBounds(300, 320, 125, 25);
		 toMainScreenButton.setVisible(false);
		 toMainScreenButton.addActionListener(this);
		 
		 CheckInOption = new JButton("Check-In");
		 CheckInOption.setBounds(140, 110, 150, 25);
		 CheckInOption.addActionListener(this);
		 
		 CheckOutOption = new JButton("Check-Out");
		 CheckOutOption.setBounds(140, 160, 150, 25);
		 CheckOutOption.addActionListener(this);
		 
		 
		 checkOutTitle = new JLabel("CHECK-OUT:");
		 checkOutTitle.setFont(new Font("Courier", Font.BOLD, 17));
		 checkOutTitle.setBounds(10, 0, 100, 50);
		 checkOutTitle.setVisible(false);
		 
		 roomNumberLabel = new JLabel("Room Number:"); 
		 roomNumberTextField = new JTextField(10);
		 
		 roomNumberLabel.setBounds(10, 30, 100, 50);
		 roomNumberLabel.setVisible(false);
		 	roomNumberTextField.setBounds(100,45,100,20);
		 	roomNumberTextField.setVisible(false);
		 	
		 proceedToCheckout = new JButton("Continue");
		 proceedToCheckout.setBounds(10, 80, 120, 25);
		 proceedToCheckout.setVisible(false);
		 proceedToCheckout.addActionListener(this);
		 
		 additionalChargesLabel = new JLabel("Additional Charges:");
		 additionalChargesLabel.setFont(new Font("Courier", Font.BOLD, 17));
		 additionalChargesLabel.setBounds(120, 0, 200, 50);
		 additionalChargesLabel.setVisible(false);
		 
		 telephoneCheckBox = new JCheckBox("Telephone");
		 telephoneTextField = new JTextField(10);
		 
		 telephoneCheckBox.setBounds(10, 40, 90, 20);
		 telephoneCheckBox.setVisible(false);
		 	telephoneTextField.setBounds(10,60,80,20);
		 	telephoneTextField.setVisible(false);
		 	telephoneTextField.setText("0");
		 
		 roomServiceCheckBox = new JCheckBox("Room Service");
		 roomServiceTextField = new JTextField(10);
		 
		 roomServiceCheckBox.setBounds(10, 40*2, 110, 20);
		 roomServiceCheckBox.setVisible(false);
		 	roomServiceTextField.setBounds(10,100,80,20);
		 	roomServiceTextField.setVisible(false);
		 	roomServiceTextField.setText("0");
		 
		 equestrianAdventureCheckBox = new JCheckBox("Equestrian Adventure");
		 equestrianAdventureTextField = new JTextField(10);
		 
		 equestrianAdventureCheckBox.setBounds(10, 40*3, 150, 20);
		 equestrianAdventureCheckBox.setVisible(false);
		 	equestrianAdventureTextField.setBounds(10,140,80,20);
		 	equestrianAdventureTextField.setVisible(false);
		 	equestrianAdventureTextField.setText("0");
		 	
		 restaurantCheckBox = new JCheckBox("Restaurant Service");
		 restaurantTextField = new JTextField(10);
		 
		 restaurantCheckBox.setBounds(10, 40*4, 140, 20);
		 restaurantCheckBox.setVisible(false);
		 	restaurantTextField.setBounds(10,180,80,20);
		 	restaurantTextField.setVisible(false);
		 	restaurantTextField.setText("0");
		 	
		 generateBill = new JButton("Generate Bill");
		 generateBill.setBounds(10, 320, 120, 25);
		 generateBill.setVisible(false);
		 generateBill.addActionListener(this);
		 
		 
		 JPanel p = new JPanel();
		 p.setLayout(null);
		 	
		 final JFrame frame = new JFrame(); 
		 	
		 		p.add(checkInTitle);
		 		p.add(checkInLabel); 
		 		p.add(checkInTextField); 
		 		p.add(checkOutLabel); 
		 		p.add(checkOutTextField); 
		 		p.add(typeOfRoom);
		 		p.add(typeOfRoomLabel);
		 		p.add(specificRoomLabel);
		 		p.add(specificRoom);
		 		p.add(locationOfRoomLabel);
		 		p.add(locationOfRoom);
		 		p.add(numberOfPeople);
		 		p.add(numberOfPeopleLabel);
		 		p.add(CheckAvailabilityButton);
		 		p.add(CheckOutOption);
		 		p.add(CheckInOption);
		 		p.add(toMainScreenButton);
		 		p.add(checkOutTitle);
		 		p.add(roomNumberLabel);
		 		p.add(roomNumberTextField);
		 		p.add(proceedToCheckout);
		 		p.add(additionalChargesLabel);
		 		p.add(telephoneCheckBox);
		 		p.add(telephoneTextField);
		 		p.add(roomServiceCheckBox);
		 		p.add(roomServiceTextField);
		 		p.add(equestrianAdventureCheckBox);
		 		p.add(equestrianAdventureTextField);
		 		p.add(restaurantCheckBox);
		 		p.add(restaurantTextField);
		 		p.add(generateBill);
		 				 	
		 
		 frame.add(p); 
		 frame.setSize(WIDTH, HEIGHT);
		 frame.setLocation(XCOORD, YCOORD);
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true); 
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 	checkInTextField.addMouseListener(new MouseAdapter(){ 
		 		public void mouseClicked(MouseEvent e){
		 			String selectedDate = new DatePicker(frame).setPickedDate();
		 			checkInTextField.setText(selectedDate); 
		 		} 
		 	});
		 
		 	checkOutTextField.addMouseListener(new MouseAdapter(){ 
		 		public void mouseClicked(MouseEvent e){
		 			String selectedDate = new DatePicker(frame).setPickedDate();
		 			checkOutTextField.setText(selectedDate); 
		 		} 
		 	});
		 	
		 	telephoneCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(telephoneCheckBox.isSelected()){
			 			telephoneTextField.setVisible(true);
			 		}else{
			 			telephoneTextField.setVisible(false);
			 		}
				}
			});
		 	
		 	roomServiceCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(roomServiceCheckBox.isSelected()){
			 			roomServiceTextField.setVisible(true);
			 		}else{
			 			roomServiceTextField.setVisible(false);
			 		}
				}
			});
		 	
		 	equestrianAdventureCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(equestrianAdventureCheckBox.isSelected()){
			 			equestrianAdventureTextField.setVisible(true);
			 		}else{
			 			equestrianAdventureTextField.setVisible(false);
			 		}
				}
			});
		 	
		 	restaurantCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(restaurantCheckBox.isSelected()){
			 			restaurantTextField.setVisible(true);
			 		}else{
			 			restaurantTextField.setVisible(false);
			 		}
				}
			});
		 				
		paintComponents(getGraphics());
		
	}
	


public static void main(String[] args){
	
	new MainFrame();
		
}


public void actionPerformed(ActionEvent event) {
	
	if(event.getSource() == CheckInOption){
		checkInTitle.setVisible(true);
		checkInLabel.setVisible(true);
		checkOutLabel.setVisible(true);
		typeOfRoomLabel.setVisible(true);
		specificRoomLabel.setVisible(true);
		locationOfRoomLabel.setVisible(true);
		numberOfPeopleLabel.setVisible(true);
		
		typeOfRoom.setVisible(true);
		specificRoom.setVisible(true);
		locationOfRoom.setVisible(true);
		numberOfPeople.setVisible(true);

		checkInTextField.setVisible(true);
		checkOutTextField.setVisible(true);
		toMainScreenButton.setVisible(true);
		
		CheckAvailabilityButton.setVisible(true);
		
		CheckInOption.setVisible(false);
		CheckOutOption.setVisible(false);
	}
	
	if(event.getSource() == CheckOutOption){
		checkOutTitle.setVisible(true);
		roomNumberLabel.setVisible(true);
		roomNumberTextField.setVisible(true);
		proceedToCheckout.setVisible(true);
		
		toMainScreenButton.setVisible(true);
		
		CheckInOption.setVisible(false);
		CheckOutOption.setVisible(false);
		
	}
	
	if(event.getSource() == toMainScreenButton){
		checkInTitle.setVisible(false);
		checkInLabel.setVisible(false);
		checkOutLabel.setVisible(false);
		typeOfRoomLabel.setVisible(false);
		specificRoomLabel.setVisible(false);
		locationOfRoomLabel.setVisible(false);
		numberOfPeopleLabel.setVisible(false);
		
		typeOfRoom.setVisible(false);
		specificRoom.setVisible(false);
		locationOfRoom.setVisible(false);
		numberOfPeople.setVisible(false);

		checkInTextField.setVisible(false);
		checkOutTextField.setVisible(false);
		toMainScreenButton.setVisible(false);
		
		CheckAvailabilityButton.setVisible(false);
		
		checkOutTitle.setVisible(false);
		roomNumberLabel.setVisible(false);
		roomNumberTextField.setVisible(false);
		proceedToCheckout.setVisible(false);
		
		additionalChargesLabel.setVisible(false);
		telephoneCheckBox.setVisible(false);
		telephoneCheckBox.setSelected(false);
		telephoneTextField.setVisible(false);
		roomServiceCheckBox.setVisible(false);
		roomServiceCheckBox.setSelected(false);
		roomServiceTextField.setVisible(false);
		equestrianAdventureCheckBox.setVisible(false);
		equestrianAdventureCheckBox.setSelected(false);
		equestrianAdventureTextField.setVisible(false);
		restaurantCheckBox.setVisible(false);
		restaurantCheckBox.setSelected(false);
		restaurantTextField.setVisible(false);
		generateBill.setVisible(false);
		
		CheckInOption.setVisible(true);
		CheckOutOption.setVisible(true);
	}
	
	if(event.getSource() == proceedToCheckout){
		
		roomNumberLabel.setVisible(false);
		roomNumberTextField.setVisible(false);
		proceedToCheckout.setVisible(false);
		
		additionalChargesLabel.setVisible(true);
		telephoneCheckBox.setVisible(true);
		roomServiceCheckBox.setVisible(true);
		equestrianAdventureCheckBox.setVisible(true);
		restaurantCheckBox.setVisible(true);
		generateBill.setVisible(true);
	}
	
	if(event.getSource() == CheckAvailabilityButton){
		
		if(typeOfRoom.getSelectedItem() != null && specificRoom.getSelectedItem() != null && 
			locationOfRoom.getSelectedItem() != null && numberOfPeople.getSelectedItem() != null){ // Checks if the fields are completed by the user.
			
		String toR = typeOfRoom.getSelectedItem().toString();
		String chaR = specificRoom.getSelectedItem().toString();
		String loR = locationOfRoom.getSelectedItem().toString();
		
			
			if(toR == "Luxury"){
				if(loR == "Patio"){
					if(chaR == "1 Queen bed"){
						// ACCESS DATABASE LOOKING FOR LUXURY, PATIO AND 1 QUEEN BED. RETRIEVE NUMBER OF ROOMS AVAILABLE.
					}else if(chaR == "2 Queen beds"){
						
					}else if(chaR == "Two Room"){
						
					}else if(chaR == "Three Room"){
						
					}else if(chaR == "Bridal"){
						
					}
				}else if(loR == "Forest"){
					if(chaR == "Two Room"){
						// ACCESS DATABASE LOOKING FOR LUXURY, FOREST AND TWO ROOM. RETRIEVE NUMBER OF ROOMS AVAILABLE.
					}else if(chaR == "Three Room"){
						
					}else if(chaR == "Four Room"){
						
					}
				}
			}
		}else{
			JOptionPane.showMessageDialog(null, "Please select an option for all fields.");
		}
		
		/*String name = NameField.getText();
	
		try {
			Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
			Connection connection = DriverManager.getConnection("jdbc:odbc:S_P_SP");
			Statement statement =  connection.createStatement();
			
			statement.executeUpdate( "INSERT INTO s VALUES ('"+name+"', 'Simpson', 20, 'Venezuela')" );
			text.setText("Insertion completed");
			
			statement.close();
	        connection.close();
			 
		} 
		catch ( SQLException sqlException ) { // detect problems interacting with the database
	        JOptionPane.showMessageDialog( null, sqlException.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE );
	        System.exit( 1 );
	    }
	    catch ( ClassNotFoundException classNotFound ) { // detect problems loading database driver
	        JOptionPane.showMessageDialog( null, classNotFound.getMessage(), "Driver Not Found", JOptionPane.ERROR_MESSAGE );
	        System.exit( 1 );
	    }*/
		
	}
	
}

}
