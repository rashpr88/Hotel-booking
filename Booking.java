import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;


public class Booking {
	JFrame frmBookingSection;
	static JButton b5 = new JButton("BOOK");
	static JDateChooser dateChooser = new JDateChooser();
	static JDateChooser dateChooser_1 = new JDateChooser();
	static JLabel lblNewLabel_7 = new JLabel("Select room no :");
	static JComboBox comboBox = new JComboBox();
	static JRadioButton r1 = new JRadioButton("Male");
	static JRadioButton r2 = new JRadioButton("Female");
	static JRadioButton r3 = new JRadioButton("Male");
	static JRadioButton r4 = new JRadioButton("Female");
	static ButtonGroup Bg1 = new ButtonGroup();
	static ButtonGroup Bg2 = new ButtonGroup();
	static ButtonGroup Bg3 = new ButtonGroup();
	static String gender1;
	static String gender2;
	static JLabel nic = new JLabel(" NIC  :");
	static JLabel pass = new JLabel(" Passcode :");
	static JTextField tn = new JTextField();
	static JButton cont = new JButton("Continue");
	static JRadioButton NB = new JRadioButton("New Booking");
	static JRadioButton EB = new JRadioButton("Extend Booking");
	static JRadioButton UB = new JRadioButton("Update Booking Information");
	static JButton btnNewButton = new JButton("Check  Available Rooms\r\n");
	static JLabel lblNewLabel_2 = new JLabel("Check in :");
	static JLabel lblNewLabel_6 = new JLabel("Check out : ");
	private final static JPasswordField tpas = new JPasswordField();
	static String ls= "Luxury Single Room";
	static String ds= "Deluxe Single Room";
	static String ld= "Luxury Double Room";
    static String dd= "Deluxe Double Room";
    static String sdate ="";
	static DateFormat df =new SimpleDateFormat("yyyy-MM-dd");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking window = new Booking();
					window.frmBookingSection.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 * 
	 */
	
	
	private static JPanel panel = new JPanel();
	private static JPanel panel_2 = new JPanel();
	private static JTextField t1 = new JTextField();
	private static JTextField t2 = new JTextField();
	private static JTextField t4 = new JTextField();
	private static JTextField t7 = new JTextField();
	private static JTextField t6 = new JTextField();
	private static JTextField t9 = new JTextField();
	private static JTextField textField_8;
	private static JTextField t5 = new JTextField();
	private static JTextField t10 = new JTextField();
	private static JLabel info = new JLabel("\r\n");
	private final JLabel cover = new JLabel("");
	private static JLabel lblNewLabel_1 = new JLabel("Choose room type :");
	private static JButton clear = new JButton("CLEAR");
	private static JButton b1 = new JButton(ls);
	private static JButton b2 = new JButton(ds);
	private static JButton b3 = new JButton(ld);
	private static JButton b4 = new JButton(dd);
	private static JLabel l2 = new JLabel("Name      ");
	private static JLabel lblNewLabel_3 = new JLabel("NIC      ");
	private static JLabel lblNewLabel_4 = new JLabel("Gender");
	private static JLabel lblNewLabel_5 = new JLabel("Address");
	private static JLabel l2_1 = new JLabel("Name");
	private static JLabel lblNewLabel_3_1 = new JLabel("NIC");
	private static JLabel lblNewLabel_9 = new JLabel("Contact No.");
	private static JLabel lblNewLabel_4_1 = new JLabel("Gender");
	private static JLabel lblNewLabel_5_1 = new JLabel("Address");
	private static JLabel lblNewLabel_8 = new JLabel("Contact No.");
	
	public Booking() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBookingSection = new JFrame();
		frmBookingSection.setTitle("Booking Section");
		frmBookingSection.setBounds(100, 100, 960, 630);
		frmBookingSection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBookingSection.getContentPane().setLayout(null);
		frmBookingSection.setResizable(false);
		
