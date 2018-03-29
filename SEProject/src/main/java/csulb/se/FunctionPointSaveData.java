package csulb.se;

import java.io.Serializable;

public class FunctionPointSaveData implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String language;
	private int vAF;
	private String Tabname;
	private VafSaveData vafdata;
	private int externalInput;
	private int externalOutput;
	private int externalInquiries;
	private int interLogicalFiles;
	private int externalInterfaceFile;
	private int externalInputTotal;
	private int externalOutputTotal;
	private int externalInquiriesTotal;
	private int interLogicalFilesTotal;
	private int externalInterfaceFileTotal;
	private int externalInputWeight;
	private int externalOutputWeight;
	private int externalInquiriesWeight;
	private int interLogicalFilesWeight;
	private int externalInterfaceFileWeight;
	
	private String textField_0;
	private String textField_1;
	private String textField_2;
	private String textField_3;
	private String textField_4;
	private String textField_5;
	private String textField_6;
	private String textField_7;
	private String textField_8;
	private String textField_9;
	private String textField_10;
	private String textField_11;
	private String textField_12;
	private String textField_13;
	private String textField_14;
	private String radioButton_1;
	private String radioButton_4;
	private String radioButton_7;
	private String radioButton_10;
	private String radioButton_13;
	private String radioButton_2;
	private String radioButton_5;
	private String radioButton_8;
	private String radioButton_11;
	private String radioButton_14;
	private String radioButton_3;
	private String radioButton_6;
	private String radioButton_9;
	private String radioButton_12;
	private String radioButton_15;

	private double FP;
	private int codeSize;
	public FunctionPointSaveData(Tab fpdata) {
		this.language = fpdata.getLanguage().getLanguage();
		this.Tabname=fpdata.getTabname();
		this.vAF = fpdata.getvAF().getvAFtotal();
		this.vafdata=new VafSaveData(fpdata.getvAF());
		this.externalInput = fpdata.getExternalInput();
		this.externalOutput = fpdata.getExternalOutput();
		this.externalInquiries = fpdata.getExternalInquiries();
		this.interLogicalFiles = fpdata.getInterLogicalFiles();
		this.externalInterfaceFile = fpdata.getExternalInterfaceFile();
		this.externalInputTotal = fpdata.getExternalInputTotal();
		this.externalOutputTotal = fpdata.getExternalOutputTotal();
		this.externalInquiriesTotal = fpdata.getExternalInquiriesTotal();
		this.interLogicalFilesTotal = fpdata.getInterLogicalFilesTotal();
		this.externalInterfaceFileTotal = fpdata.getExternalInterfaceFileTotal();
		this.externalInputWeight = fpdata.getExternalInputWeight();
		this.externalOutputWeight = fpdata.getExternalOutputWeight();
		this.externalInquiriesWeight = fpdata.getExternalInquiriesWeight();
		this.interLogicalFilesWeight = fpdata.getInterLogicalFilesWeight();
		this.externalInterfaceFileWeight = fpdata.getExternalInterfaceFileWeight();
		FP = fpdata.getFP();
		this.codeSize = fpdata.getCodeSize();
		
		this.textField_0 =fpdata.getTextField_0().getText();
		this.textField_1 =fpdata.getTextField_1().getText();
		this.textField_2 =fpdata.getTextField_2().getText();
		this.textField_3 =fpdata.getTextField_3().getText();
		this.textField_4 =fpdata.getTextField_4().getText();
		this.textField_5 =fpdata.getTextField_5().getText();
		this.textField_6 =fpdata.getTextField_6().getText();
		this.textField_7 =fpdata.getTextField_7().getText();
		this.textField_8 =fpdata.getTextField_8().getText();
		this.textField_9 =fpdata.getTextField_9().getText();
		this.textField_10=fpdata.getTextField_10().getText();
		this.textField_11=fpdata.getTextField_11().getText();
		this.textField_12=fpdata.getTextField_12().getText();
		this.textField_13=fpdata.getTextField_13().getText();
		this.textField_14=fpdata.getTextField_14().getText();
		if(fpdata.getRadioButton_1().isSelected()) {this.radioButton_1 =fpdata.getRadioButton_1().getText();}else{this.radioButton_1 =" ";}
		if(fpdata.getRadioButton_2().isSelected()) {this.radioButton_2 =fpdata.getRadioButton_1().getText();}else{this.radioButton_2 =" ";}
		if(fpdata.getRadioButton_3().isSelected()) {this.radioButton_3 =fpdata.getRadioButton_1().getText();}else{this.radioButton_3 =" ";}
		if(fpdata.getRadioButton_4().isSelected()) {this.radioButton_4 =fpdata.getRadioButton_1().getText();}else{this.radioButton_4 =" ";}
		if(fpdata.getRadioButton_5().isSelected()) {this.radioButton_5 =fpdata.getRadioButton_1().getText();}else{this.radioButton_5 =" ";}
		if(fpdata.getRadioButton_6().isSelected()) {this.radioButton_6 =fpdata.getRadioButton_1().getText();}else{this.radioButton_6 =" ";}
		if(fpdata.getRadioButton_7().isSelected()) {this.radioButton_7 =fpdata.getRadioButton_1().getText();}else{this.radioButton_7 =" ";}
		if(fpdata.getRadioButton_8().isSelected()) {this.radioButton_8 =fpdata.getRadioButton_1().getText();}else{this.radioButton_8 =" ";}
		if(fpdata.getRadioButton_9().isSelected()) {this.radioButton_9 =fpdata.getRadioButton_1().getText();}else{this.radioButton_9 =" ";}
		if(fpdata.getRadioButton_10().isSelected()) {this.radioButton_10 =fpdata.getRadioButton_1().getText();}else{this.radioButton_10 =" ";}
		if(fpdata.getRadioButton_11().isSelected()) {this.radioButton_11 =fpdata.getRadioButton_1().getText();}else{this.radioButton_11 =" ";}
		if(fpdata.getRadioButton_12().isSelected()) {this.radioButton_12 =fpdata.getRadioButton_1().getText();}else{this.radioButton_12 =" ";}
		if(fpdata.getRadioButton_13().isSelected()) {this.radioButton_13 =fpdata.getRadioButton_1().getText();}else{this.radioButton_13 =" ";}
		if(fpdata.getRadioButton_14().isSelected()) {this.radioButton_14 =fpdata.getRadioButton_1().getText();}else{this.radioButton_14 =" ";}
		if(fpdata.getRadioButton_15().isSelected()) {this.radioButton_15 =fpdata.getRadioButton_1().getText();}else{this.radioButton_15 =" ";}
	}
	
	
	public String getTabname() {
		return Tabname;
	}


	public void setTabname(String tabname) {
		Tabname = tabname;
	}


	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getvAF() {
		return vAF;
	}
	public void setvAF(int vAF) {
		this.vAF = vAF;
	}
	public VafSaveData getVafdata() {
		return vafdata;
	}
	public void setVafdata(VafSaveData vafdata) {
		this.vafdata = vafdata;
	}
	public int getExternalInput() {
		return externalInput;
	}
	public void setExternalInput(int externalInput) {
		this.externalInput = externalInput;
	}
	public int getExternalOutput() {
		return externalOutput;
	}
	public void setExternalOutput(int externalOutput) {
		this.externalOutput = externalOutput;
	}
	public int getExternalInquiries() {
		return externalInquiries;
	}
	public void setExternalInquiries(int externalInquiries) {
		this.externalInquiries = externalInquiries;
	}
	public int getInterLogicalFiles() {
		return interLogicalFiles;
	}
	public void setInterLogicalFiles(int interLogicalFiles) {
		this.interLogicalFiles = interLogicalFiles;
	}
	public int getExternalInterfaceFile() {
		return externalInterfaceFile;
	}
	public void setExternalInterfaceFile(int externalInterfaceFile) {
		this.externalInterfaceFile = externalInterfaceFile;
	}
	public int getExternalInputTotal() {
		return externalInputTotal;
	}
	public void setExternalInputTotal(int externalInputTotal) {
		this.externalInputTotal = externalInputTotal;
	}
	public int getExternalOutputTotal() {
		return externalOutputTotal;
	}
	public void setExternalOutputTotal(int externalOutputTotal) {
		this.externalOutputTotal = externalOutputTotal;
	}
	public int getExternalInquiriesTotal() {
		return externalInquiriesTotal;
	}
	public void setExternalInquiriesTotal(int externalInquiriesTotal) {
		this.externalInquiriesTotal = externalInquiriesTotal;
	}
	public int getInterLogicalFilesTotal() {
		return interLogicalFilesTotal;
	}
	public void setInterLogicalFilesTotal(int interLogicalFilesTotal) {
		this.interLogicalFilesTotal = interLogicalFilesTotal;
	}
	public int getExternalInterfaceFileTotal() {
		return externalInterfaceFileTotal;
	}
	public void setExternalInterfaceFileTotal(int externalInterfaceFileTotal) {
		this.externalInterfaceFileTotal = externalInterfaceFileTotal;
	}
	public int getExternalInputWeight() {
		return externalInputWeight;
	}
	public void setExternalInputWeight(int externalInputWeight) {
		this.externalInputWeight = externalInputWeight;
	}
	public int getExternalOutputWeight() {
		return externalOutputWeight;
	}
	public void setExternalOutputWeight(int externalOutputWeight) {
		this.externalOutputWeight = externalOutputWeight;
	}
	public int getExternalInquiriesWeight() {
		return externalInquiriesWeight;
	}
	public void setExternalInquiriesWeight(int externalInquiriesWeight) {
		this.externalInquiriesWeight = externalInquiriesWeight;
	}
	public int getInterLogicalFilesWeight() {
		return interLogicalFilesWeight;
	}
	public void setInterLogicalFilesWeight(int interLogicalFilesWeight) {
		this.interLogicalFilesWeight = interLogicalFilesWeight;
	}
	public int getExternalInterfaceFileWeight() {
		return externalInterfaceFileWeight;
	}
	public void setExternalInterfaceFileWeight(int externalInterfaceFileWeight) {
		this.externalInterfaceFileWeight = externalInterfaceFileWeight;
	}
	public String getTextField_0() {
		return textField_0;
	}
	public void setTextField_0(String textField_0) {
		this.textField_0 = textField_0;
	}
	public String getTextField_1() {
		return textField_1;
	}
	public void setTextField_1(String textField_1) {
		this.textField_1 = textField_1;
	}
	public String getTextField_2() {
		return textField_2;
	}
	public void setTextField_2(String textField_2) {
		this.textField_2 = textField_2;
	}
	public String getTextField_3() {
		return textField_3;
	}
	public void setTextField_3(String textField_3) {
		this.textField_3 = textField_3;
	}
	public String getTextField_4() {
		return textField_4;
	}
	public void setTextField_4(String textField_4) {
		this.textField_4 = textField_4;
	}
	public String getTextField_5() {
		return textField_5;
	}
	public void setTextField_5(String textField_5) {
		this.textField_5 = textField_5;
	}
	public String getTextField_6() {
		return textField_6;
	}
	public void setTextField_6(String textField_6) {
		this.textField_6 = textField_6;
	}
	public String getTextField_7() {
		return textField_7;
	}
	public void setTextField_7(String textField_7) {
		this.textField_7 = textField_7;
	}
	public String getTextField_8() {
		return textField_8;
	}
	public void setTextField_8(String textField_8) {
		this.textField_8 = textField_8;
	}
	public String getTextField_9() {
		return textField_9;
	}
	public void setTextField_9(String textField_9) {
		this.textField_9 = textField_9;
	}
	public String getTextField_10() {
		return textField_10;
	}
	public void setTextField_10(String textField_10) {
		this.textField_10 = textField_10;
	}
	public String getTextField_11() {
		return textField_11;
	}
	public void setTextField_11(String textField_11) {
		this.textField_11 = textField_11;
	}
	public String getTextField_12() {
		return textField_12;
	}
	public void setTextField_12(String textField_12) {
		this.textField_12 = textField_12;
	}
	public String getTextField_13() {
		return textField_13;
	}
	public void setTextField_13(String textField_13) {
		this.textField_13 = textField_13;
	}
	public String getTextField_14() {
		return textField_14;
	}
	public void setTextField_14(String textField_14) {
		this.textField_14 = textField_14;
	}
	public String getRadioButton_1() {
		return radioButton_1;
	}
	public void setRadioButton_1(String radioButton_1) {
		this.radioButton_1 = radioButton_1;
	}
	public String getRadioButton_4() {
		return radioButton_4;
	}
	public void setRadioButton_4(String radioButton_4) {
		this.radioButton_4 = radioButton_4;
	}
	public String getRadioButton_7() {
		return radioButton_7;
	}
	public void setRadioButton_7(String radioButton_7) {
		this.radioButton_7 = radioButton_7;
	}
	public String getRadioButton_10() {
		return radioButton_10;
	}
	public void setRadioButton_10(String radioButton_10) {
		this.radioButton_10 = radioButton_10;
	}
	public String getRadioButton_13() {
		return radioButton_13;
	}
	public void setRadioButton_13(String radioButton_13) {
		this.radioButton_13 = radioButton_13;
	}
	public String getRadioButton_2() {
		return radioButton_2;
	}
	public void setRadioButton_2(String radioButton_2) {
		this.radioButton_2 = radioButton_2;
	}
	public String getRadioButton_5() {
		return radioButton_5;
	}
	public void setRadioButton_5(String radioButton_5) {
		this.radioButton_5 = radioButton_5;
	}
	public String getRadioButton_8() {
		return radioButton_8;
	}
	public void setRadioButton_8(String radioButton_8) {
		this.radioButton_8 = radioButton_8;
	}
	public String getRadioButton_11() {
		return radioButton_11;
	}
	public void setRadioButton_11(String radioButton_11) {
		this.radioButton_11 = radioButton_11;
	}
	public String getRadioButton_14() {
		return radioButton_14;
	}
	public void setRadioButton_14(String radioButton_14) {
		this.radioButton_14 = radioButton_14;
	}
	public String getRadioButton_3() {
		return radioButton_3;
	}
	public void setRadioButton_3(String radioButton_3) {
		this.radioButton_3 = radioButton_3;
	}
	public String getRadioButton_6() {
		return radioButton_6;
	}
	public void setRadioButton_6(String radioButton_6) {
		this.radioButton_6 = radioButton_6;
	}
	public String getRadioButton_9() {
		return radioButton_9;
	}
	public void setRadioButton_9(String radioButton_9) {
		this.radioButton_9 = radioButton_9;
	}
	public String getRadioButton_12() {
		return radioButton_12;
	}
	public void setRadioButton_12(String radioButton_12) {
		this.radioButton_12 = radioButton_12;
	}
	public String getRadioButton_15() {
		return radioButton_15;
	}
	public void setRadioButton_15(String radioButton_15) {
		this.radioButton_15 = radioButton_15;
	}
	public double getFP() {
		return FP;
	}
	public void setFP(double fP) {
		FP = fP;
	}
	public int getCodeSize() {
		return codeSize;
	}
	public void setCodeSize(int codeSize) {
		this.codeSize = codeSize;
	}
	
	
}
