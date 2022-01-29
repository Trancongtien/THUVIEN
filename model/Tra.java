package model;

import java.io.Serializable;
import java.sql.*;

public class Tra implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date ngaytra;
	private int sosachtra;
	private int sosachchuatra;
	private String mathe;
	private String mathuthu;
	private String masach;

	public Tra() {

	}

	public Tra(Date ngaytra, int sosachtra, int sosachchuatra, String mathe, String mathuthu, String masach) {
		super();
		this.ngaytra = ngaytra;
		this.sosachtra = sosachtra;
		this.sosachchuatra = sosachchuatra;
		this.mathe = mathe;
		this.mathuthu = mathuthu;
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

	public int getSosachchuatra() {
		return sosachchuatra;
	}

	public void setSosachchuatra(int sosachchuatra) {
		this.sosachchuatra = sosachchuatra;
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