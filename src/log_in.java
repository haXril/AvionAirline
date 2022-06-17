import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class log_in extends JFrame {

    private JPanel frame;
    private JTextField UsernameField;
    private JPasswordField passwordField;
    private JButton login_btn;
    private JLabel labelName;

    public log_in() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\8-removebg-preview (2).png"));
        setTitle("AVION AIRLINE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1054, 633);
        frame = new JPanel();
        frame.setBackground(Color.ORANGE);
        frame.setBorder(new LineBorder(Color.BLACK, 4));
        setContentPane(frame);
        frame.setLayout(null);

        UsernameField = new JTextField();
        UsernameField.setBounds(420, 304, 336, 35);
        frame.add(UsernameField);
        UsernameField.setColumns(10);

        JLabel UsernameLabel = new JLabel("Username : ");
        UsernameLabel.setFont(new Font("Arial", Font.BOLD, 13));
        UsernameLabel.setBounds(296, 309, 114, 25);
        frame.add(UsernameLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(420, 350, 336, 35);
        frame.add(passwordField);

        JLabel passLabel = new JLabel("Password :");
        passLabel.setFont(new Font("Arial", Font.BOLD, 13));
        passLabel.setBounds(296, 355, 114, 25);
        frame.add(passLabel);

        login_btn = new JButton("Log In");
        login_btn.setBackground(Color.LIGHT_GRAY);
        login_btn.setForeground(Color.BLACK);
        login_btn.setFont(new Font("Tahoma", Font.BOLD, 12));
        login_btn.setBounds(420, 437, 104, 35);
        frame.add(login_btn);

        JButton resetBtn = new JButton("Reset");
        resetBtn.setBackground(Color.LIGHT_GRAY);
        resetBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
        resetBtn.setBounds(652, 437, 104, 35);
        frame.add(resetBtn);

        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent v) {
                if(v.getSource()==resetBtn) {
                    String userText = UsernameField.getText();
                    String pwdText = new String(passwordField.getPassword());

                    UsernameField.setText("");
                    passwordField.setText("");
                }
            }
        });


        JCheckBox showPassBtn = new JCheckBox("Show password");
        showPassBtn.setBackground(Color.ORANGE);
        showPassBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
        showPassBtn.setBounds(420, 392, 123, 23);
        frame.add(showPassBtn);

        showPassBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent c) {
                if(c.getSource()==showPassBtn) {
                    if(showPassBtn.isSelected()) {
                        passwordField.setEchoChar((char) 0);

                    }
                    else {
                        passwordField.setEchoChar('*');
                    }
                }
            }
        });

        JLabel loginLabel = new JLabel("Log In");
        loginLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
        loginLabel.setBounds(474, 235, 97, 45);
        frame.add(loginLabel);

        JLabel lineLabel = new JLabel("-------------------------------------------------------------------------------------------------------------------");
        lineLabel.setBounds(296, 279, 460, 14);
        frame.add(lineLabel);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(255, 102, 51), 3));
        panel.setBackground(Color.YELLOW);
        panel.setBounds(371, 33, 303, 166);
        frame.add(panel);
        panel.setLayout(null);

        JLabel avionLabel = new JLabel("Avion Airline\r\n");
        avionLabel.setBounds(73, 114, 191, 41);
        panel.add(avionLabel);
        avionLabel.setFont(new Font("Segoe Print", Font.BOLD, 25));

        JLabel logo = new JLabel("");
        logo.setBounds(53, 0, 250, 150);
        panel.add(logo);
        logo.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\4-removebg-preview.png"));

        JLabel lblNewLabel = new JLabel("Welcome to our System");
        lblNewLabel.setForeground(new Color(0, 0, 204));
        lblNewLabel.setBackground(new Color(0, 51, 204));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 16));
        lblNewLabel.setBounds(296, 210, 460, 14);
        frame.add(lblNewLabel);

        labelName = new JLabel("");
        labelName.setHorizontalAlignment(SwingConstants.CENTER);
        labelName.setForeground(new Color(0, 0, 204));
        labelName.setFont(new Font("SimSun", Font.BOLD, 16));
        labelName.setBackground(new Color(0, 51, 204));
        labelName.setBounds(296, 227, 460, 14);
        frame.add(labelName);



    }

    public void confirmUsername(String userName, String password,String name) {

        labelName.setText(name);

        login_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                if(UsernameField.getText().equals(userName) && passwordField.getText().equals(password) ) {
                    booking bk = new booking();
                    bk.setVisible(true);
                    bk.setLocationRelativeTo(null);
                    bk.show();
                    dispose();

                    String name = labelName.getText();

                    bk.name(name);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Please insert the correct username and password");
                }
            }
        });

    }
}

