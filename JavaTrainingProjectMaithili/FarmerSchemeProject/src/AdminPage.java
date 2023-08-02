import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AdminPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1363, 660);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(553, 29, 343, 55);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Get Farmer Details");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(121, 183, 266, 33);
		contentPane.add(btnNewButton);
		
		JButton btnGetBidderDetails = new JButton("Get Bidder Details");
		btnGetBidderDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGetBidderDetails.setBounds(964, 183, 266, 33);
		contentPane.add(btnGetBidderDetails);
		
		JButton btnApproveBid = new JButton("Approve Bid");
		btnApproveBid.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnApproveBid.setBounds(493, 338, 266, 33);
		contentPane.add(btnApproveBid);
	}
}
