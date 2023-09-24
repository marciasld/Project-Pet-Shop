import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuUtama extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUtama frame = new MenuUtama(emailmain);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	static String emailmain;
	public MenuUtama(String emaillogin) {
		if(emaillogin!=null){
		emailmain=emaillogin;
		}
		String email = emailmain;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 443);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 232, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Info Anjing");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listAnjing gotolist = new listAnjing();
				gotolist.setVisible(true);
			}
		});
		btnNewButton.setBounds(60, 315, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Checkout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transactions trans = new Transactions(email);
				trans.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(492, 315, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Informasi tentang jenis Anjing");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(23, 356, 198, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pelihara anjingmu sekarang!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(466, 356, 177, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_img = new JLabel("");
		lblNewLabel_img.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_img.setBounds(59, 76, 549, 226);

		
		ImageIcon imgicon = new ImageIcon(this.getClass().getResource("/main.jpg"));
		Image img = imgicon.getImage();
		Image newimg = img.getScaledInstance(549, 350, java.awt.Image.SCALE_SMOOTH);
		lblNewLabel_img.setIcon(new ImageIcon(newimg));
		contentPane.add(lblNewLabel_img);
		
		JLabel lblCintaGugukShop = new JLabel("Cinta Guguk Shop");
		lblCintaGugukShop.setFont(new Font("Eras Bold ITC", Font.PLAIN, 17));
		lblCintaGugukShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblCintaGugukShop.setBounds(71, 20, 162, 43);
		contentPane.add(lblCintaGugukShop);
		
		JLabel lblNewLabel_logo = new JLabel("");
		lblNewLabel_logo.setBounds(12, 13, 56, 56);
		ImageIcon logoicon = new ImageIcon(this.getClass().getResource("/paw.png"));
		Image logo = logoicon.getImage();
		Image newlogo = logo.getScaledInstance(56, 56, java.awt.Image.SCALE_SMOOTH);
		lblNewLabel_logo.setIcon(new ImageIcon(newlogo));
		contentPane.add(lblNewLabel_logo);

	}

}
