import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.entities.*;
import com.entities.farmer.FarmerDAO;
import com.entities.farmer.FarmerDAOImplementation;
import com.entities.farmer.FarmerEntity;

import Validators.AllValidators;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class FarmerRegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField fullNameTextField;
	private JTextField contactNoTextField;
	private JTextField emailIdTextField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String str1;
		String str2;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmerRegistrationPage frame = new FarmerRegistrationPage();
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
	public FarmerRegistrationPage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1351, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1300, 732);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Farmer Registeration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(552, 0, 265, 30);
		panel.add(lblNewLabel);
		
		JLabel lblPersonalDetails = new JLabel("Personal Details");
		lblPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPersonalDetails.setBounds(605, 28, 134, 30);
		panel.add(lblPersonalDetails);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(482, 68, 69, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact Number");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(482, 102, 114, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email ID");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(492, 136, 69, 24);
		panel.add(lblNewLabel_1_2);
		
		JTextField fullNameTextField = new JTextField();
		fullNameTextField.setBounds(651, 68, 265, 19);
//		fullNameTextField.setRequired(true);
//		fullNameTextField.addActionListener();
		fullNameTextField.addKeyListener(null);
		panel.add(fullNameTextField);
		
//		fullNameTextField.setRequired(true);
//		fullNameTextField.setRe
		fullNameTextField.setColumns(10);
		
		contactNoTextField = new JTextField();
		contactNoTextField.setColumns(10);
		contactNoTextField.setBounds(651, 106, 265, 19);
		panel.add(contactNoTextField);
		
		emailIdTextField = new JTextField();
		emailIdTextField.setColumns(10);
		emailIdTextField.setBounds(651, 135, 265, 19);
		panel.add(emailIdTextField);
		
		JLabel lblAddressDetails = new JLabel("Address Details");
		lblAddressDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddressDetails.setBounds(605, 164, 144, 30);
		panel.add(lblAddressDetails);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(492, 216, 69, 24);
		panel.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(651, 204, 265, 52);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("City");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1.setBounds(492, 262, 69, 24);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("State");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_2.setBounds(492, 296, 69, 24);
		panel.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Pincode");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_3.setBounds(482, 330, 69, 24);
		panel.add(lblNewLabel_1_3_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(651, 266, 265, 19);
		panel.add(textField_4);
		
		
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(651, 295, 265, 19);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(651, 324, 265, 19);
		panel.add(textField_6);
		
		JLabel lblBankDetails = new JLabel("Bank Details");
		lblBankDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBankDetails.setBounds(595, 353, 144, 30);
		panel.add(lblBankDetails);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Account No");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_1.setBounds(492, 393, 103, 24);
		panel.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("IFSC code");
		lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2.setBounds(502, 427, 69, 24);
		panel.add(lblNewLabel_1_3_1_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(651, 393, 265, 19);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(651, 422, 265, 19);
		panel.add(textField_8);
		
		JLabel lblNewLabel_1_3_1_2_1 = new JLabel("Aadhar Card");
		lblNewLabel_1_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_1.setBounds(493, 491, 103, 24);
		panel.add(lblNewLabel_1_3_1_2_1);
		
		JLabel lblNewLabel_1_3_1_2_2 = new JLabel("Pan Card");
		lblNewLabel_1_3_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_2.setBounds(502, 525, 69, 24);
		panel.add(lblNewLabel_1_3_1_2_2);
		
		JLabel lblDocuments = new JLabel("Documents");
		lblDocuments.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDocuments.setBounds(595, 451, 144, 30);
		panel.add(lblDocuments);
		
		
		JLabel lblNewLabel_1_3_1_2_2_1 = new JLabel("Password");
		lblNewLabel_1_3_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_2_1.setBounds(492, 559, 69, 24);
		panel.add(lblNewLabel_1_3_1_2_2_1);
		
		JLabel lblNewLabel_1_3_1_2_2_2 = new JLabel("Confirm Password");
		lblNewLabel_1_3_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_2_2.setBounds(462, 593, 134, 24);
		panel.add(lblNewLabel_1_3_1_2_2_2);
		
		
		JButton btnNewButton_1 = new JButton("Choose File");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser filechooser=new JFileChooser();
				int num=filechooser.showSaveDialog(null);
				String nameOfFile = null;
				 if (num == JFileChooser.APPROVE_OPTION) {
					 File file=filechooser.getSelectedFile();
					 nameOfFile=file.getName();
				 }
				 btnNewButton_1.setText(nameOfFile);
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(651, 494, 265, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Choose File");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser filechooser=new JFileChooser();
				int num=filechooser.showSaveDialog(null);
				String nameOfFile = null;
				 if (num == JFileChooser.APPROVE_OPTION) {
					 File file=filechooser.getSelectedFile();
					 nameOfFile=file.getName();
				 }
				
				btnNewButton_1_1.setText(nameOfFile);
			}
		});
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(651, 528, 265, 21);
		panel.add(btnNewButton_1_1);
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fullNameTextField.setText("");
				contactNoTextField.setText("");
				emailIdTextField.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				btnNewButton_1.setText("");
				btnNewButton_1_1.setText("");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBackground(new Color(255, 0, 0));
		btnReset.setBounds(743, 641, 112, 36);
		panel.add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(651, 561, 265, 20);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(651, 591, 265, 20);
		panel.add(passwordField_1);
		
		
		
		
		
		
		//for valid name
		JLabel ErrNameMsg = new JLabel("Enter Valid Name");
		ErrNameMsg.setForeground(new Color(255, 0, 0));
		ErrNameMsg.setBounds(956, 68, 208, 14);
		panel.add(ErrNameMsg);
		ErrNameMsg.setVisible(false);
		
		//for valid contact
		JLabel ErrMsgForContact = new JLabel("Enter Valid Contact Number");
		ErrMsgForContact.setForeground(new Color(255, 0, 0));
		ErrMsgForContact.setBounds(956, 108, 192, 14);
		panel.add(ErrMsgForContact);
		ErrMsgForContact.setVisible(false);
		
		//for valid email
		JLabel ErrMsgForEmail = new JLabel("Enter Valid Email ID");
		ErrMsgForEmail.setForeground(new Color(255, 0, 0));
		ErrMsgForEmail.setBounds(956, 136, 114, 14);
		panel.add(ErrMsgForEmail);
		ErrMsgForEmail.setVisible(false);
		
		//for valid city
		JLabel lblNewLabel_2 = new JLabel("Enter Valid City Name");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(970, 268, 114, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		//for valid account number
		JLabel lblNewLabel_3 = new JLabel("Enter Valid Account Number");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(970, 399, 144, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(!AllValidators.isValidFullName(fullNameTextField.getText()))
				{
					ErrNameMsg.setVisible(true);
					fullNameTextField.setText("");
				}
				else {
					ErrNameMsg.setVisible(false);
				}
				if(!AllValidators.isValidContactNumber(contactNoTextField.getText())) {
					ErrMsgForContact.setVisible(true);
					contactNoTextField.setText("");
					
				}else {
					ErrMsgForContact.setVisible(false);
				}
			    if(!AllValidators.isValidEmail(emailIdTextField.getText())) {
			    	ErrMsgForEmail.setVisible(true);
			    	emailIdTextField.setText("");
			    }else {
			    	ErrMsgForEmail.setVisible(false);
			    }
				if(!AllValidators.isValidCityName(textField_4.getText())) {
					lblNewLabel_2.setVisible(true);
					textField_4.setText("");
				}else {
					lblNewLabel_2.setVisible(false);
				}
				if(!AllValidators.isValidAccountNumber(textField_7.getText())) {
					lblNewLabel_3.setVisible(true);
					textField_7.setText("");
				}else {
					lblNewLabel_3.setVisible(false);
				}
				
				FarmerDAO farmerDAOObject=new FarmerDAOImplementation();
				
			    FarmerEntity farmerEntityObj=new FarmerEntity(fullNameTextField.getText(),contactNoTextField.getText() , emailIdTextField.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText(), textField_6.getText(), textField_7.getText(), textField_8.getText(), btnNewButton_1.getText(), btnNewButton_1_1.getText(),passwordField.getText());
//				
//				
				farmerDAOObject.insertFarmer(farmerEntityObj);
				
				
				
				
				
				
				try {
					DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
					Connection conn =DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(439, 641, 112, 36);
		panel.add(btnNewButton);
		
		
	
		
		
		
		
		
		
		

	}
}