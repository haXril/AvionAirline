import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Toolkit;

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

	JProgressBar progressBar = new JProgressBar();
	JLabel lblNewLabel = new JLabel();
	
	
	//Constructor Method without parameter 
	public welcomePage() {
		setTitle("AVION AIRLINE");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\8-removebg-preview (2).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 633);
		frame = new JPanel();
		frame.setBackground(new Color(255, 204, 153));
		frame.setBorder(new LineBorder(Color.BLACK, 4));
		setContentPane(frame);
		frame.setLayout(null);
		
		JLabel avionLabel = new JLabel("Avion Airline");
		avionLabel.setFont(new Font("Segoe Print", Font.BOLD, 66));
		avionLabel.setBounds(103, 253, 439, 68);
		frame.add(avionLabel);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\photo_2022-06-05_16-10-31-removebg-preview.png"));
		logo.setBounds(69, 0, 595, 306);
		frame.add(logo);
		
		JLabel welcomeLabel = new JLabel("Welcome to Our Systems");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setForeground(new Color(0, 0, 204));
		welcomeLabel.setFont(new Font("SimSun", Font.BOLD, 20));
		welcomeLabel.setBounds(10, 366, 644, 68);
		frame.add(welcomeLabel);
		
		
		progressBar.setBounds(103, 445, 439, 14);
		progressBar.setVisible(true);
		frame.add(progressBar);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(496, 426, 46, 14);
		frame.add(lblNewLabel);
		
	}
}
