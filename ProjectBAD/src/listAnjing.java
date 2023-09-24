import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listAnjing extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listAnjing frame = new listAnjing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public listAnjing() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Jenis-Jenis Anjing yang dijual");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(253, 25, 314, 16);
		contentPane.add(lblNewLabel);
		
		JLabel Golden = new JLabel("");
		Golden.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Golden gold = new Golden();
				gold.setVisible(true);
			}
		});
		ImageIcon goldenicon = new ImageIcon((this.getClass().getResource("/Golden.png")));
		Image goldenimg = goldenicon.getImage();
		Image newgoldenimg = goldenimg.getScaledInstance(135, 115, java.awt.Image.SCALE_SMOOTH);
		Golden.setIcon(new ImageIcon(newgoldenimg));
		Golden.setBounds(28, 130, 135, 115);
		contentPane.add(Golden);
		
		JLabel husky = new JLabel("");
		husky.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Husky hushus = new Husky();
				hushus.setVisible(true);
			}
		});
		ImageIcon huskyicon = new ImageIcon((this.getClass().getResource("/husky_PNG33.png")));
		Image huskyimg = huskyicon.getImage();
		Image newhuskyimg = huskyimg.getScaledInstance(135, 115, java.awt.Image.SCALE_SMOOTH);
		husky.setIcon(new ImageIcon(newhuskyimg));
		husky.setBounds(183, 130, 135, 115);
		contentPane.add(husky);
		
		JLabel Chihuahua = new JLabel("");
		Chihuahua.setHorizontalAlignment(SwingConstants.CENTER);
		Chihuahua.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Chihuahua chi = new Chihuahua();
				chi.setVisible(true);
			}
		});
		ImageIcon ChihuahuaIcon = new ImageIcon((this.getClass().getResource("/pngkit_chihuahua-png_2057922.png")));
		Image Chihuahuaimg = ChihuahuaIcon.getImage();
		Image newchihuahuaimg = Chihuahuaimg.getScaledInstance(135, 115, java.awt.Image.SCALE_SMOOTH);
		Chihuahua.setIcon(new ImageIcon(newchihuahuaimg));
		Chihuahua.setBounds(342, 146, 135, 115);
		contentPane.add(Chihuahua);
		
		JLabel ShibaInu = new JLabel("");
		ShibaInu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShibaInu shiba = new ShibaInu();
				shiba.setVisible(true);
			}
		});
		ImageIcon ShibaInuIcon = new ImageIcon((this.getClass().getResource("/shiba.png")));
		Image ShibaInuimg = ShibaInuIcon.getImage();
		Image newshibainuimg = ShibaInuimg.getScaledInstance(135, 115, java.awt.Image.SCALE_SMOOTH);
		ShibaInu.setIcon(new ImageIcon(newshibainuimg));
		ShibaInu.setBounds(494, 130, 142, 115);
		contentPane.add(ShibaInu);
		
		JLabel Poodle = new JLabel("");
		Poodle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Poodle poo = new Poodle();
				poo.setVisible(true);
			}
		});
		ImageIcon PoodleIcon= new ImageIcon((this.getClass().getResource("/Poodle-Transparent.png")));
		Image Poodleimg = PoodleIcon.getImage();
		Image newpoodleimg = Poodleimg.getScaledInstance(135, 115, java.awt.Image.SCALE_SMOOTH);
		Poodle.setIcon(new ImageIcon(newpoodleimg));
		Poodle.setBounds(657, 130, 135, 115);
		contentPane.add(Poodle);
		
		JLabel lblNewLabel_1 = new JLabel("Golden Retriever");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBackground(new Color(224, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_1.setBounds(38, 263, 124, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Chihuahua");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 255, 0));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel_3.setBounds(365, 262, 91, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Shiba Inu");
		lblNewLabel_4.setForeground(new Color(255, 255, 0));
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		lblNewLabel_4.setBounds(532, 262, 74, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Poodle");
		lblNewLabel_5.setForeground(new Color(255, 255, 0));
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel_5.setBounds(705, 262, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Klik gambar untuk informasi lebih lanjut");
		lblNewLabel_6.setForeground(new Color(255, 255, 0));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(288, 310, 245, 14);
		contentPane.add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_2 = new JLabel("Husky");
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel_2.setBounds(240, 256, 44, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_8 = new JLabel("");
        ImageIcon bgicon = new ImageIcon(this.getClass().getResource("/dogpark.jpg"));
        Image bgimg = bgicon.getImage();
        Image newbg = bgimg.getScaledInstance(821, 369, java.awt.Image.SCALE_SMOOTH);
        
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MenuUtama back = new MenuUtama(null);
        		back.setVisible(true);
        		dispose();
        	}
        });
        btnBack.setBounds(12, 22, 97, 25);
        contentPane.add(btnBack);
        lblNewLabel_8.setIcon(new ImageIcon(newbg));
        contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setBounds(0, 0, 821, 369);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setIcon(new ImageIcon(newbg));
	}
}
