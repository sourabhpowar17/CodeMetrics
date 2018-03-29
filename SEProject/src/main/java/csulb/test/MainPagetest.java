package csulb.test;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainPagetest extends JFrame{

	public MainPagetest() {
		initUI();
	}

	private void initUI(){
		createMenuBar();
		createTabbedPane();
	}

	private void createTabbedPane() {
		
		
	}

	private void createMenuBar() {
		
		setTitle("CECS 543 Metric Suite");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JMenuBar menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenuItem newFile = new JMenuItem("New");
		
		JMenuItem open = new JMenuItem("Open");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem exit = new JMenuItem("Exit");
		file.add(newFile);
		file.add(open);
		file.add(save);
		file.add(exit);

		JMenu edit = new JMenu("Edit");

		JMenu preferences = new JMenu("Preferences");
		JMenuItem language = new JMenuItem("Language");
		preferences.add(language);

		JMenu metrics = new JMenu("Metrics");
		JMenu functionPoints = new JMenu("Function Points");
		metrics.add(functionPoints);
		JMenuItem fpData = new JMenuItem("Enter FP Data");
		functionPoints.add(fpData);

		JMenu help = new JMenu("Help");

		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(preferences);
		menuBar.add(metrics);
		menuBar.add(help);

		setJMenuBar(menuBar);
	}
	
	
	
	public static void main(String[] args) {
		MainPagetest mainPage = new MainPagetest();
	}
}
