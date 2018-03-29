package csulb.se;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.JTextPane;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import antlr.debug.InputBufferEvent;
import metricssuite.JavaJavaLexer;
import metricssuite.JavaJavaParser;
import metricssuite.JavaMetrics;

public class ProjectFile extends JTextPane{
	private String Tabname;
	private String output;
	private File file;
	public ProjectFile() {
	}

	public ProjectFile(File file) {
		// TODO Auto-generated constructor stub
		this.Tabname=file.getName();
		this.file=file;
        JavaJavaLexer lexer;
		try {
			lexer = new JavaJavaLexer(new ANTLRInputStream(new FileInputStream(file)));
			JavaJavaParser parser = new JavaJavaParser(new CommonTokenStream(lexer));
			parser.compilationUnit();
			
			int operator=JavaMetrics.uniqueSpecial.size()+JavaMetrics.uniqueKeywords.size();
			int operand=JavaMetrics.uniqueConstants.size()+JavaMetrics.uniqueIdentifiers.size();
			int totalOperator=parser.specialcount+parser.keywordCount;
			int totalOperand=lexer.constantcount+parser.identcount;
			//double programLength=(operator*(Math.log(operator) / Math.log(2)))+(operand*(Math.log(operand) / Math.log(2)));
			int vocabulry=operand+operator;
			int programLength=totalOperand+totalOperator;
			double volume=programLength*Math.log(vocabulry)*1.0 / Math.log(2)*1.0;
			double difficulty=(operator*totalOperand)/(2*operand);
			double efforts=difficulty*volume;
			double time=efforts*1.0/18.0f;
			double bugs=time*1.0/3000.0f;
			
			output="File name\t"+file.getName();
			output+="\nFile length in bytes: "+file.length();
			output+="\nFile white spaces: "+lexer.ws;
			output+="\nFile comment spaces in bytes: "+lexer.commentcount;
			output+="\nComment percentages of file: "+String.format("%.2f",(lexer.commentcount*1.0f/file.length())*100f)+"%";
			output+="\nHalstead metrics:";
			output+="\n\tUnique operators: "+operator;
			output+="\n\tUnique operands: "+operand;			
			output+="\n\tTotal operators: "+totalOperator;
			output+="\n\tTotal operands: "+totalOperand;
			output+="\n\tProgram length (N) = "+programLength;
			output+="\n\tProgram vocabulry (n) = "+vocabulry;
			output+="\n\tVolume = "+String.format("%.1f", volume);
			output+="\n\tDiffculty = "+String.format("%.1f", difficulty);
			output+="\n\tEfforts = "+String.format("%.1f", efforts);
			output+="\tTime = "+String.format("%.3f", time)+" ( "+String.format("%.3f", time/60.0f)+" minutes or "+String.format("%.3f", time/360.0f)+" hours "+String.format("%.3f", time/504000.0f)+" person months"+")";
			output+="\n\tBugs expected = "+String.format("%.3f",bugs);
			
			output+="\n\n\nMcCabe's Cyclomatic Complexity";
			Iterator<String> itr =JavaMetrics.mccabeValues.iterator();
			while(itr.hasNext())
			{
				output+="\n\t"+itr.next();
			}
			this.setText(output);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        
	
	}

	public ProjectFile(SaveProjectFlie saveProjectFlie) {
		// TODO Auto-generated constructor stub
		this(new File(saveProjectFlie.getFilepath()));
		
		
	}

	public String getTabname() {
		return Tabname;
	}

	public void setTabname(String tabname) {
		this.Tabname = tabname;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
}
