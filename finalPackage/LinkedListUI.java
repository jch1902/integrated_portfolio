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
import javax.swing.SwingConstants;

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
				System.out.println("---Queue---");
				LinkedListQueueDemo newQueueList = new LinkedListQueueDemo();
				newQueueList.createList();
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblList = new JLabel("Click the buttons on the side to make a list display");
		contentPane.add(lblList, BorderLayout.CENTER);
		
		JButton btnStack = new JButton("Stacked List");
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("---Stack---");
				LinkedListStackDemo newStackedList = new LinkedListStackDemo();
				newStackedList.createList();
				lblList.setText("<html>" + newStackedList.returnArrayList()
															.replaceAll("<","&lt;")
															.replaceAll(">", "&gt;")
															.replaceAll("\n", "<br/>")
															+ "</html>");
			}
		});
		contentPane.add(btnStack, BorderLayout.WEST);
		
		JButton btnQueue = new JButton("Queued List");
		btnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("---Queue---");
				LinkedListQueueDemo newQueueList = new LinkedListQueueDemo();
				newQueueList.createList();
			}
		});
		contentPane.add(btnQueue, BorderLayout.EAST);
		
		
	}
}