		b1 = new JButton(ls);
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		b1.setBackground(new Color(0, 204, 255));
		b1.setBounds(177, 116, 166, 30);
		frmBookingSection.getContentPane().add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Bg3.isSelected(null)){
					JOptionPane.showMessageDialog(null, "Please 1st select a booking option","Booking option missing!",JOptionPane.WARNING_MESSAGE);
					
				}
				else if(e.getSource()==b1 && NB.isSelected() ) {
					Component[] comp = panel_2.getComponents();
					for(int n=0; n<comp.length; n++) {
						comp[n].setEnabled(false);
					}
					Component[] comp1 = panel.getComponents();
					for(int n=0; n<comp1.length; n++) {
						comp1[n].setEnabled(true);
					}
					textField_8.setText(ls);
					textField_8.setVisible(true);
					lblNewLabel_7.setVisible (false);
					lblNewLabel_7.setOpaque(false);
					comboBox.setVisible(false);
					comboBox.removeAllItems();
					b5.setEnabled(true);
					t6.setText(null);
					t7.setText(null);
					Bg2.clearSelection();
					t9.setText(null);
					t10.setText(null);
				}
				else {
					b1.setVisible(false);				}
				
			}
		});
		
		b2 = new JButton(ds);
		b2.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		b2.setBackground(new Color(0, 153, 204));
		b2.setBounds(353, 116, 167, 30);
		frmBookingSection.getContentPane().add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Bg3.isSelected(null)){
					JOptionPane.showMessageDialog(null, "Please 1st select a booking option","Booking option missing!",JOptionPane.WARNING_MESSAGE);
					
				}
				
			    else if(e.getSource()==b2 && NB.isSelected() ) {
					Component[] comp = panel_2.getComponents();
					for(int n=0; n<comp.length; n++) {
						comp[n].setEnabled(false);
					}
					Component[] comp1 = panel.getComponents();
					for(int n=0; n<comp1.length; n++) {
						comp1[n].setEnabled(true);
					}
					textField_8.setText(ds);
					textField_8.setVisible(true);
					lblNewLabel_7.setVisible (false);
					lblNewLabel_7.setOpaque(false);
					comboBox.setVisible(false);
					comboBox.removeAllItems();
					b5.setEnabled(true);
					t6.setText(null);
					t7.setText(null);
					Bg2.clearSelection();
					t9.setText(null);
					t10.setText(null);
				}
				
			    
			}
		});
		
		JButton b3 = new JButton(ld);
		b3.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		b3.setForeground(Color.WHITE);
		b3.setBackground(new Color(0, 51, 204));
		b3.setBounds(530, 116, 189, 30);
		frmBookingSection.getContentPane().add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Bg3.isSelected(null)){
					JOptionPane.showMessageDialog(null, "Please 1st select a booking option","Booking option missing!",JOptionPane.WARNING_MESSAGE);
					
				}
				
			    else if(e.getSource()==b3 && NB.isSelected() ) {
					Component[] comp = panel_2.getComponents();
					for(int n=0; n<comp.length; n++) {
						comp[n].setEnabled(true);
					}
					Component[] comp1 = panel.getComponents();
					for(int n=0; n<comp1.length; n++) {
						comp1[n].setEnabled(true);
					}
					textField_8.setText(ld);
					textField_8.setVisible(true);
					lblNewLabel_7.setVisible (false);
					lblNewLabel_7.setOpaque(false);
					comboBox.setVisible(false);
					comboBox.removeAllItems();
					b5.setEnabled(true);
					
				}
			    
			}
		});
		b4 = new JButton(dd);
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		b4.setBackground(new Color(0, 51, 153));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Bg3.isSelected(null)){
					JOptionPane.showMessageDialog(null, "Please 1st select a booking option","Booking option missing!",JOptionPane.WARNING_MESSAGE);
					
				}
			    else if(e.getSource()==b4 && NB.isSelected() ) {
					Component[] comp = panel_2.getComponents();
					for(int n=0; n<comp.length; n++) {
						comp[n].setEnabled(true);
					}
					Component[] comp1 = panel.getComponents();
					for(int n=0; n<comp1.length; n++) {
						comp1[n].setEnabled(true);
					}
					textField_8.setText(dd);
					textField_8.setVisible(true);
					lblNewLabel_7.setVisible (false);
					lblNewLabel_7.setOpaque(false);
					comboBox.setVisible(false);
					comboBox.removeAllItems();
					b5.setEnabled(true);
					
				}
				
			}
		});
		b4.setBounds(729, 116, 184, 30);
		frmBookingSection.getContentPane().add(b4);
		panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (textField_8.getText().isEmpty() && UB.isSelected()==false) {
					JOptionPane.showMessageDialog(null, "Please pick a room type ","Room type not selected",JOptionPane.WARNING_MESSAGE);
					e.consume();
					
				}
				else if (comboBox.getSelectedItem()== null  && NB.isSelected() && dateChooser_1.getDate() !=null) {
					JOptionPane.showMessageDialog(null, "Please pick the desired room no by checking available rooms. ","Room No. not selected",JOptionPane.WARNING_MESSAGE);
					e.consume();
				}
				
			}
		});
		panel.setBackground(new Color(255, 255, 153));
		
		
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Customer_1 Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(5, 9, 6)));
		panel.setBounds(21, 328, 424, 192);
		frmBookingSection.getContentPane().add(panel);
		panel.setLayout(null);
		//panel.setVisible(false);
		
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(t1.getText().isEmpty() && e.getKeyChar()==' ') {
					
					e.consume();
				}
				
			}
		});
		t1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		t1.setBounds(107, 22, 257, 26);
		panel.add(t1);
		t1.setColumns(10);
		
		
		l2.setBounds(20, 28, 67, 14);
		panel.add(l2);
		
		t2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int n = t2.getText().length();
				char c = e.getKeyChar();
				
				if ((n<9  && !Character.isDigit(c)) || (t2.getText().contains("v") && !Character.isDigit(c) ) || n== 10   ) {
					e.consume();
					
				}
				if(n==8 && t2.getText().contains("v")==false && Character.isDigit(c)) {
					t2.setText(t2.getText()+c+"v");
					e.consume();
				}
				if(n==9 && t2.getText().contains("v")==false) {
					e.consume();
					t2.setText(t2.getText()+"v");
				}
				
			}
		});
		t2.setBounds(107, 53, 257, 26);
		panel.add(t2);
		t2.setColumns(10);
		
		t4.setBounds(107, 115, 257, 26);
		panel.add(t4);
		t4.setColumns(10);
		
		lblNewLabel_3.setBounds(20, 59, 57, 14);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4.setBounds(20, 84, 52, 23);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5.setBounds(20, 121, 77, 14);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_9.setBounds(20, 143, 77, 26);
		panel.add(lblNewLabel_9);
		
		t5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c) || t5.getText().length()==10) {
					e.consume();
					
				}
				
			}
		});
		t5.setBounds(107, 146, 257, 26);
		panel.add(t5);
		t5.setColumns(10);
		r1.setBackground(new Color(102, 204, 153));
		
		
		
		r1.setBounds(107, 83, 77, 23);
		panel.add(r1);
		r2.setBackground(new Color(102, 204, 153));
		
		
		r2.setBounds(207, 85, 67, 23);
		panel.add(r2);
		
		
		Bg1.add(r1);
		Bg1.add(r2);
		
		b5 = new JButton("BOOK");
		b5.setForeground(Color.BLACK);
		b5.setBackground(Color.GREEN);
		b5.setFocusable(false);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==b5 ) {
				    if(r1.isSelected() && r3.isSelected())  {
                    	gender1 = "Male";
						gender2 = "Male";
						
						
						
					}
                    else if(r1.isSelected() && r4.isSelected()) {
                    	gender1 = "Male";
                    	gender2 = "Female";
                    	
                    }
                    else if(r2.isSelected() && r4.isSelected()) {
                    	gender1 = "Female";
                    	gender2 = "Female";
                    	
                    }
                    else if (r2.isSelected() && r3.isSelected()) {
                    	
                    	gender1 = "Female";
                    	gender2 = "Male";
                    	
                    	
                    }
					
				   else if(r1.isSelected() ){
						
						gender1 = "Male";
						
						
					}
					else if(r2.isSelected() )  {
						
						gender1 = "Female";
						
						
					}
                    
					
					
					cBooking();
				}
				
			}
				
		});
		b5.setBounds(356, 531, 89, 42);
		frmBookingSection.getContentPane().add(b5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 153, 51));
		panel_1.setBounds(0, 0, 954, 53);
		frmBookingSection.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_1.add(lblNewLabel);
		
		
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(SystemColor.info);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 116, 142, 30);
		lblNewLabel_1.setOpaque(true);
		frmBookingSection.getContentPane().add(lblNewLabel_1);
		lblNewLabel_2.setForeground(Color.BLACK);
		
		
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(SystemColor.info);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(21, 234, 78, 30);
		lblNewLabel_2.setOpaque(true);
		frmBookingSection.getContentPane().add(lblNewLabel_2);
		lblNewLabel_6.setForeground(Color.BLACK);
		

		
		
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBackground(SystemColor.info);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(489, 234, 89, 30);
		lblNewLabel_6.setOpaque(true);
		frmBookingSection.getContentPane().add(lblNewLabel_6);
		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(t1.getText().isEmpty() && comboBox.isVisible() && t7.isEnabled()  ) {
					e.consume();
					JOptionPane.showMessageDialog(null, "Please 1st fill all required fields for customer_1 details ","Customer_1 Details",JOptionPane.WARNING_MESSAGE);
					
				}
			}
		});
		panel_2.setBackground(new Color(255, 255, 153));
		
		
		panel_2.setBorder(new TitledBorder(null, "Customer_2  Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(489, 328, 424, 192);
		frmBookingSection.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		t6.setBounds(121, 20, 254, 26);
		t6.setColumns(10);
		panel_2.add(t6);
		
		t9.setBounds(121, 112, 254, 26);
		t9.setColumns(10);
		panel_2.add(t9);
		
		t7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int n = t7.getText().length();
				char c = e.getKeyChar();
				if ((n<9  && !Character.isDigit(c)) || (t7.getText().contains("v") && !Character.isDigit(c) ) || n== 10   ) {
					e.consume();
					
				}
				if(n==8 && t7.getText().contains("v")==false && Character.isDigit(c)) {
					t7.setText(t7.getText()+c+"v");
					e.consume();
				}
				if(n==9 && t7.getText().contains("v")==false) {
					e.consume();
					t7.setText(t7.getText()+"v");
				}
			}
		});
		t7.setBounds(121, 53, 254, 26);
		t7.setColumns(10);
		panel_2.add(t7);
		
		l2_1.setBounds(24, 24, 46, 14);
		panel_2.add(l2_1);
		
		lblNewLabel_3_1.setBounds(24, 56, 46, 14);
		panel_2.add(lblNewLabel_3_1);
		
		lblNewLabel_4_1.setBounds(24, 87, 46, 14);
		panel_2.add(lblNewLabel_4_1);
		
		lblNewLabel_5_1.setBounds(24, 118, 67, 14);
		panel_2.add(lblNewLabel_5_1);
		
		lblNewLabel_8.setBounds(24, 151, 67, 20);
		panel_2.add(lblNewLabel_8);
		
		t10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c) || t10.getText().length()==10) {
					e.consume();
			}
		}
		});
		t10.setBounds(121, 148, 254, 26);
		panel_2.add(t10);
		t10.setColumns(10);
		r3.setBackground(new Color(102, 204, 153));
		
		
		r3.setBounds(121, 85, 67, 23);
		panel_2.add(r3);
		r4.setBackground(new Color(102, 204, 153));
		
		
		r4.setBounds(211, 86, 67, 23);
		panel_2.add(r4);
		
		Bg2.add(r3);
		Bg2.add(r4);
	    comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    comboBox.setForeground(Color.WHITE);
	    comboBox.setBackground(new Color(0, 0, 0));
		
		
	    comboBox.setBounds(489, 287, 120, 30);
		frmBookingSection.getContentPane().add(comboBox);
     	comboBox.setVisible (false);
     	comboBox.setFocusable(false);
		
     	btnNewButton = new JButton("Check  Available Rooms\r\n");
		btnNewButton.setBackground(new Color(204, 255, 51));
		btnNewButton.setFocusable(false);
		
		// Checking room availability
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton)   {
					if (textField_8.getText().isEmpty()) {
						
						JOptionPane.showMessageDialog(null, "Please pick a room type ","Missing Room Type",JOptionPane.WARNING_MESSAGE);
						
					}
					else if (dateChooser.getDate() == null || dateChooser_1.getDate() == null) {
						JOptionPane.showMessageDialog(null, "Please pick both check in and check out dates ","Booking dates",JOptionPane.WARNING_MESSAGE);
						
					}
                    else if (NB.isSelected()) {
						
							getRooms();
					
					}
					
		}
		}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(21, 285, 196, 32);
		frmBookingSection.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(204, 153, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bg3.clearSelection();
				reset();
				home_page window = new home_page();
				window.frmHotelAlizia.setVisible(true);
				frmBookingSection.dispose();
			}
		});
		btnNewButton_1.setBounds(824, 536, 89, 30);
		frmBookingSection.getContentPane().add(btnNewButton_1);
		lblNewLabel_7.setForeground(Color.BLACK);
		
		
		lblNewLabel_7.setBackground(SystemColor.info);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(314, 287, 131, 30);
		lblNewLabel_7.setVisible(false);
		lblNewLabel_7.setOpaque(false);
		frmBookingSection.getContentPane().add(lblNewLabel_7);
		
		
		clear.setForeground(Color.BLACK);
		clear.setFocusable(false);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==clear) {
					textField_8.setText(null);
					textField_8.setVisible(false);
					lblNewLabel_7.setVisible (false);
					lblNewLabel_7.setOpaque(false);
					comboBox.setVisible(false);
					clear();
				}
			}
		});
		clear.setBackground(new Color(220, 20, 60));
		clear.setBounds(489, 531, 99, 42);
		frmBookingSection.getContentPane().add(clear);
		dateChooser.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				
				comboBox.setVisible(false);
				comboBox.removeAllItems();
				lblNewLabel_7.setVisible (false);
				lblNewLabel_7.setOpaque(false);
				
			}
		});
		
		
		dateChooser.setBounds(119, 234, 166, 30);
		frmBookingSection.getContentPane().add(dateChooser);
		dateChooser_1.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				comboBox.setVisible(false);
				comboBox.removeAllItems();
				if(NB.isSelected()) {
					lblNewLabel_7.setVisible (false);
					lblNewLabel_7.setOpaque(false);
				}
				
			}
		});
		
	    
		dateChooser_1.setBounds(608, 234, 166, 30);
		frmBookingSection.getContentPane().add(dateChooser_1);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setForeground(Color.GREEN);
		textField_8.setBackground(Color.BLACK);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_8.setBounds(21, 172, 166, 30);
		textField_8.setVisible(false);
		frmBookingSection.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		textField_8.setEditable(false);
		NB.setForeground(Color.WHITE);
		NB.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		NB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(NB.isSelected()) {
					NB.setBackground(new Color(0, 102, 102));
					UB.setBackground(new Color(204, 51, 102));
					EB.setBackground(new Color(153, 204, 153));
					reset();
					b3.setVisible(true);
				}
				
			}
		});
		NB.setBackground(new Color(255, 102, 102));
		NB.setFont(new Font("Tahoma", Font.BOLD, 14));
		NB.setBounds(0, 52, 343, 52);
		frmBookingSection.getContentPane().add(NB);
		EB.setForeground(Color.WHITE);
		EB.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		EB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(EB.isSelected()) {
					
					EB.setBackground(new Color(0, 102, 102));
					NB.setBackground(new Color(255, 102, 102));
					UB.setBackground(new Color(204, 51, 102));
					lblNewLabel_1.setVisible(false);
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					nic.setVisible(true);
					nic.setOpaque(true);
					pass.setVisible(true);
					pass.setOpaque(true);
					tpas.setVisible(true);
					tn.setVisible(true);
					tn.setEditable(true);
					tpas.setEditable(true);
					cont.setVisible(true);
					clear.setText("CANCEL");
					btnNewButton.setVisible(false);
					Component[] comp = panel_2.getComponents();
					for(int n=0; n<comp.length; n++) {
						comp[n].setEnabled(false);
					}
					Component[] comp2 = panel.getComponents();
					for(int n=0; n<comp2.length; n++) {
						comp2[n].setEnabled(false);
					}
					dateChooser.setEnabled(false);
					dateChooser_1.setEnabled(false);
					dateChooser.setVisible(false);
					btnNewButton.setEnabled(false);
					panel.setVisible(false);
					panel_2.setVisible(false);
					b5.setText("BOOK");
					b5.setEnabled(false);
					info.setBounds(300, 220, 350, 220);
					info.setVisible(true);
					lblNewLabel_7.setBounds(350, 234, 109, 27);
					lblNewLabel_6.setBounds(350, 334, 120, 30);
					dateChooser_1.setBounds(470, 334, 166, 30);
					lblNewLabel_2.setBounds(300, 284, 250, 30);
					lblNewLabel_2.setText("Scheduled Check Out : ");
					lblNewLabel_6.setText("New Check Out : ");
					btnNewButton.setBounds(21,285,250,32);
					clear();
				}
				
			}
		});
		EB.setBackground(new Color(153, 204, 153));
		EB.setFont(new Font("Tahoma", Font.BOLD, 14));
		EB.setBounds(650, 52, 304, 52);
		frmBookingSection.getContentPane().add(EB);
		
		Bg3.add(EB);
		Bg3.add(UB);
		Bg3.add(NB);
		
		tn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(tn.getText().length()==9 || !Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			
			}
		});
		
		tn.setBounds(251, 157, 109, 27);
		tn.setVisible(false);
		frmBookingSection.getContentPane().add(tn);
		tn.setColumns(10);
		cont = new JButton("Continue");
		cont.setForeground(Color.BLACK);
		cont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cont.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				char [] pass = tpas.getPassword();
				
				if(tn.getText().isEmpty() || pass.length==0) {
					JOptionPane.showMessageDialog(null, "Please enter both of  your passcode and NIC. ","Credentials missing",JOptionPane.WARNING_MESSAGE);
				}
				else if(tn.getText().length() != 9) {
					JOptionPane.showMessageDialog(null, "Please enter a correct NIC. ","Incorrect NIC",JOptionPane.WARNING_MESSAGE);
				}
				else {
					
					withdrawDetails();
					
				}
				

			}
		});
		
		
		cont.setFont(new Font("Tahoma", Font.BOLD, 12));
		cont.setBackground(new Color(204, 102, 102));
		cont.setBounds(638, 157, 109, 30);
		cont.setVisible(false);
		frmBookingSection.getContentPane().add(cont);
		nic.setForeground(Color.BLACK);
		
		
		nic.setBackground(new Color(204, 255, 153));
		nic.setFont(new Font("Tahoma", Font.BOLD, 12));
		nic.setBounds(197, 157, 48, 27);
		nic.setVisible(false);
		frmBookingSection.getContentPane().add(nic);
		pass.setForeground(Color.BLACK);
		pass.setBackground(new Color(204, 255, 153));
		
		
		pass.setFont(new Font("Tahoma", Font.BOLD, 12));
		pass.setBounds(404, 157, 78, 27);
		pass.setVisible(false);
		frmBookingSection.getContentPane().add(pass);
		UB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(UB.isSelected()) {
					UB.setBackground(new Color(0, 102, 102));
					NB.setBackground(new Color(255, 102, 102));
					EB.setBackground(new Color(153, 204, 153));
					lblNewLabel_1.setVisible(false);
					dateChooser_1.setBounds(608, 234, 166, 30);
					lblNewLabel_7.setBounds(410, 157, 109, 27);
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					nic.setVisible(true);
					nic.setOpaque(true);
					pass.setVisible(true);
					pass.setOpaque(true);
					tpas.setVisible(true);
					tn.setVisible(true);
					tn.setEditable(true);
					tpas.setEditable(true);
					cont.setVisible(true);
					clear.setText("CLEAR");
					clear();
					
					Component[] comp = panel_2.getComponents();
					for(int n=0; n<comp.length; n++) {
						comp[n].setEnabled(false);
					}
					Component[] comp2 = panel.getComponents();
					for(int n=0; n<comp2.length; n++) {
						comp2[n].setEnabled(false);
					}
					lblNewLabel_2.setText("Check in :");
					lblNewLabel_6.setBounds(489, 234, 89, 30);
					lblNewLabel_6.setText(" Check Out : ");
					lblNewLabel_2.setBounds(21, 234, 79, 30);
					panel.setVisible(true);
					panel_2.setVisible(true);
					info.setBounds(399, 244, 46, 14);
					info.setVisible(false);
					dateChooser.setVisible(true);
					dateChooser.setEnabled(false);
					dateChooser_1.setEnabled(false);
					btnNewButton.setEnabled(false);
					b5.setText("UPDATE");
					b5.setEnabled(false);
					btnNewButton.setVisible(false);
				}
				
			}
		});
		
		
		UB.setForeground(Color.WHITE);
		UB.setFont(new Font("Tahoma", Font.BOLD, 14));
		UB.setHorizontalAlignment(SwingConstants.CENTER);
		UB.setBackground(new Color(204, 51, 102));
		UB.setBounds(343, 52, 308, 52);
		frmBookingSection.getContentPane().add(UB);
		tpas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		tpas.setBounds(489, 157, 109, 27);
		tpas.setVisible(false);
		
		frmBookingSection.getContentPane().add(tpas);
	
		info.setBackground(SystemColor.info);
		info.setBounds(399, 244, 46, 14);
		frmBookingSection.getContentPane().add(info);
		info.setOpaque(true);
		cover.setBackground(new Color(0, 102, 102));
		cover.setBounds(0, 104, 996, 514);
		cover.setOpaque(true);
		
		frmBookingSection.getContentPane().add(cover);
		info.setVisible(false);
		
		
	
	}


	
