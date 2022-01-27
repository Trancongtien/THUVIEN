package dao;

import java.sql.*;
import model.*;
import java.util.*;

public class SachDaoImpl implements SachDao {

	@Override
	public List<Sach> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select *From Sach";
		List<Sach> list = new Vector<>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Sach s = new Sach();
				s.setMASACH(rs.getString("MaSach"));
				s.setTENSACH(rs.getString("TENSACH"));
				s.setTOMTAT(rs.getString("TOMTAT"));
				s.setSOTRANG(rs.getInt("SOTRANG"));
				s.setDONGIA(rs.getInt("DONGIA"));
				s.setNAMXUATBAN(rs.getInt("NAMXUATBAN"));
				s.setTACGIA(rs.getString("TACGIA"));
				s.setTHELOAI(rs.getString("THELOAI"));
				s.setNHAXUATBAN(rs.getString("NHAXUATBAN"));
				list.add(s);
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int createOrUpdate(Sach s) {
		try {
			Connection cons = SQLConnect.getConnection();
			String sql = "INsert into Sach values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, s.getMASACH());
			ps.setString(2, s.getTENSACH());
			ps.setString(3, s.getTOMTAT());
			ps.setInt(4, s.getSOTRANG());
			ps.setDouble(5, s.getDONGIA());
			ps.setInt(6, s.getNAMXUATBAN());
			ps.setString(7, s.getTACGIA());
			ps.setString(8, s.getTHELOAI());
			ps.setString(9, s.getNHAXUATBAN());
			ps.execute();
			ResultSet rs = ps.getGeneratedKeys();
			int generatedKey = 0;
			if (rs.next()) {
				generatedKey = rs.getInt(1);
			}
			ps.close();
			cons.close();
			return generatedKey;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
