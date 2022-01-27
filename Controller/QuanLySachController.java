package Controller;

import model.*;
import service.*;
import utility.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.util.List;
import java.util.*;
import javax.swing.table.*;

import dao.SQLConnect;

public class QuanLySachController implements ActionListener,MouseListener{
	private JPanel jpnView;
	private JTextField jtfSearch;
	private JButton btAdd;
	private JButton brInsert;
	private JButton btDelete;
	private JFrame f;
	private JTextField txtTacGia;
	private JTextField txtTheLoai;
	private JTextField txtNhaXuatBan;
	private JTextField txtMaSach;
	private JTextField txtTenSach;
	private JTextField txtTomTat;
	private JTextField txtSoTrang;
	private JTextField txtDonGia;
	private JTextField txtNamXB;
	private final String[] COLUMNS = { "Mã Sách", "STT", "Tên Sách", "Tóm Tắt", "Số Trang", "Đơn Giá", "Năm Xuất Bản",
			"Tác Giả", "Thể Loại", "Nhà Xuất Bản" };
	private SachService sachservice = null;
	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLySachController(JPanel jpnView, JTextField jtfSearch, JButton btAdd, JButton brInsert, JButton btDelete,
			JTextField txtTacGia, JTextField txtTheLoai, JTextField txtNhaXuatBan, JTextField txtMaSach,
			JTextField txtTenSach, JTextField txtTomTat, JTextField txtSoTrang, JTextField txtDonGia,
			JTextField txtNamXB) {
		this.jpnView = jpnView;
		this.jtfSearch = jtfSearch;
		this.btAdd = btAdd;
		this.brInsert = brInsert;
		this.btDelete = btDelete;
		this.txtTacGia = txtTacGia;
		this.txtTheLoai = txtTheLoai;
		this.txtNhaXuatBan = txtNhaXuatBan;
		this.txtMaSach = txtMaSach;
		this.txtTenSach = txtTenSach;
		this.txtTomTat = txtTomTat;
		this.txtSoTrang = txtSoTrang;
		this.txtDonGia = txtDonGia;
		this.txtNamXB = txtNamXB;
		this.sachservice = new SachServiceImpl();
	}

	private DefaultTableModel model;
	private JTable table;
	JScrollPane scollPane;
	int selec;

	public void setDateToTabel() {
		reload();
		selec = 0;
		table.addMouseListener(this);

		btAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		brInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

	public void reload() {
		List<Sach> listItem = sachservice.getList();
		model = new ClassTableModel().setTableSach(listItem, COLUMNS);
		table = new JTable(model);
		rowSorter = new TableRowSorter<>(table.getModel());
		table.setRowSorter(rowSorter);
		scollPane = new JScrollPane();

		jtfSearch.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				String text = jtfSearch.getText();
				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}
				table.validate();
				table.repaint();
				model.fireTableDataChanged();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				String text = jtfSearch.getText();
				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}
				table.validate();
				table.repaint();
				model.fireTableDataChanged();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
			
				model.fireTableDataChanged();
				table.validate();
				table.repaint();
				scollPane.getViewport().add(table);
				scollPane.setPreferredSize(new Dimension(1300, 400));
				jpnView.removeAll();
				jpnView.setLayout(new BorderLayout());
				jpnView.add(scollPane);
				jpnView.validate();
				jpnView.repaint();
			}
		});
		model.fireTableDataChanged();
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
		table.getTableHeader().setPreferredSize(new Dimension(100, 50));
		table.setRowHeight(50);
		table.validate();
		table.repaint();

		scollPane.getViewport().add(table);
		scollPane.setPreferredSize(new Dimension(1300, 400));
		jpnView.removeAll();
		jpnView.setLayout(new BorderLayout());
		jpnView.add(scollPane);
		jpnView.validate();
		jpnView.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		 model = (DefaultTableModel) table.getModel();
		selec = table.getSelectedRow();
		txtMaSach.setText((model.getValueAt(selec, 0).toString()));
		txtTenSach.setText((String)model.getValueAt(selec, 2));
		txtTomTat.setText((String)model.getValueAt(selec, 3));
		txtSoTrang.setText(model.getValueAt(selec, 4).toString());
		txtDonGia.setText(model.getValueAt(selec, 5).toString());
		txtNamXB.setText(model.getValueAt(selec, 6).toString());
		txtTacGia.setText((String)model.getValueAt(selec, 7));
		txtTheLoai.setText((String)model.getValueAt(selec, 8));
		txtNhaXuatBan.setText((String)model.getValueAt(selec, 9));
		model.fireTableDataChanged();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
