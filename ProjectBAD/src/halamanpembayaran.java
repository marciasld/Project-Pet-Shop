import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class halamanpembayaran extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					halamanpembayaran frame = new halamanpembayaran(email);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	static String email;
	public halamanpembayaran(String emaillogin) {
		email=emaillogin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 533);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 574, 460);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(154, 74, 265, 265);
		panel.add(label);
		
		ImageIcon qr = new ImageIcon(this.getClass().getResource("/qr.png"));
		Image qrimg = qr.getImage();
		Image newqr = qrimg.getScaledInstance(265, 265, java.awt.Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(newqr));
		
		JLabel lblPembayaran = new JLabel("Pembayaran");
		lblPembayaran.setFont(new Font("Baskerville Old Face", Font.PLAIN, 44));
		lblPembayaran.setHorizontalAlignment(SwingConstants.CENTER);
		lblPembayaran.setBounds(122, 11, 329, 48);
		panel.add(lblPembayaran);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transactions back = new Transactions(email);
				back.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(12, 26, 97, 35);
		panel.add(btnNewButton);
		
		JLabel lblSiKecil = new JLabel("\" Si Kecil Menunggu Mu \"");
		lblSiKecil.setFont(new Font("Freestyle Script", Font.PLAIN, 70));
		lblSiKecil.setHorizontalAlignment(SwingConstants.CENTER);
		lblSiKecil.setBounds(12, 344, 550, 103);
		panel.add(lblSiKecil);
	}

}