// booking methods for new , update and extend booking
public static void  cBooking() {
	if(EB.isSelected()){
		extendBooking();
	}
    else {
    	if (textField_8.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please pick a room type ","Room type not selected",JOptionPane.WARNING_MESSAGE);
			
		}
		else if (dateChooser.getDate() == null || dateChooser_1.getDate() == null) {
			JOptionPane.showMessageDialog(null, "Please pick both check in and check out dates ","Select Booking dates",JOptionPane.WARNING_MESSAGE);
		}
		
		else if (comboBox.getSelectedItem() == null && NB.isSelected()) {
			JOptionPane.showMessageDialog(null, "Please pick the desired room no by checking available rooms. ","Pick Room No.",JOptionPane.WARNING_MESSAGE);
		}
		
		else if ((textField_8.getText().equals(ls) || textField_8.getText().equals(ds)||textField_8.getText().equals(ld)||textField_8.getText().equals(dd))&&(t1.getText().isEmpty() || t2.getText().isEmpty() || gender1 == null || t4.getText().isEmpty() || t5.getText().isEmpty())) {
			JOptionPane.showMessageDialog(null, "Please complete all required fields for customer_1 details "," Customer_1 details",JOptionPane.WARNING_MESSAGE);
	
	    }
		else if (( (t6.getText().isEmpty())== false || (gender2 == null)==false) && (textField_8.getText().equals(ld) || textField_8.getText().equals(dd))&&(t1.getText().isEmpty() || t2.getText().isEmpty() || gender1 == null ||  t4.getText().isEmpty() || t5.getText().isEmpty()||t6.getText().isEmpty()
				 || t7.getText().isEmpty()||  gender2 == null || t9.getText().isEmpty() || t10.getText().isEmpty() ))  {
			JOptionPane.showMessageDialog(null, "Please complete both customer_1 details and customer_2 details ","Missing Customer Details",JOptionPane.WARNING_MESSAGE);
		
	    }
		
		
		else {
			
			
				
			
                 if((textField_8.getText().equals(ls) || textField_8.getText().equals(ds)|| textField_8.getText().equals(ld) || textField_8.getText().equals(dd))&&(t2.getText().length() != 10)) {
					
					JOptionPane.showMessageDialog(null, "Please enter a correct NIC for Customer 1  ","Incorrect NIC",JOptionPane.WARNING_MESSAGE);
					
					
				}
                  else if((textField_8.getText().equals(ls) || textField_8.getText().equals(ds) || textField_8.getText().equals(ld) || textField_8.getText().equals(dd))&&(t5.getText().length() != 10)) {
					
					JOptionPane.showMessageDialog(null, "Please enter a correct contact no. for Customer 1 ","Incorrect Contact no. ",JOptionPane.WARNING_MESSAGE);
					
					
				}
	
                
                else if((t6.getText().isEmpty()== false) &&(textField_8.getText().equals(ld) || textField_8.getText().equals(dd))&&(t2.getText().length() != 10 || t7.getText().length()!= 10)) {
  					
  					JOptionPane.showMessageDialog(null, "Please enter correct NIC for both customers ","Incorrect NIC",JOptionPane.WARNING_MESSAGE);
  					
  					
  				}
                else if((t6.getText().isEmpty()== false) &&(textField_8.getText().equals(ld) || textField_8.getText().equals(dd))&&(t5.getText().length() != 10 || t10.getText().length()!= 10)) {
  					
  					JOptionPane.showMessageDialog(null, "Please enter correct contact numbers for both customers ","Incorrect Contact no. ",JOptionPane.WARNING_MESSAGE);
  					
  					
  				}
			
			    else {	
			   
			    Date ci = dateChooser.getDate();
			   
				Date co = dateChooser_1.getDate();
				
				String sd = df.format(ci);
				String  ed= df.format(co);
				
				LocalDate s = LocalDate.parse(sd);
				LocalDate e = LocalDate.parse(ed);
				List<LocalDate> dates = s.datesUntil(e.plusDays(1)).collect(Collectors.toList());
				
			    
				
				if(NB.isSelected()) {
					int res =JOptionPane.showConfirmDialog(null, "Do you want to continue with booking ?","Confirmation",JOptionPane.YES_NO_OPTION);
					if (res == JOptionPane.YES_OPTION) {
					int i;
					String cdetails = "\n Room Type - "+textField_8.getText()+"\n Room No. - "+comboBox.getSelectedItem()+"\n Booked dates - From "+s+" to "+e+"\n\n Customer Details \n\n Name - "+t1.getText()+ "\n NIC - "+t2.getText()+"\n Gender - "+ gender1+"\n Address - "+t4.getText()+"\n Contact No. - "+t5.getText();
					
					
					String c2details = "\n Room Type - "+textField_8.getText()+"\n Room No. - "+comboBox.getSelectedItem()+"\n Booked dates - From "+s+" to "+e+"\n\n Customer 1 Details \n\n Name - "+t1.getText()+ "\n NIC - "+t2.getText()+"\n Gender - "+gender1+" \n Address - "+t4.getText()+"\n Contact No. - "+t5.getText()
							 +"\n\n Customer 2 Details \n\n Name - "+t6.getText()+ "\n NIC - "+t7.getText()+"\n Gender - "+gender2+"\n Address - "+t9.getText()+
									 "\n Contact No - "+t10.getText();
					for (i=0;  i < dates.size();i++) {
						
						LocalDate date = dates.get(i);
						 String roomno =comboBox.getSelectedItem()+",";
						 
						 // booking details 
						 
						 File f1 = new File("..\\..\\Hotel\\BookingDetails\\RoomCdetails");
						 File f2 = new File("..\\..\\Hotel\\BookingDetails\\AllRooms");
						 File f3 = new File("..\\..\\Hotel\\BookingDetails\\"+textField_8.getText());
						 File f4 = new File("..\\..\\Hotel\\Unbooked\\"+textField_8.getText());
						 
						 if ((f1.exists()==false && f2.exists()==false) || f3.exists()==false ) {
							 f1.mkdirs(); 
							 f2.mkdirs(); 
							 f3.mkdirs();
							 f4.mkdirs();
						 }
						
						 try {
								FileWriter w1 = new FileWriter("..\\..\\Hotel\\BookingDetails\\AllRooms\\"+date+".txt",true);
								
								 FileWriter w2 = new FileWriter("..\\..\\Hotel\\BookingDetails\\"+textField_8.getText()+"\\"+date+".txt",true);
								 w2.write(roomno);
							     w2.close();
								 FileWriter w3 = new FileWriter("..\\..\\Hotel\\BookingDetails\\RoomCdetails\\"+comboBox.getSelectedItem()+"_"+date+".txt");
								 if(t6.getText().isEmpty()) {
									     w3.write(cdetails);
									     w1.write(roomno);
										
									     
								 }
								 else {
										w3.write(c2details);
										w1.write(roomno);
								}
								Path filename = Path.of("Hotel\\"+textField_8.getText()+".txt");
								String str = Files.readString(filename);
								String [] str1 = str.split(",");
								List<String> list = new ArrayList(Arrays.asList(str1));
								Path filename2 = Path.of("..\\..\\Hotel\\BookingDetails\\"+textField_8.getText()+"\\"+date+".txt");
								String str2 = Files.readString(filename2);
								String [] str3 = str2.split(",");
								List<String> list2 = new ArrayList(Arrays.asList(str3));
								list.removeAll(list2);
								String content = "";
								for (int n =0 ; n<list.size();n++) {
									String c = list.get(n)+",";
									content += c;
									
									
								}
								FileWriter w4 = new FileWriter("..\\..\\Hotel\\Unbooked\\"+textField_8.getText()+"\\"+date+".txt");
								w4.write(content);
								w4.close();
								w3.close();
								w1.close();
		 						
								if (i +1 == dates.size()  ) {
									Integer ran = (int)(Math.random()*(1000-0+1)+0) ;
									String nic = t2.getText().substring(0,5);
									File F5 = new  File("..\\..\\Hotel\\C_Unbooking\\");
									File F6 = new  File("..\\..\\Hotel\\C_Credentials\\");
									if(F5.exists()==false) {
										F5.mkdirs();
										F6.mkdirs();
										
								} 
									// unbooked list
									FileWriter pc = new FileWriter("..\\..\\Hotel\\C_Unbooking\\"+ran+"_"+nic+".txt");
									pc.write(comboBox.getSelectedItem()+"\n"+textField_8.getText()+"\n"+s+"\n"+e); 
									pc.close();
									FileWriter nw = new FileWriter("..\\..\\Hotel\\C_Credentials\\"+t2.getText().substring(0,9)+"_"+s+".txt",true);
									nw.write("Room No. "+ comboBox.getSelectedItem()+" - " +Integer.toString(ran)+"\n");
									nw.close();
								    JOptionPane.showMessageDialog(null, "Room no - "+comboBox.getSelectedItem()+" is successfully booked by "+ t1.getText()+" from "+s+" to "+e+" .\nPasscode for your booking -  "+ran+"\nRemember this passcode for further modifications with your booking completed !","Booking Success",JOptionPane.INFORMATION_MESSAGE);
									clear();
									textField_8.setVisible(false);
									}
								}
								
							
							    catch (IOException e1) {
							    	JOptionPane.showMessageDialog(null, "Room number list unavailable! ","Room numbers missing!",JOptionPane.WARNING_MESSAGE);
							 }

						}
				   }
				}
				else if (UB.isSelected()) {
					int res =JOptionPane.showConfirmDialog(null, "Do you want to continue with updating your booking details ?","Confirmation",JOptionPane.YES_NO_OPTION);
					if (res == JOptionPane.YES_OPTION) {
						int i;
						String room = lblNewLabel_7.getText();
						String roomnum = room.substring(11);
						for (i=0;  i < dates.size();i++) {
							
							LocalDate date = dates.get(i);
							
							
							try {
								
								 FileWriter w3 = new FileWriter("..\\..\\Hotel\\BookingDetails\\RoomCdetails\\"+roomnum+"_"+date+".txt",false);
								 String cdetails = "\n Room Type - "+textField_8.getText()+"\n Room No. - "+roomnum+"\n Booked dates - From "+s+" to "+e+"\n\n Customer Details \n\n Name - "+t1.getText()+ "\n NIC - "+t2.getText()+"\n Gender - "+ gender1+"\n Address - "+t4.getText()+"\n Contact No. - "+t5.getText();
									
									
									String c2details = "\n Room Type - "+textField_8.getText()+"\n Room No. - "+roomnum+"\n Booked dates - From "+s+" to "+e+"\n\n Customer 1 Details \n\n Name - "+t1.getText()+ "\n NIC - "+t2.getText()+"\n Gender - "+gender1+" \n Address - "+t4.getText()+"\n Contact No. - "+t5.getText()
											 +"\n\n Customer 2 Details \n\n Name - "+t6.getText()+ "\n NIC - "+t7.getText()+"\n Gender - "+gender2+"\n Address - "+t9.getText()+
													 "\n Contact No - "+t10.getText();
								 if(t6.getText().isEmpty()) {
									     w3.write(cdetails);
									     w3.close();
								   
								 }
								 else {
										w3.write(c2details);
										w3.close();
										
								}
							}catch(Exception ex) {
								
							}
							if (i+1 == dates.size()) {
								// if nic changes file renaming
								File f1 = new File("..\\..\\Hotel\\C_Unbooking\\"+String.valueOf(tpas.getPassword())+"_"+tn.getText().substring(0,5)+".txt");
								
								File f2 = new File("..\\..\\Hotel\\C_Unbooking\\"+String.valueOf(tpas.getPassword())+"_"+t2.getText().substring(0, 5)+".txt");
								f1.renameTo(f2);
								
								File f3 = new File("..\\..\\Hotel\\C_Credentials\\"+tn.getText()+"_"+s+".txt");
								File f4 = new File("..\\..\\Hotel\\C_Credentials\\"+t2.getText().substring(0, 9)+"_"+s+".txt");
								f3.renameTo(f4);
								JOptionPane.showMessageDialog(null, "Booking details for "+textField_8.getText()+ ", number - "+roomnum+" are successfully updated !","Booking Details Updated",JOptionPane.INFORMATION_MESSAGE);
								clear();

								Component[] comp = panel_2.getComponents();
								for(int n=0; n<comp.length; n++) {
									comp[n].setEnabled(false);
								}
								Component[] comp1 = panel.getComponents();
								for(int n=0; n<comp1.length; n++) {
									comp1[n].setEnabled(false);
								}
								b5.setEnabled(false);
								tn.setEditable(true);
								tpas.setEditable(true);
								tn.setVisible(true);
								tpas.setVisible(true);
								cont.setVisible(true);
								nic.setVisible(true);
								pass.setVisible(true);
								
							}
						}
						
						
					}
					
					
					
				}
			 
				
				}
					
	   }
	
	
		
	}
		
		
 }

