package model;

import java.util.Calendar;

public class TheThuVien {
private String mathe;
private Calendar ngaybatdau;
private Calendar ngaykethuc;
private String ghichu;
private String madocgia;
public TheThuVien(String mathe, Calendar ngaybatdau, Calendar ngaykethuc, String ghichu, String madocgia) {
	super();
	this.mathe = mathe;
	this.ngaybatdau = ngaybatdau;
	this.ngaykethuc = ngaykethuc;
	this.ghichu = ghichu;
	this.madocgia = madocgia;
}
public String getMathe() {
	return mathe;
}
public void setMathe(String mathe) {
	this.mathe = mathe;
}
public Calendar getNgaybatdau() {
	return ngaybatdau;
}
public void setNgaybatdau(Calendar ngaybatdau) {
	this.ngaybatdau = ngaybatdau;
}
public Calendar getNgaykethuc() {
	return ngaykethuc;
}
public void setNgaykethuc(Calendar ngaykethuc) {
	this.ngaykethuc = ngaykethuc;
}
public String getGhichu() {
	return ghichu;
}
public void setGhichu(String ghichu) {
	this.ghichu = ghichu;
}
public String getMadocgia() {
	return madocgia;
}
public void setMadocgia(String madocgia) {
	this.madocgia = madocgia;
}

}
