package org.ATM.software;
//package ece373.arizona.edu;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.nio.file.*;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class ATM {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 * @throws ScriptException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws ScriptException, NoSuchMethodException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//TestAWT();
					ATM window = new ATM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			
		});
		/*ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
 
        // JavaScript code in a String
        String script = "function hello(name) { print('Hello, ' + name); }";
        // evaluate script
        engine.eval(script);
 
        // javax.script.Invocable is an optional interface.
        // Check whether your script engine implements or not!
        // Note that the JavaScript engine implements Invocable interface.
        Invocable inv = (Invocable) engine;
 
        // invoke the global function named "hello"
        inv.invokeFunction("hello", "Scripting!!" );*/
	}

	/**
	 * Create the application.
	 */
	public ATM() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.lightGray);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		
		//ImageIcon image = new ImageIcon("c:\\path\\image.png");
		//imagelabel = new JLabel(character, image, JLabel.CENTER);
		//frame.add(imagelabel);
		
		String strWelcome = this.getClass().getClassLoader().getResource("images/welcome.png").getFile();
		
		
		JLabel lblWelcome = new JLabel("");
		
		lblWelcome.setIcon(new ImageIcon(strWelcome));
		lblWelcome.setBounds(286, 277, 211, 73);
		lblWelcome.setBorder(BorderFactory.createEmptyBorder());
		lblWelcome.setFocusable(false);
		frame.getContentPane().add(lblWelcome);
		
		
		String strBanner = this.getClass().getClassLoader().getResource("images/banner.png").getFile();
		JLabel lblBanner = new JLabel("");
		
		lblBanner.setIcon(new ImageIcon(strBanner));
		lblBanner.setBounds(54, 6, 683, 91);
		lblBanner.setBorder(BorderFactory.createEmptyBorder());
		lblBanner.setFocusable(false);
		frame.getContentPane().add(lblBanner);
		
		JButton btnUser = new JButton("USER");
		btnUser.setForeground(Color.BLUE);
		btnUser.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnUser.setBounds(0, 134, 140, 40);
		btnUser.setVisible(false);
		frame.getContentPane().add(btnUser);
		
		JButton btnNewuser = new JButton("NEW USER");
		btnNewuser.setForeground(Color.BLUE);
		btnNewuser.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewuser.setBounds(0, 215, 140, 40);
		btnNewuser.setVisible(false);
		frame.getContentPane().add(btnNewuser);
		
		JButton btnPin = new JButton("PIN");
		btnPin.setForeground(Color.BLUE);
		btnPin.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnPin.setBounds(0, 256, 140, 40);
		btnPin.setVisible(false);
		frame.getContentPane().add(btnPin);
		
		JButton btnExistingUser = new JButton("EXISTING USER");
		btnExistingUser.setForeground(Color.BLUE);
		btnExistingUser.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnExistingUser.setBounds(0, 175, 140, 40);
		btnExistingUser.setVisible(false);

		frame.getContentPane().add(btnExistingUser);
		
		JButton btnAccount = new JButton("ACCOUNT");
		btnAccount.setForeground(Color.BLUE);
		btnAccount.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnAccount.setBounds(0, 299, 140, 40);
		btnAccount.setVisible(false);

		frame.getContentPane().add(btnAccount);
		
		JButton btnSelectTransaction = new JButton("SELECT TRANSACTION");
		btnSelectTransaction.setForeground(Color.BLUE);
		btnSelectTransaction.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		btnSelectTransaction.setBounds(0, 345, 140, 40);
		btnSelectTransaction.setVisible(false);

		frame.getContentPane().add(btnSelectTransaction);
		
		JButton btnChangePin = new JButton("CHANGE PIN");
		btnChangePin.setForeground(Color.BLUE);
		btnChangePin.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnChangePin.setBounds(0, 389, 140, 40);
		btnChangePin.setVisible(false);

		frame.getContentPane().add(btnChangePin);
		
		JButton btnLanguages = new JButton("LANGUAGES");
		btnLanguages.setForeground(Color.BLUE);
		btnLanguages.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnLanguages.setBounds(0, 430, 140, 40);
		btnLanguages.setVisible(false);
		frame.getContentPane().add(btnLanguages);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnSignUp.setForeground(UIManager.getColor("Focus.color"));
		btnSignUp.setBackground(Color.green);
		btnSignUp.setVisible(false);
		btnSignUp.setBounds(357, 175, 140, 40);
		
		frame.getContentPane().add(btnSignUp);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnCancel.setBackground(Color.GREEN);
		btnCancel.setBounds(357, 325, 140, 40);
		btnCancel.setVisible(false);
		frame.getContentPane().add(btnCancel);
		JButton btnGetStarted = new JButton("Get Started");
		btnGetStarted.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnGetStarted.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnGetStarted.setBackground(Color.GREEN);
		btnGetStarted.setBounds(357, 256, 140, 40);
		btnGetStarted.setVisible(false);
		frame.getContentPane().add(btnGetStarted);
		
		JLabel lblNewUser = new JLabel("New User");
		lblNewUser.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewUser.setForeground(UIManager.getColor("EditorPane.inactiveBackground"));
		lblNewUser.setBounds(393, 146, 73, 20);
		lblNewUser.setVisible(false);
		frame.getContentPane().add(lblNewUser);
		
		JLabel lblExistingUser = new JLabel("Existing User");
		lblExistingUser.setForeground(Color.WHITE);
		lblExistingUser.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblExistingUser.setBounds(378, 224, 103, 20);
		lblExistingUser.setVisible(false);
		frame.getContentPane().add(lblExistingUser);
		
		JLabel labelCancel = new JLabel("Cancel");
		labelCancel.setForeground(Color.RED);
		labelCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		labelCancel.setBounds(378, 300, 103, 20);
		labelCancel.setVisible(false);
		frame.getContentPane().add(labelCancel);
		
		lblWelcome.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	btnUser.setVisible(true);
		    	lblWelcome.setVisible(false);
		    	btnSignUp.setVisible(true);
		    	btnGetStarted.setVisible(true);
		    	btnCancel.setVisible(true);
				labelCancel.setVisible(true);
				lblExistingUser.setVisible(true);
				lblNewUser.setVisible(true);
		    	
		       // you can open a new frame here as
		       // i have assumed you have declared "frame" as instance variable
		       //frame = new JFrame("new frame");
		       //frame.setVisible(true);

		    }  
		}); 
		
		
		/*btnTest.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblBar1.setIcon(icon2);
				lblBar3.setIcon(icon2);
				lblSpeedometer.setIcon(speedometor2);
				lblSpeedometer3.setIcon(speedometor2);
				lblWater1.setIcon(water2);
				lblBar4.setIcon(water2);
				lblHydrOil.setIcon(water2);
				textField2.setText("256 Ltr");
				textField1.setText("265 Ltr");
				textField_4.setText("7000 Rpm");
				textField_1.setText("6800 Rpm");
				textFieldBattery.setText("24 V");
				slider2.setValue(55);
				slider1.setValue(85);
				slider4.setValue(85);
				slider3.setValue(55);
				sliderHyraulicOil.setValue(70);
				txtc.setText("85C");
				textField_6.setText("85C");
				txtc_1.setText("70C");
				lblLubrican.setIcon(icnLubricanBlue);
				lblTank.setIcon(icnTankBlue);
				lblSwingBreak.setIcon(icnSwingBreakRed);
				lblBreak.setIcon(icnBreakBlue);
				lblCarseat.setIcon(icnCarseatRed);
				lblLadder.setIcon(icnLadderBlue);
			}
		});*/

		
		
		
		
		
		/*if (label.getIcon() == null)
	        label.setIcon(...);
	    else
	        label.setIcon( null );
		*/
	}
}
