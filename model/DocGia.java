package model;

import java.util.Calendar;

public class DocGia {
	private String MaDocGia;
	private String hodem, ten;
	private Calendar ngaysinh;
	private boolean gioitinh;
	private int sdt;
	private String diachi;
	private String maloaidocgia;

	public DocGia() {

	}

	public DocGia(String maDocGia, String hodem, String ten, Calendar ngaysinh, boolean gioitinh, int sdt,
			String diachi, String maloaidocgia) {
		super();
		MaDocGia = maDocGia;
		this.hodem = hodem;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.sdt = sdt;
		this.diachi = diachi;
		this.maloaidocgia = maloaidocgia;
	}

	public String getMaDocGia() {
		return MaDocGia;
	}

	public void setMaDocGia(String maDocGia) {
		MaDocGia = maDocGia;
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

	public Calendar getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Calendar ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getMaloaidocgia() {
		return maloaidocgia;
	}

	public void setMaloaidocgia(String maloaidocgia) {
		this.maloaidocgia = maloaidocgia;
	}

}
