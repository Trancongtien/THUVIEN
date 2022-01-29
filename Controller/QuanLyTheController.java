package Controller;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import com.toedter.calendar.JDateChooser;

import dao.SQLConnect;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;

import service.*;
import utility.ClassTableModel;
import model.*;

public class QuanLyTheController implements ActionListener, MouseListener {
	private JPanel pnView;
	private JTextField txtSearch, txtMathe, txtMaDocGia;
	private JTextArea txtGhiChu;
	private JButton btAdd, btDelete, btInsert;
	private JDateChooser txtNgayBatDau, txtNgayKetThuc;

	private final String[] COLUMNS = { "Mã Thẻ", "STT", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Ghi Chú", "Mã Độc Giả" };
	private TheService theservice = null;

	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLyTheController(JPanel pnView, JTextField txtSearch, JTextField txtMathe, JTextField txtMaDocGia,
			JTextArea txtGhiChu, JButton btAdd, JButton btDelete, JButton btInsert, JDateChooser txtNgayBatDau,
			JDateChooser txtNgayKetThuc) {
		this.pnView = pnView;
		this.txtSearch = txtSearch;
		this.txtMathe = txtMathe;
		this.txtMaDocGia = txtMaDocGia;
		this.txtGhiChu = txtGhiChu;
		this.btAdd = btAdd;
		this.btDelete = btDelete;
		this.btInsert = btInsert;
		this.txtNgayBatDau = txtNgayBatDau;
		this.txtNgayKetThuc = txtNgayKetThuc;
		this.theservice = new TheServiceImpl();

	}

	private Vector<TheThuVien> listItem;
	private DefaultTableModel model;
	private JTable table;
	private SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");

	public void setDateToTable() {
		listItem = (Vector<TheThuVien>) theservice.getList();
		model = new ClassTableModel().setTableThe(listItem, COLUMNS);
		table = new JTable(model);
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
		table.addMouseListener(this);
		btAdd.addActionListener(this);
		btDelete.addActionListener(this);
		btInsert.addActionListener(this);
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
		TheThuVien ttt = (TheThuVien) listItem.elementAt(selectedRowIndex);
		txtMathe.setText(ttt.getMathe());
		txtNgayBatDau.setDate(ttt.getNgaybatdau());
		txtNgayKetThuc.setDate(ttt.getNgaykethuc());
		txtGhiChu.setText(ttt.getGhichu());
		txtMaDocGia.setText(ttt.getMadocgia());
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btAdd) {
		
		} else if (e.getSource() == btDelete) {
			String sql = "Delete from TheThuVien where MaThe=\'" + txtMathe.getText() + "\'";
			try {
				Connection conn = SQLConnect.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.executeUpdate();
				setDateToTable();
			} catch (Exception e2) {

				e2.printStackTrace();
			}
		} else if (e.getSource() == btInsert) {
			

		}
	}

}
