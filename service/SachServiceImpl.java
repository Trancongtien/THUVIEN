package service;

import java.util.List;

import dao.*;
import model.Sach;

public class SachServiceImpl implements SachService {
private SachDao sachDao=null;
	@Override
	public List<Sach> getList() {
		return sachDao.getList();
	}
	public SachServiceImpl() {
		this.sachDao= new SachDaoImpl();
	}
	@Override
	public int createOrUpdate(Sach s) {
		// TODO Auto-generated method stub
		return sachDao.createOrUpdate(s);
	}

}
