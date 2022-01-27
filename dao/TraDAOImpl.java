package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Tra;

public class TraDAOImpl implements TraDAO {

	@Override
	public List<Tra> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select *From Tra";
		List<Tra> list= new ArrayList<>();
		try {
			PreparedStatement ps =(PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Tra t= new Tra();
				t.setNgaytra(rs.getDate("NgayTra"));
				t.setSosachtra(rs.getInt("SoSachTra"));
				t.setSosachtra(rs.getInt("SoSachChuaTra"));
				t.setMathe(rs.getString("MaThe"));				
				t.setMathuthu(rs.getString("MaThuThu"));
				t.setMasach(rs.getString("MaSach"));
				list.add(t);
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