// get available rooms for a new booking
public static void getRooms()  {
	comboBox.removeAllItems();
	Date ci = dateChooser.getDate();
	Date co = dateChooser_1.getDate();

	String sd = df.format(ci);
	String  ed= df.format(co);
	
	LocalDate s = LocalDate.parse(sd);
	LocalDate e = LocalDate.parse(ed);
	
	Date to = new Date();
	String tod = df.format(to);
	LocalDate today = LocalDate.parse(tod);
	if ((s.compareTo(today)>= 0)== false  ) {
		lblNewLabel_7.setVisible (false);
		lblNewLabel_7.setOpaque(false);
		comboBox.setVisible (false);
		JOptionPane.showMessageDialog(null, "Please pick a correct Check In Date! Should be the current date or a date ahead ","Incorrect Check In Date",JOptionPane.WARNING_MESSAGE);
		
	}
	
	else if (e.compareTo(s)>= 0  ) {
	List<LocalDate> dates = s.datesUntil(e.plusDays(1)).collect(Collectors.toList());
	List<String> list = new ArrayList<String>();
	for (int in=0;  in < dates.size();in++) {
		
		LocalDate date = dates.get(in);
		Path path = Paths.get("..\\..\\Hotel\\BookingDetails\\"+textField_8.getText()+"\\"+date+".txt");
		try {
			if(Files.exists(path)) {
				byte [] d = Files.readAllBytes(Paths.get("..\\..\\Hotel\\BookingDetails\\"+textField_8.getText()+"\\"+date+".txt"));
				String  str1 = new String(d);
				String [] str2 = str1.split(",");
				List<String> li1 = new ArrayList(Arrays.asList(str2));
				list.addAll(li1);
				
				}
				else {
					list.add("");
				}
				if(in+1 == dates.size()) {
					byte[] f = Files.readAllBytes(Paths.get("Hotel\\"+textField_8.getText()+".txt"));
					String  str1 = new String(f);
					String [] str2 = str1.split(",");
					List<String> li2 = new ArrayList(Arrays.asList(str2));
					li2.removeAll(list);
					
					File unavailable = new File("..\\..\\Hotel\\Maintenance\\unavailable.txt");
					
					if(unavailable.exists()) {
						byte[] u = Files.readAllBytes(Paths.get("..\\..\\Hotel\\Maintenance\\unavailable.txt"));
						String  str3 = new String(u);
						String [] str4 = str3.split("\n");
						List<String> li3 = new ArrayList(Arrays.asList(str4));
						li2.removeAll(li3);
					}
					
					
					if(li2.isEmpty()) {
						
						Component[] comp = panel_2.getComponents();
						for(int n=0; n<comp.length; n++) {
							comp[n].setEnabled(false);
						}
						Component[] comp2 = panel.getComponents();
						for(int n=0; n<comp2.length; n++) {
							comp2[n].setEnabled(false);
						}
						
						lblNewLabel_7.setBounds(314, 285, 150, 30);
						lblNewLabel_7.setText (" Rooms Unavailable !");
						lblNewLabel_7.setBackground(Color.BLACK);
						lblNewLabel_7.setForeground(Color.RED);
						lblNewLabel_7.setVisible (true);
						lblNewLabel_7.setOpaque(true);
						comboBox.setVisible (false);
						b5.setEnabled(false);
						t1.setText(null);
						t2.setText(null);
						Bg1.clearSelection();
						t4.setText(null);
						t5.setText(null);
						t6.setText(null);
						t7.setText(null);
						Bg2.clearSelection();
						t9.setText(null);
						t10.setText(null);
						comboBox.removeAllItems();
					}
					else {
						if (textField_8.getText().equals(ld) || textField_8.getText().equals(dd)) {
							
							Component[] comp2 = panel_2.getComponents();
							for(int n=0; n<comp2.length; n++) {
								comp2[n].setEnabled(true);
							}
							Component[] comp = panel.getComponents();
							for(int n=0; n<comp.length; n++) {
								comp[n].setEnabled(true);
							}
							b5.setEnabled(true);
						}
						else {
							Component[] comp = panel.getComponents();
							for(int n=0; n<comp.length; n++) {
								comp[n].setEnabled(true);
							}
							b5.setEnabled(true);
						}
						
						for (int n=0; n<li2.size(); n++ ) {
					    	comboBox.addItem(li2.get(n));
					    }
						lblNewLabel_7.setBackground(new Color(245, 222, 179));
						lblNewLabel_7.setForeground(Color.BLACK);
						lblNewLabel_7.setText (" Select Room No : ");
						lblNewLabel_7.setBounds(314, 285, 131, 30);
					    lblNewLabel_7.setVisible (true);
						lblNewLabel_7.setOpaque(true);	 
						comboBox.setVisible (true);
					}
				  } 
		}catch(IOException ex) {
			JOptionPane.showMessageDialog(null, "Room number list unavailable! ","Room numbers missing!",JOptionPane.WARNING_MESSAGE);
		}
	   }
	}
	else {
		lblNewLabel_7.setVisible (false);
		lblNewLabel_7.setOpaque(false);
		comboBox.setVisible (false);
		JOptionPane.showMessageDialog(null, "Please pick a correct Check Out date! ","Incorrect Check Out date",JOptionPane.WARNING_MESSAGE);
	}

			     
}
private static void reset() {
	lblNewLabel_1.setVisible(true);
	b1.setVisible(true);
	b2.setVisible(true);
	b3.setVisible(true);
	b4.setVisible(true);
	nic.setVisible(false);
	nic.setOpaque(false);
	pass.setVisible(false);
	pass.setOpaque(false);
	tpas.setVisible(false);
	tn.setVisible(false);
	cont.setVisible(false);
	lblNewLabel_2.setText("Check in :");
	lblNewLabel_7.setBounds(314, 287, 131, 30);
	clear.setText("CLEAR");
	
	b5.setText("BOOK");
	b5.setEnabled(true);
	btnNewButton.setVisible(true);
	clear();
	Component[] comp = panel_2.getComponents();
	for(int n=0; n<comp.length; n++) {
		comp[n].setEnabled(true);
	}
	Component[] comp2 = panel.getComponents();
	for(int n=0; n<comp2.length; n++) {
		comp2[n].setEnabled(true);
	}
	panel.setVisible(true);
	panel_2.setVisible(true);
	info.setBounds(399, 244, 46, 14);
	info.setVisible(false);
	lblNewLabel_6.setBounds(489, 234, 89, 30);
	dateChooser_1.setBounds(608, 234, 166, 30);
	lblNewLabel_2.setBounds(21, 234, 78, 30);
	b5.setEnabled(true);
	dateChooser.setEnabled(true);
	dateChooser.setVisible(true);
	dateChooser_1.setEnabled(true);
	dateChooser_1.setBounds(608, 234, 166, 30);
	btnNewButton.setEnabled(true);
	btnNewButton.setText("Check Room Availabilty");
	btnNewButton.setBounds(21,285,196,32);
	lblNewLabel_6.setBounds(489, 234, 89, 30);
	lblNewLabel_7.setBounds(314, 287, 131, 30);
	lblNewLabel_6.setText(" Check Out : ");
	lblNewLabel_2.setBounds(21, 234, 79, 30);
}
	
