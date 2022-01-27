package service;

import java.util.List;

import dao.ThuThuDAO;
import dao.ThuThuDAOImpl;
import model.ThuThu;

public class ThuThuServiceImpl implements ThuThuService {
	private ThuThuDAO thuThuDao = null;

	@Override
	public List<ThuThu> getList() {
		return thuThuDao.getList();
	}
	public ThuThuServiceImpl() {
		this.thuThuDao = new ThuThuDAOImpl();
	}

}
