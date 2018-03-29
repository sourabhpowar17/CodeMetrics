package csulb.se;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Vector;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextField;

public class SmiTab extends JScrollPane {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel model;
	private int totalModule=0;
	private int currRow;
	

	
	
	

	/**
	 * Create the panel.
	 */
	public SmiTab() {
		
		String[] columns= {"SMI", "Modules Added", "Modules Changed", "Modules Deleted", "Total Modules"};
		Object [][] rows= new Object [][] { };
		setSize(new Dimension(1000, 800));
		setBorder(null);
		setLayout(null);
		
		model=new DefaultTableModel(rows,columns){
            boolean[] canEdit = new boolean [] {
                    false, true, true, true, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            };
		
		model.setColumnCount(5);
		model.addColumn(columns);
		model.setColumnIdentifiers(columns);
/*		
		Object [] row=new Object[5];
		row[0]="SMI";
		row[1]="Module added";
		row[2]="Module Changed";
		row[3]="Module Deleted";
		row[4]="Total Modules";
		model.addRow(row);*/
		table = new JTable();
		table.setModel(model);
		//table.setColumnSelectionAllowed(true);
		table.setBackground(Color.WHITE);
		table.setRowSelectionAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(50, 50, 600, 400);
		add(table);
		
		
		
		JLabel lblNewLabel = new JLabel("Software Maturity Index");
		lblNewLabel.setBounds(100, 10, 200, 50);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add row");
		setRowHeaderView(btnNewButton);
		btnNewButton.setBounds(50, 455, 150, 30);
		btnNewButton.addActionListener(new ActionListener() {
				
		public void actionPerformed(ActionEvent e) {				
				Object [] row=new Object[] {};				
				model.addRow(row);
				}
			});
		add(btnNewButton);

		
		JButton btnNewButton_1 = new JButton("Compute Index");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//GEN-FIRST:event_btnCIActionPerformed
		        // TODO add your handling code here:
		        
		        Integer mAdded= 0;
		        Integer mChanged = 0;
		        Integer mDeleted = 0;
		        Double smi=0.0;
		        if(currRow==0){
		            //mTotal =  Integer.parseInt(model.getValueAt(currRow, 1).toString());
		            mAdded =  Integer.parseInt(model.getValueAt(currRow, 1).toString());
		            mDeleted = Integer.parseInt(model.getValueAt(currRow, 3).toString());
		            mChanged = Integer.parseInt(model.getValueAt(currRow, 2).toString());
		            if(mAdded < 0 || mDeleted < 0 || mChanged < 0){
		                JOptionPane.showMessageDialog(null, "Negative values are not allowed.");
		            }
		            else{
		                totalModule = mAdded;
		                totalModule = totalModule - mDeleted;
		                if(totalModule < 0){
		                    JOptionPane.showMessageDialog(null, "Modules Deleted cannot be greater than Total Modules");
		                }
		                else{
		                    smi = (double)(totalModule - (mAdded + mChanged + mDeleted))/mAdded;
		                    model.setValueAt(totalModule, currRow, 4);
		                    model.setValueAt(smi, currRow,0);
		                }
		            }
		        }
		        else{
		            mAdded =  Integer.parseInt(model.getValueAt(currRow, 1).toString());    
		            mDeleted = Integer.parseInt(model.getValueAt(currRow, 3).toString());
		            mChanged = Integer.parseInt(model.getValueAt(currRow, 2).toString());
		            if(mAdded < 0 || mDeleted < 0 || mChanged < 0){
		                JOptionPane.showMessageDialog(null, "Negative values are not allowed.");
		            }
		            else {
		                totalModule  = (Integer)model.getValueAt(currRow-1,4) + mAdded - mDeleted;
		                if(totalModule  < 0){
		                    JOptionPane.showMessageDialog(null, "Modules Deleted cannot be greater than Total Modules");
		                }
		                else{
		                    smi = (double)(totalModule - (mAdded + mChanged + mDeleted))/totalModule;
		                    model.setValueAt(totalModule, currRow, 4);
		                    model.setValueAt(smi, currRow,0);
		                }
		            }
		        }
		       
		        
		                
		    }
		});
		setRowHeaderView(btnNewButton_1);
		btnNewButton_1.setBounds(205, 455, 150, 30);
		add(btnNewButton_1);
		
	}
	

}
