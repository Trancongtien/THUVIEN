package model;

import java.util.Calendar;

public class Tra {
private String maphieutra;
private Calendar ngaytra;
private int sosachtra;
private int sosachchuatra;
private String maphieumuon;
private String mathe;
private String mathuthu;
private String masach;
public Tra() {
	
}
public Tra(String maphieutra, Calendar ngaytra, int sosachtra, int sosachchuatra, String maphieumuon, String mathe,
		String mathuthu, String masach) {
	super();
	this.maphieutra = maphieutra;
	this.ngaytra = ngaytra;
	this.sosachtra = sosachtra;
	this.sosachchuatra = sosachchuatra;
	this.maphieumuon = maphieumuon;
	this.mathe = mathe;
	this.mathuthu = mathuthu;
	this.masach = masach;
}
public String getMaphieutra() {
	return maphieutra;
}
public void setMaphieutra(String maphieutra) {
	this.maphieutra = maphieutra;
}
public Calendar getNgaytra() {
	return ngaytra;
}
public void setNgaytra(Calendar ngaytra) {
	this.ngaytra = ngaytra;
}
public int getSosachtra() {
	return sosachtra;
}
public void setSosachtra(int sosachtra) {
	this.sosachtra = sosachtra;
}
public int getSosachchuatra() {
	return sosachchuatra;
}
public void setSosachchuatra(int sosachchuatra) {
	this.sosachchuatra = sosachchuatra;
}
public String getMaphieumuon() {
	return maphieumuon;
}
public void setMaphieumuon(String maphieumuon) {
	this.maphieumuon = maphieumuon;
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
