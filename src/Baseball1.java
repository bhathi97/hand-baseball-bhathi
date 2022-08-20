import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Baseball1 {
	public int count =0;
	private int out = 0;
	public JFrame frame;
	private JTextField textruns;
	private JTextField textwik;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Baseball1 window = new Baseball1();
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
	public Baseball1() {
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
		
		textruns = new JTextField();
		textruns.setBounds(91, 36, 86, 20);
		frame.getContentPane().add(textruns);
		textruns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Runs :");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(21, 28, 86, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textwik = new JTextField();
		textwik.setBounds(327, 36, 86, 20);
		frame.getContentPane().add(textwik);
		textwik.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Wickets :");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBounds(242, 29, 86, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BATTING");
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(174, 86, 95, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int randomNum = (int)(Math.random()* 4+1);
				if(randomNum == 1) {
					if(out == 3) {
						String finalMark = textruns.getText();  
						JOptionPane.showMessageDialog(null, "You scored " + finalMark + " runs. Now, its time to ball.");
						frame.dispose();
						Baseball2 window = new Baseball2();
						window.lblNewLabel_3.setText(finalMark);
						window.frame.setVisible(true);
						
						}else {
								out++;
								textwik.setText(Integer.toString(out));
						}
				}else {
					count++;
					textruns.setText(Integer.toString(count));
				}
				
			}
		});
		btn1.setBackground(new Color(204, 255, 0));
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setBounds(78, 190, 65, 45);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int randomNum = (int)(Math.random()* 4+1);
				if(randomNum == 2) {
					if(out == 3) {
						String finalMark = textruns.getText(); 
						JOptionPane.showMessageDialog(null, "You scored " + finalMark + " runs. Now, its time to ball.");
						frame.dispose();
						Baseball2 window = new Baseball2();
						window.lblNewLabel_3.setText(finalMark);
						window.frame.setVisible(true);
						
						}else {
							out++;
							textwik.setText(Integer.toString(out));
						}
				}else {
					count = count + 2;
					textruns.setText(Integer.toString(count));
				}
			}
		});
		btn2.setBackground(new Color(153, 255, 0));
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setBounds(153, 190, 65, 45);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int randomNum = (int)(Math.random()* 4+1);
				if(randomNum == 3) {
					if(out == 3) {
						String finalMark = textruns.getText(); 
						JOptionPane.showMessageDialog(null, "You scored " + finalMark + " runs. Now, its time to ball.");
						frame.dispose();
						Baseball2 window = new Baseball2();
						window.lblNewLabel_3.setText(finalMark);
						window.frame.setVisible(true);
						
						}else {
							out++;
							textwik.setText(Integer.toString(out));
						}
				}else {
					count = count + 3;
					textruns.setText(Integer.toString(count));
				}
			}
		});
		btn3.setBackground(new Color(102, 255, 0));
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setBounds(228, 190, 65, 45);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int randomNum = (int)(Math.random()* 4+1);
				if(randomNum == 4) {
					if(out == 3) {
						String finalMark = textruns.getText(); 
						JOptionPane.showMessageDialog(null, "You scored " + finalMark + " runs. Now, its time to ball.");
						frame.dispose();
						Baseball2 window = new Baseball2();
						window.lblNewLabel_3.setText(finalMark);
						window.frame.setVisible(true);
						
						}else {
							out++;
							textwik.setText(Integer.toString(out));
						}
				}else {
					count = count + 4;
					textruns.setText(Integer.toString(count));
				}

			}
		});
		btn4.setBackground(new Color(51, 255, 0));
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setBounds(303, 190, 65, 45);
		frame.getContentPane().add(btn4);
		
		JLabel show_image = new JLabel("");
		show_image.setBackground(new Color(153, 255, 0));
		show_image.setIcon(new ImageIcon(Baseball1.class.getResource("/backgrounds/batt.jpg")));
		show_image.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(show_image);
	}

}

