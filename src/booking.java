import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import com.toedter.calendar.JDateChooser;
import com.github.lgooddatepicker.components.TimePicker;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.SpinnerNumberModel;

public class booking extends JFrame {

	private JPanel contentPane;
	private JTextField totalField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textClass;
	private JTextField textFrom;
	private JTextField textTo;
	private JTextField textWay;
	private JTextField textTicketID;
	private JTextField textPrice;
	private JTextField textTime;
	private JTextField textBackDate;
	private JTextField textRoute;
	private JTextField textGoDate;
	private JButton ticketBtn;
	private JLabel labelName;
	private JLabel labelGate;
	private JTextField textSeat;
	
	//Constructor Method without parameter 
	public booking() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\8-removebg-preview (2).png"));
		setTitle("AVION AIRLINE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1324, 715);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new LineBorder(Color.BLACK, 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setForeground(new Color(255, 255, 255));
		cancelBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		cancelBtn.setBackground(new Color(0, 0, 0));
		cancelBtn.setBounds(35, 617, 96, 23);
		contentPane.add(cancelBtn);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(Color.BLACK));
		panel2.setBackground(new Color(255, 204, 102));
		panel2.setBounds(468, 153, 794, 432);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel1.setBackground(new Color(255, 255, 204));
		panel1.setBounds(35, 11, 1239, 131);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel bookingLabel = new JLabel("Booking Ticket");
		bookingLabel.setBounds(441, 42, 371, 50);
		panel1.add(bookingLabel);
		bookingLabel.setFont(new Font("Stencil", Font.BOLD, 40));
		
