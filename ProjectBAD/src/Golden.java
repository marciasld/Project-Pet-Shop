import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Golden extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Golden frame = new Golden();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Golden() {
		
		setBounds(100, 100, 782, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Golden Retriever");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel.setBounds(257, 18, 236, 41);
		contentPane.add(lblNewLabel);
		
		JLabel golden = new JLabel("");
		golden.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon GoldenIcon =new ImageIcon(this.getClass().getResource("/goldenimg.jpeg"));
		Image Goldenimage = GoldenIcon.getImage();
		Image newgoldenimage = Goldenimage.getScaledInstance(188,268 , java.awt.Image.SCALE_SMOOTH);
		golden.setIcon(new ImageIcon(newgoldenimage));
		golden.setBounds(32, 86, 188, 268);
		contentPane.add(golden);
		
		JLabel DeskripsiGolden = new JLabel("Deskripsi");
		DeskripsiGolden.setFont(new Font("Tahoma", Font.BOLD, 14));
		DeskripsiGolden.setBounds(230, 86, 67, 16);
		contentPane.add(DeskripsiGolden);
		
		JTextArea txtrGoldenRetrieverAdalah = new JTextArea();
		txtrGoldenRetrieverAdalah.setBackground(new Color(245, 222, 179));
		txtrGoldenRetrieverAdalah.setLineWrap(true);
		txtrGoldenRetrieverAdalah.setEditable(false);
		txtrGoldenRetrieverAdalah.setText("Golden Retriever adalah anjing trah yang mulanya dibiakkan sebagai anjing pemburu untuk mengambil burung hasil buruan yang sudah ditembak. Anjing trah ini termasuk jenis Retriever (pengambil) yang menemukan atau mengambilkan burung air atau unggas liar untuk pemburu.");
		txtrGoldenRetrieverAdalah.setBounds(230, 114, 515, 107);
		txtrGoldenRetrieverAdalah.setWrapStyleWord(true);
		contentPane.add(txtrGoldenRetrieverAdalah);
		
		JLabel lblNewLabel_1 = new JLabel("Hal yang perlu diperhatikan dalam memelihara Golden Retriever");
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(230, 220, 409, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- Membutuhkan cukup ruang");
		lblNewLabel_2.setBounds(236, 248, 188, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("- Rutin Membersihkan bulu");
		lblNewLabel_3.setBounds(236, 276, 179, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("- Menyiapkan mainan untuk mengunyah");
		lblNewLabel_4.setBounds(236, 304, 263, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("- Jangan meninggalkan Golden sendirian");
		lblNewLabel_5.setBounds(236, 336, 263, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("- Rajin memberikan latihan untuk menyalurkan energi");
		lblNewLabel_6.setBounds(236, 364, 346, 16);
		contentPane.add(lblNewLabel_6);
		
	}
}
