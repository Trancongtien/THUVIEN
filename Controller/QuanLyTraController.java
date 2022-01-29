package Controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.toedter.calendar.JDateChooser;

import dao.SQLConnect;
import model.*;
import service.*;
import utility.*;

public class QuanLyTraController extends JFrame implements MouseListener, ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel pnView;
	private JTextField txtSearch, txtSoSachTra, txtSoSachChuaTra, txtMaThe, txtMaThuThu, txtMaSach;
	private JButton btAdd, btDelete, btInsert;
	private JDateChooser txtNgayTra;

	private final String[] COLUMNS = { "STT", "Ngày Trả", "Số Sách Trả", "Số Sách chưa trả", "Mã Thẻ", "Mã Thủ Thư",
			"Mã Sách" };
	private TraService traservice = null;
	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLyTraController(JPanel pnView, JTextField txtSearch, JTextField txtSoSachTra,
			JTextField txtSoSachChuaTra, JTextField txtMaThe, JTextField txtMaThuThu, JTextField txtMaSach,
			JButton btAdd, JButton btDelete, JButton btInsert, JDateChooser txtNgayTra) {
		this.pnView = pnView;
		this.txtSearch = txtSearch;
		this.txtSoSachTra = txtSoSachTra;
		this.txtSoSachChuaTra = txtSoSachChuaTra;
		this.txtMaThe = txtMaThe;
		this.txtMaThuThu = txtMaThuThu;
		this.txtMaSach = txtMaSach;
		this.btAdd = btAdd;
		this.btDelete = btDelete;
		this.btInsert = btInsert;
		this.txtNgayTra = txtNgayTra;
		this.traservice = new TraServiceImpl();
	}

	private DefaultTableModel model;
	private JTable table;
	private Vector<Tra> listItem = null;
	private SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
	public void setDateToTable() {
		listItem = (Vector<Tra>) traservice.getList();
		model = new ClassTableModel().setTableTra(listItem, COLUMNS);
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
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btAdd) {
			
		} else if (e.getSource() == btInsert) {
			

		} else if (e.getSource() == btDelete) {
			String sql = "Delete from Tra where NgayTra=\'" +ft.format( txtNgayTra.getDate()) + "\'";
			try {
				Connection conn = SQLConnect.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.executeUpdate();
				setDateToTable();
				model.fireTableDataChanged();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int selectedRowIndex = table.getSelectedRow();
		   selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
		Tra t = (Tra) listItem.elementAt(selectedRowIndex);
		txtNgayTra.setDate(t.getNgaytra());
		txtSoSachChuaTra.setText(String.valueOf(t.getSosachchuatra()));
		txtSoSachTra.setText(String.valueOf(t.getSosachtra()));
		txtMaThe.setText(t.getMathe());
		txtMaThuThu.setText(t.getMathuthu());
		txtMaSach.setText(t.getMasach());

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
