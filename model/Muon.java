package model;

public class Muon {
private String maphieumuon;
private String ngaymuon;
private int sosachmuon;
private String sachhiendat;
private String mathe;
private String mathuthu;
private String masach;
public Muon() {
	
}
public Muon(String maphieumuon, String ngaymuon, int sosachmuon, String sachhiendat, String mathe, String mathuthu,
		String masach) {
	super();
	this.maphieumuon = maphieumuon;
	this.ngaymuon = ngaymuon;
	this.sosachmuon = sosachmuon;
	this.sachhiendat = sachhiendat;
	this.mathe = mathe;
	this.mathuthu = mathuthu;
	this.masach = masach;
}
public String getMaphieumuon() {
	return maphieumuon;
}
public void setMaphieumuon(String maphieumuon) {
	this.maphieumuon = maphieumuon;
}
public String getNgaymuon() {
	return ngaymuon;
}
public void setNgaymuon(String ngaymuon) {
	this.ngaymuon = ngaymuon;
}
public int getSosachmuon() {
	return sosachmuon;
}
public void setSosachmuon(int sosachmuon) {
	this.sosachmuon = sosachmuon;
}
public String getSachhiendat() {
	return sachhiendat;
}
public void setSachhiendat(String sachhiendat) {
	this.sachhiendat = sachhiendat;
}
public String getMathe() {
	return mathe;
}
public void setMathe(String mathe) {
	this.mathe = mathe;
}
public String getMathuthu() {
	return mathuthu;
}
public void setMathuthu(String mathuthu) {
	this.mathuthu = mathuthu;
}
public String getMasach() {
	return masach;
}
public void setMasach(String masach) {
	this.masach = masach;
}

}
