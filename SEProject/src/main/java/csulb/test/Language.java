package csulb.test;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Language extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Language frame = new Language();
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
	public Language() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 150, 350, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectLanguage = new JLabel("Select One Language");
		lblSelectLanguage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectLanguage.setBounds(92, 13, 136, 26);
		contentPane.add(lblSelectLanguage);
		
		JCheckBox chckbxJava = new JCheckBox("Assembler");
		chckbxJava.setBounds(105, 46, 97, 23);
		contentPane.add(chckbxJava);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Ada 95");
		chckbxNewCheckBox.setBounds(105, 72, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("C");
		chckbxNewCheckBox_1.setBounds(105, 98, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("C++");
		chckbxNewCheckBox_2.setBounds(105, 124, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("C#");
		chckbxNewCheckBox_3.setBounds(105, 150, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("FORTRAN");
		chckbxNewCheckBox_4.setBounds(105, 176, 97, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("HTML");
		chckbxNewCheckBox_5.setBounds(105, 202, 97, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Java");
		chckbxNewCheckBox_6.setBounds(105, 228, 97, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Java Script");
		chckbxNewCheckBox_7.setBounds(105, 254, 97, 23);
		contentPane.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("VBScript");
		chckbxNewCheckBox_8.setBounds(105, 280, 97, 23);
		contentPane.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Visual Basic");
		chckbxNewCheckBox_9.setBounds(105, 306, 97, 23);
		contentPane.add(chckbxNewCheckBox_9);
		
		
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String language = "";
				
				for (Component c :contentPane.getComponents()) {
					JCheckBox temp = (JCheckBox) c;
					if(temp.isSelected()) {
						System.out.println(temp.getText());
					}
				}
			}
		});
		btnNewButton.setBounds(105, 349, 89, 23);
		contentPane.add(btnNewButton);
	}
}
