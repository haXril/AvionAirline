import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
        setBounds(100, 100, 1054, 633);
        frame = new JPanel();
        frame.setBackground(Color.ORANGE);
        frame.setBorder(new LineBorder(Color.BLACK, 4));
        setContentPane(frame);
        frame.setLayout(null);

        JLabel signUpLabel = new JLabel("Register");
        signUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
        signUpLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
        signUpLabel.setBounds(242, 72, 485, 57);
        frame.add(signUpLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(376, 159, 351, 32);
        frame.add(firstNameField);
        firstNameField.setColumns(10);

        JLabel firstnameLabel = new JLabel("First Name :\r\n");
        firstnameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        firstnameLabel.setBounds(242, 163, 98, 23);
        frame.add(firstnameLabel);

        lastNameField = new JTextField();
        lastNameField.setBounds(376, 207, 351, 32);
        frame.add(lastNameField);
        lastNameField.setColumns(10);

        JLabel lastnameLabel = new JLabel("Last Name :\r\n");
        lastnameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        lastnameLabel.setBounds(242, 211, 98, 23);
        frame.add(lastnameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(376, 260, 224, 32);
        frame.add(usernameField);
        usernameField.setColumns(10);

        JLabel lblNewLabel = new JLabel("*");
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setBackground(Color.ORANGE);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel.setBounds(319, 268, 14, 14);
        frame.add(lblNewLabel);

        JLabel usernameLabel = new JLabel("Username :\r\n");
        usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        usernameLabel.setBounds(242, 264, 98, 23);
        frame.add(usernameLabel);

        JLabel passLabel1 = new JLabel("Password :\r\n");
        passLabel1.setFont(new Font("Tahoma", Font.BOLD, 13));
        passLabel1.setBounds(242, 307, 98, 23);
        frame.add(passLabel1);

        JLabel passLabel2 = new JLabel("Confirm Password :\r\n");
        passLabel2.setFont(new Font("Tahoma", Font.BOLD, 13));
        passLabel2.setBounds(242, 350, 135, 23);
        frame.add(passLabel2);

        JLabel msgLabel = new JLabel("Please make sure your both password is same!!!");
        msgLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
        msgLabel.setForeground(Color.RED);
        msgLabel.setBounds(366, 389, 274, 13);
        frame.add(msgLabel);

        JButton registerBtn = new JButton("Register\r\n");
        registerBtn.setBackground(Color.LIGHT_GRAY);
        registerBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
        registerBtn.setBounds(438, 486, 106, 32);
        frame.add(registerBtn);

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
                                            lg.show();
                                            dispose();

                                            String name = firstNameField.getText() + " " + lastNameField.getText();

                                            String userName = usernameField.getText();
                                            String password = passwordField1.getText();
                                            lg.confirmUsername(userName,password,name);

                                            break;
                                    }
                            }
                    }
                }

            }});

        JButton resetBtn = new JButton("Reset");
        resetBtn.setBackground(Color.LIGHT_GRAY);
        resetBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
        resetBtn.setBounds(613, 486, 106, 32);
        frame.add(resetBtn);

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

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(376, 303, 224, 32);
        frame.add(passwordField1);

        passwordField2 = new JPasswordField();
        passwordField2.setBounds(376, 346, 224, 32);
        frame.add(passwordField2);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(255, 102, 51), 3));
        panel.setBackground(Color.YELLOW);
        panel.setBounds(242, 72, 485, 63);
        frame.add(panel);

        JLabel lblNewLabel_1 = new JLabel("*");
        lblNewLabel_1.setForeground(Color.RED);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_1.setBackground(Color.ORANGE);
        lblNewLabel_1.setBounds(319, 312, 14, 14);
        frame.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("*");
        lblNewLabel_2.setForeground(Color.RED);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_2.setBackground(Color.ORANGE);
        lblNewLabel_2.setBounds(366, 344, 14, 14);
        frame.add(lblNewLabel_2);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btnCancel) {
                    log_in login = new log_in();
                    login.setLocationRelativeTo(null);
                    login.setVisible(true);
                    login.show();
                    dispose();
                }
            }
        });
        btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnCancel.setBackground(Color.LIGHT_GRAY);
        btnCancel.setBounds(242, 486, 106, 32);
        frame.add(btnCancel);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Show password");
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
        chckbxNewCheckBox.setBackground(Color.ORANGE);
        chckbxNewCheckBox.setBounds(376, 410, 224, 23);
        frame.add(chckbxNewCheckBox);


    }
}
