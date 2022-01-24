package model;

public class ThuThu {
private String mathuthu;
private String hodem;
private String ten;
private String diachi;
private boolean gioitinh;
private String matk;
public ThuThu() {
	
}
public ThuThu(String mathuthu, String hodem, String ten, String diachi, boolean gioitinh, String matk) {
	super();
	this.mathuthu = mathuthu;
	this.hodem = hodem;
	this.ten = ten;
	this.diachi = diachi;
	this.gioitinh = gioitinh;
	this.matk = matk;
}
public String getMathuthu() {
	return mathuthu;
}
public void setMathuthu(String mathuthu) {
	this.mathuthu = mathuthu;
}
public String getHodem() {
	return hodem;
}
public void setHodem(String hodem) {
	this.hodem = hodem;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public boolean isGioitinh() {
	return gioitinh;
}
public void setGioitinh(boolean gioitinh) {
	this.gioitinh = gioitinh;
}
public String getMatk() {
	return matk;
}
public void setMatk(String matk) {
	this.matk = matk;
}


}
