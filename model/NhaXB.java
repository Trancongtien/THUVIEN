package model;

public class NhaXB {
private  String maxb;
private String tenxb;
private String diachi;
private String email;
public NhaXB() {
	
}
public NhaXB(String maxb, String tenxb, String diachi, String email) {
	super();
	this.maxb = maxb;
	this.tenxb = tenxb;
	this.diachi = diachi;
	this.email = email;
}
public String getMaxb() {
	return maxb;
}
public void setMaxb(String maxb) {
	this.maxb = maxb;
}
public String getTenxb() {
	return tenxb;
}
public void setTenxb(String tenxb) {
	this.tenxb = tenxb;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
