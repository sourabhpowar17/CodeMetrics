package csulb.se;

import java.io.Serializable;

public class SaveProjectFlie implements Serializable{
	
	private String filename;
	private String filepath;
	public SaveProjectFlie(ProjectFile projectFile) {
		// TODO Auto-generated constructor stub
		this.filename=projectFile.getFile().getName();
		this.filepath=projectFile.getFile().getAbsolutePath();
		
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
	

}
