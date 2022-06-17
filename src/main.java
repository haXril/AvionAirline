import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.JProgressBar;

public class main extends JFrame {

    private JPanel frame;
    private JProgressBar progressBar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    main frame = new main();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public main() {
        setTitle("AVION AIRLINE");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\8-removebg-preview (2).png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1054, 633);
        frame = new JPanel();
        frame.setBackground(Color.ORANGE);
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
        welcomeLabel.setFont(new Font("SimSun", Font.BOLD, 20));
        welcomeLabel.setBounds(385, 360, 282, 68);
        frame.add(welcomeLabel);

        JButton btnNewButton = new JButton("ENTER");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==btnNewButton) {

                    register r = new register();
                    r.setVisible(true);
                    r.setLocationRelativeTo(null);
                    r.show();
                    dispose();
                }
            }
        });
        btnNewButton.setBackground(Color.LIGHT_GRAY);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton.setBounds(454, 430, 89, 23);
        frame.add(btnNewButton);
    }
}
