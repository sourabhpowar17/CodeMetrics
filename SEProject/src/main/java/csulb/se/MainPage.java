package csulb.se;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class MainPage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JFrame frmCecsMetrics;

	private NewProject project;
	private Boolean saveFlag = false;

	private JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	static JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
	private JScrollPane treeView = new JScrollPane();
	private JTree tree = new JTree();
	DefaultMutableTreeNode top;
	private DefaultMutableTreeNode selectedNode;
	private ArrayList<Component> removedTabs = new ArrayList<Component>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();

					frmCecsMetrics.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					frmCecsMetrics.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	public NewProject getProject() {
		return project;
	}

	public void setProject(NewProject project) {
		this.project = project;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmCecsMetrics = new JFrame();

		frmCecsMetrics.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				if (saveFlag == false && project != null) {
					JOptionPane.showMessageDialog(null, "Please save project before closing window");

				} else {
					frmCecsMetrics.setVisible(false);
				}

			}
		});
		frmCecsMetrics.setTitle("CECS 543 Metrics Suite");
		frmCecsMetrics.setBounds(100, 100, 900, 900);
		frmCecsMetrics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		splitPane.setRightComponent(tabbedPane_1);

		JPopupMenu menu = new JPopupMenu();
		JMenuItem item = new JMenuItem("Open");
		item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < removedTabs.size(); i++) {
					try {
						if (removedTabs.get(i) instanceof ProjectFile) {
							if (selectedNode.toString()
									.equalsIgnoreCase(((ProjectFile) removedTabs.get(i)).getTabname())) {

								tabbedPane_1.addTab(((ProjectFile) removedTabs.get(i)).getTabname(),
										removedTabs.get(i));
								removedTabs.remove(i);
							}
						}
						if (removedTabs.get(i) instanceof Tab) {
							if (selectedNode.toString().equalsIgnoreCase(((Tab) removedTabs.get(i)).getTabname())) {

								tabbedPane_1.addTab(((Tab) removedTabs.get(i)).getTabname(), removedTabs.get(i));
								removedTabs.remove(i);
							}
						}
					} catch (Exception exp) {
						// TODO: handle exception
					}
				}
			}
		});
		menu.add(item);

		JMenuItem item2 = new JMenuItem("Close");
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (tabbedPane_1.indexOfTab(selectedNode.toString()) != -1) {
					removedTabs.add(tabbedPane_1.getComponent(tabbedPane_1.indexOfTab(selectedNode.toString())));
					tabbedPane_1.remove((tabbedPane_1.indexOfTab(selectedNode.toString())));
				}
			}
		});
		menu.add(item2);

		JMenuItem item3 = new JMenuItem("Delete");
		item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane jopt= new JOptionPane("Delete"+selectedNode.toString(),JOptionPane.WARNING_MESSAGE , JOptionPane.YES_NO_CANCEL_OPTION);
				int result=jopt.showConfirmDialog(null, "Delete"+selectedNode.toString());
				if (result==JOptionPane.YES_OPTION) {
				System.out.println("inside listener"+tabbedPane_1.indexOfTab(selectedNode.toString()));
				int index;
				// TODO Auto-generated method stub
				if (tabbedPane_1.indexOfTab(selectedNode.toString()) != -1) {
					index = tabbedPane_1.indexOfTab(selectedNode.toString());
					System.out.println(tabbedPane_1.getComponentAt(index).getClass());
					if (tabbedPane_1.getComponentAt(index) instanceof ProjectFile) {
						for (int j = 0; j < project.getFileTab().size(); j++) {
							if (project.getFileTab().get(j).getTabname().equalsIgnoreCase(selectedNode.toString()))
								project.getFileTab().remove(j);
						}
						tabbedPane_1.remove(index);
					}
					else if (tabbedPane_1.getComponentAt(index) instanceof Tab) {
						for (int j = 0; j < project.getFptab().size(); j++) {
							if (project.getFptab().get(j).getTabname().equalsIgnoreCase(selectedNode.toString()))
								project.getFptab().remove(j);
						}
						tabbedPane_1.remove(index);
					}
				((DefaultTreeModel)tree.getModel()).removeNodeFromParent(selectedNode);

				}
			}
			}
		});
		menu.add(item3);

		treeView.add(tree);
		splitPane.setLeftComponent(treeView);
		frmCecsMetrics.getContentPane().add(splitPane);

		JMenuBar menuBar = new JMenuBar();
		frmCecsMetrics.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				project = new NewProject();
				project.setVisible(true);
				frmCecsMetrics.setTitle("CECS 543 Metrics Suite : " + project.getProjectName());

			}
		});

		mnFile.add(mntmNew);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saveFlag == false && project != null) {
					JOptionPane.showMessageDialog(null, "Please save current project before opening new project");

				} else {

					File file = null;

					// FileNameExtensionFilter filter = new FileNameExtensionFilter(".ms
					// file",".ms");
					JFileChooser chooser = new JFileChooser("E:\\CodeMetricsProject");
					FileFilter ff = new FileFilter() {

						public String getDescription() {
							return "Ms extension File)";
						}

						public boolean accept(File f) {
							if (f.isDirectory()) {
								return true;
							} else {
								String filename = f.getName().toLowerCase();
								return filename.endsWith(".ms");
							}
						}
					};
					chooser.setFileFilter(ff);
					int returnVal = chooser.showOpenDialog(frmCecsMetrics);
					if (returnVal == JFileChooser.APPROVE_OPTION) {

						file = chooser.getSelectedFile();
						saveFlag=false;
						ObjectInputStream objectinputstream = null;
						try {

							FileInputStream streamIn = new FileInputStream(file);
							objectinputstream = new ObjectInputStream(streamIn);
							ProjectInfo temp = (ProjectInfo) objectinputstream.readObject();

							// MainPage window = new MainPage();
							project = new NewProject(temp);
							// frmCecsMetrics.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
							frmCecsMetrics.setTitle("CECS 543 Metrics Suite " + project.getProjectName());

							// frmCecsMetrics.setVisible(true);
							tabbedPane_1.removeAll();

							for (int i = 0; i < project.getFptab().size(); i++) {
								tabbedPane_1.addTab(project.getFptab().get(i).getTabname(), project.getFptab().get(i));
							}
							for (int i = 0; i < project.getFptab().size(); i++) {
								tabbedPane_1.addTab(project.getFileTab().get(i).getTabname(), project.getFileTab().get(i));
							}
							top = new DefaultMutableTreeNode(project.getProjectName());
							for (int i = 0; i < project.getFptab().size(); i++) {
								DefaultMutableTreeNode temptabname;
								temptabname = new DefaultMutableTreeNode(project.getFptab().get(i).getTabname());
								top.add(temptabname);
							}
							for (int i = 0; i < project.getFileTab().size(); i++) {
								DefaultMutableTreeNode temptabname;
								temptabname = new DefaultMutableTreeNode(project.getFileTab().get(i).getTabname());
								top.add(temptabname);
				
							}
							
							tree = new JTree(top);
							tree.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseReleased(MouseEvent e) {
									
									if (SwingUtilities.isRightMouseButton(e)) {
										TreePath pathForLocation = tree.getPathForLocation(e.getPoint().x, e.getPoint().y);
										menu.show(e.getComponent(), e.getX(), e.getY());
										if (pathForLocation != null) {
											selectedNode = (DefaultMutableTreeNode) pathForLocation.getLastPathComponent();
										} else {
											selectedNode = null;
										}

									}
								}
							});
							treeView = new JScrollPane(tree);
							splitPane.setLeftComponent(treeView);
							frmCecsMetrics.getContentPane().add(splitPane);
							

						} catch (Exception e1) {
							e1.printStackTrace();
						} finally {
							if (objectinputstream != null) {
								try {
									objectinputstream.close();
								} catch (IOException e1) {

									e1.printStackTrace();
								}
							}
						}
					}

				}
			}
		});
		mnFile.add(mntmOpen);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (project != null) {

					File file = new File("E:\\CodeMetricsProject" + project.getProjectName() + ".ms");
					JFileChooser saveFile = new JFileChooser("E:\\CodeMetricsProject");
					saveFile.setCurrentDirectory(new File("E:\\CodeMetricsProject"));
					saveFile.setSelectedFile(file);
					saveFile.showSaveDialog(null);
					ProjectInfo saveProjectInfo = new ProjectInfo(project);
					ObjectOutputStream oos = null;
					FileOutputStream fout = null;
					try {
						fout = new FileOutputStream(file);
						oos = new ObjectOutputStream(fout);
						oos.writeObject(saveProjectInfo);
						saveFlag = true;
						JOptionPane.showMessageDialog(null, "File saved successfully");
					} catch (Exception ex) {
						ex.printStackTrace();
					} finally {
						if (oos != null) {
							try {
								oos.close();
							} catch (IOException e) {

								e.printStackTrace();
							}
						}
					}

				} else {
					JOptionPane.showMessageDialog(null, "Create or open project");
				}

			}
		});
		mnFile.add(mntmSave);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		JMenu mnPreferences = new JMenu("Preferences");
		menuBar.add(mnPreferences);

		JMenuItem mntmLanguage = new JMenuItem("Language");
		mntmLanguage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mntmLanguage) {
					// fptab1.getLanguage().setVisible(true);

				}

			}
		});
		mnPreferences.add(mntmLanguage);

		JMenu mnMetric = new JMenu("Metric");
		menuBar.add(mnMetric);

		JMenu mnFunctionPoints = new JMenu("Function Points");
		mnMetric.add(mnFunctionPoints);

		JMenuItem mntmEnter = new JMenuItem("Enter FP Data");
		mntmEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean repeatflag = false;
				if (project != null) {
					String str1 = JOptionPane.showInputDialog("Enter Name for the functional point");

					for (int i = 0; i < project.getFptab().size(); i++) {
						if (str1.equalsIgnoreCase(project.getFptab().get(i).getTabname())) {
							repeatflag = true;
							break;
						}
					}
					if (repeatflag) {
						JOptionPane.showMessageDialog(null,
								"The name for FP tab must be unique. Please enter unique name.");
						repeatflag = false;
					} else {
						Tab temp = new Tab();
						temp.setTabname(str1);
						project.getFptab().add(temp);
						tabbedPane_1.addTab(project.getFptab().get(project.getFptab().size() - 1).getTabname(),
								project.getFptab().get(project.getFptab().size() - 1));
						if (top != null) {
							DefaultMutableTreeNode temptabname;
							temptabname = new DefaultMutableTreeNode(
									project.getFptab().get(project.getFptab().size() - 1).getTabname());
							top.add(temptabname);
						} else {
							top = new DefaultMutableTreeNode(project.getProjectName());
							DefaultMutableTreeNode temptabname;
							temptabname = new DefaultMutableTreeNode(
									project.getFptab().get(project.getFptab().size() - 1).getTabname());
							top.add(temptabname);
						}
						tree = new JTree(top);
						tree.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseReleased(MouseEvent e) {
								
								if (SwingUtilities.isRightMouseButton(e)) {
									TreePath pathForLocation = tree.getPathForLocation(e.getPoint().x, e.getPoint().y);
									menu.show(e.getComponent(), e.getX(), e.getY());
									if (pathForLocation != null) {
										selectedNode = (DefaultMutableTreeNode) pathForLocation.getLastPathComponent();
									} else {
										selectedNode = null;
									}

								}
							}
						});
						treeView = new JScrollPane(tree);
						splitPane.setLeftComponent(treeView);
						frmCecsMetrics.getContentPane().add(splitPane);
					}

				} else {
					JOptionPane.showMessageDialog(null, "Create or open project");
				}

			}
		});

		mnFunctionPoints.add(mntmEnter);

		JMenu mnSmi = new JMenu("SMI");
		mnMetric.add(mnSmi);

		JMenuItem mntmSmiTab = new JMenuItem("Enter SMI Data");
		mnSmi.add(mntmSmiTab);
		mntmSmiTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (project != null) {
					if (project.getSmiTab() == null) {
						SmiTab temp = new SmiTab();
						project.setSmiTab(temp);
						tabbedPane_1.addTab("SMI", project.getSmiTab());
					} else {
						tabbedPane_1.addTab("SMI", project.getSmiTab());
					}

				} else {
					JOptionPane.showMessageDialog(null, "Create or open project");
				}

			}
		});

		JMenuBar menuBar_1 = new JMenuBar();
		mnSmi.add(menuBar_1);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenu mnNewMenu = new JMenu("Project code");
		menuBar.add(mnNewMenu);

		JMenuItem mntmAddCode = new JMenuItem("Add code");
		mntmAddCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				File[] file = null;

				JFileChooser chooser = new JFileChooser("C:\\Users\\Sourabh Powar\\Desktop\\JavaInputProject");
				FileFilter ff = new FileFilter() {

					public String getDescription() {
						return "java extension File)";
					}

					public boolean accept(File f) {
						if (f.isDirectory()) {
							return true;
						} else {
							String filename = f.getName().toLowerCase();
							return filename.endsWith(".java");
						}
					}
				};
				chooser.setFileFilter(ff);
				chooser.setMultiSelectionEnabled(true);
				int returnVal = chooser.showOpenDialog(frmCecsMetrics);
				if (returnVal == JFileChooser.APPROVE_OPTION) {

					file = chooser.getSelectedFiles();

				}
				for (int i = 0; i < file.length; i++) {
					project.getFileTab().add(new ProjectFile(file[i]));
				}
				if (top != null) {
					DefaultMutableTreeNode temp;
					for (int i = 0; i < file.length; i++) {
						temp = new DefaultMutableTreeNode(file[i].getName());// project.getFileTab().get(i).getTabname());
						top.add(temp);
					}
				} else {
					top = new DefaultMutableTreeNode(project.getProjectName());
					DefaultMutableTreeNode temp;
					for (int i = 0; i < file.length; i++) {
						temp = new DefaultMutableTreeNode(file[i].getName());
						top.add(temp);
					}
				}
				tree = new JTree(top);
				tree.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent e) {
						
						if (SwingUtilities.isRightMouseButton(e)) {
							TreePath pathForLocation = tree.getPathForLocation(e.getPoint().x, e.getPoint().y);
							menu.show(e.getComponent(), e.getX(), e.getY());
							if (pathForLocation != null) {
								selectedNode = (DefaultMutableTreeNode) pathForLocation.getLastPathComponent();
							} else {
								selectedNode = null;
							}

						}
					}
				});
				treeView = new JScrollPane(tree);
				splitPane.setLeftComponent(treeView);
				frmCecsMetrics.getContentPane().add(splitPane);

			}
		});
		mnNewMenu.add(mntmAddCode);

		JMenuItem mntmNewMenuItem = new JMenuItem("Project code Statistic");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 0; i < project.getFileTab().size(); i++) {
					tabbedPane_1.addTab(project.getFileTab().get(i).getTabname(), project.getFileTab().get(i));
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
	}

	private ActionListener getAddActionListener() {
		return new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (selectedNode != null) {
					System.out.println("pressed" + selectedNode);
					DefaultMutableTreeNode n = new DefaultMutableTreeNode("added");
					selectedNode.add(n);
					tree.repaint();
					tree.updateUI();
				}
			}
		};
	}

	private ActionListener getEditActionListener() {
		return new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (selectedNode != null) {
					// edit here
					System.out.println("pressed" + selectedNode);
				}
			}
		};
	}

}
