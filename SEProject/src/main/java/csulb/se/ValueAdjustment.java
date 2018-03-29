package csulb.se;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class ValueAdjustment extends JDialog implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int vAFtotal;
	private transient String[] comboBoxValue = {"0","1","2","3","4","5"};
	JPanel contentPanel;

	private  JComboBox<Object> comboBox1 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox2 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox3 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox4 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox5 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox6 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox7 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox8 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox9 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox10 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox11 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox12 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox13 = new JComboBox<Object>(comboBoxValue);
	private  JComboBox<Object> comboBox14 = new JComboBox<Object>(comboBoxValue);
	
	public int getvAFtotal() {
		return vAFtotal;
	}

	public void setvAFtotal(int vAFtotal) {
		this.vAFtotal = vAFtotal;
	}
	

	
	public JComboBox<Object> getComboBox1() {
		return comboBox1;
	}

	public void setComboBox1(JComboBox<Object> comboBox1) {
		this.comboBox1 = comboBox1;
	}

	public JComboBox<Object> getComboBox2() {
		return comboBox2;
	}

	public void setComboBox2(JComboBox<Object> comboBox2) {
		this.comboBox2 = comboBox2;
	}

	public JComboBox<Object> getComboBox3() {
		return comboBox3;
	}

	public void setComboBox3(JComboBox<Object> comboBox3) {
		this.comboBox3 = comboBox3;
	}

	public JComboBox<Object> getComboBox4() {
		return comboBox4;
	}

	public void setComboBox4(JComboBox<Object> comboBox4) {
		this.comboBox4 = comboBox4;
	}

	public JComboBox<Object> getComboBox5() {
		return comboBox5;
	}

	public void setComboBox5(JComboBox<Object> comboBox5) {
		this.comboBox5 = comboBox5;
	}

	public JComboBox<Object> getComboBox6() {
		return comboBox6;
	}

	public void setComboBox6(JComboBox<Object> comboBox6) {
		this.comboBox6 = comboBox6;
	}

	public JComboBox<Object> getComboBox7() {
		return comboBox7;
	}

	public void setComboBox7(JComboBox<Object> comboBox7) {
		this.comboBox7 = comboBox7;
	}

	public JComboBox<Object> getComboBox8() {
		return comboBox8;
	}

	public void setComboBox8(JComboBox<Object> comboBox8) {
		this.comboBox8 = comboBox8;
	}

	public JComboBox<Object> getComboBox9() {
		return comboBox9;
	}

	public void setComboBox9(JComboBox<Object> comboBox9) {
		this.comboBox9 = comboBox9;
	}

	public JComboBox<Object> getComboBox10() {
		return comboBox10;
	}

	public void setComboBox10(JComboBox<Object> comboBox10) {
		this.comboBox10 = comboBox10;
	}

	public JComboBox<Object> getComboBox11() {
		return comboBox11;
	}

	public void setComboBox11(JComboBox<Object> comboBox11) {
		this.comboBox11 = comboBox11;
	}

	public JComboBox<Object> getComboBox12() {
		return comboBox12;
	}

	public void setComboBox12(JComboBox<Object> comboBox12) {
		this.comboBox12 = comboBox12;
	}

	public JComboBox<Object> getComboBox13() {
		return comboBox13;
	}

	public void setComboBox13(JComboBox<Object> comboBox13) {
		this.comboBox13 = comboBox13;
	}

	public JComboBox<Object> getComboBox14() {
		return comboBox14;
	}

	public void setComboBox14(JComboBox<Object> comboBox14) {
		this.comboBox14 = comboBox14;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ValueAdjustment dialog = new ValueAdjustment();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ValueAdjustment() {init();}
	public void init() {
			
			contentPanel = new JPanel();
			setBounds(100, 100, 676, 497);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(null);


		
			JLabel lblNewLabel = new JLabel("Assign the value from 0 to 5 for each of the following value Adjustment Factors:");
			lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblNewLabel.setBounds(10, 11, 600, 16);
			contentPanel.add(lblNewLabel);
		
		
			JLabel lblDoesTheSystem = new JLabel("Does the system require reliable backup and recovery processes?");
			lblDoesTheSystem.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblDoesTheSystem.setBounds(10, 48, 566, 16);
			contentPanel.add(lblDoesTheSystem);
		
		
			JLabel lblAreSpecializedData = new JLabel("Are specialized data communications required to transfer information to or from the application?");
			lblAreSpecializedData.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblAreSpecializedData.setBounds(10, 75, 579, 16);
			contentPanel.add(lblAreSpecializedData);
	
		
			JLabel lblAreThereDistributed = new JLabel("Are there distributed processing functions?");
			lblAreThereDistributed.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblAreThereDistributed.setBounds(10, 102, 579, 16);
			contentPanel.add(lblAreThereDistributed);
	
		
			JLabel lblIsPerformanceCritical = new JLabel("Is performance critical?");
			lblIsPerformanceCritical.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblIsPerformanceCritical.setBounds(10, 129, 600, 16);
			contentPanel.add(lblIsPerformanceCritical);
		
		
			JLabel lblWillTheSystem = new JLabel("Does the system require online data entry?");
			lblWillTheSystem.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblWillTheSystem.setBounds(10, 183, 579, 16);
			contentPanel.add(lblWillTheSystem);
		
		
			JLabel lblDoesTheOnline = new JLabel("Are the internal logical files updated online?");
			lblDoesTheOnline.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblDoesTheOnline.setBounds(10, 237, 579, 16);
			contentPanel.add(lblDoesTheOnline);

		
			JLabel lblAreTheInput = new JLabel("Are the input, output, files or inquiries complex?");
			lblAreTheInput.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblAreTheInput.setBounds(10, 264, 579, 16);
			contentPanel.add(lblAreTheInput);
		
		
			JLabel lblIsTheInternal = new JLabel("Is the internal processing complex?");
			lblIsTheInternal.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblIsTheInternal.setBounds(10, 291, 566, 16);
			contentPanel.add(lblIsTheInternal);
		
		
			JLabel lblIsTheCode = new JLabel("Is the code designed to be reusable?");
			lblIsTheCode.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblIsTheCode.setBounds(10, 318, 566, 16);
			contentPanel.add(lblIsTheCode);
		
		
			JLabel lblAreConversionOr = new JLabel("Are conversion or installation included in the design?");
			lblAreConversionOr.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblAreConversionOr.setBounds(10, 345, 566, 16);
			contentPanel.add(lblAreConversionOr);
		
		
			JLabel lblIsTheSystem = new JLabel("Is the system designed for multiple installations in different organizations?");
			lblIsTheSystem.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblIsTheSystem.setBounds(10, 372, 566, 16);
			contentPanel.add(lblIsTheSystem);
		
			JLabel lblIsTheApplication = new JLabel("Is the application designed to facilitate change and for ease of use by the user?");
			lblIsTheApplication.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblIsTheApplication.setBounds(4, 399, 572, 16);
			contentPanel.add(lblIsTheApplication);
		
		
		

		comboBox1 = new JComboBox<Object>(comboBoxValue);
		comboBox1.setBounds(600, 100, 33, 20);
		contentPanel.add(comboBox1);

		comboBox2 = new JComboBox<Object>(comboBoxValue);
		comboBox2.setBounds(600, 127, 33, 20);
		contentPanel.add(comboBox2);

		comboBox3 = new JComboBox<Object>(comboBoxValue);
		comboBox3.setBounds(600, 154, 33, 20);
		contentPanel.add(comboBox3);

		comboBox4 = new JComboBox<Object>(comboBoxValue);
		comboBox4.setBounds(599, 181, 33, 20);
		contentPanel.add(comboBox4);

		comboBox5 = new JComboBox<Object>(comboBoxValue);
		comboBox5.setBounds(600, 208, 33, 20);
		contentPanel.add(comboBox5);

		comboBox6 = new JComboBox<Object>(comboBoxValue);
		comboBox6.setBounds(600, 235, 33, 20);
		contentPanel.add(comboBox6);

		comboBox7 = new JComboBox<Object>(comboBoxValue);
		comboBox7.setBounds(600, 262, 33, 20);
		contentPanel.add(comboBox7);

		comboBox8 = new JComboBox<Object>(comboBoxValue);
		comboBox8.setBounds(600, 289, 33, 20);
		contentPanel.add(comboBox8);

		comboBox9 = new JComboBox<Object>(comboBoxValue);
		comboBox9.setBounds(600, 316, 33, 20);
		contentPanel.add(comboBox9);


		comboBox10 = new JComboBox<Object>(comboBoxValue);
		comboBox10.setBounds(600, 343, 33, 20);
		contentPanel.add(comboBox10);


		comboBox11 = new JComboBox<Object>(comboBoxValue);
		comboBox11.setBounds(600, 370, 33, 20);
		contentPanel.add(comboBox11);


		comboBox12 = new JComboBox<Object>(comboBoxValue);
		comboBox12.setBounds(600, 397, 33, 20);
		contentPanel.add(comboBox12);


		comboBox13 = new JComboBox<Object>(comboBoxValue);
		comboBox13.setBounds(600, 46, 33, 20);
		contentPanel.add(comboBox13);

		comboBox14 = new JComboBox<Object>(comboBoxValue);
		comboBox14.setBounds(599, 73, 33, 20);
		contentPanel.add(comboBox14);


		
			JLabel lblWillTheSystem_1 = new JLabel("Will the system run in an existing, heavily utilized operational environment?");
			lblWillTheSystem_1.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblWillTheSystem_1.setBounds(10, 156, 579, 16);
			contentPanel.add(lblWillTheSystem_1);
		
		
			JLabel lblDoesTheOnline_1 = new JLabel("Does the online data entry the input transaction to be build over multiple screens or operations?");
			lblDoesTheOnline_1.setFont(new Font("Calibri", Font.PLAIN, 14));
			lblDoesTheOnline_1.setBounds(10, 210, 579, 16);
			contentPanel.add(lblDoesTheOnline_1);
		
			
		
			
				JButton okButton = new JButton("OK");
				okButton.setSize(90, 25);
				okButton.setLocation(200, 420);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {		
						vAFtotal=0;
						vAFtotal+= Integer.parseInt(comboBox13.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox14.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox1.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox2.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox3.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox4.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox5.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox6.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox7.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox8.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox9.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox10.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox11.getSelectedItem().toString());
						vAFtotal+= Integer.parseInt(comboBox12.getSelectedItem().toString());
						Tab temp1 = (Tab) MainPage.tabbedPane_1.getSelectedComponent();
						if(temp1 != null)
							temp1.textField_11.setText(""+vAFtotal);
						
				 		
	
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				contentPanel.add(okButton);
				
			
			
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setLocation(320, 420);
				cancelButton.setSize(90, 25);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				contentPanel.add(cancelButton);
			
		}

	

	public ValueAdjustment(VafSaveData vafdata, int getvAF) {
		init();
		this.vAFtotal=getvAF;
		this.comboBox1.setSelectedItem(vafdata.getComboBox1());
		this.comboBox2.setSelectedItem(vafdata.getComboBox2());
		this.comboBox3.setSelectedItem(vafdata.getComboBox3());
		this.comboBox4.setSelectedItem(vafdata.getComboBox4());
		this.comboBox5.setSelectedItem(vafdata.getComboBox5());
		this.comboBox6.setSelectedItem(vafdata.getComboBox6());
		this.comboBox7.setSelectedItem(vafdata.getComboBox7());
		this.comboBox8.setSelectedItem(vafdata.getComboBox8());
		this.comboBox9.setSelectedItem(vafdata.getComboBox9());
		this.comboBox10.setSelectedItem(vafdata.getComboBox10());
		this.comboBox11.setSelectedItem(vafdata.getComboBox11());
		this.comboBox12.setSelectedItem(vafdata.getComboBox12());
		this.comboBox13.setSelectedItem(vafdata.getComboBox13());
		this.comboBox14.setSelectedItem(vafdata.getComboBox14());
	}
	}




