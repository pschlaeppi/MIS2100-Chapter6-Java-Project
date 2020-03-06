package Schlaeppi.Piper.Project6.Javaproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField numerator1;
	private JTextField denominator1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		numerator1 = new JTextField();
		numerator1.setBounds(29, 59, 130, 26);
		frame.getContentPane().add(numerator1);
		numerator1.setColumns(10);
		
		denominator1 = new JTextField();
		denominator1.setBounds(29, 108, 130, 26);
		frame.getContentPane().add(denominator1);
		denominator1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numerator");
		lblNewLabel.setBounds(32, 43, 96, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominator");
		lblNewLabel_1.setBounds(32, 91, 96, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel Resultlable = new JLabel("Result");
		Resultlable.setBounds(35, 159, 202, 16);
		frame.getContentPane().add(Resultlable);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double numerator = Double.parseDouble(numerator1.getText());
				double denominator = Double.parseDouble(denominator1.getText());
				
				SimpleMath simpleMath = new SimpleMath ();
	 			
				 try {
						Double result = simpleMath.divide(numerator, denominator);
						
						Resultlable.setText(result.toString());
						
				 } catch (ArithmeticException e1) { 
						Resultlable.setText("Cannot divide by 0");
							
					}
			}
		});
		btnNewButton.setBounds(29, 188, 117, 29);
		frame.getContentPane().add(btnNewButton);
			
			
	}
	}