// clear button	
private static void clear() {
	dateChooser.setCalendar(null);
	dateChooser_1.setCalendar(null);
	t1.setText(null);
	t2.setText(null);
	Bg1.clearSelection();
	t4.setText(null);
	t5.setText(null);
	t6.setText(null);
	t7.setText(null);
	Bg2.clearSelection();
	t9.setText(null);
	t10.setText(null);
	comboBox.removeAllItems();
	tn.setText(null);
	tpas.setText(null);
	textField_8.setText(null);
	textField_8.setVisible(false);
	tn.setEditable(true);
	tpas.setEditable(true);
	cont.setEnabled(true);
	if(EB.isSelected()) {
		lblNewLabel_2.setText("Scheduled Check Out : ");
		lblNewLabel_2.setBounds(300, 284, 250, 30);
		dateChooser_1.setEnabled(false);
		
	}
	if(EB.isSelected() || UB.isSelected()) {
		tn.setVisible(true);
		tpas.setVisible(true);
		cont.setVisible(true);
		nic.setVisible(true);
		pass.setVisible(true);
		b5.setEnabled(false);
		Component[] comp = panel_2.getComponents();
		for(int n=0; n<comp.length; n++) {
			comp[n].setEnabled(false);
		}
		Component[] comp1 = panel.getComponents();
		for(int n=0; n<comp1.length; n++) {
			comp1[n].setEnabled(false);
	    }
	}
	
}

