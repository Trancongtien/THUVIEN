package Controller;

import model.*;
import service.*;
import utility.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.event.*;

import java.util.*;
import javax.swing.table.*;

import dao.SQLConnect;

public class QuanLySachController extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel jpnView;
	private JTextField jtfSearch;
	private JButton btAdd;
	private JButton brInsert;
	private JButton btDelete;
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
	Vector<Sach> listItem = null;

	public void setDateToTabel() {
		reload();
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
		table.addMouseListener(this);

		btAdd.addActionListener(this);
		brInsert.addActionListener(this);
		btDelete.addActionListener(this);
	}

	public void reload() {
		listItem = (Vector<Sach>) sachservice.getList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btAdd) {
			
		} else if (e.getSource() == brInsert) {
			
		} else if (e.getSource() == btDelete) {
			String sql = "Delete from Sach where MaSach=\'" + txtMaSach.getText() + "\'";
			try {
				Connection conn = SQLConnect.getConnection();
				PreparedStatement prs = conn.prepareStatement(sql);
				prs.executeUpdate();
				reload();
				setDateToTabel();
				model.fireTableDataChanged();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int selectedRowIndex = table.getSelectedRow();
		   selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
		Sach st = (Sach) listItem.elementAt(selectedRowIndex);
		txtMaSach.setText(st.getMASACH());
		txtTenSach.setText(st.getTENSACH());
		txtTomTat.setText(st.getTOMTAT());
		txtSoTrang.setText(String.valueOf(st.getSOTRANG()));
		txtDonGia.setText(String.valueOf(st.getDONGIA()));
		txtNamXB.setText(String.valueOf(st.getNAMXUATBAN()));
		txtTacGia.setText(st.getTACGIA());
		txtTheLoai.setText(st.getTHELOAI());
		txtNhaXuatBan.setText(st.getNHAXUATBAN());
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
