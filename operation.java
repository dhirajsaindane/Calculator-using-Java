package operation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class operation {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					operation window = new operation();
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
	public operation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operations");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(167, 11, 105, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(31, 74, 73, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Number2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(31, 132, 73, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt1.setBounds(246, 79, 96, 27);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt2.setBounds(246, 137, 96, 27);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(42, 377, 86, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txt3.setBounds(167, 377, 216, 27);
		frame.getContentPane().add(txt3);
		txt3.setColumns(10);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a1 = Integer.parseInt(txt1.getText());
				int a2 = Integer.parseInt(txt2.getText());
				int a3 = a1 + a2;
				txt3.setText(String.valueOf(a3));
				if (txt1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Please Required All the field");
				}
				else if(txt2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "sx");
				}
			}
		});
		btnNewButton.setBounds(23, 201, 105, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtraction");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b1 = Integer.parseInt(txt1.getText());
				int b2 = Integer.parseInt(txt2.getText());
				int b3 = b1 - b2;
				txt3.setText(String.valueOf(b3));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(167, 202, 161, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Division");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c1 = Integer.parseInt(txt1.getText());
				int c2 = Integer.parseInt(txt2.getText());
				int c3 = c1/c2;
				txt3.setText(String.valueOf(c3));
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(31, 286, 106, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Multiplication");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int d1 = Integer.parseInt(txt1.getText());
				int d2 = Integer.parseInt(txt2.getText());
				int d3 = d1 * d2;
				txt3.setText(String.valueOf(d3));
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(167, 286, 161, 38);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("factorial");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int e1 = Integer.parseInt(txt1.getText());
				int fact=1;
				for(int i=1;i<=e1;i++){    
				      fact=fact*i;
				      
				      txt3.setText(String.valueOf(fact));
				  } 
				
				
				

			}
		});
		btnNewButton_4.setBounds(366, 205, 105, 31);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Exit");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame opr = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(opr,"Confirm You want to exit this operation","Operation system",JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_1.setBounds(366, 286, 105, 31);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_3_1 = new JButton("Reset Values");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
				txt2.setText("");
				
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_1.setBounds(83, 425, 339, 38);
		frame.getContentPane().add(btnNewButton_3_1);
	}
}
