package csulb.se;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class NewProject extends JDialog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private ArrayList<Tab> fptab;
	private ArrayList<ProjectFile> fileTab;
	private SmiTab smiTab;
	private String projectName;
	private String productName;
	private String creatorName;
	private String comments;

	
	

	public ArrayList<ProjectFile> getFileTab() {
		return fileTab;
	}



	public void setFileTab(ArrayList<ProjectFile> fileTab) {
		this.fileTab = fileTab;
	}



	public SmiTab getSmiTab() {
		return smiTab;
	}
	
	

	public void setSmiTab(SmiTab smiTab) {
		this.smiTab = smiTab;
	}

	public ArrayList<Tab> getFptab() {
		return fptab;
	}

	public void setFptab(ArrayList<Tab> fptab) {
		this.fptab = fptab;
	}
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NewProject dialog = new NewProject();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NewProject() {
			fptab=new ArrayList<Tab>();
			fileTab=new ArrayList<ProjectFile>();
				
			setBounds(100, 100, 482, 344);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(null);
		
			JLabel lblNewLabel = new JLabel("CECS 543 Metrics Suite New Project");
			lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 16));
			lblNewLabel.setBounds(110, 11, 249, 25);
			contentPanel.add(lblNewLabel);
		
		
			JLabel lblProjectName = new JLabel("Project Name:");
			lblProjectName.setFont(new Font("Calibri", Font.BOLD, 16));
			lblProjectName.setBounds(29, 47, 115, 25);
			contentPanel.add(lblProjectName);
		
		
			JLabel lblProductName = new JLabel("Product Name:");
			lblProductName.setFont(new Font("Calibri", Font.BOLD, 16));
			lblProductName.setBounds(29, 83, 115, 25);
			contentPanel.add(lblProductName);
		
		
			JLabel lblCreator = new JLabel("Creator:");
			lblCreator.setFont(new Font("Calibri", Font.BOLD, 16));
			lblCreator.setBounds(29, 119, 72, 25);
			contentPanel.add(lblCreator);
		
		
			JTextField textField = new JTextField();
			textField.setBounds(163, 49, 201, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		
		
			JTextField textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(163, 83, 201, 20);
			contentPanel.add(textField_1);
		
		
			JTextField textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(163, 119, 201, 20);
			contentPanel.add(textField_2);
		
		
			JLabel lblComments = new JLabel("Comments:");
			lblComments.setFont(new Font("Calibri", Font.BOLD, 16));
			lblComments.setBounds(29, 150, 115, 25);
			contentPanel.add(lblComments);
		

		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(29, 180, 402, 82);
		contentPanel.add(textArea);
		{
			JButton okButton = new JButton("OK");
			okButton.setBounds(29, 273, 72, 23);
			contentPanel.add(okButton);
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(textField.getText() == null || textField.getText().trim().equals("")||textField_1.getText() == null || textField_1.getText().trim().equals("")||textField_2.getText() == null || textField_2.getText().trim().equals(""))
						JOptionPane.showMessageDialog(null, "Project Name, Product name and Creator name are mandatory");
					else {
						projectName=textField.getText();
						productName=textField_1.getText();
						creatorName=textField_2.getText();
						comments=textArea.getText();
						MainPage.frmCecsMetrics.setTitle("CECS 543 Metrics Suite " + projectName);
						dispose();
					}
				}
			});
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setBounds(110, 273, 82, 23);
			contentPanel.add(cancelButton);
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			cancelButton.setActionCommand("Cancel");
		}
	}
	
	public NewProject(ProjectInfo proj) {
		this.projectName=proj.getProjectName();
		this.productName=proj.getProductName();
		this.creatorName=proj.getCreatorName();
		this.comments=proj.getComments();
		this.fptab=new ArrayList<Tab>();
		this.fileTab=new ArrayList<ProjectFile>();
		for(int i=0;i<proj.getFunctionpoint().size();i++)
		{
			this.fptab.add(new Tab(proj.getFunctionpoint().get(i)));
		}
		for(int i=0;i<proj.getProjectFiles().size();i++)
		{
			this.fileTab.add(new ProjectFile(proj.getProjectFiles().get(i)));
		}
	
	}
	
}
