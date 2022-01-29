package Controller;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import java.sql.*;
import java.sql.Date;

import com.toedter.calendar.JDateChooser;
import dao.SQLConnect;
import service.*;
import utility.ClassTableModel;
import model.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class QuanLyMuonController implements MouseListener, ActionListener {
	private JPanel pnView;
	private JTextField txtSearch;
	private JButton btAdd, btInsert, btDelete;
	private JTextField txtSoSachMuon, txtMaThuThu, txtMaThe, txtMaSach;
	private JDateChooser txtNgayMuon;

	private final String[] COLUMNS = { "STT", "Ngày Mượn", "Số Sách Mượn", "Mã Sách", "Mã Thẻ", "Mã Thủ Thư" };

	private MuonService muonservice = null;
	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLyMuonController(JPanel pnView, JTextField txtSearch, JButton btAdd, JButton btInsert, JButton btDelete,
			JTextField txtSoSachMuon, JTextField txtMaThuThu, JTextField txtMaThe, JTextField txtMaSach,
			JDateChooser txtNgayMuon) {
		super();
		this.pnView = pnView;
		this.txtSearch = txtSearch;
		this.btAdd = btAdd;
		this.btInsert = btInsert;
		this.btDelete = btDelete;
		this.txtSoSachMuon = txtSoSachMuon;
		this.txtMaThuThu = txtMaThuThu;
		this.txtMaThe = txtMaThe;
		this.txtMaSach = txtMaSach;
		this.txtNgayMuon = txtNgayMuon;
		this.muonservice = new MuonServiceImpl();
	}

	private DefaultTableModel model;
	private JTable table;
	JScrollPane scollPane;
	
private	Vector<Muon> listItem = null;
	public void setDateToTable() {
		listItem = (Vector<Muon>) muonservice.getList();
		model = new ClassTableModel().setTableMuon(listItem, COLUMNS);
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
		scollPane = new JScrollPane();
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
			Muon  m = new Muon((Date) txtNgayMuon.getDate(), Integer.parseInt( txtSoSachMuon.getText()),txtMaThe.getText() , txtMaThuThu.getText(), txtMaSach.getText());
		muonservice.Insert(m);
		setDateToTable();
		} else if (e.getSource() == btDelete) {
			String sql = "Delete from Muon where NgayMuon= \'" +(txtNgayMuon.getDate()) + "\' and MaThe=\'"
					+ txtMaThe.getText() + "\' and MaSach=\'" + txtMaSach.getText() + "\'";

			try {
				Connection conn = (Connection) SQLConnect.getConnection();
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
				ps.executeUpdate();
				setDateToTable();
				model.fireTableDataChanged();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else if (e.getSource() == btInsert) {
			Muon m = new Muon((Date)txtNgayMuon.getDate(), Integer.parseInt(txtSoSachMuon.getText()), txtMaThe.getText(), txtMaThuThu.getText(), txtMaSach.getText());
			muonservice.Update(m);
			setDateToTable();
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		  int selectedRowIndex = table.getSelectedRow();
		   selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
		Muon m = (Muon) listItem.elementAt(selectedRowIndex);
		txtNgayMuon.setDate(m.getNgaymuon());
		
		
		txtSoSachMuon.setText(String.valueOf(m.getSosachmuon()));
		txtMaThuThu.setText(m.getMathuthu());
		txtMaSach.setText(m.getMasach());
		txtMaThe.setText(m.getMathe());
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
