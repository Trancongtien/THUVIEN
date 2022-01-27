package service;

import java.util.List;

import dao.*;
import model.Muon;

public class MuonServiceImpl implements MuonService {
private MuonDAO muonDao=null;
	@Override
	public List<Muon> getList() {
		return muonDao.getList();
	}

	public MuonServiceImpl() {
		this.muonDao = new MuonDAOImpl();
	}
	

}
