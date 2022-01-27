package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.DocGia;

public class DocGiaDAOImpl  implements DocGiaDAO{

	@Override
	public List<DocGia> getList() {
		Connection conn= SQLConnect.getConnection();
		String sql ="Select * from DocGia";
		List<DocGia> list= new ArrayList<>();
		try {
			PreparedStatement ps =(PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				DocGia dg= new DocGia();
				dg.setMaDocGia(rs.getString("MaDocGia"));
				dg.setHodem(rs.getString("Hodem"));
				dg.setTen(rs.getString("Ten"));
				dg.setNgaysinh(rs.getDate("NgaySinh"));
				dg.setDiachi(rs.getString("DiaChi"));
				dg.setSdt(rs.getString("SDT"));
				dg.setMaloaidocgia(rs.getString("Maloaidocgia"));
				dg.setGioitinh(rs.getBoolean("GioiTinh"));
				list.add(dg);
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
