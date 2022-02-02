package model;

import java.io.Serializable;
import java.sql.Date;

public class Tra implements Serializable {
	private static final long serialVersionUID = 1L;

	private String mathe;
	private String mathuthu;
	private String masach;
	private Date ngaytra;
	private int sosachtra;
	public Tra() {

	}
	public Tra(String mathe, String mathuthu, String masach, Date ngaytra, int sosachtra) {
		this.mathe = mathe;
		this.mathuthu = mathuthu;
		this.masach = masach;
		this.ngaytra = ngaytra;
		this.sosachtra = sosachtra;
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
	public Date getNgaytra() {
		return ngaytra;
	}
	public void setNgaytra(Date ngaytra) {
		this.ngaytra = ngaytra;
	}
	public int getSosachtra() {
		return sosachtra;
	}
	public void setSosachtra(int sosachtra) {
		this.sosachtra = sosachtra;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}