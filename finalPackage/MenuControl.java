package finalPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class MenuControl extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuControl frame = new MenuControl();
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
	public MenuControl() {
		getContentPane().setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		
		JMenu mnShorthand = new JMenu("Shorthand");
		menuBar.add(mnShorthand);
		
		JMenuItem mntmDropdownShorthand = new JMenuItem("Run");
		mntmDropdownShorthand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shorthand frame = new Shorthand();
				frame.setVisible(true);
			}
		});
		mnShorthand.add(mntmDropdownShorthand);
		
		JMenu mnPalindrom = new JMenu("Palindrome");
		menuBar.add(mnPalindrom);
		
		JMenuItem mntmDropdownPalindrom = new JMenuItem("Run");
		mntmDropdownPalindrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PalindromeUI frame = new PalindromeUI();
				frame.setVisible(true);			
			}
		});
		mnPalindrom.add(mntmDropdownPalindrom);
		
		JMenu mnSprint = new JMenu("Calculator");
		menuBar.add(mnSprint);
		
		JMenuItem mntmCalculator = new JMenuItem("Run");
		mntmCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator frame = new Calculator();
				frame.setVisible(true);			
			}
		});
		mnSprint.add(mntmCalculator);
		
		JMenu mnPoly = new JMenu("Polymorphism");
		menuBar.add(mnPoly);
		
		JMenuItem mntmPoly = new JMenuItem("Run");
		mntmPoly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_UI frame = new AP_UI();
				frame.setVisible(true);			
			}
		});
		mnPoly.add(mntmPoly);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the menu!");
		lblWelcomeToThe.setForeground(Color.WHITE);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblWelcomeToThe, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Click on the drop down menus to run the programs");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.SOUTH);
		
	}
	
}
