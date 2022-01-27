package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class TheThuVienDAOImpl implements TheThuVienDAO {

	@Override
	public List<TheThuVien> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select *from TheThuVien";
		List<TheThuVien> list = new ArrayList<>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				TheThuVien ttt = new TheThuVien();
				ttt.setMathe(rs.getString("MaThe"));
				ttt.setNgaybatdau(rs.getDate("NgayBatDau"));
				ttt.setNgaykethuc(rs.getDate("NgayKetThuc"));
				ttt.setGhichu(rs.getString("GhiChu"));
				ttt.setMadocgia(rs.getString("MaDocGia"));
				list.add(ttt);
			}
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
return list;
		
	}

}
