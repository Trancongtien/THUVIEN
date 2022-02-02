package dao;

import java.sql.*;
import java.sql.Date;
import java.util.*;
import model.Tra;

public class TraDAOImpl implements TraDAO {

	@Override
	public List<Tra> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select *From Tra";
		List<Tra> list= new Vector<Tra>();
		try {
			PreparedStatement ps =(PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Tra t= new Tra();
				t.setNgaytra(rs.getDate("NgayTra"));
				t.setSosachtra(rs.getInt("SoSachTra"));
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

	@Override
	public int Update(Tra t) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Update Tra set mathe=?,MaThuTHu=?,MaSach=?,Ngaytra=?,SOSACHTRA=? where MaThe=? and MaSach=? and MaThuThu=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getMathe());
			ps.setString(2, t.getMathuthu());
			ps.setString(3, t.getMasach());
			ps.setDate(4,(Date) t.getNgaytra());
			ps.setInt(5, t.getSosachtra());
			ps.setString(6, t.getMathe());
			ps.setString(7, t.getMasach());
			ps.setString(8, t.getMathuthu());
			ps.executeUpdate();
			ps.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int Insert(Tra t) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Insert into Tra values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getMathe());
			ps.setString(2, t.getMathuthu());
			ps.setString(3, t.getMasach());
			ps.setDate(4,(Date) t.getNgaytra());
			ps.setInt(5, t.getSosachtra());
			ps.executeUpdate();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

}
