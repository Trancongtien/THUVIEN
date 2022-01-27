package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Muon;

public class MuonDAOImpl  implements MuonDAO{

	@Override
	public List<Muon> getList() {
		Connection conn =SQLConnect.getConnection();
		String sql = "Select * from Muon";
		List<Muon> list= new ArrayList<>();
		try {
			PreparedStatement ps = (PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Muon m = new Muon();
				m.setNgaymuon(rs.getDate("NgayMuon"));
				m.setSosachmuon(rs.getInt("SoSachMuon"));
				m.setMathuthu(rs.getString("MaThuThu"));
				m.setMathe(rs.getString("MaThe"));
				m.setMasach(rs.getString("MaSach"));
			list.add(m);
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
