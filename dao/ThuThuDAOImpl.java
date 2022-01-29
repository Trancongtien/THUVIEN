package dao;

import java.sql.*;
import java.util.*;

import model.ThuThu;

public class ThuThuDAOImpl implements ThuThuDAO {

	@Override
	public List<ThuThu> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select *from ThuThu";
		List<ThuThu> list = new Vector<ThuThu>();
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

	@Override
	public int Update(ThuThu tt) {
		try {
		Connection conn = SQLConnect.getConnection();
		String sql="Update ThuTHu set MathuThu=?,HoDem=?,Ten=?,GioiTinh=?,DiaChi=?,MaTK=? where MathuThu=? and MaTK=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, tt.getMathuthu());
		ps.setString(2, tt.getHodem());
		ps.setString(3, tt.getTen());
		ps.setBoolean(4, tt.isGioitinh());
		ps.setString(5, tt.getDiachi());
		ps.setString(6, tt.getMatk());
		ps.setString(7, tt.getMathuthu());
		ps.setString(8, tt.getMatk());
		
		
		ps.executeUpdate();
		ps.close();
		conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int Insert(ThuThu tt) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Insert into Tra values(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tt.getMathuthu());
			ps.setString(2, tt.getHodem());
			ps.setString(3, tt.getTen());
			ps.setBoolean(4, tt.isGioitinh());
			ps.setString(5, tt.getDiachi());
			ps.setString(6, tt.getMatk());
			
			ps.executeUpdate();
			ps.close();
			conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return 0;
	}

}
