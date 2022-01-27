package Controller;

import java.awt.*;
import java.awt.Font;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import model.DocGia;

import java.util.List;
import service.*;
import utility.ClassTableModel;

public class QuanLyDocGiaController {
	private JPanel pnView;
	private JTextField txtSearch;
	private final String[] COLUMNS = { "Mã Độc Giả", "STT", "Họ Đệm", "Tên", "Giới Tính	", "Ngày Sinh", "SĐT",
			"Địa Chỉ", "Mã Loại Độc Giả" };
	private DocGiaService docgiaservice = null;
	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLyDocGiaController(JPanel pnView, JTextField txtSearch) {
		this.pnView = pnView;
		this.txtSearch = txtSearch;
		this.docgiaservice = new DocGiaServiceImpl();
	}

	public void setDateToTabel() {
		List<DocGia> listItem = docgiaservice.getList();
		DefaultTableModel model = new ClassTableModel().setTableDocGia(listItem, COLUMNS);
		JTable table = new JTable(model);
		rowSorter = new TableRowSorter<>(table.getModel());
		table.setRowSorter(rowSorter);
		txtSearch.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				String text = txtSearch.getText();
				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}

			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				String text = txtSearch.getText();
				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}
			}

			@Override
			public void changedUpdate(DocumentEvent e) {

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
		pnView.removeAll();
		pnView.setLayout(new BorderLayout());
		pnView.add(scollPane);
		pnView.validate();
		pnView.repaint();

	}

}
