package dao;
import java.util.List;

import model.ThuThu;
public interface ThuThuDAO {
public List<model.ThuThu> getList();
public int Update(ThuThu tt);
public int Insert(ThuThu tt);
}
