package csulb.test;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button1;
	JTextArea textArea1;
	int buttonClicked;

	public Test() {
	
		this.setSize(400, 400);
		
		//this.setLocationRelativeTo(null);
		this.setVisible(true);

		setTitle("CECS 543 Metric Suite");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JLabel lable = new JLabel("Test Lable");
		
		button1 = new JButton("Submit");
		textArea1 = new JTextArea(15,20);
		textArea1.setText("Event Counter ");
		textArea1.setLineWrap(true);

		ListenForAction listenForAction = new ListenForAction();

		button1.addActionListener(listenForAction);
		panel.add(lable);
		panel.add(button1);
		panel.add(textArea1);
		this.add(panel);
	}

	public static void main(String[] args) {
		new Test();
	}

	private class ListenForAction implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == button1) {
				buttonClicked++;
				textArea1.append("Button clicked : "+buttonClicked+"\n");
			}

		}

	}
}
