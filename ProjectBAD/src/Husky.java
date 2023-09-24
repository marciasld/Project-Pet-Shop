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

public class Husky extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Husky frame = new Husky();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Husky() {
		
		setBounds(100, 100, 751, 541);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Husky");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));
		lblNewLabel.setBounds(328, 30, 114, 30);
		contentPane.add(lblNewLabel);
		
		JLabel Husky = new JLabel("");
		ImageIcon HuskyIcon = new ImageIcon((this.getClass().getResource("/huskyimg.jpeg")));
		Image huskyimg = HuskyIcon.getImage();
		Image newhuskyimg = huskyimg.getScaledInstance(188,268 , java.awt.Image.SCALE_SMOOTH);
		Husky.setIcon(new ImageIcon(newhuskyimg));
		
		Husky.setBounds(74, 101, 188, 321);
		contentPane.add(Husky);
		
		JLabel lblNewLabel_1 = new JLabel("Deskripsi");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(303, 101, 78, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hal yang perlu diperhatikan dalam memelihara Husky");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(303, 322, 415, 16);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtrAnjingSiberianHusky = new JTextArea();
		txtrAnjingSiberianHusky.setLineWrap(true);
		txtrAnjingSiberianHusky.setEditable(false);
		txtrAnjingSiberianHusky.setWrapStyleWord(true);
		txtrAnjingSiberianHusky.setText("Anjing Siberian Husky merupakan anjing yang penuh kasih, lembut, menyenangkan, ceria, jinak, dan bersemangat. Anjing yang baik dengan anak-anak dan bersahabat dengan orang asing, Husky bukan anjing pengawas, mereka hanya menggonggong kecil dan mencintai siapa saja. Anjing Siberian Husky sangat pintar dan mudah dilatih, namun mereka hanya akan mematuhi perintah jika mereka melihat manusia yang mempunyai ketegasan yang lebih kuat daripada diri mereka sendiri.");
		txtrAnjingSiberianHusky.setBounds(303, 128, 417, 183);
		contentPane.add(txtrAnjingSiberianHusky);
		
		JLabel lblNewLabel_3 = new JLabel("-Memilih dan Memberikan Makanan Berkualitas.");
		lblNewLabel_3.setBounds(303, 350, 344, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("-Memberikan Vaksin dan Vitamin.");
		lblNewLabel_4.setBounds(303, 378, 344, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("-Menyisir dan Menyikat Bulu Sewajarnya.");
		lblNewLabel_5.setBounds(303, 406, 344, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("- Rajin Menyikat Giginya.");
		lblNewLabel_6.setBounds(303, 434, 344, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("- Perhatikan Kondisi Kandang dan Rutin Sosialisasi.");
		lblNewLabel_7.setBounds(303, 462, 344, 16);
		contentPane.add(lblNewLabel_7);
	}

}
