package Controller;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.*;
import service.*;
import utility.ClassTableModel;
import model.*;

public class QuanLyTheController {
	private JPanel pnView;
	private JTextField txtSearch;

	private final String[] COLUMNS = { "Mã Thẻ", "STT", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Ghi Chú", "Mã Độc Giả" };
	private TheService theservice = null;

	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLyTheController(JPanel pnView, JTextField txtSearch) {
		this.pnView = pnView;
		this.txtSearch = txtSearch;
		this.theservice = new TheServiceImpl();
	}

	public void setDateToTable() {
		List<TheThuVien> listItem = theservice.getList();
		DefaultTableModel model = new ClassTableModel().setTableThe(listItem, COLUMNS);
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
		pnView.removeAll();
		pnView.setLayout(new BorderLayout());
		pnView.add(scollPane);
		pnView.validate();
		pnView.repaint();
	}

}
