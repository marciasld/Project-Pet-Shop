import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class registrasi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JPanel panel;
	private JLabel lblNewLabel_bg;
	private JLabel lblNewLabel_pass;
	private JTextField textFieldpass;
	private JLabel lblNewLabel_address;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrasi frame = new registrasi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static boolean checkemail(String email)
	{
		if(email.charAt(email.indexOf('@')+1)=='.'||email.charAt(email.indexOf('@')-1)=='.'){
			return false;
		}
		else if(email.startsWith(".")||email.endsWith(".")||email.startsWith("@")|| email.endsWith("@"))
		{
			return false;
		}
		else return true;
	    
	}
	public static boolean checkphone(String phone)
	{
		char[] phonearr = phone.toCharArray();
		for(char c : phonearr)
		{
			if(!Character.isDigit(c))
			{
				return false;
			}
		}
		if(phone.length()<12)
		{
			return false;
		}
		return true;
	}
	
	public static boolean checkpassword(String password)
	{
		if(password.length()<5 || password.length()>30)
		{
			return false;
		}
		char[] passwordarr = password.toCharArray();
		boolean containsDigit=false,containsChar=false;
		for(char c : passwordarr)
		{
			if(Character.isDigit(c))
			{
				containsDigit=true;
			}
			else if(Character.isAlphabetic(c))
			{
				containsChar=true;
			}
			
		}
		if(containsDigit && containsChar)
		{
			return true;
		}
		return false;
	}
	public registrasi() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException ec){
			ec.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/tokocintaguguk";
		String uname = "root";
		String pass = "";
		String lastid ="ME000";
		try{	
			Connection con = DriverManager.getConnection(url,uname,pass);
			String idquery = "SELECT `MemberID` FROM `users` ORDER BY `MemberID` DESC";
			Statement stid = con.createStatement();
			ResultSet resid = stid.executeQuery(idquery);
			
			while(resid.next())
			{
				lastid = resid.getString("MemberID");
				break;
			}
			
		}
		catch (SQLException se){
			se.printStackTrace();
		}
			
		int newIDnumber = (Integer.parseInt(lastid.substring(2,lastid.length()))+1);

	    String newID = null;
	    if(newIDnumber<10)
	    {
	    	newID = "ME00" + newIDnumber;
	    }
	    else if(newIDnumber<100 && newIDnumber>10)
	    {
	    	newID = "ME0" +newIDnumber;
	    }
	    else
	    {
	    	newID = "ME" + newIDnumber;
	    }
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 130, 238));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 206, 209), new Color(0, 191, 255), new Color(238, 130, 238), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(18, 13, 463, 479);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_5 = new JLabel("Email :");
		lblNewLabel_5.setBounds(46, 158, 50, 16);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Registrasi Membership");
		lblNewLabel.setBounds(93, 13, 277, 44);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 25));
		lblNewLabel.setBackground(UIManager.getColor("InternalFrame.borderLight"));
		
		textField = new JTextField();
		textField.setBounds(228, 74, 223, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(228, 153, 223, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(228, 223, 223, 26);
		panel.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(newID);
		
		textField_3 = new JTextField();
		textField_3.setBounds(228, 260, 223, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Member ID :");
		lblNewLabel_1.setBounds(46, 228, 82, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nama Lengkap :");
		lblNewLabel_2.setBounds(46, 79, 110, 16);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(228, 113, 222, 27);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80"}));
		
		lblNewLabel_3 = new JLabel("Umur :");
		lblNewLabel_3.setBounds(46, 118, 42, 16);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Nomor Telepon :");
		lblNewLabel_4.setBounds(46, 265, 106, 16);
		panel.add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(UIManager.getBorder("TextField.border"));
		textArea.setBounds(228, 307, 223, 99);
		panel.add(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nama = textField.getText();
				String email = textField_1.getText();
				int umur = Integer.valueOf(comboBox.getSelectedItem().toString());
				String password = textFieldpass.getText();
				String notelp = textField_3.getText();
				String id = textField_2.getText();
				String alamat = textArea.getText();
				 if(email.equals("")){
				    	JOptionPane.showMessageDialog(null,"Silahkan isi alamat email anda!","Message",JOptionPane.ERROR_MESSAGE);
				    }
				 if(nama.equals("")){
				    	JOptionPane.showMessageDialog(null,"Silahkan isi nama anda!","Message",JOptionPane.ERROR_MESSAGE);
				    }
				 if(password.equals("")){
				    	JOptionPane.showMessageDialog(null,"Silahkan isi password anda!","Message",JOptionPane.ERROR_MESSAGE);
				    }
				 if(notelp.equals("")){
				    	JOptionPane.showMessageDialog(null,"Silahkan isi nomor telepon anda!","Message",JOptionPane.ERROR_MESSAGE);
				    }
				 if(id.equals(""))
				 {
					 JOptionPane.showMessageDialog(null, "MemberID Error!","Message",JOptionPane.ERROR_MESSAGE);
				 }
				 if(alamat.equals(""))
				 {
					 JOptionPane.showMessageDialog(null, "Silahkan isi alamat anda!","Message",JOptionPane.ERROR_MESSAGE);
				 }
				 try{
						if (checkemail(email)==false){
							JOptionPane.showMessageDialog(null,"Tolong isi dengan email yang valid!","Message",JOptionPane.ERROR_MESSAGE);
							textField_1.setText("");
						}
						
						else if(checkphone(notelp)==false){
							JOptionPane.showMessageDialog(null,"Tolong isi dengan nomor telpon yang valid!","Message",JOptionPane.ERROR_MESSAGE);
							textField_3.setText("");
						}
						
						else if(checkpassword(password)==false)
						{
							JOptionPane.showMessageDialog(null,"Tolong isi dengan password yang valid!","Message",JOptionPane.ERROR_MESSAGE);
							textFieldpass.setText("");
							System.out.println(password);
						}
						else{
							String query="INSERT INTO `users` (`MemberID`, `MemberNama`,`MemberUsia`, `MemberEmail`,`MemberPassword`,`MemberTelpon`,`MemberAddress`) " + 
									"VALUES('"+id+"', '"+nama+"', '"+umur+"', '"+email+"', '"+password+"', '"+notelp+"', '"+alamat+"');";
							try{
								Connection con = DriverManager.getConnection(url,uname,pass);
								Statement st = con.createStatement();
								 int x = st.executeUpdate(query);
				                    if (x == 0) {
				                        JOptionPane.showMessageDialog(null, "Anda sudah memiliki akun!");
				                    } else {
				                        JOptionPane.showMessageDialog(null,
				                            "Anda Berhasil Mendaftar!");
				                    }
							}
							catch (SQLException se){
								se.printStackTrace();
							}
							
		                   Login berhasil = new Login();
		                   berhasil.setVisible(true);
		                   dispose();
		                    
							
						}}
					
					catch(Exception exc){
						exc.printStackTrace();
					};	
				
				
			}
		});
		btnNewButton.setBounds(176, 419, 110, 26);
		panel.add(btnNewButton);
		
		lblNewLabel_pass = new JLabel("Password :");
		lblNewLabel_pass.setBounds(46, 194, 82, 16);
		panel.add(lblNewLabel_pass);
		
		textFieldpass = new JTextField();
		textFieldpass.setColumns(10);
		textFieldpass.setBounds(228, 189, 223, 26);
		panel.add(textFieldpass);
		
		lblNewLabel_address = new JLabel("Alamat :");
		lblNewLabel_address.setBounds(46, 310, 106, 16);
		panel.add(lblNewLabel_address);

		JLabel lblSudahMemilikiAkun = new JLabel("Sudah Memiliki Akun");
		lblSudahMemilikiAkun.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login udahada = new Login();
				udahada.setVisible(true);
				dispose();
			}
		});
		lblSudahMemilikiAkun.setBounds(168, 450, 127, 16);
		panel.add(lblSudahMemilikiAkun);
		
		lblNewLabel_bg = new JLabel("");
		lblNewLabel_bg.setBounds(0, 0, 499, 505);
		contentPane.add(lblNewLabel_bg);

		ImageIcon bgicon = new ImageIcon(this.getClass().getResource("/background.jpg"));
		Image bgimg = bgicon.getImage();
		Image newbg = bgimg.getScaledInstance(502, 505, java.awt.Image.SCALE_SMOOTH);
		lblNewLabel_bg.setIcon(new ImageIcon(newbg));
	}
}
