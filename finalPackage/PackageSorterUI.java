package finalPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import finalPackage.PackageSorter.ListType;

public class PackageSorterUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	private ArrayList tempArray;
	private PackageSorter newSorter;
	private List uiList;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PackageSorterUI frame = new PackageSorterUI();
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
	public PackageSorterUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
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
		
		JMenu mnPackageSorter = new JMenu("Package Sorter");
		menuBar.add(mnPackageSorter);
		
		JMenuItem mntmPackageSorter = new JMenuItem("Run");
		mntmPackageSorter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PackageSorterUI frame = new PackageSorterUI();
				frame.setVisible(true);
			}
		});
		mnPackageSorter.add(mntmPackageSorter);
		
		newSorter = new PackageSorter();
		newSorter.addItems();
		System.out.println(newSorter);
		uiList = new List();
		uiList.setMultipleMode(false);
		uiList.setBounds(10, 10, 392, 198);
		updateList(false);
		contentPane.add(uiList);
		
		JButton sortButton = new JButton("Sort");
		sortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newSorter.listType = ListType.Insert;
				newSorter.InsertionSort();
				updateList(true);
				System.out.println(newSorter);
			}
		});
		contentPane.add(sortButton, BorderLayout.EAST);
	}
	private void updateList(boolean hasValue) {
		List list = new List();
		tempArray = newSorter.getItems();
		if(hasValue) {
			int x = tempArray.size()-1;
			for(int i = tempArray.size()-1; i >= 0 ; i--) {
				uiList.remove(i);
				x--;
			}
		}
		for(int x = 0; x < tempArray.size(); x++) {
			list.add((String) tempArray.get(x));
		}
		
		uiList = list;//to basically replace the whole list if we need to
	}

}
