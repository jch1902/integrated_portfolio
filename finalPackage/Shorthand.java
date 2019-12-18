package finalPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import chn.util.ConsoleIO;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Shorthand extends JFrame {

	private static ConsoleIO newConsole = new ConsoleIO();
    private static String userInput = "";
    private static boolean keepRunning;
    private static String[] splitString = {};
    private static JTextField userTxtInput;
	private JPanel contentPane;
	private static JLabel lblInstruction;
	private static JLabel lblResult;
	private static JButton btnRun;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shorthand frame = new Shorthand();
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
	
	public Shorthand() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		userTxtInput = new JTextField();
		userTxtInput.setText("Input text here");
		contentPane.add(userTxtInput, BorderLayout.CENTER);
		userTxtInput.setColumns(10);
		
		lblInstruction = new JLabel("Hello");
		contentPane.add(lblInstruction, BorderLayout.NORTH);
		
		lblResult = new JLabel("Result:");
		contentPane.add(lblResult, BorderLayout.SOUTH);
		
		btnRun = new JButton("Run");
		btnRun.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(btnRun, BorderLayout.EAST);
		
		runProgram();
		
	}
	public static void runProgram(){
        
        lblInstruction.setText("Welcome to the Shorthand Message Generator!\\nEnter a message(Press x to leave): ");
        
            btnRun.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				userInput = userTxtInput.getText();
    				splitString = userInput.split("\\s+");
    				String textResult = "";
	                for(String string:splitString) {
	                    textResult += (string.replaceAll("and","&").replaceAll("for","4")
	                        .replaceAll("you","U").replaceAll("to","2")
	                        .replaceAll("a","").replaceAll("e","")
	                        .replaceAll("i","").replaceAll("o","")
	                        .replaceAll("u","") + " ");  
    	            }
	                lblResult.setText("Result: " + textResult);
    			}
    		});
            
    }

}
