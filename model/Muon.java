package model;

import java.io.Serializable;
import java.sql.Date;

public class Muon implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date ngaymuon;
	private int sosachmuon;
	private String mathe;
	private String mathuthu;
	private String masach;

	public Muon() {

	}

	public Muon(Date ngaymuon, int sosachmuon, String mathe, String mathuthu, String masach) {
		this.ngaymuon = ngaymuon;
		this.sosachmuon = sosachmuon;
		this.mathe = mathe;
		this.mathuthu = mathuthu;
		this.masach = masach;
	}

	public Date getNgaymuon() {
		return ngaymuon;
	}

	public void setNgaymuon(Date ngaymuon) {
		this.ngaymuon = ngaymuon;
	}

	public int getSosachmuon() {
		return sosachmuon;
	}

	public void setSosachmuon(int sosachmuon) {
		this.sosachmuon = sosachmuon;
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
