package csulb.se;

import java.io.Serializable;
import java.util.ArrayList;

public class ProjectInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private ArrayList<Tab> fptab;
	private ArrayList<FunctionPointSaveData> functionpoint;
	private ArrayList<SaveProjectFlie> projectFiles;
	//private SmiTab smiTab;
	private String projectName;
	private String productName;
	private String creatorName;
	private String comments;
	public ProjectInfo(NewProject project) {
		functionpoint=new ArrayList<FunctionPointSaveData>();
		projectFiles=new ArrayList<SaveProjectFlie>();
		for(int i=0;i<project.getFptab().size();i++) {
		FunctionPointSaveData temp=new FunctionPointSaveData(project.getFptab().get(i));
		this.functionpoint.add(temp);
		}
		for(int i=0;i<project.getFileTab().size();i++) {
			SaveProjectFlie temp=new SaveProjectFlie(project.getFileTab().get(i));
			this.projectFiles.add(temp);
			}
		this.projectName = project.getProjectName();
		this.productName = project.getProductName();
		this.creatorName = project.getCreatorName();
		this.comments = project.getComments();
		//this.smiTab = smiTab;
		
	}
	
	
	public ArrayList<SaveProjectFlie> getProjectFiles() {
		return projectFiles;
	}


	public void setProjectFiles(ArrayList<SaveProjectFlie> projectFiles) {
		this.projectFiles = projectFiles;
	}


	public ArrayList<FunctionPointSaveData> getFunctionpoint() {
		return functionpoint;
	}
	public void setFunctionpoint(ArrayList<FunctionPointSaveData> functionpoint) {
		this.functionpoint = functionpoint;
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
	

	
}
