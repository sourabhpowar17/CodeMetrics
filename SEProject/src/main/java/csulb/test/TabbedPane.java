package csulb.test;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPane  extends JFrame{


	public TabbedPane() {

		setTitle("Tabbed Pane");
		setSize(400,400);
		JTabbedPane jtp = new JTabbedPane();
		getContentPane().add(jtp);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JLabel label1 = new JLabel();
		label1.setText("You are in area of Tab1");
		JLabel label2 = new JLabel();
		label2.setText("You are in area of Tab2");
		jp1.add(label1);
		jp2.add(label2);
		
		JButton button = new JButton("Ok");
		jp1.add(button);
		jtp.addTab("Tab1", jp1);
		jtp.addTab("Tab2", jp2);

	}
	public static void main(String[] args) {

		TabbedPane tp = new TabbedPane();
		tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tp.setVisible(true);

	}
}

