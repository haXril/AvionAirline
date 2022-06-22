import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ticket extends JFrame {

	private JPanel contentPane;
	private JLabel labelName,labelClass1,labelClass2,labelClass3,labelGate,labelGate2,labelSeat,labelSeat2,labelTime,labelTime2,labelFlight,labelFlight2,labelFrom,labelFrom2,labelTo,labelTo2,labelTicketId;
	private JButton payBtn;
	
	//Constructor Method without parameter 
	public ticket() {
		setTitle("AVION AIRLINE");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\8-removebg-preview (2).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1191, 765);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new LineBorder(Color.BLACK, 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(68, 162, 1032, 434);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(34, 52, 960, 320);
		panel.add(panel_1);
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBackground(new Color(255, 204, 204));
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.BLACK));
		panel_2.setBackground(new Color(255, 204, 102));
		panel_2.setBounds(661, 0, 299, 320);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel logo2 = new JLabel("");
		logo2.setBackground(new Color(255, 102, 255));
		logo2.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\3.2-removebg-preview.png"));
		logo2.setBounds(87, 11, 144, 81);
		panel_2.add(logo2);
		
		JLabel labelAvion2 = new JLabel("AVION AIRLINE");
		labelAvion2.setHorizontalAlignment(SwingConstants.CENTER);
		labelAvion2.setFont(new Font("Snap ITC", Font.BOLD, 25));
		labelAvion2.setBounds(10, 87, 279, 33);
		panel_2.add(labelAvion2);
		
		JLabel lblNewLabel_1_1 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1.setFont(new Font("Stencil", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(10, 117, 279, 14);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("gate :");
		lblNewLabel_6_1_1.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblNewLabel_6_1_1.setBounds(10, 183, 46, 14);
		panel_2.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("seat :");
		lblNewLabel_6_1_2.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblNewLabel_6_1_2.setBounds(10, 200, 46, 22);
		panel_2.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("time :");
		lblNewLabel_6_1_3.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblNewLabel_6_1_3.setBounds(10, 227, 46, 14);
		panel_2.add(lblNewLabel_6_1_3);
		
		JLabel lblNewLabel_6_1_4 = new JLabel("flight :");
		lblNewLabel_6_1_4.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblNewLabel_6_1_4.setBounds(130, 183, 54, 14);
		panel_2.add(lblNewLabel_6_1_4);
		
		JLabel lblNewLabel_6_1_5 = new JLabel("from :");
		lblNewLabel_6_1_5.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblNewLabel_6_1_5.setBounds(130, 200, 46, 22);
		panel_2.add(lblNewLabel_6_1_5);
		
		JLabel lblNewLabel_6_1_6 = new JLabel("to :");
		lblNewLabel_6_1_6.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblNewLabel_6_1_6.setBounds(130, 227, 46, 14);
		panel_2.add(lblNewLabel_6_1_6);
		
		labelClass3 = new JLabel("");
		labelClass3.setHorizontalAlignment(SwingConstants.LEFT);
		labelClass3.setFont(new Font("Stencil", Font.PLAIN, 17));
		labelClass3.setBounds(160, 125, 129, 47);
		panel_2.add(labelClass3);
		
		labelGate2 = new JLabel("");
		labelGate2.setFont(new Font("Arial", Font.PLAIN, 13));
		labelGate2.setBounds(51, 182, 46, 14);
		panel_2.add(labelGate2);
		
		labelSeat2 = new JLabel("");
		labelSeat2.setFont(new Font("Arial", Font.PLAIN, 13));
		labelSeat2.setBounds(51, 203, 79, 14);
		panel_2.add(labelSeat2);
		
		labelTime2 = new JLabel("");
		labelTime2.setFont(new Font("Arial", Font.PLAIN, 13));
		labelTime2.setBounds(51, 226, 46, 14);
		panel_2.add(labelTime2);
		
		labelFlight2 = new JLabel("");
		labelFlight2.setFont(new Font("Arial", Font.PLAIN, 13));
		labelFlight2.setBounds(186, 182, 103, 14);
		panel_2.add(labelFlight2);
		
		labelFrom2 = new JLabel("");
		labelFrom2.setFont(new Font("Arial", Font.PLAIN, 13));
		labelFrom2.setBounds(186, 203, 103, 14);
		panel_2.add(labelFrom2);
		
		labelTo2 = new JLabel("");
		labelTo2.setFont(new Font("Arial", Font.PLAIN, 13));
		labelTo2.setBounds(155, 226, 144, 14);
		panel_2.add(labelTo2);
		
		JLabel barcode2 = new JLabel("");
		barcode2.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\image-removebg-preview (3).png"));
		barcode2.setBounds(10, 267, 262, 42);
		panel_2.add(barcode2);
		
		JLabel label_1 = new JLabel("|");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(141, 120, 11, 52);
		panel_2.add(label_1);
		
		JLabel lblNewLabel_6_1_7_1 = new JLabel("Boarding pass");
		lblNewLabel_6_1_7_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6_1_7_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel_6_1_7_1.setBounds(10, 125, 120, 47);
		panel_2.add(lblNewLabel_6_1_7_1);
		
		JLabel logo1 = new JLabel("");
		logo1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\8-removebg-preview (4).png"));
		logo1.setBounds(27, 11, 70, 58);
		panel_1.add(logo1);
		
		JLabel lblNewLabel_1 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 13));
		lblNewLabel_1.setBounds(27, 67, 608, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel labelAvion1 = new JLabel("AVION AIRLINE");
		labelAvion1.setFont(new Font("Snap ITC", Font.BOLD, 25));
		labelAvion1.setBounds(107, 23, 256, 33);
		panel_1.add(labelAvion1);
		
		JLabel label = new JLabel("|");
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label.setBounds(506, 11, 11, 52);
		panel_1.add(label);
		
		labelClass1 = new JLabel("");
		labelClass1.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelClass1.setBounds(527, 23, 108, 33);
		panel_1.add(labelClass1);
		
		labelTicketId = new JLabel("");
		labelTicketId.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelTicketId.setBounds(453, 23, 46, 33);
		panel_1.add(labelTicketId);
		
		JLabel lblNewLabel_6 = new JLabel("Booker Name :");
		lblNewLabel_6.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(37, 92, 141, 16);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("gate :");
		lblNewLabel_6_1.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_6_1.setBounds(37, 161, 46, 14);
		panel_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("seat :");
		lblNewLabel_6_2.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_6_2.setBounds(37, 180, 46, 63);
		panel_1.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("time :");
		lblNewLabel_6_3.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_6_3.setBounds(37, 247, 46, 14);
		panel_1.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("flight :");
		lblNewLabel_6_4.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_6_4.setBounds(312, 143, 57, 14);
		panel_1.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_5 = new JLabel("from :");
		lblNewLabel_6_5.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_6_5.setBounds(312, 180, 46, 14);
		panel_1.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_6_6 = new JLabel("to :");
		lblNewLabel_6_6.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_6_6.setBounds(312, 213, 28, 14);
		panel_1.add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_6_7 = new JLabel("Class :");
		lblNewLabel_6_7.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_6_7.setBounds(312, 247, 46, 14);
		panel_1.add(lblNewLabel_6_7);
		
		labelGate = new JLabel("");
		labelGate.setFont(new Font("Arial", Font.PLAIN, 13));
		labelGate.setBounds(83, 160, 173, 14);
		panel_1.add(labelGate);
		
		labelSeat = new JLabel("");
		labelSeat.setFont(new Font("Arial", Font.PLAIN, 13));
		labelSeat.setBounds(83, 203, 219, 14);
		panel_1.add(labelSeat);
		
		labelTime = new JLabel("");
		labelTime.setFont(new Font("Arial", Font.PLAIN, 13));
		labelTime.setBounds(83, 246, 173, 14);
		panel_1.add(labelTime);
		
		labelFlight = new JLabel("");
		labelFlight.setFont(new Font("Arial", Font.PLAIN, 13));
		labelFlight.setBounds(379, 142, 171, 14);
		panel_1.add(labelFlight);
		
		labelFrom = new JLabel("");
		labelFrom.setFont(new Font("Arial", Font.PLAIN, 13));
		labelFrom.setBounds(379, 179, 171, 14);
		panel_1.add(labelFrom);
		
		labelTo = new JLabel("");
		labelTo.setFont(new Font("Arial", Font.PLAIN, 13));
		labelTo.setBounds(377, 212, 173, 14);
		panel_1.add(labelTo);
		
		labelClass2 = new JLabel("");
		labelClass2.setFont(new Font("Arial", Font.PLAIN, 13));
		labelClass2.setBounds(378, 246, 173, 14);
		panel_1.add(labelClass2);
		
		JLabel barcode1 = new JLabel("");
		barcode1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\image-removebg-preview (5).png"));
		barcode1.setBounds(561, 92, 86, 193);
		panel_1.add(barcode1);
		
		labelName = new JLabel("");
		labelName.setFont(new Font("Arial", Font.BOLD, 14));
		labelName.setBounds(166, 83, 363, 25);
		panel_1.add(labelName);
		
		JLabel lblNewLabel_2 = new JLabel("kamal\nkamal");
		lblNewLabel_2.setBounds(210, 271, 92, 38);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("YOUR TICKET");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 40));
		lblNewLabel.setBounds(484, 71, 266, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1_1.setFont(new Font("Stencil", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(431, 113, 366, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
	    payBtn = new JButton("RECIEPT");
		payBtn.setBackground(Color.LIGHT_GRAY);
		payBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		payBtn.setBounds(1011, 632, 89, 40);
		contentPane.add(payBtn);
		
		JButton cancelBtn = new JButton("CANCEL");
		cancelBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		cancelBtn.setBackground(Color.LIGHT_GRAY);
		cancelBtn.setBounds(68, 632, 89, 40);
		contentPane.add(cancelBtn);
		
		
        //ActionListener for cancel Button
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//display booking frame
				booking bk = new booking();
				bk.setVisible(true);
				bk.setLocationRelativeTo(null);
				dispose();
				
			}
		});
		
	}
	
	//Mutator Method for all attributes 
	public void display_ticket( String name1, String gate, String seat, String Time, String flight, String From, String to, String className,  String ticketID , double price, double flightPrice, int adultPrice, int childPrice, int adultQuantity, int childQuantity) {
	
				labelClass1.setText(className);
				labelClass2.setText(className);
				labelClass3.setText(className);
				labelGate.setText(gate);
				labelGate2.setText(gate);
				labelSeat.setText(seat);
				labelSeat2.setText(seat);
				labelTime.setText(""+Time);
				labelTime2.setText(""+Time);
				labelFlight.setText(flight);
				labelFlight2.setText(flight);
				labelTicketId.setText(ticketID);
				labelFrom.setText(From);
				labelFrom2.setText(From);
				labelTo.setText(to);
				labelTo2.setText(to);
				labelName.setText(name1);
				
				
				payBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						reciept r = new reciept();
						r.setVisible(true);
						r.setLocationRelativeTo(null);
						dispose();
						
						String name2 = name1;
						String gate2 = gate;
						String seat2 = seat;
						String Time2 = Time;
						String flight2 = flight;
						String From2 = From;
						String to2 = to;
						String className2 = className;
						String ticketID2 = ticketID;
						double price2 = price;
						double price3 = flightPrice;
						int adult = adultPrice;
						int child = childPrice;
						int ad = adultQuantity;
						int ch = childQuantity;
						
						r.data(name2,  gate2,  seat2,  Time2,  flight2,  From2,  to2,  className2,   ticketID2 ,  price2, price3, adult, child, ad, ch);
						
						/*
						if(JOptionPane.showConfirmDialog(null, "Confirm if you want to exit ", "Customer Booking Systems",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
							
							
						}*/
						
					}
				});
	}
}
