import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAwal extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAwal frame = new MenuAwal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MenuAwal() {
		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Selamat Datang di Cinta Guguk Shop");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 16));
		lblNewLabel.setBounds(106, 21, 351, 23);
		contentPane.add(lblNewLabel);
		
		JRadioButton buttonSudah = new JRadioButton("Sudah");
		buttonSudah.setBackground(new Color(255, 192, 203));
		buttonSudah.setBounds(179, 314, 80, 23);
		contentPane.add(buttonSudah);
		
		JRadioButton buttonBelum = new JRadioButton("Belum");
		buttonBelum.setBackground(new Color(255, 192, 203));
		buttonBelum.setBounds(314, 314, 70, 23);
		contentPane.add(buttonBelum);
		
		JLabel lblNewLabel_1 = new JLabel("Apakah anda memiliki akun member?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(160, 278, 243, 16);
		contentPane.add(lblNewLabel_1);
		
		ButtonGroup bg = new ButtonGroup ();
		bg.add(buttonSudah);
		bg.add(buttonBelum);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonSudah.isSelected())
				{
					Login sudah = new Login();
					sudah.setVisible(true);
					dispose();
				}
				else if(buttonBelum.isSelected())
				{
					registrasi belum = new registrasi();
					belum.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Opsi belum dipilih!");
				}
			}
		});
		
		if(buttonSudah.isSelected()) {
			Login log = new Login();
			log. setVisible(true);
		}
		else if (buttonBelum.isSelected()){
			registrasi rgs = new registrasi();
			rgs.setVisible(true);
		}
		
		
		
		Submit.setBounds(223, 349, 117, 29);
		contentPane.add(Submit);
		
		JLabel guguk = new JLabel("");
		guguk.setHorizontalAlignment(SwingConstants.CENTER);
		
		ImageIcon gugukIcon = new ImageIcon(this.getClass().getResource("/dog.png"));
		Image gugukimg = gugukIcon.getImage();
		Image newgugukimg = gugukimg.getScaledInstance(188, 188, java.awt.Image.SCALE_SMOOTH);
		guguk.setIcon(new ImageIcon(newgugukimg));
		
		guguk.setBounds(179, 48, 205, 227);
		contentPane.add(guguk);
		
	}
}
