package dao;
import model.*;
import java.util.List;

public interface SachDao {
 public List<Sach> getList();
public int createOrUpdate(Sach s);

}


