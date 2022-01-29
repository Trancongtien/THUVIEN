package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;


import model.Muon;

public class MuonDAOImpl implements MuonDAO {

	@Override
	public List<Muon> getList() {
		Connection conn = (Connection) SQLConnect.getConnection();
		String sql = "Select * from Muon";
		List<Muon> list = new Vector<Muon>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
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

	@Override
	public int Insert(Muon m) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Insert into Muon values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, m.getMathe());
			ps.setString(2, m.getMathuthu());
			ps.setString(3, m.getMasach());
			ps.setDate(4, (java.sql.Date) m.getNgaymuon());
			ps.setInt(5, m.getSosachmuon());
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int Update(Muon m) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "update Muon set MaThe=?,MaThuTHu=?"
					+ ",MaSach=?,NgayMuon=?,SoSachMuon=? where NgayMuon=? and MaThe=? and MaSach=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, m.getMathe());
			ps.setString(2, m.getMathuthu());
			ps.setString(3, m.getMasach());
			ps.setDate(4,  (java.sql.Date) m.getNgaymuon());
			ps.setInt(5, m.getSosachmuon());
			ps.setDate(6, (java.sql.Date) m.getNgaymuon());
			ps.setString(7, m.getMathe());
			ps.setString(8, m.getMasach());
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
