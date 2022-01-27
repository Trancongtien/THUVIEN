package service;

import java.util.List;

import dao.*;
import model.Sach;

public class SachServiceImpl implements SachService {
private SachDao sachDao=null;
public SachServiceImpl() {
	this.sachDao= new SachDaoImpl();
}
	@Override
	public List<Sach> getList() {
		return sachDao.getList();
	}
	@Override
	public int createOrUpdate(Sach s) {
		return sachDao.createOrUpdate(s);
	}
	
	

}
