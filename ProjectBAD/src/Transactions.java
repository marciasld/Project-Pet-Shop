import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class Transactions extends JFrame {

	private JPanel contentPane;
	private JLabel lblTransaction;
	private JTable table;
	private JScrollPane scrollPane;
	private JScrollPane scrollPanecart;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_2;
	private JLabel lblNewLabel;
	private JLabel lblIdAnjing;
	private JLabel lblJenisAnjing;
	private JLabel lblPrice;
	private JLabel lblStock;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable cart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transactions frame = new Transactions(email);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	static String email;
	private JButton btnBack;
	public Transactions(String emaillogin) {
		email=emaillogin;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException ec){
			ec.printStackTrace();}
		String url = "jdbc:mysql://localhost:3306/tokocintaguguk";
		String uname = "root";
		String pass = "";
		String id ="";
		try{	
			Connection con = DriverManager.getConnection(url,uname,pass);
			String namequery = "SELECT `MemberID` FROM `users` WHERE `MemberEmail` LIKE '"+email+"'";
			Statement stname = con.createStatement();
			ResultSet resname = stname.executeQuery(namequery);
			while(resname.next()){
				id = resname.getString("MemberID");
				break;
			}
		}
		
		catch (SQLException se){
			se.printStackTrace();
		}
		String useridcart=id;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 558);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPanecart = new JScrollPane();
		scrollPanecart.setOpaque(false);
		scrollPanecart.setBounds(22, 305, 827, 138);
		contentPane.add(scrollPanecart);
		
		cart = new JTable();
		scrollPanecart.setRowHeaderView(cart);
		scrollPanecart.setViewportView(cart);
		DefaultTableModel cartmodel=
				new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID Transaction", "ID Pelanggan", "ID Pembayaran","ID DeliveryMan","ID Status", "Alamat Pemesanan", "Tanggal transaksi", "Rating Resto"
			}
		);
		
		cart.setModel(cartmodel);
		cart.setVisible(true);
		btnNewButton = new JButton("Add to Cart");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setBounds(588, 272, 261, 22);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Remove Selected Cart");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(22, 469, 261, 25);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1_1 = new JButton("Clear Cart");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_1.setBounds(588, 469, 261, 25);
		contentPane.add(btnNewButton_1_1);
		
		btnNewButton_1_2 = new JButton("Checkout");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_2.setBounds(308, 469, 250, 25);
		contentPane.add(btnNewButton_1_2);
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(22, 52, 827, 164);
		contentPane.add(scrollPane_1);
		

		
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		DefaultTableModel model=new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID Transaksi", "ID Menu", "Qty", "Rating Menu"
			}
		);
		
		table.setModel(model);
		table.setVisible(true);
		
		try{	
			Connection con = DriverManager.getConnection(url,uname,pass);
			String buyquery = "SELECT `AnjingID`,`AnjingJenis`,`AnjingPrice`,`AnjingStock` FROM `dogs`";
			Statement stbuy = con.createStatement();
			ResultSet resbuy= stbuy.executeQuery(buyquery);
			while(resbuy.next())
			{
				String anjID = resbuy.getString("AnjingID");
				String anjType = resbuy.getString("AnjingJenis");
				String anjPrice = resbuy.getString("AnjingPrice");
				String anjStock = resbuy.getString("AnjingStock");
				
				Object[] tableData= {anjID,anjType,anjPrice,anjStock};
				
				model.addRow(tableData);
				table.setVisible(true);
			}
			
		}
		catch (SQLException se){
			se.printStackTrace();
		}
	

		textField = new JTextField();
		textField.setBounds(113, 234, 170, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 272, 170, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(376, 234, 170, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(376, 272, 170, 22);
		contentPane.add(textField_3);
		table.setModel(model);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = table.getSelectedRow();
				String selectID = model.getValueAt(selectedRow, 0).toString();
				String selectName = model.getValueAt(selectedRow, 1).toString();
				String selectPrice = model.getValueAt(selectedRow, 2).toString();
				String selectStock = model.getValueAt(selectedRow, 3).toString();
				textField.setText(selectID);
				textField_1.setText(selectName);

				textField_2.setText(selectPrice);
				textField_3.setText(selectStock);
				if(selectStock.equals("0"))
				{
					JOptionPane.showMessageDialog(null,"There is no more stock for this beverage!","Message",JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
				}
			}
		});
		
		lblTransaction = new JLabel("Transaction");
		lblTransaction.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 40));
		lblTransaction.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransaction.setBounds(221, 0, 419, 52);
		contentPane.add(lblTransaction);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(658, 234, 191, 22);
		contentPane.add(spinner);
		
		lblNewLabel = new JLabel("Quantity");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(588, 234, 58, 25);
		contentPane.add(lblNewLabel);
		
		lblIdAnjing = new JLabel("ID Transaksi");
		lblIdAnjing.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIdAnjing.setBounds(22, 237, 79, 16);
		contentPane.add(lblIdAnjing);
		
		lblJenisAnjing = new JLabel("ID Menu");
		lblJenisAnjing.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblJenisAnjing.setBounds(22, 275, 79, 16);
		contentPane.add(lblJenisAnjing);
		
		lblPrice = new JLabel("Price");
		lblPrice.setBounds(308, 275, 56, 16);
		contentPane.add(lblPrice);
		
		lblStock = new JLabel("Status");
		lblStock.setBounds(308, 237, 56, 16);
		contentPane.add(lblStock);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuUtama goback = new MenuUtama(email);
				goback.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(12, 14, 97, 25);
		contentPane.add(btnBack);
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(textField.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Silahkan memilih anjing yang anda inginkan!","Message",JOptionPane.ERROR_MESSAGE);
				}
				else{
					String cartid = textField.getText();
					String cartquantity = spinner.getValue().toString();
					int stockrow=table.getSelectedRow();
					int quantityInt = Integer.valueOf(cartquantity);
					int stock=Integer.valueOf(model.getValueAt(stockrow, 3).toString());
					if(quantityInt==0)
					{
						JOptionPane.showMessageDialog(null,"Silahkan memasukkan jumlah anjing yang anda inginkan!","Message",JOptionPane.ERROR_MESSAGE);
					}
					else if(quantityInt>stock)
					{
						JOptionPane.showMessageDialog(null,"Stok untuk jenis anjing tesebut telah habis!","Message",JOptionPane.ERROR_MESSAGE);
					}
					else{
					try{	
						Connection con = DriverManager.getConnection(url,uname,pass);
						String insertcart = "INSERT INTO `cart` SELECT `MemberID`,`AnjingID`,`Quantity` FROM"
								+ " (SELECT '"+useridcart+"'as `MemberID`,'"+cartid+"'as `AnjingID`,'"+cartquantity+"'as `Quantity`) as alias_sub "
										+ "WHERE NOT EXISTS(SELECT `MemberID`,`AnjingID` FROM `cart` WHERE `MemberID` LIKE'"+useridcart+"' AND `AnjingID` LIKE'"+cartid+"')";
						Statement stinsert = con.createStatement();
						 int x = stinsert.executeUpdate(insertcart);
		                    if (x == 0) {
		                      String updatequantity = "UPDATE `cart` SET `Quantity`=`Quantity`+"+cartquantity+" WHERE MemberID LIKE '"+useridcart+"' AND AnjingID LIKE '"+cartid+"'";
		                      stinsert.executeUpdate(updatequantity);
		                      cartmodel.setRowCount(0);
		                        try{
		                			String cartquery = "SELECT `cart`.`AnjingID`,`AnjingJenis`,`AnjingPrice`,`Quantity` FROM `cart` JOIN `dogs` on `dogs`.`AnjingID`=`cart`.`AnjingID`";
		                			Statement stcart = con.createStatement();
		                			ResultSet rescart= stcart.executeQuery(cartquery);
		                			while(rescart.next())
		                			{
		                				String anjID = rescart.getString("AnjingID");
		                				String anjType = rescart.getString("AnjingJenis");
		                				int anjPrice = rescart.getInt("AnjingPrice");
		                				int cartquant = rescart.getInt("Quantity");
		                				
		                				Object[] tableDataCart= {anjID,anjType,anjPrice,cartquant,cartquant*anjPrice};
		                				
		                				cartmodel.addRow(tableDataCart);
		                				cart.setVisible(true);
		                			}
		                			
		                		}
		                		catch (SQLException se){
		                			se.printStackTrace();
		                		}
		                	
		                		
		                		cart.setModel(cartmodel);
		                    } else {
		                        JOptionPane.showMessageDialog(null,
		                            "Successfully Insert Cart!"); 
		                        cartmodel.setRowCount(0);
		                        try{
		                			String cartquery = "SELECT `cart`.`AnjingID`,`AnjingJenis`,`AnjingPrice`,`Quantity` FROM `cart` JOIN `dogs` on `dogs`.`AnjingID`=`cart`.`AnjingID`";
		                			Statement stcart = con.createStatement();
		                			ResultSet rescart= stcart.executeQuery(cartquery);
		                			while(rescart.next())
		                			{
		                				String AnjingID = rescart.getString("AnjingID");
		                				String AnjingType = rescart.getString("AnjingJenis");
		                				int AnjingPrice = rescart.getInt("AnjingPrice");
		                				int cartquant = rescart.getInt("Quantity");
		                				
		                				Object[] tableDataCart= {AnjingID,AnjingType,AnjingPrice,cartquant,cartquant*AnjingPrice};
		                				
		                				cartmodel.addRow(tableDataCart);
		                				cart.setVisible(true);
		                			}
		                			
		                		}
		                		catch (SQLException se){
		                			se.printStackTrace();
		                		}
		                	
		                		
		                		cart.setModel(cartmodel);
		                    }
		                    
					}
					catch (SQLException se){
						se.printStackTrace();
					}
					}
				}
			}
		});
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRowcart = cart.getSelectedRow();
				String selectedRemoveAnj = cart.getValueAt(selectedRowcart, 0).toString();
				try{	
					Connection con = DriverManager.getConnection(url,uname,pass);
					String removequery = "DELETE FROM `cart` WHERE `AnjingID` LIKE '"+selectedRemoveAnj+"'";
					Statement st = con.createStatement();
					st.executeUpdate(removequery);
				}
				catch (SQLException se){
					se.printStackTrace();
				}
				cartmodel.removeRow(selectedRowcart);
			}
		});

		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opsi = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus cart?", "Message", JOptionPane.YES_NO_OPTION);
		        if (opsi == JOptionPane.YES_OPTION)
		        {
		            
					try{	
						Connection con = DriverManager.getConnection(url,uname,pass);
						String clearquery = "TRUNCATE `cart`";
						Statement stclear = con.createStatement();
						stclear.executeUpdate(clearquery);
						cartmodel.setRowCount(0);
					}
					catch (SQLException se){
						se.printStackTrace();
					}
		        }
		        else
		        {
		        	
		        }
		        
			}
		});
		

		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opsicheckout = JOptionPane.showConfirmDialog(null, "Apakah anda ingin mengonfirmasi pembelian?", "Message", JOptionPane.YES_NO_OPTION);
		        if (opsicheckout == JOptionPane.YES_OPTION)
		        {
		        	
		        	String lastid ="TR000";
		    		try{	
		    			Connection con = DriverManager.getConnection(url,uname,pass);
		    			String idquery = "SELECT `TransactionID` FROM `transaction` ORDER BY `TransactionID` DESC";
		    			Statement stid = con.createStatement();
		    			ResultSet resid = stid.executeQuery(idquery);
		    			
		    			while(resid.next())
		    			{
		    				lastid = resid.getString("TransactionID");
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
		    	    	newID = "TR00" + newIDnumber;
		    	    }
		    	    else if(newIDnumber<100 && newIDnumber>10)
		    	    {
		    	    	newID = "TR0" +newIDnumber;
		    	    }
		    	    else
		    	    {
		    	    	newID = "TR" + newIDnumber;
		    	    }
		    	    java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		    	    try{
						Connection con = DriverManager.getConnection(url,uname,pass);
						for(int i=0;i<cart.getRowCount();i++)
						{
							String anjID=cart.getValueAt(i, 0).toString();
							String cartquantity=cart.getValueAt(i, 3).toString();
							String updateStock="UPDATE `dogs` SET `AnjingStock`=`AnjingStock` - "+ cartquantity +" WHERE `AnjingID` LIKE '"+anjID+"'";
							Statement stock = con.createStatement();
							stock.executeUpdate(updateStock);
						}
						String query="INSERT INTO `transaction` VALUES ('"+newID+"','"+useridcart+"','"+date+"')";
			        	
						try{
							Statement st = con.createStatement();
							int x = st.executeUpdate(query);
							if (x == 0) {
		                        JOptionPane.showMessageDialog(null, "Error memasukkan data!");
		                    } else {
		                    	JOptionPane.showMessageDialog(null, "Pesanan berhasil!");
		                    	for(int i=0;i<cart.getRowCount();i++)
								{
									String anjID=cart.getValueAt(i, 0).toString();
									String cartquantity=cart.getValueAt(i, 3).toString();
									String detailquery="INSERT INTO `detailtransaction` VALUES ('"+newID+"','"+anjID+"','"+cartquantity+"')";
									try{
										Statement stdetail = con.createStatement();
										int y = stdetail.executeUpdate(detailquery);
										if (y == 0) {
					                        JOptionPane.showMessageDialog(null, "Error memasukkan data transaksi!");
					                    } else {					                    	
					                    }
									}
									catch (SQLException se){
										se.printStackTrace();
									}
								}
		                    	try{	
		    						String clearquery = "TRUNCATE `cart`";
		    						Statement stclear = con.createStatement();
		    						stclear.executeUpdate(clearquery);
		    						cartmodel.setRowCount(0);
		    					}
		    					catch (SQLException se){
		    						se.printStackTrace();
		    					}
		                    }
						}
						catch (SQLException se){
							se.printStackTrace();
						}
						
					}
					catch (SQLException se){
						se.printStackTrace();
					}
		        	
					model.setRowCount(0);
					try{	
						Connection con = DriverManager.getConnection(url,uname,pass);
						String buyquery = "SELECT `AnjingID`,`AnjingJenis`,`AnjingPrice`,`AnjingStock` FROM `dogs`";
						Statement stbuy = con.createStatement();
						ResultSet resbuy= stbuy.executeQuery(buyquery);
						while(resbuy.next())
						{
							String AnjingID = resbuy.getString("AnjingID");
							String AnjingType = resbuy.getString("AnjingJenis");
							String AnjingPrice = resbuy.getString("AnjingPrice");
							String AnjingStock = resbuy.getString("AnjingStock");
							
							Object[] tableData= {AnjingID,AnjingType,AnjingPrice,AnjingStock};
							
							model.addRow(tableData);
							table.setVisible(true);
						}
						
					}
					catch (SQLException se){
						se.printStackTrace();
					}
				
					
					table.setModel(model);
					
					
					halamanpembayaran qr = new halamanpembayaran(email);
					qr.setVisible(true);
					dispose();

		        }
		        else
		        {
		        	
		        }
			}
		});
		JLabel lblNewLabel_bg = new JLabel("");
		lblNewLabel_bg.setBounds(-23, -33, 884, 572);
		contentPane.add(lblNewLabel_bg);
		ImageIcon bgicon = new ImageIcon(this.getClass().getResource("/bg2.jpg"));
		Image bgimg = bgicon.getImage();
		Image newbg = bgimg.getScaledInstance(960, 640, java.awt.Image.SCALE_SMOOTH);
		lblNewLabel_bg.setIcon(new ImageIcon(newbg));
	}
}
