package service;

import java.util.List;
import dao.*;
import model.*;

public class TheServiceImpl  implements TheService{
private TheThuVienDAO theThuVienDao=null;
	@Override
	public List<TheThuVien> getList() {
		return theThuVienDao.getList();
	}
	public TheServiceImpl() {
		this.theThuVienDao = new TheThuVienDAOImpl();
	}

}
