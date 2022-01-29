package dao;
import model.*;
import java.util.List;
public interface MuonDAO {
public List<Muon> getList();
public int Update(Muon muon);
public int Insert(Muon muon);
}
