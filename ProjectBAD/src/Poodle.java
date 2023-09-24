import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;

public class Poodle extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Poodle frame = new Poodle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Poodle() {
		
		setBounds(100, 100, 749, 553);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Poodle");
		lblNewLabel.setFont(new Font("Gill Sans MT", Font.PLAIN, 26));
		lblNewLabel.setBounds(313, 66, 80, 32);
		contentPane.add(lblNewLabel);
		
		JLabel Poodle = new JLabel("");
		ImageIcon PoodleIcon = new ImageIcon((this.getClass().getResource("/poodleimg.jpeg")));
		Image Poodleimg = PoodleIcon.getImage();
		Image newpoodleimg = Poodleimg.getScaledInstance(188,268 , java.awt.Image.SCALE_SMOOTH);
		Poodle.setIcon(new ImageIcon(newpoodleimg));
		Poodle.setBounds(90, 160, 188, 268);
		contentPane.add(Poodle);
		
		JLabel lblNewLabel_1 = new JLabel("Deskripsi");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(311, 160, 91, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hal yang perlu diperhatikan dalam memelihara poodle");
		lblNewLabel_2.setBounds(311, 307, 346, 16);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtrAnjingPoodleMenjadi = new JTextArea();
		txtrAnjingPoodleMenjadi.setLineWrap(true);
		txtrAnjingPoodleMenjadi.setEditable(false);
		txtrAnjingPoodleMenjadi.setBackground(new Color(222, 184, 135));
		txtrAnjingPoodleMenjadi.setText("Anjing poodle menjadi salah satu hewan peliharaan favorit di dunia. Poodle memiliki penampilan yang unik, cantik, serta karakternya selalu bersemangat. Tak heran banyak yang menjadikan jenis anjing ini sebagai teman bagi manusia.");
		txtrAnjingPoodleMenjadi.setWrapStyleWord(true);
		txtrAnjingPoodleMenjadi.setBounds(311, 193, 396, 106);
		contentPane.add(txtrAnjingPoodleMenjadi);
		
		JLabel lblNewLabel_3 = new JLabel("- Mengatur jadwal mandi anjing");
		lblNewLabel_3.setBounds(311, 335, 346, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("- Rutin menyisir bulu dan menggunting kukunya");
		lblNewLabel_4.setBounds(311, 363, 329, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("- Melatihnya bersosialisasi");
		lblNewLabel_5.setBounds(311, 391, 329, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("- Memberinya perawatan gigi dan telinga");
		lblNewLabel_6.setBounds(311, 419, 329, 16);
		contentPane.add(lblNewLabel_6);
	}

}
