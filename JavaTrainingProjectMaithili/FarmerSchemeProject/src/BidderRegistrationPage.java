import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;

public class BidderRegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_13;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BidderRegistrationPage frame = new BidderRegistrationPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BidderRegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1290, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1256, 695);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bidder Registeration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(573, 0, 239, 30);
		panel.add(lblNewLabel);
		
		JLabel lblPersonalDetails = new JLabel("Personal Details");
		lblPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPersonalDetails.setBounds(605, 27, 134, 30);
		panel.add(lblPersonalDetails);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(493, 60, 69, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact Number");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(482, 94, 114, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email ID");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(493, 128, 69, 24);
		panel.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(651, 67, 265, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(651, 96, 265, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(651, 125, 265, 19);
		panel.add(textField_2);
		
		JLabel lblAddressDetails = new JLabel("Address Details");
		lblAddressDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddressDetails.setBounds(605, 154, 144, 30);
		panel.add(lblAddressDetails);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(493, 206, 69, 24);
		panel.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(651, 194, 265, 36);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("City");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1.setBounds(503, 240, 69, 24);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("State");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_2.setBounds(493, 265, 69, 24);
		panel.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Pincode");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_3.setBounds(493, 299, 69, 24);
		panel.add(lblNewLabel_1_3_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(651, 240, 265, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(651, 269, 265, 19);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(651, 298, 265, 19);
		panel.add(textField_6);
		
		JLabel lblBankDetails = new JLabel("Bank Details");
		lblBankDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBankDetails.setBounds(605, 327, 144, 30);
		panel.add(lblBankDetails);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Account No");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_1.setBounds(503, 367, 103, 24);
		panel.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("IFSC code");
		lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2.setBounds(513, 392, 69, 24);
		panel.add(lblNewLabel_1_3_1_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(651, 367, 265, 19);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(651, 396, 265, 19);
		panel.add(textField_8);
		
		JLabel lblNewLabel_1_3_1_2_1 = new JLabel("Aadhar Card");
		lblNewLabel_1_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_1.setBounds(493, 461, 103, 24);
		panel.add(lblNewLabel_1_3_1_2_1);
		
		JLabel lblNewLabel_1_3_1_2_2 = new JLabel("Pan Card");
		lblNewLabel_1_3_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_2.setBounds(513, 490, 69, 24);
		panel.add(lblNewLabel_1_3_1_2_2);
		
		JLabel lblDocuments = new JLabel("Documents");
		lblDocuments.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDocuments.setBounds(605, 425, 144, 30);
		panel.add(lblDocuments);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(651, 465, 265, 19);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(651, 494, 265, 19);
		panel.add(textField_10);
		
		JLabel lblNewLabel_1_3_1_2_2_1 = new JLabel("Password");
		lblNewLabel_1_3_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_2_1.setBounds(503, 558, 69, 24);
		panel.add(lblNewLabel_1_3_1_2_2_1);
		
		JLabel lblNewLabel_1_3_1_2_2_2 = new JLabel("Confirm Password");
		lblNewLabel_1_3_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_2_2.setBounds(472, 592, 134, 24);
		panel.add(lblNewLabel_1_3_1_2_2_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(493, 647, 112, 36);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBackground(new Color(255, 0, 0));
		btnReset.setBounds(743, 647, 112, 36);
		panel.add(btnReset);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(651, 523, 265, 19);
		panel.add(textField_13);
		
		JLabel lblNewLabel_1_3_1_2_2_3 = new JLabel("Trader Certificate");
		lblNewLabel_1_3_1_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_2_3.setBounds(473, 524, 123, 24);
		panel.add(lblNewLabel_1_3_1_2_2_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(651, 562, 265, 20);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(651, 592, 265, 20);
		panel.add(passwordField_1);
	}
}