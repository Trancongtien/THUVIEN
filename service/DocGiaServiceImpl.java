package service;

import java.util.List;

import dao.DocGiaDAO;
import dao.DocGiaDAOImpl;
import model.DocGia;

public class DocGiaServiceImpl  implements DocGiaService{
private DocGiaDAO docGiaDao=null;
	@Override
	public List<DocGia> getList() {
		return docGiaDao.getList();
	}
	public DocGiaServiceImpl() {
		this.docGiaDao = new DocGiaDAOImpl();
	}

}
