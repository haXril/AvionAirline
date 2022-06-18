import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class register extends JFrame {

	private JPanel frame;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField usernameField;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;
	
	public register() {
		setTitle("AVION AIRLINE");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\8-removebg-preview (2).png"));
		setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 633);
		frame = new JPanel();
		frame.setBackground(new Color(255, 204, 153));
		frame.setBorder(new LineBorder(Color.BLACK, 4));
		setContentPane(frame);
		frame.setLayout(null);
		
		firstNameField = new JTextField();
		firstNameField.setBounds(180, 159, 351, 32);
		frame.add(firstNameField);
		firstNameField.setColumns(10);
		
		JLabel firstnameLabel = new JLabel("First Name :\r\n");
		firstnameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		firstnameLabel.setBounds(46, 163, 98, 23);
		frame.add(firstnameLabel);
		
		lastNameField = new JTextField();
		lastNameField.setBounds(180, 207, 351, 32);
		frame.add(lastNameField);
		lastNameField.setColumns(10);
		
		JLabel lastnameLabel = new JLabel("Last Name :\r\n");
		lastnameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lastnameLabel.setBounds(46, 211, 98, 23);
		frame.add(lastnameLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(180, 260, 224, 32);
		frame.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("*");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(121, 268, 14, 14);
		frame.add(lblNewLabel);
		
		JLabel usernameLabel = new JLabel("Username :\r\n");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		usernameLabel.setBounds(46, 264, 98, 23);
		frame.add(usernameLabel);
		
		JLabel passLabel1 = new JLabel("Password :\r\n");
		passLabel1.setFont(new Font("Tahoma", Font.BOLD, 13));
		passLabel1.setBounds(46, 307, 98, 23);
		frame.add(passLabel1);
		
		JLabel passLabel2 = new JLabel("Confirm Password :\r\n");
		passLabel2.setFont(new Font("Tahoma", Font.BOLD, 13));
		passLabel2.setBounds(46, 350, 135, 23);
		frame.add(passLabel2);
		
		JLabel msgLabel = new JLabel("Please make sure your both password is same!!!");
		msgLabel.setForeground(Color.RED);
		msgLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		msgLabel.setBounds(180, 389, 274, 14);
		frame.add(msgLabel);
		
		JButton registerBtn = new JButton("Register\r\n");
		registerBtn.setForeground(Color.WHITE);
		registerBtn.setBackground(Color.BLACK);
		registerBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		registerBtn.setFocusable(false);
		registerBtn.setBounds(235, 486, 106, 32);
		frame.add(registerBtn);
		
		JButton resetBtn = new JButton("Reset");
		resetBtn.setForeground(Color.WHITE);
		resetBtn.setBackground(Color.BLACK);
		resetBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		resetBtn.setFocusable(false);
		resetBtn.setBounds(425, 486, 106, 32);
		frame.add(resetBtn);
		
		passwordField1 = new JPasswordField();
		passwordField1.setBounds(180, 303, 224, 32);
		frame.add(passwordField1);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBounds(180, 346, 224, 32);
		frame.add(passwordField2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(204, 102, 0), 3));
		panel.setBackground(new Color(255, 204, 51));
		panel.setBounds(46, 72, 485, 63);
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel signUpLabel = new JLabel("Register");
		signUpLabel.setBounds(10, 8, 465, 44);
		panel.add(signUpLabel);
		signUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		signUpLabel.setFont(new Font("Snap ITC", Font.BOLD, 35));
		
		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setBounds(121, 311, 14, 14);
		frame.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("*");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBackground(Color.ORANGE);
		lblNewLabel_2.setBounds(167, 346, 14, 14);
		frame.add(lblNewLabel_2);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel.setBackground(Color.BLACK);
		btnCancel.setFocusable(false);
		btnCancel.setBounds(46, 486, 106, 32);
		frame.add(btnCancel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show password");
		chckbxNewCheckBox.setBackground(new Color(255, 204, 153));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(180, 412, 224, 23);
		frame.add(chckbxNewCheckBox);
		
		//Action for Register Button
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String pass1 = new String(passwordField1.getPassword());
				String pass2 = new String(passwordField2.getPassword());
			
				if(e.getSource()==registerBtn) {
					
					switch(username) {
					case "":
						JOptionPane.showMessageDialog(null, "Please fill up the places that have symbol '*'");
						break;
					default:
						switch(pass1) {
						case "":
							JOptionPane.showMessageDialog(null, "Please fill up the places that have symbol '*'");
							break;
						default:
							switch(pass2) {
							case "":
								JOptionPane.showMessageDialog(null, "Please fill up the places that have symbol '*'");
								break;
							default:
									JOptionPane.showMessageDialog(null, "Your Register is successful!!!");
									log_in lg = new log_in();
									lg.setVisible(true);
									lg.setLocationRelativeTo(null);
									dispose();
									
									String name = firstNameField.getText() + " " + lastNameField.getText();
									
									String userName = usernameField.getText();
									String password = pass1;
									lg.confirmUsername(userName,password,name);
								    break;
							}
						}
				}
			}
			
			}
		});
		
		//Action for Reset Button
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent r) {
				if(r.getSource()==resetBtn) {
					firstNameField.setText("");
					lastNameField.setText("");
					usernameField.setText("");
					passwordField1.setText("");
					passwordField2.setText("");
				}
			}
			
		});
		
		//Action for Cancel Button
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnCancel) {
					System.exit(0);
				}
			}
		});
		
		//Action for Show PAssword CheckBox 
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==chckbxNewCheckBox) {
					if(chckbxNewCheckBox.isSelected()) {
						passwordField1.setEchoChar((char) 0);
						passwordField2.setEchoChar((char) 0);
					}
					else {
						passwordField1.setEchoChar('*');
						passwordField2.setEchoChar('*');
					}
			}
			}
		});
	}
}
