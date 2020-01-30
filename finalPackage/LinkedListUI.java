package finalPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class LinkedListUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinkedListUI frame = new LinkedListUI();
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
	public LinkedListUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblList = new JLabel("Click the buttons on the side to make a list display");
		lblList.setBackground(new Color(255, 255, 153));
		lblList.setHorizontalAlignment(SwingConstants.CENTER);
		lblList.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 8));
		contentPane.add(lblList, BorderLayout.CENTER);
		
		JButton btnStack = new JButton("Stacked List");
		btnStack.setBackground(new Color(255, 204, 102));
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("---Stack---");
				LinkedListStackDemo newStackedList = new LinkedListStackDemo();
				newStackedList.createList();
				
				lblList.setText("");
				lblList.setFont(lblList.getFont().deriveFont(6f));
				lblList.setText("<html>" + newStackedList.returnArrayList()
															.replaceAll("<","&lt;")
															.replaceAll(">", "&gt;")
															.replaceAll("\n", "<br/>")
															+ "</html>");
			}
		});
		contentPane.add(btnStack, BorderLayout.WEST);
		
		JButton btnQueue = new JButton("Queued List");
		btnQueue.setForeground(new Color(0, 0, 0));
		btnQueue.setBackground(new Color(255, 204, 102));
		btnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("---Queue---");
				LinkedListQueueDemo newQueueList = new LinkedListQueueDemo();
				newQueueList.createList();
				
				lblList.setText("");
				lblList.setFont(lblList.getFont().deriveFont(6f));
				lblList.setText("<html>" + newQueueList.returnArrayList()
															.replaceAll("<","&lt;")
															.replaceAll(">", "&gt;")
															.replaceAll("\n", "<br/>")
															+ "</html>");
			}
		});
		contentPane.add(btnQueue, BorderLayout.EAST);
		
		
		//Menu bar ui added
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
		
		JMenu mnLink = new JMenu("Linked List");
		menuBar.add(mnLink);
		JMenuItem mntmLink = new JMenuItem("Run");
		mntmLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedListUI frame = new LinkedListUI();
				frame.setVisible(true);
			}
		});
		mnLink.add(mntmLink);
	}
}

