package Controller;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import service.*;
import utility.ClassTableModel;
import model.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.*;
public class QuanLyMuonController {
private JPanel pnView;
private JTextField txtSearch;
private final String []COLUMNS= {"STT","Ngày Mượn","Số Sách Mượn","Mã Sách","Mã Thẻ","Mã Thủ Thư"};

private MuonService muonservice=null;
private TableRowSorter<TableModel>rowSorter=null;
public QuanLyMuonController(JPanel pnView, JTextField txtSearch) {
	this.pnView = pnView;
	this.txtSearch = txtSearch;
	this.muonservice=new MuonServiceImpl(); 
}
public void setDateToTable() {
	List<Muon>listItem= muonservice.getList();
	DefaultTableModel model = new ClassTableModel().setTableMuon(listItem, COLUMNS);
	JTable table = new JTable(model);
	rowSorter= new TableRowSorter<>(table.getModel());
	table.setRowSorter(rowSorter);
	txtSearch.getDocument().addDocumentListener(new DocumentListener() {
		
		@Override
		public void removeUpdate(DocumentEvent e) {
			String text= txtSearch.getText();
			if(text.trim().length()==0) {
				rowSorter.setRowFilter(null);
			}else {
				rowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+text));
			}
		}
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			String text= txtSearch.getText();
			if(text.trim().length()==0) {
				rowSorter.setRowFilter(null);
			}else {
				rowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+text));
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
