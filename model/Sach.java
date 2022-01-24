package model;

public class Sach {
	
	private String MASACH;
	private String TENSACH;
	private String TOMTAT;
	private int SOTRANG;
	private double DONGIA;
	private int NAMXUATBAN;
	private String TACGIA,MATHELOAI,MANXB;
public Sach() {
}
public Sach(String mASACH, String tENSACH, String tOMTAT, int sOTRANG, double dONGIA, int nAMXUATBAN, String tACGIA,
		String mATHELOAI, String mANXB) {
	super();
	MASACH = mASACH;
	TENSACH = tENSACH;
	TOMTAT = tOMTAT;
	SOTRANG = sOTRANG;
	DONGIA = dONGIA;
	NAMXUATBAN = nAMXUATBAN;
	TACGIA = tACGIA;
	MATHELOAI = mATHELOAI;
	MANXB = mANXB;
}
public String getMASACH() {
	return MASACH;
}
public void setMASACH(String mASACH) {
	MASACH = mASACH;
}
public String getTENSACH() {
	return TENSACH;
}
public void setTENSACH(String tENSACH) {
	TENSACH = tENSACH;
}
public String getTOMTAT() {
	return TOMTAT;
}
public void setTOMTAT(String tOMTAT) {
	TOMTAT = tOMTAT;
}
public int getSOTRANG() {
	return SOTRANG;
}
public void setSOTRANG(int sOTRANG) {
	SOTRANG = sOTRANG;
}
public double getDONGIA() {
	return DONGIA;
}
public void setDONGIA(double dONGIA) {
	DONGIA = dONGIA;
}
public int getNAMXUATBAN() {
	return NAMXUATBAN;
}
public void setNAMXUATBAN(int nAMXUATBAN) {
	NAMXUATBAN = nAMXUATBAN;
}
public String getTACGIA() {
	return TACGIA;
}
public void setTACGIA(String tACGIA) {
	TACGIA = tACGIA;
}
public String getMATHELOAI() {
	return MATHELOAI;
}
public void setMATHELOAI(String mATHELOAI) {
	MATHELOAI = mATHELOAI;
}
public String getMANXB() {
	return MANXB;
}
public void setMANXB(String mANXB) {
	MANXB = mANXB;
}

}