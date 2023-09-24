import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Login() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException ec){
			ec.printStackTrace();}
		String url = "jdbc:mysql://localhost:3306/tokocintaguguk";
		String uname = "root";
		String pass = "";
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 317);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_bg = new JLabel("");
		lblNewLabel_bg.setBounds(-6, -8, 476, 298);

		ImageIcon bgicon = new ImageIcon(this.getClass().getResource("/background.jpg"));
		Image bgimg = bgicon.getImage();
		Image newbg = bgimg.getScaledInstance(476, 298, java.awt.Image.SCALE_SMOOTH);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 12, 408, 245);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(160, 5, 87, 41);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 30));
		
		JLabel lblNewLabel_1 = new JLabel("Email       :");
		lblNewLabel_1.setBounds(12, 87, 99, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setBounds(12, 129, 99, 16);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(157, 82, 239, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JPasswordField textFieldpass = new JPasswordField();
		textFieldpass.setBounds(156, 124, 240, 26);
		panel.add(textFieldpass);
		textFieldpass.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Connection con = DriverManager.getConnection(url,uname,pass);
					PreparedStatement ps;
					String query = "SELECT `MemberEmail`, `MemberPassword` FROM `users` WHERE `MemberEmail` = ? AND `MemberPassword` = ?";
					ps = con.prepareStatement(query);
					String loginemail = textField.getText();
					String loginpass = String.valueOf(textFieldpass.getPassword());
					
					if (textField.getText().trim().length() == 0 )
					{
						JOptionPane.showMessageDialog(null, "Silahkan isi email anda!");
					}
					else
					{
						ps.setString(1, loginemail);
					}
					if (String.valueOf(textFieldpass.getPassword()).trim().length() == 0 )
					{
						JOptionPane.showMessageDialog(null, "Silahkan isi password anda!");
					}
					else
					{
						ps.setString(2, loginpass);
					}
					ResultSet result = ps.executeQuery();
					 if(result.next()){
						 JOptionPane.showMessageDialog(null, "Login Berhasil.");
						 MenuUtama menu = new MenuUtama(loginemail);
						 menu.setVisible(true);
						 dispose();
			            }
			            else{
			                JOptionPane.showMessageDialog(null, "Email/password anda salah!");
			            }
				}
				catch (SQLException se){
					se.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(145, 182, 117, 29);
		panel.add(btnNewButton);
		
		JLabel lblBelumMemilikiAkun = new JLabel("Belum Memiliki Akun");
		lblBelumMemilikiAkun.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				registrasi belum = new registrasi();
				belum.setVisible(true);
				dispose();
			}
		});
		lblBelumMemilikiAkun.setHorizontalAlignment(SwingConstants.CENTER);
		lblBelumMemilikiAkun.setBounds(137, 224, 133, 16);
		panel.add(lblBelumMemilikiAkun);
		lblNewLabel_bg.setIcon(new ImageIcon(newbg));
		contentPane.add(lblNewLabel_bg);
	}
}
