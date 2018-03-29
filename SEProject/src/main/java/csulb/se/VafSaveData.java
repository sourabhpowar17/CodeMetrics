package csulb.se;

import java.io.Serializable;

import javax.swing.JComboBox;

public class VafSaveData implements Serializable {

	private  String comboBox1 = "0";
	private  String comboBox2 = "0";
	private  String comboBox3 = "0";
	private  String comboBox4 = "0";
	private  String comboBox5 = "0";
	private  String comboBox6 = "0";
	private  String comboBox7 = "0";
	private  String comboBox8 = "0";
	private  String comboBox9 = "0";
	private  String comboBox10 = "0";
	private  String comboBox11 = "0";
	private  String comboBox12 = "0";
	private  String comboBox13 = "0";
	private  String comboBox14 = "0";
	
	
	public VafSaveData(ValueAdjustment vAf) {
		this.comboBox1 = vAf.getComboBox1().getSelectedItem().toString();
		this.comboBox2 = vAf.getComboBox2().getSelectedItem().toString();
		this.comboBox3 = vAf.getComboBox3().getSelectedItem().toString();
		this.comboBox4 = vAf.getComboBox4().getSelectedItem().toString();
		this.comboBox5 = vAf.getComboBox5().getSelectedItem().toString();
		this.comboBox6 = vAf.getComboBox6().getSelectedItem().toString();
		this.comboBox7 = vAf.getComboBox7().getSelectedItem().toString();
		this.comboBox8 = vAf.getComboBox8().getSelectedItem().toString();
		this.comboBox9 = vAf.getComboBox9().getSelectedItem().toString();
		this.comboBox10 =vAf.getComboBox10().getSelectedItem().toString();
		this.comboBox11 =vAf.getComboBox11().getSelectedItem().toString();
		this.comboBox12 =vAf.getComboBox12().getSelectedItem().toString();
		this.comboBox13 =vAf.getComboBox13().getSelectedItem().toString();
		this.comboBox14 =vAf.getComboBox14().getSelectedItem().toString();
	}
	public String getComboBox1() {
		return comboBox1;
	}
	public void setComboBox1(String comboBox1) {
		this.comboBox1 = comboBox1;
	}
	public String getComboBox2() {
		return comboBox2;
	}
	public void setComboBox2(String comboBox2) {
		this.comboBox2 = comboBox2;
	}
	public String getComboBox3() {
		return comboBox3;
	}
	public void setComboBox3(String comboBox3) {
		this.comboBox3 = comboBox3;
	}
	public String getComboBox4() {
		return comboBox4;
	}
	public void setComboBox4(String comboBox4) {
		this.comboBox4 = comboBox4;
	}
	public String getComboBox5() {
		return comboBox5;
	}
	public void setComboBox5(String comboBox5) {
		this.comboBox5 = comboBox5;
	}
	public String getComboBox6() {
		return comboBox6;
	}
	public void setComboBox6(String comboBox6) {
		this.comboBox6 = comboBox6;
	}
	public String getComboBox7() {
		return comboBox7;
	}
	public void setComboBox7(String comboBox7) {
		this.comboBox7 = comboBox7;
	}
	public String getComboBox8() {
		return comboBox8;
	}
	public void setComboBox8(String comboBox8) {
		this.comboBox8 = comboBox8;
	}
	public String getComboBox9() {
		return comboBox9;
	}
	public void setComboBox9(String comboBox9) {
		this.comboBox9 = comboBox9;
	}
	public String getComboBox10() {
		return comboBox10;
	}
	public void setComboBox10(String comboBox10) {
		this.comboBox10 = comboBox10;
	}
	public String getComboBox11() {
		return comboBox11;
	}
	public void setComboBox11(String comboBox11) {
		this.comboBox11 = comboBox11;
	}
	public String getComboBox12() {
		return comboBox12;
	}
	public void setComboBox12(String comboBox12) {
		this.comboBox12 = comboBox12;
	}
	public String getComboBox13() {
		return comboBox13;
	}
	public void setComboBox13(String comboBox13) {
		this.comboBox13 = comboBox13;
	}
	public String getComboBox14() {
		return comboBox14;
	}
	public void setComboBox14(String comboBox14) {
		this.comboBox14 = comboBox14;
	}

}
