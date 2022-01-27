package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.ThuThu;

public class ThuThuDAOImpl implements ThuThuDAO {

	@Override
	public List<ThuThu> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select *from ThuThu";
		List<ThuThu> list = new ArrayList<ThuThu>();
		try {
			PreparedStatement ps= (PreparedStatement)conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			ThuThu tt= new ThuThu();
			tt.setMathuthu(rs.getString("MaThuThu"));
			tt.setHodem(rs.getString("HoDem"));
			tt.setTen(rs.getString("Ten"));
			tt.setGioitinh(rs.getBoolean("GioiTinh"));
			tt.setDiachi(rs.getString("DiaChi"));
			tt.setMatk(rs.getString("MaTK"));
			list.add(tt);
		}
		ps.close();
		conn.close();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
