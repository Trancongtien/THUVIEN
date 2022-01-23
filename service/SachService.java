package service;
import java.util.*;
import model.*;
public interface SachService {
public List<Sach> getList();
public int createOrUpdate(Sach s);
}
