package Controller;
import model.*;
import service.*;
import utility.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class QuanLySachController {
	 private JPanel jpnView;
	    private JButton btnAdd;
	    private JTextField jtfSearch;

	    private ClassTableModel classTableModel = null;
	    private final String[]COLUMNS= {"Mã Sách","STT","Tên Sách","Tóm Tắt","Số Trang","Đơn Giá","Năm Xuất Bản","Trạng Thái","Tác Giả","MÃ Thể Loại","MÃ NXB"};
	    private SachService sachservice=null;
	    private TableRowSorter<TableModel> rowSorter=null;
	    public QuanLySachController(JPanel pnView,JButton btnAdd,JTextField tfSearch) {
	    	this.jpnView= pnView;
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    
}