		JLabel avionLabel_1 = new JLabel("Avion Airline");
		avionLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 25));
		avionLabel_1.setBounds(20, 95, 175, 25);
		panel1.add(avionLabel_1);
		
		JLabel avionLabel_2 = new JLabel("Avion Airline");
		avionLabel_2.setFont(new Font("Segoe Print", Font.BOLD, 25));
		avionLabel_2.setBounds(1007, 95, 175, 25);
		panel1.add(avionLabel_2);
		
		JLabel logo2 = new JLabel("New label");
		logo2.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\4-removebg-preview.png"));
		logo2.setBounds(987, 0, 252, 108);
		panel1.add(logo2);
		
		JLabel logo1 = new JLabel("New label");
		logo1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\4-removebg-preview.png"));
		logo1.setBounds(0, 1, 257, 106);
		panel1.add(logo1);
		
		JLabel lblNewLabel_1 = new JLabel("Type Of Ticket");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(35, 153, 340, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("--------------------------------------------------------------------");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(35, 181, 373, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Class");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setBounds(60, 202, 59, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("-------------------------------------------------------------------------------------");
		lblNewLabel_4.setBounds(35, 225, 373, 14);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton Business = new JRadioButton("Business");
		buttonGroup_1.add(Business);
		Business.setBackground(new Color(255, 204, 153));
		Business.setFont(new Font("Tahoma", Font.BOLD, 11));
		Business.setBounds(35, 277, 109, 23);
		contentPane.add(Business);
		
		JLabel lblNewLabel_5 = new JLabel("Category");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_5.setBounds(222, 204, 72, 19);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton economy = new JRadioButton("Economy");
		buttonGroup_1.add(economy);
		economy.setBackground(new Color(255, 204, 153));
		economy.setFont(new Font("Tahoma", Font.BOLD, 11));
		economy.setBounds(35, 246, 109, 31);
		contentPane.add(economy);
		
		JLabel lblNewLabel_7 = new JLabel("-------------------------------------------------------------------------------------");
		lblNewLabel_7.setBounds(35, 307, 373, 14);
		contentPane.add(lblNewLabel_7);
		
		JRadioButton oneWay = new JRadioButton("One Way");
		buttonGroup.add(oneWay);
		oneWay.setBackground(new Color(255, 204, 153));
		oneWay.setFont(new Font("Tahoma", Font.BOLD, 11));
		oneWay.setBounds(154, 251, 85, 23);
		contentPane.add(oneWay);
		
		JRadioButton Return = new JRadioButton("Return");
		buttonGroup.add(Return);
		Return.setBackground(new Color(255, 204, 153));
		Return.setFont(new Font("Tahoma", Font.BOLD, 11));
		Return.setBounds(154, 277, 85, 23);
		contentPane.add(Return);
		
		JLabel lblNewLabel_8 = new JLabel("-------------------------------------------------------------------------------------");
		lblNewLabel_8.setBounds(35, 483, 373, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel toLabel = new JLabel("From :");
		toLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		toLabel.setBounds(45, 332, 61, 14);
		contentPane.add(toLabel);
		
		JComboBox from = new JComboBox();
		from.setBackground(Color.ORANGE);
		from.setModel(new DefaultComboBoxModel(new String[] {"Destination", "KLIA","Krabi,Thailand","Singapore","Seoul,South Korea","Jakarta,Indonesia","Bali,Indonesia","Tokyo,Japan","Guangzhou,China"}));
		from.setBounds(132, 332, 202, 22);
		contentPane.add(from);
		
		JLabel lblNewLabel_10 = new JLabel("-------------------------------------------------------------------------------------");
		lblNewLabel_10.setBounds(35, 529, 373, 14);
		contentPane.add(lblNewLabel_10);
		
		totalField = new JTextField();
		totalField.setBackground(new Color(255, 255, 204));
		totalField.setBounds(132, 563, 202, 31);
		totalField.setEditable(false);
		contentPane.add(totalField);
		totalField.setColumns(10);
		
		JLabel totalLabel = new JLabel("Price :");
		totalLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		totalLabel.setBounds(60, 571, 84, 14);
		contentPane.add(totalLabel);
		
		JButton totalBtn = new JButton("Total");
		totalBtn.setForeground(new Color(255, 255, 255));
		totalBtn.setBackground(new Color(0, 0, 0));
		totalBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		totalBtn.setBounds(286, 617, 89, 23);
		contentPane.add(totalBtn);
		
		JButton resetBtn = new JButton("Reset");
		resetBtn.setForeground(new Color(255, 255, 255));
		resetBtn.setBackground(new Color(0, 0, 0));
		resetBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		resetBtn.setBounds(166, 617, 89, 23);
		contentPane.add(resetBtn);
		
		textClass = new JTextField();
		textClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		textClass.setHorizontalAlignment(SwingConstants.CENTER);
		textClass.setBounds(152, 166, 620, 34);
		textClass.setEditable(false);
		panel2.add(textClass);
		textClass.setColumns(10);
		
		textFrom = new JTextField();
		textFrom.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFrom.setHorizontalAlignment(SwingConstants.CENTER);
		textFrom.setBounds(152, 211, 422, 34);
		textFrom.setEditable(false);
		panel2.add(textFrom);
		textFrom.setColumns(10);
		
		textTo = new JTextField();
		textTo.setFont(new Font("Tahoma", Font.BOLD, 14));
		textTo.setHorizontalAlignment(SwingConstants.CENTER);
		textTo.setColumns(10);
		textTo.setEditable(false);
		textTo.setBounds(152, 256, 422, 34);
		panel2.add(textTo);
		
		textWay = new JTextField();
		textWay.setFont(new Font("Tahoma", Font.BOLD, 13));
		textWay.setHorizontalAlignment(SwingConstants.CENTER);
		textWay.setColumns(10);
		textWay.setEditable(false);
		textWay.setBounds(638, 256, 134, 27);
		panel2.add(textWay);
		
		textTicketID = new JTextField();
		textTicketID.setFont(new Font("Arial", Font.BOLD, 40));
		textTicketID.setHorizontalAlignment(SwingConstants.CENTER);
		textTicketID.setColumns(10);
		textTicketID.setEditable(false);
		textTicketID.setBounds(638, 329, 113, 77);
		panel2.add(textTicketID);
		
		textPrice = new JTextField();
		textPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPrice.setHorizontalAlignment(SwingConstants.CENTER);
		textPrice.setColumns(10);
		textPrice.setEditable(false);
		textPrice.setBounds(152, 301, 134, 27);
		panel2.add(textPrice);
		
		textTime = new JTextField();
		textTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		textTime.setHorizontalAlignment(SwingConstants.CENTER);
		textTime.setColumns(10);
		textTime.setEditable(false);
		textTime.setBounds(152, 339, 134, 27);
		panel2.add(textTime);
		
		textBackDate = new JTextField();
		textBackDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		textBackDate.setHorizontalAlignment(SwingConstants.CENTER);
		textBackDate.setColumns(10);
		textBackDate.setEditable(false);
		textBackDate.setBounds(405, 339, 169, 27);
		panel2.add(textBackDate);
		
		textRoute = new JTextField();
		textRoute.setFont(new Font("Arial", Font.BOLD, 40));
		textRoute.setHorizontalAlignment(SwingConstants.CENTER);
		textRoute.setColumns(10);
		textRoute.setEditable(false);
		textRoute.setBounds(22, 93, 113, 77);
		panel2.add(textRoute);
		
		textGoDate = new JTextField();
		textGoDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		textGoDate.setHorizontalAlignment(SwingConstants.CENTER);
		textGoDate.setColumns(10);
		textGoDate.setEditable(false);
		textGoDate.setBounds(405, 301, 169, 27);
		panel2.add(textGoDate);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(22, 11, 750, 77);
		panel2.add(panel);
		panel.setLayout(null);
		
		JLabel lblYourBookingDetails = new JLabel("Your Booking Details");
		lblYourBookingDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourBookingDetails.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblYourBookingDetails.setBounds(10, 11, 730, 55);
		panel.add(lblYourBookingDetails);
		
		labelName = new JLabel("");
		labelName.setFont(new Font("Arial", Font.BOLD, 11));
		labelName.setBounds(216, 100, 358, 26);
		panel2.add(labelName);
		
		JLabel bookingTime = new JLabel("");
		bookingTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		bookingTime.setBounds(22, 407, 283, 14);
		panel2.add(bookingTime);
		
		JLabel lblNewLabel_9 = new JLabel("Class");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(152, 128, 620, 27);
		panel2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("Name : ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(152, 99, 65, 27);
		panel2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("From : ");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11_1.setBounds(77, 211, 65, 27);
		panel2.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_11_2 = new JLabel("To : ");
		lblNewLabel_11_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11_2.setBounds(77, 256, 65, 27);
		panel2.add(lblNewLabel_11_2);
		
		JLabel lblNewLabel_11_4 = new JLabel("Time : ");
		lblNewLabel_11_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11_4.setBounds(77, 339, 65, 27);
		panel2.add(lblNewLabel_11_4);
		
		JLabel lblNewLabel_11_4_1 = new JLabel("Price : ");
		lblNewLabel_11_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11_4_1.setBounds(77, 301, 65, 27);
		panel2.add(lblNewLabel_11_4_1);
		
		JLabel lblNewLabel_11_4_1_1 = new JLabel("Date Go :");
		lblNewLabel_11_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11_4_1_1.setBounds(329, 301, 75, 27);
		panel2.add(lblNewLabel_11_4_1_1);
		
		JLabel lblNewLabel_11_4_1_2 = new JLabel("Date Back :");
		lblNewLabel_11_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11_4_1_2.setBounds(329, 339, 75, 27);
		panel2.add(lblNewLabel_11_4_1_2);
		
		JLabel lblNewLabel_11_4_1_3 = new JLabel("Ticket.ID");
		lblNewLabel_11_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11_4_1_3.setBounds(638, 294, 113, 27);
		panel2.add(lblNewLabel_11_4_1_3);
		
		JLabel lblNewLabel_11_4_1_3_1 = new JLabel("Category ");
		lblNewLabel_11_4_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_4_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11_4_1_3_1.setBounds(638, 222, 134, 27);
		panel2.add(lblNewLabel_11_4_1_3_1);
		
		textSeat = new JTextField();
		textSeat.setHorizontalAlignment(SwingConstants.CENTER);
		textSeat.setFont(new Font("Tahoma", Font.BOLD, 13));
		textSeat.setBounds(488, 379, 86, 27);
		textSeat.setEditable(false);
		panel2.add(textSeat);
		textSeat.setColumns(10);
		
		JLabel lblNewLabel_11_4_1_2_1 = new JLabel("Seat :");
		lblNewLabel_11_4_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11_4_1_2_1.setBounds(436, 379, 42, 27);
		panel2.add(lblNewLabel_11_4_1_2_1);
		
		JLabel lblNewLabel_12 = new JLabel("Gate :");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(660, 150, 33, 14);
		panel2.add(lblNewLabel_12);
		
		labelGate = new JLabel("");
		labelGate.setHorizontalAlignment(SwingConstants.CENTER);
		labelGate.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelGate.setBounds(697, 150, 75, 14);
		panel2.add(labelGate);
		
		ticketBtn = new JButton("TICKET");
		ticketBtn.setForeground(new Color(255, 255, 255));
		ticketBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		ticketBtn.setBackground(new Color(0, 0, 0));
		ticketBtn.setBounds(1122, 613, 140, 31);
		contentPane.add(ticketBtn);
		
		JComboBox To = new JComboBox();
		To.setBounds(132, 361, 202, 22);
		contentPane.add(To);
		
		JSpinner spinnerAdult = new JSpinner();
		spinnerAdult.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		spinnerAdult.setBounds(316, 252, 59, 20);
		contentPane.add(spinnerAdult);
		
		JSpinner spinnerChild = new JSpinner();
		spinnerChild.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinnerChild.setBounds(316, 278, 59, 20);
		contentPane.add(spinnerChild);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(132, 401, 131, 20);
		contentPane.add(dateChooser);
		
		TimePicker timePicker = new TimePicker();
		timePicker.setBounds(132, 419, 80, 23);
		contentPane.add(timePicker);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(132, 452, 131, 20);
		contentPane.add(dateChooser_1);

		JSpinner spinnerDay = new JSpinner();
		spinnerDay.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		spinnerDay.setBounds(134, 498, 59, 20);
		contentPane.add(spinnerDay);
		
		JLabel lblNewLabel = new JLabel("Adult :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(260, 254, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblChild = new JLabel("Child :");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChild.setBounds(260, 281, 46, 14);
		contentPane.add(lblChild);
		
		JLabel lblTo = new JLabel("To :");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTo.setBounds(47, 365, 59, 14);
		contentPane.add(lblTo);
		
		JLabel lblNewLabel_6 = new JLabel("Date*");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(273, 407, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Time*");
		lblNewLabel_6_1.setForeground(Color.RED);
		lblNewLabel_6_1.setBounds(222, 423, 46, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Date*");
		lblNewLabel_6_2.setForeground(Color.RED);
		lblNewLabel_6_2.setBounds(273, 458, 46, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel labelDay = new JLabel("Day :");
		labelDay.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelDay.setBounds(60, 501, 46, 14);
		contentPane.add(labelDay);
		
		JLabel lblTimeForGo = new JLabel("Time For Go :");
		lblTimeForGo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTimeForGo.setBounds(46, 401, 85, 20);
		contentPane.add(lblTimeForGo);
		
		JLabel lblDateForBack = new JLabel("Date For Back :");
		lblDateForBack.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDateForBack.setBounds(46, 452, 85, 20);
		contentPane.add(lblDateForBack);
		
		//========================================================================================================================= ActionListener for each Components =====================================================================================================
		
		//ActionListener for Cancel Button
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if(a.getSource()==cancelBtn) {
					System.exit(0);
				}
			}
			
		});
		
		//Calculation
		from.addActionListener(new ActionListener() { //ActionListener for From ComboBox

			public void actionPerformed(ActionEvent e) {
				
				int num1 = (int) spinnerAdult.getValue();
				int num2 = (int) spinnerChild.getValue();
				
				int day = (int) spinnerDay.getValue();
				
				if(from.getSelectedItem().equals("KLIA")) { //Action if user select KLIA in ComboBox - from
					To.removeAllItems();
					To.addItem("Destination");
					To.addItem("Langkawi,Kedah");
					To.addItem("Johor Bahru");
					To.addItem("Terengganu");
					To.addItem("Kota Bharu,Kelantan");
					To.addItem("Kuching,Sarawak");
					To.addItem("Kota Kinabalu,Sabah");
					To.addItem("Penang");
					To.addItem("Kuantan,Pahang");
					To.addItem("Seoul,South Korea");
					To.addItem("Singapore");
					To.addItem("Tokyo,Japan");
					To.addItem("Krabi,Thailand");
					To.addItem("Bali,Indonesia");
					To.addItem("Jakarta,Indonesia");
					To.addItem("Guangzhou,China");
					
					if(oneWay.isSelected()) {
						spinnerDay.setEnabled(false);
						lblDateForBack.setEnabled(false);
						dateChooser_1.setEnabled(false);
					}
					else if(Return.isSelected()) {
						spinnerDay.setEnabled(true);
						lblDateForBack.setEnabled(true);
						dateChooser_1.setEnabled(true);
					}
					
					totalBtn.addActionListener(new ActionListener() { //ActionListener for Total Button 
						public void actionPerformed(ActionEvent e) {
							
							String className = "";
							String seat = "";
							String gate = "";
							int totalCategory = 0;
							double totalPrice = 0.00 , totalFinalOfPrice = 0.00;
						
							double tax = 0.06, totalTax;
							double price = 00.0;
							
							if(oneWay.isSelected()) {
								spinnerDay.setValue(1);
							}
							
							DecimalFormat format = new DecimalFormat("#0.00");
							
							//======================================================================== Business ==================================================================
							if(Business.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Business class and select Langkawi,Kedah
								
								className = "Business";
								
								totalTax = 354.3 * tax;
								price = (354.3 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;  //Calculation
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Johor Bahru")) { //Action if user select Business class and select Johor Bahru
								
								className = "Business";
								
								totalTax = 274.3 * tax;
                                price = (274.3 * day) + totalTax;
								
                                if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
    							
    							totalCategory = num1 + num2;
    							
    							totalFinalOfPrice = totalPrice * totalCategory;
    							
    							seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Business class and select Terengganu
								className = "Business";
								
								totalTax = 284 * tax;
                                price = (284 * day)+totalTax;
								
                                if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
    							
    							totalCategory = num1 + num2;
    							
    							totalFinalOfPrice = totalPrice * totalCategory;
    							
    							seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kota Bharu,Kelantan")) { //Action if user select Business class and select Kota Bharu,Kelantan
								className = "Business";
								
								totalTax = 264.3 * tax;
								price = (264.3 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Business class and select Kuching,Sarawak
								className = "Business";
								
								totalTax = 284.3 * tax;
								price = (284.3 * day) +totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Business class and select Kota Kinabalu,Sabah
								className = "Business";
								
								totalTax = 394.3 * tax;
								price = (394.3 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Business class and select Penang
								className = "Business";
								
								totalTax = 264.3 * tax;
								price = (264.3 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kuantan,Pahang")) { //Action if user select Business class and select Kuantan,Pahang
								className = "Business";
								
								totalTax = 284 * tax;
								price = (284 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
							
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Seoul,South Korea")) { //Action if user select Business class and select Seoul.South Korea
								className = "Business";
								
								totalTax = 1557 * tax;
								price = (1557 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Singapore")) { //Action if user select Business class and select Singapore
								className = "Business";
								
								totalTax = 328 * tax;
								price = (328 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Tokyo,Japan")) { //Action if user select Business class and select Tokyo,Japan
								className = "Business";
								
								totalTax = 1060 * tax;
								price = (1060 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Krabi,Thailand")) { //Action if user select Business class and select Krabi.Thailand
								className = "Business";
								
								totalTax = 1609.1 * tax;
								price = (1609.1 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Bali,Indonesia")) { //Action if user select Business class and select Bali,Indonesia
								className = "Business";
								
								totalTax = 760 * tax;
								price = (760 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Jakarta,Indonesia")) { //Action if user select Business class and select Jakarta,Indonesia
								className = "Business";
								
								totalTax = 694 * tax;
								price = (694 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Guangzhou,China")) { //Action if user select Business class and select Guangzhou,China
								className = "Business";
								
								totalTax = 11509 * tax;
								price = (11509 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							
							//============================================================== economy =================================================================
							else if(economy.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Economy class and select Langkawi,Kedah
								className = "Economy";
								
								totalTax = 194.3 * tax;
								price = (194.3 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Johor Bahru")) { //Action if user select Economy class and select Johor Bahru
								className = "Economy";
								
								totalTax = 114.3 * tax;
                                price = (114.3 * day) + totalTax;
								
                                if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
    							
    							totalCategory = num1 + num2;
    							
    							totalFinalOfPrice = totalPrice * totalCategory;
    							
    							seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Economy class and select Terengganu
								className = "Economy";
								
								totalTax = 124 * tax;
                                price = (124 * day)+totalTax;
								
                                if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
    							
    							totalCategory = num1 + num2;
    							
    							totalFinalOfPrice = totalPrice * totalCategory;
    							
    							seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kota Bharu,Kelantan")) { //Action if user select Economy class and select Kota Bharu,Kelantan
								className = "Economy";
								
								totalTax = 104.3 * tax;
								price = (104.3 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Economy class and select Kuching,Sarawak
								className = "Economy";
								
								totalTax = 124.3 * tax;
								price = (124.3 * day) +totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Economy class and select Kota Kinabalu,Sabah
								className = "Economy";
								
								totalTax = 234.3 * tax;
								price = (234.3 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Economy class and select Penang
								className = "Economy";
								
								totalTax = 104.3 * tax;
								price = (104.3 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kuantan,Pahang")) { //Action if user select Economy class and select Kuantan,Pahang
								className = "Economy";
								
								totalTax = 124 * tax;
								price = (124 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Seoul,South Korea")) { //Action if user select Economy class and select Seoul,South Korea
								className = "Economy";
								
								totalTax = 1397 * tax;
								price = (1397 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Singapore")) { //Action if user select Economy class and select Singapore
								className = "Economy";
								
								totalTax = 168 * tax;
								price = (168 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Tokyo,Japan")) { //Action if user select Economy class and select Tokyo,Japan
								className = "Economy";
								
								totalTax = 900 * tax;
								price = (900 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Krabi,Thailand")) { //Action if user select Economy class and select Krabi,Thailand
								className = "Economy";
								
								totalTax = 1449.1 * tax;
								price = (1449.1 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Bali,Indonesia")) { //Action if user select Economy class and select Bali,Indonesia
								className = "Economy";
								
								totalTax = 600 * tax;
								price = (600 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Jakarta,Indonesia")) { //Action if user select Economy class and select Jakarta,Indonesia
								className = "Economy";
								
								totalTax = 534 * tax;
								price = (534 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Guangzhou,China")) { //Action if user select Economy class and select Guangzhou,China
								className = "Economy";
								
								totalTax = 11349 * tax;
								price = (11349 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
									contentPane.add(dateChooser_1);
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							
							
							if(from.getSelectedItem().equals("Destination")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you come from");
								
							}
							if(To.getSelectedItem().equals("")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you want to go");
							}
							if(buttonGroup.getSelection() == null) {
								JOptionPane.showMessageDialog(null, "You do not select the category");
							}
						    if(buttonGroup_1.getSelection()==null) {
								JOptionPane.showMessageDialog(null, "You do not select the class");
							}
						    if(dateChooser.getDate()==null) {
								JOptionPane.showMessageDialog(null, "You do not select date for you Go");
							}
						    if(timePicker.getTime()==null) {
						    	JOptionPane.showMessageDialog(null, "You do not select the time when you want to go");
						    }
						    if(dateChooser_1.isEnabled()==true) {
								if(dateChooser_1.getDate()==null) {
									JOptionPane.showMessageDialog(null, "You do not select date for you back to Malaysia");
								}
								else {
									//================================================================================== Gate ================================================================================================
		                            labelGate.setText(gate);
									//================================================================================== Seat ================================================================================================
									textSeat.setText(seat);
									//================================================================================== Class Name ===========================================================================================
									textClass.setText(className);
									//================================================================================== Price ===============================================================================================
									textPrice.setText("RM"+format.format(totalFinalOfPrice));
									totalField.setText("RM"+ format.format(totalFinalOfPrice));
									//================================================================================== Calendar =================================================================================================================
									Calendar timer = Calendar.getInstance();
									timer.getTime();
									SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
									textTime.setText(""+timePicker.getTime());
									//================================================================================== Date =================================================================================================================
									SimpleDateFormat Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
									bookingTime.setText("Booking Time : "+Tdate.format(timer.getTime()) + " / " +tTime.format(timer.getTime()));
									
									textFrom.setText("" + from.getSelectedItem());
									textTo.setText( "" + To.getSelectedItem());
									textGoDate.setText(Tdate.format(dateChooser.getDate()));
									textBackDate.setText(Tdate.format(dateChooser_1.getDate()));
									//================================================================================== Random number =================================================================================================================
									int random;
									random = 24 + (int) (Math.random());
									textTicketID.setText(random + "AA");
									
									textRoute.setText("ANY");
								}
						    }
							
						}
					});
				}
				
				//========================================================= krabi ,Thailand ======================================================
				else if(from.getSelectedItem().equals("Krabi,Thailand")) {
					
					To.removeAllItems();
					To.addItem("Penang");
					To.addItem("Langkawi,Kedah");
					To.addItem("Kota Kinabalu,Sabah");
					To.addItem("Terengganu");
					To.addItem("Kota Bharu,Kelantan");
					To.addItem("Kuching,Sarawak");
					To.addItem("KLIA");
					
					if(oneWay.isSelected()) {
						spinnerDay.setEnabled(false);
						lblDateForBack.setEnabled(false);
						dateChooser_1.setEnabled(false);
					}
					else if(Return.isSelected()) {
						spinnerDay.setEnabled(true);
						lblDateForBack.setEnabled(true);
						dateChooser_1.setEnabled(true);
					}
					
					totalBtn.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String seat = "";
							String className = "";
							String gate = "";
							int totalCategory = 0;
							double totalPrice = 0.00 , totalFinalOfPrice = 0.00;
						
							double tax = 0.06, totalTax;
							double price = 00.0;
							
							if(oneWay.isSelected()) {
								spinnerDay.setValue(1);
							}
						
							DecimalFormat format = new DecimalFormat("#0.00");
							
							//========================================================== business =============================================================================
							if(Business.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Business class and select Penang
								className = "Business";
								
								totalTax = 894.51*tax;
								price = (894.51 * day) + totalTax;
								
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Business class and select Langkawi,Kedah
								className = "Business";
								
								totalTax = 1236.71*tax;
								price = (1236.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
                            else if(Business.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Business class and select Kota Kinabalu,Sabah
                            	className = "Business";
								
								totalTax = 803.71*tax;
								price = (803.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Business class and select Terengganu
								className = "Business";
								
								totalTax = 466.68*tax;
								price = (466.68 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Business class and select Kota Bahru,Kelantan
								className = "Business";
								
								totalTax = 552.77 * tax;
								price = (552.77 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Business class and select Kuching,Sarawak
								className = "Business";
								
								totalTax = 1078.18*tax;
								price = (1078.18 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;

								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Business class and select KLIA
								className = "Business";
								
								totalTax = 682.62 * tax;
								price = (682.62 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							
							//========================================================== economy =============================================================================
							else if(economy.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Economy class and select Penang
								className = "Economy";
								
								totalTax = 734.51*tax;
								price = (734.51 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) {  //Action if user select Economy class and select Langkawi,Kedah
								className = "Economy";
								
								totalTax = 1076.71*tax;
								price = (1076.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
                            else if(economy.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Economy class and select Kota Kinabalu,Sabah
                            	className = "Economy";
								
								totalTax = 643.71*tax;
								price = (643.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Economy class and select Terengganu
								className = "Economy";
								
								totalTax = 306.68*tax;
								price = (306.68 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Economy class and select Kota Bahru,Kelantan
								className = "Economy";
								
								totalTax = 392.77 * tax;
								price = (392.77 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Economy class and select Kuching,Sarawak
								className = "Economy";
								
								totalTax = 918.18*tax;
								price = (918.18 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Economy class and select KLIA
								className = "Economy";
								
								totalTax = 522.62 * tax;
								price = (522.62 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							
							//Display error popup message if something is not selected
							if(from.getSelectedItem().equals("Destination")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you come from");
								
							}
							if(To.getSelectedItem().equals("")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you want to go");
							}
							if(buttonGroup.getSelection() == null) {
								JOptionPane.showMessageDialog(null, "You do not select the category");
							}
						    if(buttonGroup_1.getSelection()==null) {
								JOptionPane.showMessageDialog(null, "You do not select the class");
							}
						    if(dateChooser.getDate()==null) {
								JOptionPane.showMessageDialog(null, "You do not select date for you Go");
							}
						    if(timePicker.getTime()==null) {
						    	JOptionPane.showMessageDialog(null, "You do not select the time when you want to go");
						    }
						    if(dateChooser_1.isEnabled()==true) {
								if(dateChooser_1.getDate()==null) {
									JOptionPane.showMessageDialog(null, "You do not select date for you back to Malaysia");
								}
								else {
									//================================================================================== Gate ================================================================================================
		                            labelGate.setText(gate);
									//================================================================================== Seat ================================================================================================
									textSeat.setText(seat);
									//================================================================================== Class Name ===========================================================================================
									textClass.setText(className);
									//================================================================================== Price ===============================================================================================
									textPrice.setText("RM"+format.format(totalFinalOfPrice));
									totalField.setText("RM"+ format.format(totalFinalOfPrice));
									//================================================================================== Calendar =================================================================================================================
									Calendar timer = Calendar.getInstance();
									timer.getTime();
									SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
									textTime.setText(""+timePicker.getTime());
									//================================================================================== Date =================================================================================================================
									SimpleDateFormat Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
									bookingTime.setText("Booking Time : "+Tdate.format(timer.getTime()) + " / " +tTime.format(timer.getTime()));
									
									textFrom.setText("" + from.getSelectedItem());
									textTo.setText( "" + To.getSelectedItem());
									textGoDate.setText(Tdate.format(dateChooser.getDate()));
									textBackDate.setText(Tdate.format(dateChooser_1.getDate()));
									//================================================================================== Random number =================================================================================================================
									int random;
									random = 24 + (int) (Math.random());
									textTicketID.setText(random + "AA");
									
									textRoute.setText("ANY");
								}
						    }
						
						}
						
					});
					
					
				}
				
				//========================================================= Singapore ======================================================
				else if(from.getSelectedItem().equals("Singapore")) {
					
					To.removeAllItems();
					To.addItem("Penang");
					To.addItem("Langkawi,Kedah");
					To.addItem("Kota Kinabalu,Sabah");
					To.addItem("Terengganu");
					To.addItem("Kota Bharu,Kelantan");
					To.addItem("Kuching,Sarawak");
					
					if(oneWay.isSelected()) {
						spinnerDay.setEnabled(false);
						lblDateForBack.setEnabled(false);
						dateChooser_1.setEnabled(false);
					}
					else if(Return.isSelected()) {
						spinnerDay.setEnabled(true);
						lblDateForBack.setEnabled(true);
						dateChooser_1.setEnabled(true);
					}
					
					totalBtn.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String seat = "";
							String className = "";
							String gate = "";
							int totalCategory = 0;
							double totalPrice = 0.00 , totalFinalOfPrice = 0.00;
							double tax = 0.06 ,totalTax;
							double price = 00.0;
							
							if(oneWay.isSelected()) {
								spinnerDay.setValue(1);
							}
							
							DecimalFormat format = new DecimalFormat("#0.00");
							
							//======================================================================== Business ==================================================================
							if(Business.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Business class and select Penang
								className = "Business";
								
								totalTax = 656.9*tax;
								price = (656.9 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Business class and select Langkawi,Kedah
								className = "Business";
								
								totalTax = 1234.71*tax;
								price = (1234.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
                            else if(Business.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Business class and select Kota Kinabalu,Sabah
                            	className = "Business";
								
								totalTax = 461.71*tax;
								price = (461.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Business class and select Terengganu
								className = "Business";
								
								totalTax = 645.79*tax;
								price = (645.79 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Business class and select Kota Bahru,Kelantan
								className = "Business";
								
								totalTax = 975.58 * tax;
								price = (975.58 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Business class and select Kuching,Sarawak
								className = "Business";
								
								totalTax = 647*tax;
								price = (647 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Business class and select KLIA
								className = "Business";
								
								totalTax = 446 * tax;
								price = (446 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
							
								seat = "BS17";
								gate = "B2";
							}
							
							//========================================================== economy =============================================================================
							else if(economy.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Economy class and select Penang
								className = "Economy";
								
								totalTax = 496.9*tax;
								price = (496.9 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Economy class and select Langkawi,Kedah
								className = "Economy";
								
								totalTax = 1076.71*tax;
								price = (1076.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
                            else if(economy.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Economy class and select Kota Kinabalu,Sabah
                            	className = "Economy";
								
								totalTax = 301.7*tax;
								price = (301.7 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Economy class and select Terengganu
								className = "Economy";
								
								totalTax = 485.79*tax;
								price = (485.79 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Economy class and select Kota Bahru,Kelantan
								className = "Economy";
								
								totalTax = 815.56 * tax;
								price = (815.56 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Economy class and select Kuching,Sarawak
								className = "Economy";
								
								totalTax = 487*tax;
								price = (487 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Economy class and select KLIA
								className = "Economy";
								
								totalTax = 286 * tax;
								price = (286 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							
							
							if(from.getSelectedItem().equals("Destination")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you come from");
								
							}
							if(To.getSelectedItem().equals("")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you want to go");
							}
							if(buttonGroup.getSelection() == null) {
								JOptionPane.showMessageDialog(null, "You do not select the category");
							}
						    if(buttonGroup_1.getSelection()==null) {
								JOptionPane.showMessageDialog(null, "You do not select the class");
							}
						    if(dateChooser.getDate()==null) {
								JOptionPane.showMessageDialog(null, "You do not select date for you Go");
							}
						    if(timePicker.getTime()==null) {
						    	JOptionPane.showMessageDialog(null, "You do not select the time when you want to go");
						    }
						    if(dateChooser_1.isEnabled()==true) {
								if(dateChooser_1.getDate()==null) {
									JOptionPane.showMessageDialog(null, "You do not select date for you back to Malaysia");
								}
								else {
									//================================================================================== Gate ================================================================================================
		                            labelGate.setText(gate);
									//================================================================================== Seat ================================================================================================
									textSeat.setText(seat);
									//================================================================================== Class Name ===========================================================================================
									textClass.setText(className);
									//================================================================================== Price ===============================================================================================
									textPrice.setText("RM"+format.format(totalFinalOfPrice));
									totalField.setText("RM"+ format.format(totalFinalOfPrice));
									//================================================================================== Calendar =================================================================================================================
									Calendar timer = Calendar.getInstance();
									timer.getTime();
									SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
									textTime.setText(""+timePicker.getTime());
									//================================================================================== Date =================================================================================================================
									SimpleDateFormat Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
									bookingTime.setText("Booking Time : "+Tdate.format(timer.getTime()) + " / " +tTime.format(timer.getTime()));
									
									textFrom.setText("" + from.getSelectedItem());
									textTo.setText( "" + To.getSelectedItem());
									textGoDate.setText(Tdate.format(dateChooser.getDate()));
									textBackDate.setText(Tdate.format(dateChooser_1.getDate()));
									//================================================================================== Random number =================================================================================================================
									int random;
									random = 24 + (int) (Math.random());
									textTicketID.setText(random + "AA");
									
									textRoute.setText("ANY");
								}
						    }
						}
						
					});
					
					
				}
				
				//========================================================= Seoul,South Korea ======================================================
				else if(from.getSelectedItem().equals("Seoul,South Korea")) {
					
					To.removeAllItems();
					To.addItem("Penang");
					To.addItem("Langkawi,Kedah");
					To.addItem("Kota Kinabalu,Sabah");
					To.addItem("Terengganu");
					To.addItem("Kota Bharu,Kelantan");
					To.addItem("Kuching,Sarawak");
					To.addItem("KLIA");
					
					if(oneWay.isSelected()) {
						spinnerDay.setEnabled(false);
						lblDateForBack.setEnabled(false);
						dateChooser_1.setEnabled(false);
					}
					else if(Return.isSelected()) {
						spinnerDay.setEnabled(true);
						lblDateForBack.setEnabled(true);
						dateChooser_1.setEnabled(true);
					}
					
					totalBtn.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String seat = "";
							String className = "";
							String gate = "";
							int totalCategory = 0;
							double totalPrice = 0.00 , totalFinalOfPrice = 0.00;
							double tax = 0.06 ,totalTax;
							double price = 00.0;
							
							
							if(oneWay.isSelected()) {
								spinnerDay.setValue(1);
							}
							
							DecimalFormat format = new DecimalFormat("#0.00");
							
							//======================================================================== Business ==================================================================
							if(Business.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Business class and select Penang
								className = "Business";
								
								totalTax = 1130.32*tax;
								price = (1130.32 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Business class and select Langkawi,Kedah
								className = "Business";
								
								totalTax = 2190.15*tax;
								price = (2190.15 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
                            else if(Business.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Business class and select Kota Kinabalu,Sabah
                            	className = "Business";
								
								totalTax = 1548.33*tax;
								price = (1548.33 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Business class and select Terengganu
								className = "Business";
								
								totalTax = 2129.36*tax;
								price = (2129.36 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Business class and select Kota Bahru,Kelantan
								className = "Business";
								
								totalTax = 2080.22 * tax;
								price = (2080.22 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Business class and select Kuching,Sarawak
								className = "Business";
								
								totalTax = 1301.2*tax;
								price = (1301.2 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Business class and select KLIA
								className = "Business";
								
								totalTax = 933.16 * tax;
								price = (933.16 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							
							//========================================================== economy =============================================================================
							else if(economy.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Economy class and select Penang
								className = "Economy";
								
								totalTax = 970.32*tax;
								price = (970.32 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Economy class and select Langkawi,Kedah
								className = "Economy";
								
								totalTax = 2030.15*tax;
								price = (2030.15 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
                            else if(economy.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Economy class and select Kota Kinabalu,Sabah
                            	className = "Economy";
								
								totalTax = 1388.33*tax;
								price = (1388.33 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Economy class and select Terengganu
								className = "Economy";
								
								totalTax = 1969.36*tax;
								price = (1969.36 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Economy class and select Kota Bahru,Kelantan
								className = "Economy";
								
								totalTax = 1920.22 * tax;
								price = (1920.22 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Economy class and select Kuching,Sarawak
								className = "Economy";
								
								totalTax = 1141.2*tax;
								price = (1141.2 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Economy class and select KLIA
								className = "Economy";
								
								totalTax = 773.16 * tax;
								price = (773.16 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							
							
							if(from.getSelectedItem().equals("Destination")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you come from");
								
							}
							if(To.getSelectedItem().equals("")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you want to go");
							}
							if(buttonGroup.getSelection() == null) {
								JOptionPane.showMessageDialog(null, "You do not select the category");
							}
						    if(buttonGroup_1.getSelection()==null) {
								JOptionPane.showMessageDialog(null, "You do not select the class");
							}
						    if(dateChooser.getDate()==null) {
								JOptionPane.showMessageDialog(null, "You do not select date for you Go");
							}
						    if(timePicker.getTime()==null) {
						    	JOptionPane.showMessageDialog(null, "You do not select the time when you want to go");
						    }
						    if(dateChooser_1.isEnabled()==true) {
								if(dateChooser_1.getDate()==null) {
									JOptionPane.showMessageDialog(null, "You do not select date for you back to Malaysia");
								}
								else {
									//================================================================================== Gate ================================================================================================
		                            labelGate.setText(gate);
									//================================================================================== Seat ================================================================================================
									textSeat.setText(seat);
									//================================================================================== Class Name ===========================================================================================
									textClass.setText(className);
									//================================================================================== Price ===============================================================================================
									textPrice.setText("RM"+format.format(totalFinalOfPrice));
									totalField.setText("RM"+ format.format(totalFinalOfPrice));
									//================================================================================== Calendar =================================================================================================================
									Calendar timer = Calendar.getInstance();
									timer.getTime();
									SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
									textTime.setText(""+timePicker.getTime());
									//================================================================================== Date =================================================================================================================
									SimpleDateFormat Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
									bookingTime.setText("Booking Time : "+Tdate.format(timer.getTime()) + " / " +tTime.format(timer.getTime()));
									
									textFrom.setText("" + from.getSelectedItem());
									textTo.setText( "" + To.getSelectedItem());
									textGoDate.setText(Tdate.format(dateChooser.getDate()));
									textBackDate.setText(Tdate.format(dateChooser_1.getDate()));
									//================================================================================== Random number =================================================================================================================
									int random;
									random = 24 + (int) (Math.random());
									textTicketID.setText(random + "AA");
									
									textRoute.setText("ANY");
								}
						    }
						}
						
					});
					
					
				}
				
				
				//========================================================= Jakarta,Indonesia ======================================================
				else if(from.getSelectedItem().equals("Jakarta,Indonesia")) {
					
					To.removeAllItems();
					To.addItem("Penang");
					To.addItem("Langkawi,Kedah");
					To.addItem("Kota Kinabalu,Sabah");
					To.addItem("Terengganu");
					To.addItem("Kota Bharu,Kelantan");
					To.addItem("Kuching,Sarawak");
					To.addItem("KLIA");
					
					if(oneWay.isSelected()) {
						spinnerDay.setEnabled(false);
						lblDateForBack.setEnabled(false);
						dateChooser_1.setEnabled(false);
					}
					else if(Return.isSelected()) {
						spinnerDay.setEnabled(true);
						lblDateForBack.setEnabled(true);
						dateChooser_1.setEnabled(true);
					}
					
					totalBtn.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String seat = "";
							String className = "";
							String gate = "";
							int totalCategory = 0;
							double totalPrice = 0.00 , totalFinalOfPrice = 0.00;
							double tax = 0.06 ,totalTax;
							double price = 00.0;
							
							if(oneWay.isSelected()) {
								spinnerDay.setValue(1);
							}
							
							DecimalFormat format = new DecimalFormat("#0.00");
							
							//======================================================================== Business ==================================================================
							if(Business.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Business class and select Penang
								className = "Business";
								
								totalTax = 1155.37*tax;
								price = (1155.37 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Business class and select Langkawi,Kedah
								className = "Business";
								
								totalTax = 1262.73*tax;
								price = (1262.73 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
                            else if(Business.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Business class and select Kota Kinabalu,Sabah
                            	className = "Business";
								
								totalTax = 1306*tax;
								price = (1306 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Business class and select Terengganu
								className = "Business";
								
								totalTax = 2447.06*tax;
								price = (2447.06 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Business class and select Kota Bahru,Kelantan
								className = "Business";
								
								totalTax = 1106.36 * tax;
								price = (1106.36 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Business class and select Kuching,Sarawak
								className = "Business";
								
								totalTax = 1155.34*tax;
								price = (1155.34 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Business class and select KLIA
								className = "Business";
								
								totalTax = 935.59 * tax;
								price = (935.59 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							
							//========================================================== economy =============================================================================
							else if(economy.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Economy class and select Penang
								className = "Economy";
								
								totalTax = 995.37*tax;
								price = (995.37 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Economy class and select Langkawi,Kedah
								className = "Economy";
								
								totalTax = 1102.73*tax;
								price = (1102.73 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
                            else if(economy.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Economy class and select Kota Kinabalu,Sabah
                            	className = "Economy";
								
								totalTax = 1146*tax;
								price = (1146 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Economy class and select Terengganu
								className = "Economy";
								
								totalTax = 2287.06*tax;
								price = (2287.06 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Economy class and select Kota Bahru,Kelantan
								className = "Economy";
								
								totalTax = 946.36 * tax;
								price = (946.36 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Economy class and select Kuching,Sarawak
								className = "Economy";
								
								totalTax = 995.34*tax;
								price = (995.34 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Economy class and select KLIA
								className = "Economy";
								
								totalTax = 775.59 * tax;
								price = (775.59 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							
							
							if(from.getSelectedItem().equals("Destination")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you come from");
								
							}
							if(To.getSelectedItem().equals("")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you want to go");
							}
							if(buttonGroup.getSelection() == null) {
								JOptionPane.showMessageDialog(null, "You do not select the category");
							}
						    if(buttonGroup_1.getSelection()==null) {
								JOptionPane.showMessageDialog(null, "You do not select the class");
							}
						    if(dateChooser.getDate()==null) {
								JOptionPane.showMessageDialog(null, "You do not select date for you Go");
							}
						    if(timePicker.getTime()==null) {
						    	JOptionPane.showMessageDialog(null, "You do not select the time when you want to go");
						    }
						    if(dateChooser_1.isEnabled()==true) {
								if(dateChooser_1.getDate()==null) {
									JOptionPane.showMessageDialog(null, "You do not select date for you back to Malaysia");
								}
								else {
									//================================================================================== Gate ================================================================================================
		                            labelGate.setText(gate);
									//================================================================================== Seat ================================================================================================
									textSeat.setText(seat);
									//================================================================================== Class Name ===========================================================================================
									textClass.setText(className);
									//================================================================================== Price ===============================================================================================
									textPrice.setText("RM"+format.format(totalFinalOfPrice));
									totalField.setText("RM"+ format.format(totalFinalOfPrice));
									//================================================================================== Calendar =================================================================================================================
									Calendar timer = Calendar.getInstance();
									timer.getTime();
									SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
									textTime.setText(""+timePicker.getTime());
									//================================================================================== Date =================================================================================================================
									SimpleDateFormat Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
									bookingTime.setText("Booking Time : "+Tdate.format(timer.getTime()) + " / " +tTime.format(timer.getTime()));
									
									textFrom.setText("" + from.getSelectedItem());
									textTo.setText( "" + To.getSelectedItem());
									textGoDate.setText(Tdate.format(dateChooser.getDate()));
									textBackDate.setText(Tdate.format(dateChooser_1.getDate()));
									//================================================================================== Random number =================================================================================================================
									int random;
									random = 24 + (int) (Math.random());
									textTicketID.setText(random + "AA");
									
									textRoute.setText("ANY");
								}
						    }
						}
						
					});
					
					
				}
				
				//========================================================= Bali,Indonesia ======================================================
				else if(from.getSelectedItem().equals("Bali,Indonesia")) {
					
					To.removeAllItems();
					To.addItem("Penang");
					To.addItem("Langkawi,Kedah");
					To.addItem("Kota Kinabalu,Sabah");
					To.addItem("Terengganu");
					To.addItem("Kota Bharu,Kelantan");
					To.addItem("Kuching,Sarawak");
					To.addItem("KLIA");
					
					if(oneWay.isSelected()) {
						spinnerDay.setEnabled(false);
						lblDateForBack.setEnabled(false);
						dateChooser_1.setEnabled(false);
					}
					else if(Return.isSelected()) {
						spinnerDay.setEnabled(true);
						lblDateForBack.setEnabled(true);
						dateChooser_1.setEnabled(true);
					}
					
					totalBtn.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String seat = "";
							String className = "";
							String gate = "";
							int totalCategory = 0;
							double totalPrice = 0.00 , totalFinalOfPrice = 0.00;
							double tax = 0.06 ,totalTax;
							double price = 00.0;
							
							if(oneWay.isSelected()) {
								spinnerDay.setValue(1);
							}
							
							DecimalFormat format = new DecimalFormat("#0.00");
							
							//======================================================================== Business ==================================================================
							if(Business.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Business class and select Penang
								className = "Business";
								
								totalTax = 894.51*tax;
								price = (894.51 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Business class and select Langkawi,Kedah
								className = "Business";
								
								totalTax = 1236.71*tax;
								price = (1236.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
                            else if(Business.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Business class and select Kota Kinabalu,Sabah
                            	className = "Business";
								
								totalTax = 803.71*tax;
								price = (803.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Business class and select Terengganu
								className = "Business";
								
								totalTax = 466.68*tax;
								price = (466.68 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Business class and select Kota Bahru,Kelantan
								className = "Business";
								
								totalTax = 552.77 * tax;
								price = (552.77 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Business class and select Kuching,Sarawak
								className = "Business";
								
								totalTax = 1078.18*tax;
								price = (1078.18 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Business class and select KLIA
								className = "Business";
								
								totalTax = 682.62 * tax;
								price = (682.62 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							
							//========================================================== economy =============================================================================
							else if(economy.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Economy class and select Penang
								className = "Economy";
								
								totalTax = 867.6*tax;
								price = (867.6 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Economy class and select Langkawi,Kedah
								className = "Economy";
								
								totalTax = 896.91*tax;
								price = (896.91 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
                            else if(economy.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Economy class and select Kota Kinabalu,Sabah
                            	className = "Economy";
								
								totalTax = 1014.32*tax;
								price = (1014.32 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Economy class and select Terengganu
								className = "Economy";
								
								totalTax = 867.6*tax;
								price = (867.6 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Economy class and select Kota Bahru,Kelantan
								className = "Economy";
								
								totalTax = 887.15 * tax;
								price = (887.15 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Economy class and select Kuching,Sarawak
								className = "Economy";
								
								totalTax = 936.13*tax;
								price = (936.13 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Economy class and select KLIA
								className = "Economy";
								
								totalTax = 718.38 * tax;
								price = (718.38 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							
							if(from.getSelectedItem().equals("Destination")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you come from");
								
							}
							if(To.getSelectedItem().equals("")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you want to go");
							}
							if(buttonGroup.getSelection() == null) {
								JOptionPane.showMessageDialog(null, "You do not select the category");
							}
						    if(buttonGroup_1.getSelection()==null) {
								JOptionPane.showMessageDialog(null, "You do not select the class");
							}
						    if(dateChooser.getDate()==null) {
								JOptionPane.showMessageDialog(null, "You do not select date for you Go");
							}
						    if(timePicker.getTime()==null) {
						    	JOptionPane.showMessageDialog(null, "You do not select the time when you want to go");
						    }
						    if(dateChooser_1.isEnabled()==true) {
								if(dateChooser_1.getDate()==null) {
									JOptionPane.showMessageDialog(null, "You do not select date for you back to Malaysia");
								}
								else {
									//================================================================================== Gate ================================================================================================
		                            labelGate.setText(gate);
									//================================================================================== Seat ================================================================================================
									textSeat.setText(seat);
									//================================================================================== Class Name ===========================================================================================
									textClass.setText(className);
									//================================================================================== Price ===============================================================================================
									textPrice.setText("RM"+format.format(totalFinalOfPrice));
									totalField.setText("RM"+ format.format(totalFinalOfPrice));
									//================================================================================== Calendar =================================================================================================================
									Calendar timer = Calendar.getInstance();
									timer.getTime();
									SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
									textTime.setText(""+timePicker.getTime());
									//================================================================================== Date =================================================================================================================
									SimpleDateFormat Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
									bookingTime.setText("Booking Time : "+Tdate.format(timer.getTime()) + " / " +tTime.format(timer.getTime()));
									
									textFrom.setText("" + from.getSelectedItem());
									textTo.setText( "" + To.getSelectedItem());
									textGoDate.setText(Tdate.format(dateChooser.getDate()));
									textBackDate.setText(Tdate.format(dateChooser_1.getDate()));
									//================================================================================== Random number =================================================================================================================
									int random;
									random = 24 + (int) (Math.random());
									textTicketID.setText(random + "AA");
									
									textRoute.setText("ANY");
								}
						    }
						}
						
					});
					
					
				}
				
				//========================================================= Tokyo,Japan ======================================================
				else if(from.getSelectedItem().equals("Tokyo,Japan")) {
					
					To.removeAllItems();
					To.addItem("Penang");
					To.addItem("Langkawi,Kedah");
					To.addItem("Kota Kinabalu,Sabah");
					To.addItem("Terengganu");
					To.addItem("Kota Bharu,Kelantan");
					To.addItem("Kuching,Sarawak");
					To.addItem("KLIA");
					
					if(oneWay.isSelected()) {
						spinnerDay.setEnabled(false);
						lblDateForBack.setEnabled(false);
						dateChooser_1.setEnabled(false);
					}
					else if(Return.isSelected()) {
						spinnerDay.setEnabled(true);
						lblDateForBack.setEnabled(true);
						dateChooser_1.setEnabled(true);
					}
					
					totalBtn.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							
							String className = "";
							String seat = "";
							String gate = "";
							
							int totalCategory = 0;
							double totalPrice = 0.00 , totalFinalOfPrice = 0.00;
							double tax = 0.06 ,totalTax;
							double price = 00.0;
							
							if(oneWay.isSelected()) {
								spinnerDay.setValue(1);
							}
							
							DecimalFormat format = new DecimalFormat("#0.00");
							
							//======================================================================== Business ==================================================================
							if(Business.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Business class and select Penang
								className = "Business";
								
								totalTax = 894.51*tax;
								price = (894.51 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Business class and select Langkawi,Kedah
								className = "Business";
								
								totalTax = 1236.71*tax;
								price = (1236.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
                            else if(Business.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Business class and select Kota Kinabalu,Sabah
                            	className = "Business";
								
								totalTax = 803.71*tax;
								price = (803.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;

								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Business class and select Terengganu
								className = "Business";
								
								totalTax = 466.68*tax;
								price = (466.68 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Business class and select Kota Bahru,Kelantan
								className = "Business";
								
								totalTax = 552.77 * tax;
								price = (552.77 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Business class and select Kuching,Sarawak
								className = "Business";
								
								totalTax = 1078.18*tax;
								price = (1078.18 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Business class and select KLIA
								className = "Business";
								
								totalTax = 682.62 * tax;
								price = (682.62 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							
							//========================================================== economy =============================================================================
							else if(economy.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Economy class and select Penang
								className = "Economy";
								
								totalTax = 4876.64*tax;
								price = (4876.64 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Economy class and select Langkawi,Kedah
								className = "Economy";
								
								totalTax = 1827.98*tax;
								price = (1827.98 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
                            else if(economy.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Economy class and select Kota Kinabalu,Sabah
                            	className = "Economy";
								
								totalTax = 1568.77*tax;
								price = (1568.77 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Economy class and select Terengganu
								className = "Economy";
								
								totalTax = 2625.07*tax;
								price = (2625.07 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Economy class and select Kota Bahru,Kelantan
								className = "Economy";
								
								totalTax = 2981.10 * tax;
								price = (2981.10 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Economy class and select Kuching,Sarawak
								className = "Economy";
								
								totalTax = 4910.05*tax;
								price = (4910.05 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Economy class and select KLIA
								className = "Economy";
								
								totalTax = 3841.95 * tax;
								price = (3841.95 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							
							if(from.getSelectedItem().equals("Destination")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you come from");
								
							}
							if(To.getSelectedItem().equals("")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you want to go");
							}
							if(buttonGroup.getSelection() == null) {
								JOptionPane.showMessageDialog(null, "You do not select the category");
							}
						    if(buttonGroup_1.getSelection()==null) {
								JOptionPane.showMessageDialog(null, "You do not select the class");
							}
						    if(dateChooser.getDate()==null) {
								JOptionPane.showMessageDialog(null, "You do not select date for you Go");
							}
						    if(timePicker.getTime()==null) {
						    	JOptionPane.showMessageDialog(null, "You do not select the time when you want to go");
						    }
						    if(dateChooser_1.isEnabled()==true) {
								if(dateChooser_1.getDate()==null) {
									JOptionPane.showMessageDialog(null, "You do not select date for you back to Malaysia");
								}
								else {
									//================================================================================== Gate ================================================================================================
		                            labelGate.setText(gate);
									//================================================================================== Seat ================================================================================================
									textSeat.setText(seat);
									//================================================================================== Class Name ===========================================================================================
									textClass.setText(className);
									//================================================================================== Price ===============================================================================================
									textPrice.setText("RM"+format.format(totalFinalOfPrice));
									totalField.setText("RM"+ format.format(totalFinalOfPrice));
									//================================================================================== Calendar =================================================================================================================
									Calendar timer = Calendar.getInstance();
									timer.getTime();
									SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
									textTime.setText(""+timePicker.getTime());
									//================================================================================== Date =================================================================================================================
									SimpleDateFormat Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
									bookingTime.setText("Booking Time : "+Tdate.format(timer.getTime()) + " / " +tTime.format(timer.getTime()));
									
									textFrom.setText("" + from.getSelectedItem());
									textTo.setText( "" + To.getSelectedItem());
									textGoDate.setText(Tdate.format(dateChooser.getDate()));
									textBackDate.setText(Tdate.format(dateChooser_1.getDate()));
									//================================================================================== Random number =================================================================================================================
									int random;
									random = 24 + (int) (Math.random());
									textTicketID.setText(random + "AA");
									
									textRoute.setText("ANY");
								}
						    }
						}
						
					});
					
					
				}
				
				
				//========================================================= Guangzhou,China ======================================================
				else if(from.getSelectedItem().equals("Guangzhou,China")) {
					
					To.removeAllItems();
					To.addItem("Penang");
					To.addItem("Langkawi,Kedah");
					To.addItem("Kota Kinabalu,Sabah");
					To.addItem("Terengganu");
					To.addItem("Kota Bharu,Kelantan");
					To.addItem("Kuching,Sarawak");
					To.addItem("KLIA");
					
					if(oneWay.isSelected()) {
						spinnerDay.setEnabled(false);
						lblDateForBack.setEnabled(false);
						dateChooser_1.setEnabled(false);
					}
					else if(Return.isSelected()) {
						spinnerDay.setEnabled(true);
						lblDateForBack.setEnabled(true);
						dateChooser_1.setEnabled(true);
					}
					
					totalBtn.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String seat = "";
							String className = "";
							String gate ="";
							int totalCategory = 0;
							double totalPrice = 0.00 , totalFinalOfPrice = 0.00;
							double tax = 0.06 ,totalTax;
							double price = 00.0;
							
							if(oneWay.isSelected()) {
								spinnerDay.setValue(1);
							}
							
							DecimalFormat format = new DecimalFormat("#0.00");
							
							if(Business.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Business class and select Penang
								
								className = "Business";
								
								totalTax = 894.51*tax;
								price = (894.51 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
								
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Business class and select Langkawi,Kedah
								className = "Business";
								
								totalTax = 1236.71*tax;
								price = (1236.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
                            else if(Business.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Business class and select Kota Kinabalu,Sabah
                            	className = "Business";
								
								totalTax = 803.71*tax;
								price = (803.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Business class and select Terengganu
								className = "Business";
								
								totalTax = 466.68*tax;
								price = (466.68 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Business class and select Kota Bahru,Kelantan
								className = "Business";
								
								totalTax = 552.77 * tax;
								price = (552.77 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Business class and select Kuching,Sarawak
								className = "Business";
								
								totalTax = 1078.18*tax;
								price = (1078.18 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							else if(Business.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Business class and select KLIA
								className = "Business";
								
								totalTax = 682.62 * tax;
								price = (682.62 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "BS17";
								gate = "B2";
							}
							
							//========================================================== economy / adult / oneWay =============================================================================
							else if(economy.isSelected() && To.getSelectedItem().equals("Penang")) { //Action if user select Economy class and select Penang
								className = "Economy";
								
								totalTax = 734.51*tax;
								price = (734.51 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Langkawi,Kedah")) { //Action if user select Economy class and select Langkawi,Kedah
								className = "Economy";
								
								totalTax = 1076.71*tax;
								price = (1076.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
                            else if(economy.isSelected() && To.getSelectedItem().equals("Kota Kinabalu,Sabah")) { //Action if user select Economy class and select Kota Kinabalu,Sabah
                            	className = "Economy";
								
								totalTax = 643.71*tax;
								price = (643.71 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Terengganu")) { //Action if user select Economy class and select Terengganu
								className = "Economy";
								
								totalTax = 306.68*tax;
								price = (306.68 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kota Bahru,Kelantan")) { //Action if user select Economy class and select Kota Bahru,Kelantan
								className = "Economy";
								
								totalTax = 392.77 * tax;
								price = (392.77 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("Kuching,Sarawak")) { //Action if user select Economy class and select Kuching,Sarawak
								className = "Economy";
								
								totalTax = 918.18*tax;
								price = (918.18 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							else if(economy.isSelected() && To.getSelectedItem().equals("KLIA")) { //Action if user select Economy class and select KLIA
								className = "Economy";
								
								totalTax = 522.62 * tax;
								price = (522.62 * day) + totalTax;
									
								if(oneWay.isSelected()) {//Action if user select one Way for the single way
									textWay.setText("One Way");
									totalPrice = price;
								}
								else if(Return.isSelected()) {//Action if user select Return for the Two Way
									textWay.setText("Return");
									totalPrice = price * 2;
								}
								
								totalCategory = num1 + num2;
								
								totalFinalOfPrice = totalPrice * totalCategory;
								
								seat = "EC25";
								gate = "E3";
							}
							
							if(from.getSelectedItem().equals("Destination")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you come from");
								
							}
							if(To.getSelectedItem().equals("")) {
								JOptionPane.showMessageDialog(null, "You do not select the destination you want to go");
							}
							if(buttonGroup.getSelection() == null) {
								JOptionPane.showMessageDialog(null, "You do not select the category");
							}
						    if(buttonGroup_1.getSelection()==null) {
								JOptionPane.showMessageDialog(null, "You do not select the class");
							}
						    if(dateChooser.getDate()==null) {
								JOptionPane.showMessageDialog(null, "You do not select date for you Go");
							}
						    if(timePicker.getTime()==null) {
						    	JOptionPane.showMessageDialog(null, "You do not select the time when you want to go");
						    }
						    if(dateChooser_1.isEnabled()==true) {
								if(dateChooser_1.getDate()==null) {
									JOptionPane.showMessageDialog(null, "You do not select date for you back to Malaysia");
								}
								else {
									//================================================================================== Gate ================================================================================================
		                            labelGate.setText(gate);
									//================================================================================== Seat ================================================================================================
									textSeat.setText(seat);
									//================================================================================== Class Name ===========================================================================================
									textClass.setText(className);
									//================================================================================== Price ===============================================================================================
									textPrice.setText("RM"+format.format(totalFinalOfPrice));
									totalField.setText("RM"+ format.format(totalFinalOfPrice));
									//================================================================================== Calendar =================================================================================================================
									Calendar timer = Calendar.getInstance();
									timer.getTime();
									SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
									textTime.setText(""+timePicker.getTime());
									//================================================================================== Date =================================================================================================================
									SimpleDateFormat Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
									bookingTime.setText("Booking Time : "+Tdate.format(timer.getTime()) + " / " +tTime.format(timer.getTime()));
									
									textFrom.setText("" + from.getSelectedItem());
									textTo.setText( "" + To.getSelectedItem());
									textGoDate.setText(Tdate.format(dateChooser.getDate()));
									textBackDate.setText(Tdate.format(dateChooser_1.getDate()));
									//================================================================================== Random number =================================================================================================================
									int random;
									random = 24 + (int) (Math.random());
									textTicketID.setText(random + "AA");
									
									textRoute.setText("ANY");
								}
							
								
							}
						}
						
					});
					
					
				}
				
				
			}
		});
		
		//ActionListener for Reset Button
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Business.setSelected(false);
					economy.setSelected(false);
					spinnerAdult.setValue(1);
					spinnerChild.setValue(0);
					spinnerDay.setValue(1);
					Business.setSelected(false);
					economy.setSelected(true);
					oneWay.setSelected(true);
					Return.setSelected(false);
					timePicker.setText("");
					dateChooser.setDate(null);
					dateChooser_1.setDate(null);
					from.setSelectedItem("Destination");
					To.setSelectedItem(null);
					
					totalField.setText("");
					textRoute.setText("");
					textClass.setText("");
					textFrom.setText("");
					textTo.setText("");
					textPrice.setText("");
					textTime.setText("");
					textGoDate.setText("");
					textBackDate.setText("");
					textSeat.setText("");
					textWay.setText("");
					textTicketID.setText("");
					bookingTime.setText("Booking time :");
					labelGate.setText("");
					labelName.setText("");
					
				
			}
		});
		
	}
	
	//Mutator method with parameter
	public void name(String name) {
		
		labelName.setText(name);
		
		//ActionListener for Ticket Button
		ticketBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Display ticket frame
				ticket display = new ticket();
				display.setVisible(true);
				display.setLocationRelativeTo(null);
				dispose();
				
				//Declaration all attributes for ticket frame
				String name = labelName.getText();
			    String Time = textTime.getText();
				String gate = labelGate.getText();
				String ticketID = textTicketID.getText();
				String flight = "TGG321";
				String From = textFrom.getText();
				String to = textTo.getText();
				String seat = textSeat.getText();
				String className = textClass.getText();
				
				//Input data for ticket frame
				display.display_ticket(name,gate,seat,Time,flight,From,to,className,ticketID);
				
				}
		});
		
	}
}
