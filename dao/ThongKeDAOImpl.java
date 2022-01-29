package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

import model.Muon;
import model.Sach;
import model.Tra;

public class ThongKeDAOImpl implements ThongKeDAO {

	@Override
	public List<Muon> getListByMuon() {
		Connection conn =SQLConnect.getConnection();
		String sql="select";
		List<Muon>list=new Vector<Muon>();
		try {
			PreparedStatement ps =(PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				Muon m = new Muon();
				
				list.add(m);
			}
			ps.close();
			conn.close();
			
		} catch (Exception e) {
e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Tra> getListByTra() {
		Connection conn= SQLConnect.getConnection();
		String sql="";
		List<Tra>list= new Vector<Tra>();
		try {
			PreparedStatement ps =(PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				Tra t= new Tra();
				
				
				
				list.add(t);
			}
			ps.close();
			conn.close();
		} catch (Exception e) {

		e.printStackTrace();}
		return null;
	}

	@Override
	public List<Sach> getListBySach() {
		Connection conn =SQLConnect.getConnection();
		String sql="";
		List<Sach>list= new Vector<Sach>();
		try {
			PreparedStatement ps =(PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				Sach s = new Sach();
				
				
				
				list.add(s);
				
			}
			ps.close();
			conn.close();
		} catch (Exception e) {

		e.printStackTrace();}
		return null;
	}

}
