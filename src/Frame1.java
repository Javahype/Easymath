import java.awt.EventQueue;


import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.Icon;
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
		
		Icon a=new ImageIcon(getClass().getResource("summation.png"));
		JButton btnNewButton = new JButton(a);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			
		
			
			
		});
		btnNewButton.setBounds(60, 151, 112, 59);
		frame.getContentPane().add(btnNewButton);
		
		Icon b=new ImageIcon(getClass().getResource("subtraction.png"));
		JButton btnNewButton_1 = new JButton(b);
		btnNewButton_1.setBounds(60, 221, 112, 59);
		frame.getContentPane().add(btnNewButton_1);
		
		Icon c=new ImageIcon(getClass().getResource("multiplication.png"));
		JButton btnNewButton_2 = new JButton(c);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(60, 291, 112, 57);
		frame.getContentPane().add(btnNewButton_2);
		
		Icon d=new ImageIcon(getClass().getResource("division.png"));
		JButton btnDivision = new JButton(d);
		btnDivision.setBounds(60, 359, 112, 59);
		frame.getContentPane().add(btnDivision);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass() .getResource("/easymathlogo.png")) .getImage(); 
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 11, 214, 129);
		frame.getContentPane().add(label);
	}
}
