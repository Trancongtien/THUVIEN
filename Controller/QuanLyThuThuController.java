package Controller;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import dao.SQLConnect;
import model.*;
import service.*;
import utility.ClassTableModel;

public class QuanLyThuThuController implements MouseListener {
	private JPanel pnView;
	private JTextField txtSearch, txtMaThuThu, txtHoDem, txtTen, txtGioiTinh, txtDiaChi, txtMaTK;
	private JButton btAdd, btDelete, btInsert;
	private final String[] COLUMNS = { "Mã Thủ Thư", "STT", "Giới Tính", "Họ Đệm", "Tên", "Địa Chỉ", "Mã Tài Khoản" };
	private ThuThuService thuthuservice = null;
	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLyThuThuController(JPanel pnView, JTextField txtSearch, JTextField txtMaThuThu, JTextField txtHoDem,
			JTextField txtTen, JTextField txtGioiTinh, JTextField txtDiaChi, JTextField txtMaTK, JButton btAdd,
			JButton btDelete, JButton btInsert) {
		this.pnView = pnView;
		this.txtSearch = txtSearch;
		this.txtMaThuThu = txtMaThuThu;
		this.txtHoDem = txtHoDem;
		this.txtTen = txtTen;
		this.txtGioiTinh = txtGioiTinh;
		this.txtDiaChi = txtDiaChi;
		this.txtMaTK = txtMaTK;
		this.btAdd = btAdd;
		this.btDelete = btDelete;
		this.btInsert = btInsert;
		this.thuthuservice = new ThuThuServiceImpl();
	}

	private ThuThu tt = null;
	private Vector<ThuThu> listItem;
	private DefaultTableModel model;
	private JTable table;

	public void setDateToTable() {
		listItem = (Vector<ThuThu>) thuthuservice.getList();

		model = new ClassTableModel().setTableThuThu(listItem, COLUMNS);
		table = new JTable(model);
		rowSorter = new TableRowSorter<>(table.getModel());
		table.setRowSorter(rowSorter);
		table.addMouseListener(this);
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
		btAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tt = new ThuThu();
				tt.setDiachi(txtDiaChi.getText());
				tt.setGioitinh(txtGioiTinh.getText().equals("Nam") ? true : false);
				tt.setHodem(txtHoDem.getText());
				tt.setTen(txtTen.getText());
				tt.setMathuthu(txtMaThuThu.getText());
				tt.setMatk(txtMaTK.getText());
				thuthuservice.Insert(tt);
				setDateToTable();

			}
		});
		btDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String sql = "Delete from ThuThu where MaThuThu=\'" + txtMaThuThu.getText() + "\'";
				try {
					Connection conn = SQLConnect.getConnection();
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.executeUpdate();

					setDateToTable();

				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tt = new ThuThu(txtMaThuThu.getText(), txtHoDem.getText(), txtTen.getText(), txtDiaChi.getText(),
						txtGioiTinh.getText().equals("Nam") ? true : false, txtMaTK.getText());
				thuthuservice.Update(tt);
				setDateToTable();

			}
		});
		JScrollPane scollPane = new JScrollPane();
		scollPane.getViewport().add(table);
		scollPane.setPreferredSize(new Dimension(1300, 400));
		pnView.removeAll();
		pnView.setLayout(new BorderLayout());
		pnView.add(scollPane);
		pnView.validate();
		pnView.repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int selectedRowIndex = table.getSelectedRow();
		selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
		tt = (ThuThu) listItem.elementAt(selectedRowIndex);
		txtMaThuThu.setText(tt.getMathuthu());
		txtHoDem.setText(tt.getHodem());
		txtTen.setText(tt.getTen());
		txtGioiTinh.setText(tt.isGioitinh() == true ? "Nam" : "Nữ");
		txtDiaChi.setText(tt.getDiachi());
		txtMaTK.setText(tt.getMatk());
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
