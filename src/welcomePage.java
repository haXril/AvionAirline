import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class welcomePage extends JFrame {

	private JPanel frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomePage frame = new welcomePage();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public welcomePage() {
		setTitle("AVION AIRLINE");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\8-removebg-preview (2).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 633);
		frame = new JPanel();
		frame.setBackground(new Color(255, 255, 204));
		frame.setBorder(new LineBorder(Color.BLACK, 4));
		setContentPane(frame);
		frame.setLayout(null);
		
		JLabel avionLabel = new JLabel("Avion Airline");
		avionLabel.setFont(new Font("Segoe Print", Font.BOLD, 66));
		avionLabel.setBounds(296, 252, 535, 68);
		frame.add(avionLabel);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\photo_2022-06-05_16-10-31-removebg-preview.png"));
		logo.setBounds(274, -14, 595, 306);
		frame.add(logo);
		
		JLabel welcomeLabel = new JLabel("Welcome To Our System!!!");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setForeground(new Color(0, 0, 204));
		welcomeLabel.setFont(new Font("SimSun", Font.BOLD, 20));
		welcomeLabel.setBounds(10, 360, 1018, 68);
		frame.add(welcomeLabel);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(467, 430, 89, 23);
		frame.add(btnNewButton);
				
		//Action for Enter Button
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnNewButton) {
					register r = new register();
					r.setVisible(true);
					r.setLocationRelativeTo(null);
					dispose();
				}
			}
		});
		
	}
}
