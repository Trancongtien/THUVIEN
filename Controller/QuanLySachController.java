package Controller;

import model.*;
import service.*;
import utility.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class QuanLySachController {
	private JPanel jpnView;
	private JButton btnAdd;
	private JTextField jtfSearch;

	private ClassTableModel classTableModel = null;
	private final String[] COLUMNS = { "Mã Sách", "STT", "Tên Sách", "Tóm Tắt", "Số Trang", "Đơn Giá", "Năm Xuất Bản",
			 "Tác Giả", "MÃ Thể Loại", "MÃ NXB" };
	private SachService sachservice = null;
	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLySachController(JPanel pnView, JButton btnAdd, JTextField tf) {
		this.jpnView = pnView;
		this.btnAdd = btnAdd;
		jtfSearch = tf;

		this.sachservice = new SachServiceImpl();
	}

	public void setDateToTabel() {
		List<Sach> listItem = sachservice.getList();
		DefaultTableModel model = new ClassTableModel().setTableSach(listItem, COLUMNS);
		JTable table = new JTable(model);
		rowSorter = new TableRowSorter<>(table.getModel());
		table.setRowSorter(rowSorter);
		jtfSearch.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				String text = jtfSearch.getText();
				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}

			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				String text = jtfSearch.getText();
				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}
		});

		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
		table.getTableHeader().setPreferredSize(new Dimension(100, 50));
		table.setRowHeight(50);
		table.validate();
		table.repaint();

		JScrollPane scollPane = new JScrollPane();
		scollPane.getViewport().add(table);
		scollPane.setPreferredSize(new Dimension(1300, 400));
		jpnView.removeAll();
		jpnView.setLayout(new BorderLayout());
		jpnView.add(scollPane);
		jpnView.validate();
		jpnView.repaint();

	}
}
