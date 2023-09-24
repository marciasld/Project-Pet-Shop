import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;

public class Chihuahua extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chihuahua frame = new Chihuahua();
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
	public Chihuahua() {
		
		setBounds(100, 100, 749, 572);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chihuahua");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblNewLabel.setBounds(295, 48, 158, 47);
		contentPane.add(lblNewLabel);
		
		JLabel Chihuahua = new JLabel("");
		Chihuahua.setIcon(new ImageIcon((this.getClass().getResource("/chihuahuaimg.jpeg"))));
		Chihuahua.setBounds(64, 136, 187, 308);
		contentPane.add(Chihuahua);
		
		JLabel lblNewLabel_1 = new JLabel("Deskripsi");
		lblNewLabel_1.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(295, 154, 95, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hal yang perlu diperhatikan dalam memelihara Chihuahua");
		lblNewLabel_2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(296, 288, 409, 26);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtrChihuahuaPadaDasarnya = new JTextArea();
		txtrChihuahuaPadaDasarnya.setBackground(new Color(255, 235, 205));
		txtrChihuahuaPadaDasarnya.setLineWrap(true);
		txtrChihuahuaPadaDasarnya.setEditable(false);
		txtrChihuahuaPadaDasarnya.setText("Chihuahua pada dasarnya adalah ras anjing yang penyayang, sering menggonggong dan suka mencari perhatian pada pemiliknya. Seperti anjing pada umumnya, chihuahua juga mempunyai perilaku yang aktif dan sangat senang ketika diajak bermain di luar rumah.");
		txtrChihuahuaPadaDasarnya.setWrapStyleWord(true);
		txtrChihuahuaPadaDasarnya.setBounds(295, 174, 386, 112);
		contentPane.add(txtrChihuahuaPadaDasarnya);
		
		JLabel lblNewLabel_3 = new JLabel("- Chihuahua dapat menjadi destruktif ketika bosan.");
		lblNewLabel_3.setBounds(295, 316, 372, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("- Chihuahua perlu 20 sampai 30 menit olahraga sehari.");
		lblNewLabel_4.setBounds(295, 344, 372, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("- Telinga Chihuahua rentan terhadap tumpukan kotoran.");
		lblNewLabel_5.setBounds(295, 372, 372, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("- Chihuahua tidak cocok dengan anak-anak.");
		lblNewLabel_6.setBounds(295, 400, 372, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("- Chihuahua rentan menggigil saat dingin");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(295, 428, 386, 16);
		contentPane.add(lblNewLabel_7);
	}

}
