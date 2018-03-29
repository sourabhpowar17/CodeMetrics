package csulb.se;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.io.Serializable;
import java.awt.event.ItemEvent;

public class Language extends JDialog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String language = "None";
	private transient ActionListener commonActionListener;
	private JPanel languagePanel = new JPanel();
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	
	//private ItemListener commonActionListener;
	

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
		
		JPanel contentPane;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 267, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Select One Language");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(46, 11, 160, 25);
		contentPane.add(lblNewLabel);

		languagePanel = new JPanel();
		languagePanel.setBounds(29, 47, 177, 314);
		contentPane.add(languagePanel);
		languagePanel.setLayout(null);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Assembler");
		chckbxNewCheckBox.addActionListener(commonActionListener);
		chckbxNewCheckBox.setBounds(42, 7, 97, 23);
		languagePanel.add(chckbxNewCheckBox);

		JCheckBox chckbxC = new JCheckBox("Ada 95");
		chckbxC.addActionListener(commonActionListener);
		chckbxC.setBounds(42, 33, 97, 23);
		languagePanel.add(chckbxC);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("C");
		chckbxNewCheckBox_1.addActionListener(commonActionListener);
		chckbxNewCheckBox_1.setBounds(42, 59, 97, 23);
		languagePanel.add(chckbxNewCheckBox_1);
		

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("C#");
		chckbxNewCheckBox_2.addActionListener(commonActionListener);
		chckbxNewCheckBox_2.setBounds(42, 81, 97, 23);
		languagePanel.add(chckbxNewCheckBox_2);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("COBOL");
		chckbxNewCheckBox_3.addActionListener(commonActionListener);
		chckbxNewCheckBox_3.setBounds(42, 107, 97, 23);
		languagePanel.add(chckbxNewCheckBox_3);

		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("FORTRAN");
		chckbxNewCheckBox_4.addActionListener(commonActionListener);
		chckbxNewCheckBox_4.setBounds(42, 133, 97, 23);
		languagePanel.add(chckbxNewCheckBox_4);

		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("HTML");
		chckbxNewCheckBox_5.addActionListener(commonActionListener);
		chckbxNewCheckBox_5.setBounds(42, 159, 97, 23);
		languagePanel.add(chckbxNewCheckBox_5);

		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Java");
		chckbxNewCheckBox_6.addActionListener(commonActionListener);
		chckbxNewCheckBox_6.setBounds(42, 185, 97, 23);
		languagePanel.add(chckbxNewCheckBox_6);

		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Java Script");
		chckbxNewCheckBox_7.addActionListener(commonActionListener);
		chckbxNewCheckBox_7.setBounds(42, 211, 97, 23);
		languagePanel.add(chckbxNewCheckBox_7);

		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("VB Script");
		chckbxNewCheckBox_8.addActionListener(commonActionListener);
		chckbxNewCheckBox_8.setBounds(42, 237, 97, 23);
		languagePanel.add(chckbxNewCheckBox_8);

		JCheckBox chckbxVisualBasic = new JCheckBox("Visual Basic");
		chckbxVisualBasic.addActionListener(commonActionListener);
		chckbxVisualBasic.setBounds(42, 263, 97, 23);
		languagePanel.add(chckbxVisualBasic);
		
		JCheckBox chckbxNewCheckBox_cpp = new JCheckBox("C++");
		chckbxNewCheckBox_cpp.addActionListener(commonActionListener);
		chckbxNewCheckBox_cpp.setBounds(42, 292, 97, 23);
		languagePanel.add(chckbxNewCheckBox_cpp);
		
		ButtonGroup topGroup = new ButtonGroup();
		topGroup.add(chckbxNewCheckBox_cpp);
		topGroup.add(chckbxVisualBasic);
		topGroup.add(chckbxNewCheckBox_8);
		topGroup.add(chckbxNewCheckBox_7);
		topGroup.add(chckbxNewCheckBox_6);
		topGroup.add(chckbxNewCheckBox_5);
		topGroup.add(chckbxNewCheckBox_4);
		topGroup.add(chckbxNewCheckBox_3);
		topGroup.add(chckbxNewCheckBox_2);
		topGroup.add(chckbxNewCheckBox_1);
		topGroup.add(chckbxC);
		topGroup.add(chckbxNewCheckBox);
		

		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Component c : languagePanel.getComponents()) {
					JCheckBox temp = (JCheckBox) c;
					if(temp.isSelected()) {
						language= temp.getText();
						Tab temp1 = (Tab) MainPage.tabbedPane_1.getSelectedComponent();
						if(temp1 != null)
							temp1.textField_13.setText(language);
						dispose();
					}
				}

			}
		});
		btnDone.setBounds(70, 372, 89, 23);
		contentPane.add(btnDone);
	}

	public Language(String language2) {
		// TODO Auto-generated constructor stub
		this.language=language2;
		for (Component c : languagePanel.getComponents()) {
			JCheckBox temp = (JCheckBox) c;
			if(temp.getText().equalsIgnoreCase(language2)) {
				temp.setSelected(true);
			}
		}

	}



}
