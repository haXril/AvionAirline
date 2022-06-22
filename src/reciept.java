package com.nt.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class reciept extends JFrame {

	private JPanel contentPane;
	private JButton payBtn;
	private JTextArea textArea;
	private JLabel balanceLabel;
	private JLabel lblDebitCardOnly;
	
	public reciept() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Pictures\\8-removebg-preview (4).png"));
		setTitle("AVION AIRLINE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 755);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new LineBorder(Color.BLACK, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		panel.setBorder(new TitledBorder(null, "RECIEPT", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 571, 608);
		contentPane.add(panel);
		panel.setLayout(null);
		
	    textArea = new JTextArea();
		textArea.setBounds(15, 17, 546, 580);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("PRINT");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(10, 670, 143, 35);
		btnNewButton.setFocusable(false);
		contentPane.add(btnNewButton);
		
	    payBtn = new JButton("PAY");
	    payBtn.setForeground(Color.WHITE);
	    payBtn.setBackground(Color.BLACK);
	    payBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
	    payBtn.setBounds(219, 670, 143, 35);
	    payBtn.setFocusable(false);
		contentPane.add(payBtn);
		
		JButton finishBtn = new JButton("FINISH");
		finishBtn.setForeground(Color.WHITE);
		finishBtn.setBackground(Color.BLACK);
		finishBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		finishBtn.setBounds(438, 670, 143, 35);
		contentPane.add(finishBtn);
		
		balanceLabel = new JLabel("");
		balanceLabel.setForeground(Color.RED);
		balanceLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		balanceLabel.setBounds(151, 624, 287, 21);
		contentPane.add(balanceLabel);
		
		lblDebitCardOnly = new JLabel("Debit Card only");
		lblDebitCardOnly.setHorizontalAlignment(SwingConstants.CENTER);
		lblDebitCardOnly.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDebitCardOnly.setBounds(145, 649, 293, 14);
		contentPane.add(lblDebitCardOnly);

		
		finishBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					textArea.print();
				}
				catch(Exception e1)
				{
					
				}
			
			}
		});
		
		
	}
	
	public void data(String name2, String gate2, String seat2, String Time2, String flight2, String From2, String to2, String className2,  String ticketID2 , double price2, double price3, int adult, int child, int ad, int ch) {
		
	
				
				DecimalFormat format = new DecimalFormat("#0.00");
				
				textArea.setText("\t\t       AVION AIRLINE\n");
				textArea.setText(textArea.getText()+"\t\t2,4 , JALAN SENTRAL 5 ,\n");
				textArea.setText(textArea.getText()+"\t\tKUALA LUMPUR SENTRAL ,\n");
				textArea.setText(textArea.getText()+"\t50470, KUALA LUMPUR WILAYAH PERSEKUTUAN\n");
				textArea.setText(textArea.getText()+"\n");
				
				textArea.setText(textArea.getText()+"===================================================================\n"); 
				textArea.setText(textArea.getText()+"\n");
				textArea.setText(textArea.getText()+"BOOKER DETAILS\t\t\t\t   PRICE\n");
				textArea.setText(textArea.getText()+"\n");
				textArea.setText(textArea.getText()+"===================================================================\n"); 
				
				textArea.setText(textArea.getText()+"\n");
				textArea.setText(textArea.getText()+"Name : " + name2 + "\n");
				textArea.setText(textArea.getText()+"From : "+From2 +"\n");
				textArea.setText(textArea.getText()+"To : "+to2 +"\n");
				textArea.setText(textArea.getText()+"\n");
				
				textArea.setText(textArea.getText()+"Price for your destination = RM "+format.format(price3)+"\n");
				textArea.setText(textArea.getText()+"\n");
				
				textArea.setText(textArea.getText()+"===================================================================\n");
				textArea.setText(textArea.getText()+"\t                  INFO -- Adult = RM170 , Child = RM70 \n");
				textArea.setText(textArea.getText()+"===================================================================\n");
				textArea.setText(textArea.getText()+"\n");
				
				textArea.setText(textArea.getText()+"The customer has book for " +ad +  " -adult and "+ ch + " -children.\n");
				textArea.setText(textArea.getText()+"\n");
				
				textArea.setText(textArea.getText()+"Adult price = RM" +adult+"\n");
				textArea.setText(textArea.getText()+"Child price = RM" +child+"\n");
				textArea.setText(textArea.getText()+"\n");
				
				textArea.setText(textArea.getText()+"Tax = 6% from your total price\n");
				textArea.setText(textArea.getText()+"\n");
				
				textArea.setText(textArea.getText()+"===================================================================\n");
				textArea.setText(textArea.getText()+"Total price   \t\t\t\t\tRM" +price2+"\n");
				textArea.setText(textArea.getText()+"===================================================================\n");
				
				 payBtn.addActionListener(new ActionListener() {
				    	public void actionPerformed(ActionEvent e) {
				    		
				    		String price = JOptionPane.showInputDialog(null,"Enter the ammount :");
				    		String IdDebitCard = JOptionPane.showInputDialog(null,"ID Card :");
				    		String name = JOptionPane.showInputDialog(null,"Name :");
				    		
				    		int ID = Integer.parseInt(IdDebitCard);
				    		double p = Double.parseDouble(price);
				    		String n = name;
				    		
				    		
				    		if(p < price2) {
				    			JOptionPane.showInternalMessageDialog(null, "Please insert the ammount more than price.","",JOptionPane.ERROR_MESSAGE);
				    		}
				    		else if(p == price2) {
				    			JOptionPane.showMessageDialog(null, "Your payment is Successful !!");
				    			
				    		}
				    		else if(p >= price2) {
				    			JOptionPane.showMessageDialog(null, "Name : "+n+"\nID Card : "+ID+"\nAmmount : RM"+ p + "\n\nYour payment is Successful !!");
				    			
				    			double balance = p - price2;
				    			
				    			balanceLabel.setText("You still have a balance : RM"+format.format(balance));
				    			
				    		}
				    	}
				    });
				
			
	}
}
