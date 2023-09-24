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

public class ShibaInu extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShibaInu frame = new ShibaInu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ShibaInu() {
		
		setBounds(100, 100, 750, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Shiba Inu");
		lblNewLabel.setBounds(315, 57, 120, 32);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.PLAIN, 26));
		contentPane.add(lblNewLabel);
		
		JLabel ShibaInu = new JLabel("");
		ShibaInu.setBounds(73, 156, 188, 261);
		ImageIcon ShibaInuIcon = new ImageIcon((this.getClass().getResource("/shibainuimg.jpeg")));
		Image ShibaInuimg = ShibaInuIcon.getImage();
		Image newshibainuimg = ShibaInuimg.getScaledInstance(188,268 , java.awt.Image.SCALE_SMOOTH);
		ShibaInu.setIcon(new ImageIcon(newshibainuimg));
		contentPane.add(ShibaInu);
		
		JLabel lblNewLabel_1 = new JLabel("Deskripsi");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(293, 142, 93, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hal yang perlu diperhatikan dalam memelihara Shiba Inu");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(293, 298, 408, 21);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtrShibaInu = new JTextArea();
		txtrShibaInu.setLineWrap(true);
		txtrShibaInu.setEditable(false);
		txtrShibaInu.setBackground(new Color(222, 184, 135));
		txtrShibaInu.setText("Shiba Inu (柴犬, Anjing Shiba) adalah anjing asli Jepang yang sudah ada sejak zaman kuno. Shiba Inu merupakan anjing ras paling populer di Jepang. Tipe anjing berukuran sedang, tinggi badan jantan sekitar 38 cm hingga 41 cm, sedangkan tinggi badan betina sekitar 35 cm hingga 38 cm.");
		txtrShibaInu.setWrapStyleWord(true);
		txtrShibaInu.setBounds(293, 167, 428, 120);
		contentPane.add(txtrShibaInu);
		
		JLabel lblNewLabel_3 = new JLabel("- Shiba Inu merupakan anjing yang berjiwa bebas.");
		lblNewLabel_3.setBounds(293, 330, 364, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("- Shiba Inu merupakan anjing yang agresif.");
		lblNewLabel_4.setBounds(293, 358, 291, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("- Bulu Shiba Inu sangat mudah rontok.");
		lblNewLabel_5.setBounds(293, 386, 364, 16);
		contentPane.add(lblNewLabel_5);
	}

}
