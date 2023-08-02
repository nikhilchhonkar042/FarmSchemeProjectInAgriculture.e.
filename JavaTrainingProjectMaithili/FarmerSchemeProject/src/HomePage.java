import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		
		 boolean visibleVal;
		 
		 
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1218, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\MHR18\\git\\JavaTrainingProjectMaithili\\FarmerSchemeProject\\src\\IMAGES\\homePageCover.jpg"));
		lblNewLabel.setBounds(0, 110, 1204, 494);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 10, 1204, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\MHR18\\Documents\\workspace-spring-tool-suite-4-4.19.0.RELEASE\\FarmerSchemeProject\\IMAGES\\logo1.jpg"));
		lblNewLabel_1.setBounds(10, 10, 78, 69);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("file:///C:/Users/MHR18/git/JavaTrainingProjectMaithili/FarmerSchemeProject/src/IMAGES/logo1.jpg"));
		lblNewLabel_2.setBounds(10, 0, 90, 100);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(476, 26, 159, 53);
		panel.add(btnNewButton);
		
		JButton btnAbout = new JButton("About Us");
		btnAbout.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAbout.setBounds(654, 26, 159, 53);
		panel.add(btnAbout);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage loginPage=new LoginPage();
				loginPage.setVisible(true);
			}
		});
		
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogin.setBounds(834, 26, 159, 53);
		panel.add(btnLogin);
		
		JButton btnContactUs = new JButton("Contact us");
		btnContactUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactUsPage contactUsPage=new ContactUsPage();
				
				contactUsPage.setVisible(true);
			}
		});
		btnContactUs.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnContactUs.setBounds(1015, 25, 159, 53);
		panel.add(btnContactUs);
	}
}