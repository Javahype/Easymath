import java.awt.EventQueue;


import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 250, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton(" ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			
			ImageIcon icon = new ImageIcon(this.getClass().getResource("summation.png"));
			btnNewButton.setIcon(summation.png);
			
			
		});
		btnNewButton.setBounds(72, 165, 100, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtraction");
		btnNewButton_1.setBounds(72, 291, 100, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplication");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(72, 325, 100, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnDivision = new JButton("Division");
		btnDivision.setBounds(72, 359, 100, 23);
		frame.getContentPane().add(btnDivision);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass() .getResource("/easymathlogo.png")) .getImage(); 
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 11, 214, 129);
		frame.getContentPane().add(label);
	}
}
