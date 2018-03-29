package csulb.se;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import java.util.Enumeration;
import javax.swing.JTabbedPane;

public class Tab extends JScrollPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Language language;
	private ValueAdjustment vAF;
	private String Tabname;
	private int externalInput;
	private int externalOutput;
	private int externalInquiries;
	private int interLogicalFiles;
	private int externalInterfaceFile;
	private int externalInputTotal;
	private int externalOutputTotal;
	private int externalInquiriesTotal;
	private int interLogicalFilesTotal;
	private int externalInterfaceFileTotal;
	private int externalInputWeight;
	private int externalOutputWeight;
	private int externalInquiriesWeight;
	private int interLogicalFilesWeight;
	private int externalInterfaceFileWeight;
	private double FP;
	private int codeSize;

	
	private JLabel lblNewLabel;
	private JLabel lblSimpleAverageComplex;
	private JLabel lblInternalLogicalFiles;
	private JLabel lblExternalLogicalFiles;
	private JLabel lblTotal;
	
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	JTextField textField_11;
	private JTextField textField_12;
	JTextField textField_13;
	private JTextField textField_14;


	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JRadioButton radioButton_6;
	private JRadioButton radioButton_7;
	private JRadioButton radioButton_8;
	private JRadioButton radioButton_9;
	private JRadioButton radioButton_10;
	private JRadioButton radioButton_11;
	private JRadioButton radioButton_12;
	private JRadioButton radioButton_13;

	private JRadioButton radioButton_14;

	private JRadioButton radioButton_15;
	

	private JButton btnNewButton;
	private JButton btnValueAdjustment;
	private JButton btnComputeSize;
	private JButton btnLanguage;

	private transient ButtonGroup buttonGroup1;
	private transient ButtonGroup buttonGroup2;
	private transient ButtonGroup buttonGroup3;
	private transient ButtonGroup buttonGroup4;
	private transient ButtonGroup buttonGroup5;

	
	public String getTabname() {
		return Tabname;
	}


	public void setTabname(String tabname) {
		Tabname = tabname;
	}


	public JTextField getTextField_0() {
		return textField_0;
	}


	public void setTextField_0(JTextField textField_0) {
		this.textField_0 = textField_0;
	}


	public JTextField getTextField_1() {
		return textField_1;
	}


	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}


	public JTextField getTextField_2() {
		return textField_2;
	}


	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}


	public JTextField getTextField_3() {
		return textField_3;
	}


	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}


	public JTextField getTextField_4() {
		return textField_4;
	}


	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}


	public JTextField getTextField_5() {
		return textField_5;
	}


	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}


	public JTextField getTextField_6() {
		return textField_6;
	}


	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}


	public JTextField getTextField_7() {
		return textField_7;
	}


	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}


	public JTextField getTextField_8() {
		return textField_8;
	}


	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}


	public JTextField getTextField_9() {
		return textField_9;
	}


	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}


	public JTextField getTextField_10() {
		return textField_10;
	}


	public void setTextField_10(JTextField textField_10) {
		this.textField_10 = textField_10;
	}


	public JTextField getTextField_12() {
		return textField_12;
	}


	public void setTextField_12(JTextField textField_12) {
		this.textField_12 = textField_12;
	}


	public JTextField getTextField_14() {
		return textField_14;
	}


	public void setTextField_14(JTextField textField_14) {
		this.textField_14 = textField_14;
	}


	public JRadioButton getRadioButton_1() {
		return radioButton_1;
	}


	public void setRadioButton_1(JRadioButton radioButton_1) {
		this.radioButton_1 = radioButton_1;
	}


	public JRadioButton getRadioButton_4() {
		return radioButton_4;
	}


	public void setRadioButton_4(JRadioButton radioButton_4) {
		this.radioButton_4 = radioButton_4;
	}


	public JRadioButton getRadioButton_7() {
		return radioButton_7;
	}


	public void setRadioButton_7(JRadioButton radioButton_7) {
		this.radioButton_7 = radioButton_7;
	}


	public JRadioButton getRadioButton_10() {
		return radioButton_10;
	}


	public void setRadioButton_10(JRadioButton radioButton_10) {
		this.radioButton_10 = radioButton_10;
	}


	public JRadioButton getRadioButton_13() {
		return radioButton_13;
	}


	public void setRadioButton_13(JRadioButton radioButton_13) {
		this.radioButton_13 = radioButton_13;
	}


	public JRadioButton getRadioButton_2() {
		return radioButton_2;
	}


	public void setRadioButton_2(JRadioButton radioButton_2) {
		this.radioButton_2 = radioButton_2;
	}


	public JRadioButton getRadioButton_5() {
		return radioButton_5;
	}


	public void setRadioButton_5(JRadioButton radioButton_5) {
		this.radioButton_5 = radioButton_5;
	}


	public JRadioButton getRadioButton_8() {
		return radioButton_8;
	}


	public void setRadioButton_8(JRadioButton radioButton_8) {
		this.radioButton_8 = radioButton_8;
	}


	public JRadioButton getRadioButton_11() {
		return radioButton_11;
	}


	public void setRadioButton_11(JRadioButton radioButton_11) {
		this.radioButton_11 = radioButton_11;
	}


	public JRadioButton getRadioButton_14() {
		return radioButton_14;
	}


	public void setRadioButton_14(JRadioButton radioButton_14) {
		this.radioButton_14 = radioButton_14;
	}


	public JRadioButton getRadioButton_3() {
		return radioButton_3;
	}


	public void setRadioButton_3(JRadioButton radioButton_3) {
		this.radioButton_3 = radioButton_3;
	}


	public JRadioButton getRadioButton_6() {
		return radioButton_6;
	}


	public void setRadioButton_6(JRadioButton radioButton_6) {
		this.radioButton_6 = radioButton_6;
	}


	public JRadioButton getRadioButton_9() {
		return radioButton_9;
	}


	public void setRadioButton_9(JRadioButton radioButton_9) {
		this.radioButton_9 = radioButton_9;
	}


	public JRadioButton getRadioButton_12() {
		return radioButton_12;
	}


	public void setRadioButton_12(JRadioButton radioButton_12) {
		this.radioButton_12 = radioButton_12;
	}


	public JRadioButton getRadioButton_15() {
		return radioButton_15;
	}


	public void setRadioButton_15(JRadioButton radioButton_15) {
		this.radioButton_15 = radioButton_15;
	}


	public JTextField getTextField_13() {
		return textField_13;
	}


	public void setTextField_13(JTextField textField_13) {
		this.textField_13 = textField_13;
	}
	

	public JTextField getTextField_11() {
		return textField_11;
	}


	public void setTextField_11(JTextField textField_11) {
		this.textField_11 = textField_11;
	}


	/**
	 * Create the panel.
	 */
	public Tab() {
		
		this.language=new Language();
		this.vAF=new ValueAdjustment();
		initializeTab();
	}
	

	public Tab(FunctionPointSaveData functionPointSaveData) {
		this.language=new Language(functionPointSaveData.getLanguage());
		this.vAF=new ValueAdjustment(functionPointSaveData.getVafdata(),functionPointSaveData.getvAF());
		this.Tabname=functionPointSaveData.getTabname();
		initializeTab();
		
		this.externalInput=functionPointSaveData.getExternalInput();
		this.externalOutput=functionPointSaveData.getExternalOutput();
		this.externalInquiries=functionPointSaveData.getExternalInquiries();
		this.interLogicalFiles=functionPointSaveData.getInterLogicalFiles();
		this.externalInterfaceFile=functionPointSaveData.getExternalInterfaceFile();
		
		this.externalInputTotal=functionPointSaveData.getExternalInputTotal();
		this.externalOutputTotal=functionPointSaveData.getExternalOutputTotal();
		this.externalInquiriesTotal=functionPointSaveData.getExternalInquiriesTotal();
		this.interLogicalFilesTotal=functionPointSaveData.getInterLogicalFilesTotal();
		this.externalInterfaceFileTotal=functionPointSaveData.getExternalInterfaceFileTotal();
		
		this.externalInputWeight=functionPointSaveData.getExternalInputWeight();
		this.externalOutputWeight=functionPointSaveData.getExternalOutputWeight();
		this.externalInquiriesWeight=functionPointSaveData.getExternalInquiriesWeight();
		this.interLogicalFilesWeight=functionPointSaveData.getInterLogicalFilesWeight();
		this.externalInterfaceFileWeight=functionPointSaveData.getExternalInterfaceFileWeight();
		
		this.FP=functionPointSaveData.getFP();
		this.codeSize=functionPointSaveData.getCodeSize();
			
		this.textField_0.setText(functionPointSaveData.getTextField_0());
		this.textField_1.setText(functionPointSaveData.getTextField_1());
		this.textField_2.setText(functionPointSaveData.getTextField_2());
		this.textField_3.setText(functionPointSaveData.getTextField_3());
		this.textField_4.setText(functionPointSaveData.getTextField_4());
		this.textField_5.setText(functionPointSaveData.getTextField_5());
		this.textField_6.setText(functionPointSaveData.getTextField_6());
		this.textField_7.setText(functionPointSaveData.getTextField_7());
		this.textField_8.setText(functionPointSaveData.getTextField_8());
		this.textField_9.setText(functionPointSaveData.getTextField_9());
		this.textField_10.setText(functionPointSaveData.getTextField_10());
		this.textField_11.setText(functionPointSaveData.getTextField_11());
		this.textField_12.setText(functionPointSaveData.getTextField_12());
		this.textField_13.setText(functionPointSaveData.getTextField_13());
		this.textField_14.setText(functionPointSaveData.getTextField_14());

		if(functionPointSaveData.getRadioButton_1().trim().equalsIgnoreCase("")) {this.radioButton_1.setEnabled(true);}else{this.radioButton_1.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_2().trim().equalsIgnoreCase("")) {this.radioButton_2.setEnabled(true);}else{this.radioButton_2.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_3().trim().equalsIgnoreCase("")) {this.radioButton_3.setEnabled(true);}else{this.radioButton_3.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_4().trim().equalsIgnoreCase("")) {this.radioButton_4.setEnabled(true);}else{this.radioButton_4.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_5().trim().equalsIgnoreCase("")) {this.radioButton_5.setEnabled(true);}else{this.radioButton_5.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_6().trim().equalsIgnoreCase("")) {this.radioButton_6.setEnabled(true);}else{this.radioButton_6.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_7().trim().equalsIgnoreCase("")) {this.radioButton_7.setEnabled(true);}else{this.radioButton_7.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_8().trim().equalsIgnoreCase("")) {this.radioButton_8.setEnabled(true);}else{this.radioButton_8.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_9().trim().equalsIgnoreCase("")) {this.radioButton_9.setEnabled(true);}else{this.radioButton_9.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_10().trim().equalsIgnoreCase("")) {this.radioButton_10.setEnabled(true);}else{this.radioButton_10.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_11().trim().equalsIgnoreCase("")) {this.radioButton_11.setEnabled(true);}else{this.radioButton_11.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_12().trim().equalsIgnoreCase("")) {this.radioButton_12.setEnabled(true);}else{this.radioButton_12.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_13().trim().equalsIgnoreCase("")) {this.radioButton_13.setEnabled(true);}else{this.radioButton_13.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_14().trim().equalsIgnoreCase("")) {this.radioButton_14.setEnabled(true);}else{this.radioButton_14.setEnabled(false);}
		if(functionPointSaveData.getRadioButton_15().trim().equalsIgnoreCase("")) {this.radioButton_15.setEnabled(true);}else{this.radioButton_15.setEnabled(false);}
	}


	private void initializeTab() {


		setBorder(null);
		setLayout(null);
		setAutoscrolls(true);
		setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JLabel lblNewLabel_1 = new JLabel("External Input");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(29, 111, 93, 18);
		add(lblNewLabel_1);

		JLabel lblExternalInquiries = new JLabel("External Inquiries");
		lblExternalInquiries.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblExternalInquiries.setBounds(29, 183, 130, 16);
		add(lblExternalInquiries);

		JLabel lblExternal = new JLabel("External Output");
		lblExternal.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblExternal.setBounds(29, 147, 111, 15);
		add(lblExternal);

		lblNewLabel = new JLabel("Weighting Factors");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(252, 11, 174, 34);
		add(lblNewLabel);

		lblSimpleAverageComplex = new JLabel("Simple Average Complex");
		lblSimpleAverageComplex.setFont(new Font("Arial", Font.BOLD, 18));
		lblSimpleAverageComplex.setBounds(223, 47, 232, 27);
		add(lblSimpleAverageComplex);

		lblInternalLogicalFiles = new JLabel("Internal Logical Files");
		lblInternalLogicalFiles.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblInternalLogicalFiles.setBounds(29, 219, 145, 16);
		add(lblInternalLogicalFiles);

		lblExternalLogicalFiles = new JLabel("External Logical Files");
		lblExternalLogicalFiles.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblExternalLogicalFiles.setBounds(29, 255, 145, 16);
		add(lblExternalLogicalFiles);

		lblTotal = new JLabel("Total Count");
		lblTotal.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblTotal.setBounds(29, 291, 145, 16);
		add(lblTotal);

		JLabel currentLanguage = new JLabel("Current Language");
		currentLanguage.setFont(new Font("Calibri", Font.PLAIN, 16));
		currentLanguage.setBounds(310, 434, 130, 18);
		add(currentLanguage);

		/***********************Text Fields***************************/

		textField_0 = new JTextField(10);
		textField_0.setBounds(200, 113, 59, 20);
		add(textField_0);
		textField_0.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(200, 149, 59, 20);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(200, 185, 59, 20);
		add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(200, 221, 59, 20);
		add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(200, 257, 59, 20);
		add(textField_4);

		/***********************Radio Buttons***************************/

		radioButton_1 = new JRadioButton("3");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_1.setBounds(282, 109, 41, 23);
		add(radioButton_1);

		radioButton_4 = new JRadioButton("4");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_4.setBounds(282, 145, 41, 23);
		add(radioButton_4);

		radioButton_7 = new JRadioButton("3");
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_7.setBounds(282, 180, 41, 23);
		add(radioButton_7);

		radioButton_10 = new JRadioButton("7");
		radioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_10.setBounds(282, 216, 41, 23);
		add(radioButton_10);

		radioButton_13 = new JRadioButton("5");
		radioButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_13.setBounds(282, 252, 41, 23);
		add(radioButton_13);

		radioButton_2 = new JRadioButton("4");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_2.setSelected(true);
		radioButton_2.setBounds(354, 109, 41, 23);
		add(radioButton_2);

		radioButton_5 = new JRadioButton("5");
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_5.setSelected(true);
		radioButton_5.setBounds(354, 145, 41, 23);
		add(radioButton_5);

		radioButton_8 = new JRadioButton("4");
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_8.setSelected(true);
		radioButton_8.setBounds(354, 180, 41, 23);
		add(radioButton_8);

		radioButton_11 = new JRadioButton("10");
		radioButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_11.setSelected(true);
		radioButton_11.setBounds(354, 216, 41, 23);
		add(radioButton_11);

		radioButton_14 = new JRadioButton("7");
		radioButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_14.setSelected(true);
		radioButton_14.setBounds(354, 252, 51, 23);
		add(radioButton_14);

		radioButton_3 = new JRadioButton("6");
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_3.setBounds(426, 109, 51, 23);
		add(radioButton_3);

		radioButton_6 = new JRadioButton("7");
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_6.setBounds(426, 145, 51, 23);
		add(radioButton_6);

		radioButton_9 = new JRadioButton("6");
		radioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_9.setBounds(426, 180, 51, 23);
		add(radioButton_9);

		radioButton_12 = new JRadioButton("15");
		radioButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_12.setBounds(426, 216, 51, 23);
		add(radioButton_12);

		radioButton_15 = new JRadioButton("10");
		radioButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton_15.setBounds(426, 252, 51, 23);
		add(radioButton_15);

		/***********************Button Group***************************/

		buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton_1);
		buttonGroup1.add(radioButton_2);
		buttonGroup1.add(radioButton_3);

		buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(radioButton_4);
		buttonGroup2.add(radioButton_5);
		buttonGroup2.add(radioButton_6);

		buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(radioButton_7);
		buttonGroup3.add(radioButton_8);
		buttonGroup3.add(radioButton_9);

		buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(radioButton_10);
		buttonGroup4.add(radioButton_11);
		buttonGroup4.add(radioButton_12);

		buttonGroup5 = new ButtonGroup();
		buttonGroup5.add(radioButton_13);
		buttonGroup5.add(radioButton_14);
		buttonGroup5.add(radioButton_15);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setEnabled(false);
		textField_5.setEditable(false);

		textField_5.setColumns(10);
		textField_5.setBounds(552, 113, 59, 20);
		add(textField_5);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.setEnabled(false);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(552, 149, 59, 20);
		add(textField_6);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_7.setEnabled(false);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(552, 185, 59, 20);
		add(textField_7);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_8.setEnabled(false);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(552, 221, 59, 20);
		add(textField_8);

		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_9.setEnabled(false);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(552, 257, 59, 20);
		add(textField_9);

		btnNewButton = new JButton("Compute FP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(textField_0.getText().equals("") || textField_0.getText() == null
						|| textField_1.getText().equals("") || textField_1.getText() == null
						|| textField_2.getText().equals("") || textField_2.getText() == null
						|| textField_3.getText().equals("") || textField_3.getText() == null
						|| textField_4.getText().equals("") || textField_4.getText() == null)
					JOptionPane.showMessageDialog(null, "Enter all values");
				else {
					totalCount();
				}

			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 14));
		btnNewButton.setBounds(29, 335, 161, 34);
		add(btnNewButton);

		btnValueAdjustment = new JButton("Value Adjustments");
		btnValueAdjustment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vAF.setVisible(true);
				textField_11.setText(vAF.getvAFtotal()+"");
				add(textField_11);

			}
		});
		btnValueAdjustment.setFont(new Font("Cambria", Font.BOLD, 14));
		btnValueAdjustment.setBounds(29, 380, 161, 34);
		add(btnValueAdjustment);

		btnComputeSize = new JButton("Compute Code Size");
		btnComputeSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String lang = "";
				
				lang= textField_13.getText();
				//Tab temp1 = (Tab) MainPage.tabbedPane_1.getSelectedComponent();
				if(lang.equals("None"))
				{
					 JOptionPane.showMessageDialog(null, "Please select the language");
				}
				else {
				
				if(lang.equalsIgnoreCase("assembler")) {

					textField_12.setText(""+(int)FP*209);
				} else if(lang.equalsIgnoreCase("ada 95")) {
					textField_12.setText(""+(int)FP*154);

				} else if(lang.equalsIgnoreCase("c#")) {
					textField_12.setText(""+(int)FP*58);
				}
				else if(lang.equalsIgnoreCase("c++")) {
					textField_12.setText(""+(int)FP*59);
				}
				else if(lang.equalsIgnoreCase("c")) {
					textField_12.setText(""+(int)FP*148);
				}
				else if(lang.equalsIgnoreCase("cobol")) {
					textField_12.setText(""+(int)FP*80);
				}
				else if(lang.equalsIgnoreCase("fortran")) {
					textField_12.setText(""+(int)FP*90);
				}else if(lang.equalsIgnoreCase("html")) {
					textField_12.setText(""+(int)FP*43);
				}
				else if(lang.equalsIgnoreCase("java")) {
					textField_12.setText(""+(int)FP*55);
				}
				else if(lang.equalsIgnoreCase("java script")) {
					textField_12.setText(""+(int)FP*54);
				}else if(lang.equalsIgnoreCase("visual basic")) {
					textField_12.setText(""+(int)FP*50);
				}
				else if(lang.equalsIgnoreCase("vb script")) {
					textField_12.setText(""+(int)FP*38);
				}
				codeSize=Integer.parseInt(textField_12.getText());
				}
	
			}
		});
		btnComputeSize.setFont(new Font("Cambria", Font.BOLD, 14));
		btnComputeSize.setBounds(29, 425, 161, 34);
		add(btnComputeSize);

		btnLanguage = new JButton("Code Language");
		btnLanguage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnLanguage) {

					//language = new Language();	
					language.setVisible(true);
					textField_13.setText(language.getLanguage());
					add(textField_13);
					

				}
			}
		});
		btnLanguage.setFont(new Font("Cambria", Font.BOLD, 14));
		btnLanguage.setBounds(29, 469, 161, 34);
		add(btnLanguage);

		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_10.setEditable(false);
		textField_10.setEnabled(false);
		textField_10.setBounds(552, 293, 59, 20);
		textField_10.setColumns(10);
		add(textField_10);

		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_11.setEditable(false);
		textField_11.setEnabled(false);
		textField_11.setText("0");
		textField_11.setColumns(10);
		textField_11.setBounds(552, 390, 59, 20);
		add(textField_11);

		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_12.setEditable(false);
		textField_12.setEnabled(false);
		textField_12.setColumns(10);
		textField_12.setBounds(552, 430, 59, 20);
		add(textField_12);

		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_13.setEditable(false);
		textField_13.setEnabled(false);
		textField_13.setColumns(10);
		textField_13.setBounds(432, 430, 59, 20);
		textField_13.setText(language.getLanguage());
		add(textField_13);


		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_14.setEditable(false);
		textField_14.setEnabled(false);
		textField_14.setColumns(10);
		textField_14.setBounds(552, 340, 59, 20);
		add(textField_14);
		
		
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	

	public int getInterLogicalFiles() {
		return interLogicalFiles;
	}

	public void setInterLogicalFiles(int interLogicalFiles) {
		this.interLogicalFiles = interLogicalFiles;
	}

	public int getInterLogicalFilesTotal() {
		return interLogicalFilesTotal;
	}

	public void setInterLogicalFilesTotal(int interLogicalFilesTotal) {
		this.interLogicalFilesTotal = interLogicalFilesTotal;
	}

	public double getFP() {
		return FP;
	}

	public void setFP(double fP) {
		FP = fP;
	}

	public int getExternalInput() {
		return externalInput;
	}

	public void setExternalInput(int externalInput) {
		this.externalInput = externalInput;
	}

	public int getExternalOutput() {
		return externalOutput;
	}

	public void setExternalOutput(int externalOutput) {
		this.externalOutput = externalOutput;
	}

	public int getExternalInquiries() {
		return externalInquiries;
	}

	public void setExternalInquiries(int externalInquiries) {
		this.externalInquiries = externalInquiries;
	}

	public int getExternalInterfaceFile() {
		return externalInterfaceFile;
	}

	public void setExternalInterfaceFile(int externalInterfaceFile) {
		this.externalInterfaceFile = externalInterfaceFile;
	}

	public int getExternalInputTotal() {
		return externalInputTotal;
	}

	public void setExternalInputTotal(int externalInputTotal) {
		this.externalInputTotal = externalInputTotal;
	}

	public int getExternalOutputTotal() {
		return externalOutputTotal;
	}

	public void setExternalOutputTotal(int externalOutputTotal) {
		this.externalOutputTotal = externalOutputTotal;
	}

	public int getExternalInquiriesTotal() {
		return externalInquiriesTotal;
	}

	public void setExternalInquiriesTotal(int externalInquiriesTotal) {
		this.externalInquiriesTotal = externalInquiriesTotal;
	}

	public int getExternalInterfaceFileTotal() {
		return externalInterfaceFileTotal;
	}

	public void setExternalInterfaceFileTotal(int externalInterfaceFileTotal) {
		this.externalInterfaceFileTotal = externalInterfaceFileTotal;
	}
	

	public int getCodeSize() {
		return codeSize;
	}

	public void setCodeSize(int codeSize) {
		this.codeSize = codeSize;
	}
	

	public ValueAdjustment getvAF() {
		return vAF;
	}

	public void setvAF(ValueAdjustment vAF) {
		this.vAF = vAF;
	}
	

	public int getExternalInputWeight() {
		return externalInputWeight;
	}

	public void setExternalInputWeight(int externalInputWeight) {
		this.externalInputWeight = externalInputWeight;
	}

	public int getExternalOutputWeight() {
		return externalOutputWeight;
	}

	public void setExternalOutputWeight(int externalOutputWeight) {
		this.externalOutputWeight = externalOutputWeight;
	}

	public int getExternalInquiriesWeight() {
		return externalInquiriesWeight;
	}

	public void setExternalInquiriesWeight(int externalInquiriesWeight) {
		this.externalInquiriesWeight = externalInquiriesWeight;
	}

	public int getInterLogicalFilesWeight() {
		return interLogicalFilesWeight;
	}

	public void setInterLogicalFilesWeight(int interLogicalFilesWeight) {
		this.interLogicalFilesWeight = interLogicalFilesWeight;
	}

	public int getExternalInterfaceFileWeight() {
		return externalInterfaceFileWeight;
	}

	public void setExternalInterfaceFileWeight(int externalInterfaceFileWeight) {
		this.externalInterfaceFileWeight = externalInterfaceFileWeight;
	}

	private void totalCount() {

		try {
			int radioButton_1_value = 0;

			for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
				AbstractButton button = buttons.nextElement();
				if (button.isSelected()) {
					radioButton_1_value = Integer.parseInt(button.getText());
				}
			}
			
			externalInput=Integer.parseInt(textField_0.getText());
			externalInputWeight=radioButton_1_value;
			externalInputTotal= Integer.parseInt(textField_0.getText())*(radioButton_1_value);
			
			textField_5.setText(""+externalInputTotal);

			int radioButton_2_value = 0;

			for (Enumeration<AbstractButton> buttons = buttonGroup2.getElements(); buttons.hasMoreElements();) {
				AbstractButton button = buttons.nextElement();
				if (button.isSelected()) {
					radioButton_2_value = Integer.parseInt(button.getText());
				}
			}
			externalOutput=Integer.parseInt(textField_1.getText());
			externalInputWeight=radioButton_2_value;
			externalOutputTotal = Integer.parseInt(textField_1.getText())*radioButton_2_value;
			textField_6.setText(""+externalOutputTotal);

			int radioButton_3_value = 0;

			for (Enumeration<AbstractButton> buttons = buttonGroup3.getElements(); buttons.hasMoreElements();) {
				AbstractButton button = buttons.nextElement();
				if (button.isSelected()) {
					radioButton_3_value = Integer.parseInt(button.getText());
				}
			}
			externalInquiries=Integer.parseInt(textField_2.getText());
			externalInquiriesWeight=radioButton_3_value;
			externalInquiriesTotal = Integer.parseInt(textField_2.getText())*radioButton_3_value;
			textField_7.setText(""+externalInquiriesTotal);

			int radioButton_4_value = 0;

			for (Enumeration<AbstractButton> buttons = buttonGroup4.getElements(); buttons.hasMoreElements();) {
				AbstractButton button = buttons.nextElement();
				if (button.isSelected()) {
					radioButton_4_value = Integer.parseInt(button.getText());
				}
			}
			interLogicalFiles=Integer.parseInt(textField_3.getText());
			interLogicalFilesWeight=radioButton_4_value;
			interLogicalFilesTotal = Integer.parseInt(textField_3.getText())*radioButton_4_value;
			textField_8.setText(""+interLogicalFilesTotal);

			int radioButton_5_value = 0;

			for (Enumeration<AbstractButton> buttons = buttonGroup5.getElements(); buttons.hasMoreElements();) {
				AbstractButton button = buttons.nextElement();
				if (button.isSelected()) {
					radioButton_5_value = Integer.parseInt(button.getText());
				}
			}
			
			externalInterfaceFile=Integer.parseInt(textField_4.getText());
			externalInterfaceFileWeight=radioButton_5_value;
			externalInterfaceFileTotal= Integer.parseInt(textField_4.getText())*radioButton_5_value;
			textField_9.setText(""+radioButton_5_value);

			int total =externalInputTotal+externalOutputTotal+externalInquiriesTotal+interLogicalFilesTotal+externalInterfaceFileTotal;
			textField_10.setText(""+total);
			

			FP =total*(0.65 + 0.01 * vAF.getvAFtotal());
			textField_14.setText(""+Math.round(FP*100.0)/100.0);



		} catch (Exception e1) {
			e1.printStackTrace();
		}


	}
}