// to fill text fields in extend booking and update booking	
public static void  withdrawDetails() {
	char [] pasc = tpas.getPassword();
	String tpass = String.valueOf(pasc);
	
		File file = new File("..\\..\\Hotel\\C_Unbooking\\"+tpass+"_"+tn.getText().substring(0,5)+".txt");
		
		if(file.exists()) {
			
			tn.setEditable(false);
			tpas.setEditable(false);
			cont.setEnabled(false);
			tn.setVisible(false);
			tpas.setVisible(false);
			nic.setVisible(false);
			pass.setVisible(false);
			cont.setVisible(false);
			
		
			//t2.setEditable(false);
			Component[] comp = panel_2.getComponents();
			for(int n=0; n<comp.length; n++) {
				comp[n].setEnabled(true);
			}
			Component[] comp2 = panel.getComponents();
			for(int n=0; n<comp2.length; n++) {
				comp2[n].setEnabled(true);
			}
			b5.setEnabled(true);
			btnNewButton.setVisible(false);
			
			byte[] d;
			try {
				// to get room number and dates 
				d = Files.readAllBytes(Paths.get("..\\..\\Hotel\\C_Unbooking\\"+tpass+"_"+tn.getText().substring(0,5)+".txt"));
				String  str1 = new String(d);
				String[] str2  = str1 .split("\n");
				List<String> list = new ArrayList(Arrays.asList(str2)); 
				String roomno = list.get(0);
				String type= list.get(1);
				String ci = list.get(2);
				String co = list.get(3);
				textField_8.setText(type);
				
				lblNewLabel_7.setText(" Room no : "+roomno);
				
				
				// getting details
				byte[]  str3= Files.readAllBytes(Paths.get("..\\..\\Hotel\\BookingDetails\\RoomCdetails\\"+roomno+"_"+ci+".txt"));
				String  customer = new String(str3);
				String[] str4 = customer.split("\n");
				List<String> list1 = new ArrayList(Arrays.asList(str4));
				
				Date s;
				Date end;
				Date to = new Date();
				String  tod= df.format(to);
				LocalDate today = LocalDate.parse(tod);
				LocalDate ending = LocalDate.parse(co);
				
				
				if(ending.compareTo(today)  >= 0) {

					try {
						s = df.parse(ci);
						dateChooser.setDate(s);
						
						sdate = df.format(s);
						
						end = df.parse(co);
						if(EB.isSelected()  ) {
							Calendar c = Calendar.getInstance();
							c.setTime(end);
							c.add(Calendar.DATE, 1);
							String en = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
							Date last = new SimpleDateFormat("yyyy-MM-dd").parse(en);
							
							dateChooser_1.setDate(last);
						
						}
						else  {
							
							dateChooser_1.setDate(end);
							
						}
						
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					lblNewLabel_7.setOpaque(true);
					lblNewLabel_7.setVisible(true);
					
					if(textField_8.getText().equals(ls) || textField_8.getText().equals(ds)|| (textField_8.getText().equals(ld) && list1.size()<20) || (textField_8.getText().equals(dd) && list1.size()<20)) {
						for(int i =0 ; i<7 ; i++) {
							list1.remove(0);
						}
						String content ="" ;
						for(int n=0;n<list1.size();n++) {
							String c = list1.get(n)+",";
							String[] p = c.split("-");
							List<String> list2 = new ArrayList(Arrays.asList(p));
							content += list2.get(1);

							
						}
						String[] details = content.split(",");
						List<String> list3 = new ArrayList(Arrays.asList(details));
						t1.setText(list3.get(0).substring(1));
						t2.setText(list3.get(1).substring(1));
	                    String gen=list3.get(2);
						
						if (gen.charAt(1)=='F') {
							r1.setSelected(false);
							r2.setSelected(true);
						}
						else {
							r1.setSelected(true);
							r2.setSelected(false);
						}
						t4.setText(list3.get(3).substring(1));
						t5.setText(list3.get(4).substring(1));
						if(textField_8.getText().equals(ls) || textField_8.getText().equals(ds)){
							Component[] comp3 = panel_2.getComponents();
							for(int n=0; n<comp3.length; n++) {
								comp3[n].setEnabled(false);
							}
							
						}
						
					}
					else {
						
						for(int i =0 ; i<7 ; i++) {
							list1.remove(0);
						}
						for(int i =0 ; i<3 ; i++) {
							list1.remove(5);
						}
						String content ="" ;
						for(int n=0;n<list1.size();n++) {
							String c = list1.get(n)+",";
							String[] p = c.split("-");
							List<String> list2 = new ArrayList(Arrays.asList(p));
							content += list2.get(1);

							
						}
						String[] details = content.split(",");
						List<String> list3 = new ArrayList(Arrays.asList(details));
						t1.setText(list3.get(0).substring(1));
						t2.setText(list3.get(1).substring(1));
						String gen=list3.get(2);
						
						if (gen.charAt(1)=='F') {
							r1.setSelected(false);
							r2.setSelected(true);
						}
						else {
							r1.setSelected(true);
							r2.setSelected(false);
						}
						t4.setText(list3.get(3).substring(1));
						t5.setText(list3.get(4).substring(1));
						t6.setText(list3.get(5).substring(1));
						t7.setText(list3.get(6).substring(1));
						String gen2=list3.get(7);
						if (gen2.charAt(1)=='M') {
							r3.setSelected(true);
							r4.setSelected(false);
						}
						else {
							r3.setSelected(false);
							r4.setSelected(true);
						}
						t9.setText(list3.get(8).substring(1));
						t10.setText(list3.get(9).substring(1));
						
					}
					
					if(EB.isSelected()  ) {
						
						Component[] comp3 = panel_2.getComponents();
						for(int n=0; n<comp3.length; n++) {
							comp3[n].setEnabled(false);
						}
						Component[] comp4 = panel.getComponents();
						for(int n=0; n<comp4.length; n++) {
							comp4[n].setEnabled(false);
						}
						
						b5.setText("BOOK");
						
						dateChooser.setEnabled(false);
						dateChooser_1.setEnabled(true);
						btnNewButton.setVisible(false);
						btnNewButton.setEnabled(false);
						dateChooser.setVisible(false);
						DateFormat df1 =new SimpleDateFormat("yyyy-MM-dd");
						Date sd = df1.parse(co);
						DateFormat df2 =new SimpleDateFormat("MMM dd,yyyy");
						String date = df2.format(sd);
						lblNewLabel_2.setBounds(350, 284, 250, 30);
						lblNewLabel_2.setText("Scheduled Check Out : "+date);
						lblNewLabel_7.setOpaque(true);
						lblNewLabel_7.setVisible(true);
					}
					
					
				}
				else {
					clear();
					JOptionPane.showMessageDialog(null, "Booking already Expired !","Expired",JOptionPane.ERROR_MESSAGE);
					
				}
				
			} catch (IOException | ParseException | IndexOutOfBoundsException e) {
				clear();
				JOptionPane.showMessageDialog(null, "Incorrect File Format !","File Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
			
		}
		else {
			clear();
			JOptionPane.showMessageDialog(null, "Booking does not exists !","Error",JOptionPane.ERROR_MESSAGE);
			
		}
		
}

public static void  extendBooking() {
	Date co = dateChooser_1.getDate();
	String ini= lblNewLabel_2.getText();
	String s = ini.substring(22);
	LocalDate st1 = LocalDate.parse(sdate);
	
	try {
		DateFormat df1 =new SimpleDateFormat("MMM dd,yyyy");
		Date datesche = df1.parse(s);
		
		String sd=df.format(datesche);
		String  ed= df.format(co);
		
		LocalDate st = LocalDate.parse(sd);
		LocalDate e = LocalDate.parse(ed);
		String roomnum = lblNewLabel_7.getText().substring(11);
		
		if ( e.compareTo(st)> 0  ) {
			List<LocalDate> dates = st.datesUntil(e.plusDays(1)).collect(Collectors.toList());
			int count = 0;
			for (int in=0;  in < dates.size();in++) {
				
				LocalDate date = dates.get(in);
				// checking booked room list by room type for dates given 
				Path path = Paths.get("..\\..\\Hotel\\BookingDetails\\"+textField_8.getText()+"\\"+date+".txt");
				if(Files.exists(path)) {
					byte[] d;
					try {
						d = Files.readAllBytes(Paths.get("..\\..\\Hotel\\BookingDetails\\"+textField_8.getText()+"\\"+date+".txt"));
						String  str1 = new String(d);
						String [] str2 = str1.split(",");
						List<String> li1 = new ArrayList(Arrays.asList(str2));
						
                       
						if(li1.contains(roomnum) ) {
							count ++;
							
						}
						
						
					} catch (IOException e1) {
						
					}
				
				
			    }
				
			 }
			 File unavailable = new File("..\\..\\Hotel\\Maintenance\\unavailable.txt");
             try {
            	 if(unavailable.exists()) {
 					byte[] u = Files.readAllBytes(Paths.get("..\\..\\Hotel\\Maintenance\\unavailable.txt"));
 					String  str3 = new String(u);
 					String [] str4 = str3.split("\n");
 					List<String> li3 = new ArrayList(Arrays.asList(str4));
 					if(li3.contains(roomnum) ) {
						count ++;
						
					}
 					
 				}
             }
             catch(Exception e1) {
            	 JOptionPane.showMessageDialog(null, "Rooms details missing!. ","Room details",JOptionPane.ERROR_MESSAGE);
     			
             }
				
			if(count == 1) {
				
				b5.setEnabled(true);
				int res =JOptionPane.showConfirmDialog(null, "Do you want to continue with extending booking ?","Confirmation",JOptionPane.YES_NO_OPTION);
				if (res == JOptionPane.YES_OPTION) {
					char [] pass = tpas.getPassword();
					String tpass = String.valueOf(pass);
					
					Date ci;
					try {
						
						byte [] d = Files.readAllBytes(Paths.get("..\\..\\Hotel\\C_Unbooking\\"+tpass+"_"+tn.getText().substring(0,5)+".txt"));
						
						String  str1 = new String(d);
						String[] str2  = str1 .split("\n");
						List<String> list = new ArrayList(Arrays.asList(str2)); 
						
						String start = list.get(2);
						
						String cdetails = "\n Room Type - "+textField_8.getText()+"\n Room No. - "+roomnum+"\n Booked dates - From "+start+" to "+e+"\n\n Customer Details \n\n Name - "+t1.getText()+ "\n NIC - "+t2.getText()+"\n Gender - "+ gender1+"\n Address - "+t4.getText()+"\n Contact No. - "+t5.getText();
						
						
						String c2details = "\n Room Type - "+textField_8.getText()+"\n Room No. - "+comboBox.getSelectedItem()+"\n Booked dates - From "+start+" to "+e+"\n\n Customer 1 Details \n\n Name - "+t1.getText()+ "\n NIC - "+t2.getText()+"\n Gender - "+gender1+" \n Address - "+t4.getText()+"\n Contact No. - "+t5.getText()
								 +"\n\n Customer 2 Details \n\n Name - "+t6.getText()+ "\n NIC - "+t7.getText()+"\n Gender - "+gender2+"\n Address - "+t9.getText()+
										 "\n Contact No - "+t10.getText();
						
						List<LocalDate> dates1 = st1.datesUntil(e.plusDays(1)).collect(Collectors.toList());
			            for (int in=0;  in < dates1.size();in++) {
			            	LocalDate date = dates1.get(in);
			            	FileWriter w1 = new FileWriter("..\\..\\Hotel\\BookingDetails\\RoomCdetails\\"+roomnum+"_"+date+".txt",false);
			            	FileWriter w2 = new FileWriter("..\\..\\Hotel\\BookingDetails\\AllRooms\\"+date+".txt",true);
			            	FileWriter w3 = new FileWriter ("..\\..\\Hotel\\BookingDetails\\"+textField_8.getText()+"\\"+date+".txt",true);
			            	
			            		
								
			            	if(t6.getText().isEmpty()) {
							     w1.write(cdetails);
							     w1.close();
								
							     
						    }
						    else {
								w1.write(c2details);
								w1.close();
						     }	
							 if(date.compareTo(st)> 0) {	
								w2.write(roomnum+",");
								w3.write(roomnum+",");
								w2.close();
								w3.close();
							 }
								// to update unbooked list by room type
								Path filename = Path.of("Hotel\\"+textField_8.getText()+".txt");
								String str = Files.readString(filename);
								String [] str_1 = str.split(",");
								List<String> listr = new ArrayList(Arrays.asList(str_1));
								Path filename2 = Path.of("..\\..\\Hotel\\BookingDetails\\"+textField_8.getText()+"\\"+date+".txt");
								String str_2 = Files.readString(filename2);
								String [] str_3 = str_2.split(",");
								List<String> list2 = new ArrayList(Arrays.asList(str_3));
								listr.removeAll(list2);
								String content = "";
								for (int n =0 ; n<listr.size();n++) {
									String c = listr.get(n)+",";
									content += c;
									
									
								}
								FileWriter w4 = new FileWriter("..\\..\\Hotel\\Unbooked\\"+textField_8.getText()+"\\"+date+".txt");
								w4.write(content);	
								w4.close();  
								 
								 
			            }
			            
							
							FileWriter w5 = new FileWriter("..\\..\\Hotel\\C_Unbooking\\"+String.valueOf(tpas.getPassword())+"_"+tn.getText().substring(0,5)+".txt");
					            w5.write(roomnum+"\n"+textField_8.getText()+"\n"+sdate+"\n"+e);
					            w5.close();
			           
							
					}catch(Exception x) {
						JOptionPane.showMessageDialog(null, "Room number list unavailable! ","Room numbers missing!",JOptionPane.WARNING_MESSAGE);
						
					}
					JOptionPane.showMessageDialog(null, "Booking successfully extended!. ","Booking extended!",JOptionPane.INFORMATION_MESSAGE);
					clear();
					lblNewLabel_2.setText("Scheduled Check Out : ");
					tn.setVisible(true);
					tpas.setVisible(true);
					cont.setVisible(true);
					b5.setEnabled(false);
					
				}
						
						
			}
			else {
					b5.setEnabled(false);
					clear();
					JOptionPane.showMessageDialog(null, "Room no. "+roomnum+" is unavailable for the dates checked.","Room Unavailable!",JOptionPane.INFORMATION_MESSAGE);
					btnNewButton.setText("Check Availabilty of Room :");
			}
					
				
				
		
		}
		else {
			
				JOptionPane.showMessageDialog(null, "Please pick a correct new Check Out date! Should be a date ahead of sheduled check out date. ","Incorrect Check Out date",JOptionPane.WARNING_MESSAGE);
			
			
			}
	    } catch (ParseException e2) {
	    	// TODO Auto-generated catch block
	    	
	    	JOptionPane.showMessageDialog(null, "Please pick a correct new Check Out date! Should be a date ahead of sheduled check out date. ","Incorrect Check Out date",JOptionPane.WARNING_MESSAGE);
			
	    }
	
 }
}
