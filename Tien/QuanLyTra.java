package Tien;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class QuanLyTra extends JPanel {

	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btFind;
	private javax.swing.JButton btAdd;
	private javax.swing.JButton btInsert;
	private javax.swing.JButton btDelete;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel lbMaPhieuTra;
	private javax.swing.JLabel lbNgayTra;
	private javax.swing.JLabel lbSoSachTra;
	private javax.swing.JLabel lbSoSachChuaTra;
	private javax.swing.JLabel lbMaPhieuMuon;
	private javax.swing.JLabel lbMaThe;
	private javax.swing.JLabel lbMaThuThu;
	private javax.swing.JLabel lbMaSach;
	private javax.swing.JPanel pnTable;
	private javax.swing.JPanel pnQuery;
	private javax.swing.JTextField txtFind;
	private javax.swing.JTextField txtPhieuTra;
	private javax.swing.JTextField txtNgayTra;
	private javax.swing.JTextField txtSoSachTra;
	private javax.swing.JTextField txtSoSachChuaTra;
	private javax.swing.JTextField txtMaPhieuMuon;
	private javax.swing.JTextField txtMaThe;
	private javax.swing.JTextField txtMaThuThu;
	private javax.swing.JTextField txtMaSach;

	public QuanLyTra() {
		pnTable = new javax.swing.JPanel();
		pnTable.setBackground(UIManager.getColor("Button.background"));
		pnQuery = new javax.swing.JPanel();
		pnQuery.setBackground(UIManager.getColor("Button.shadow"));
		btFind = new javax.swing.JButton();
		txtFind = new javax.swing.JTextField();
		jComboBox1 = new javax.swing.JComboBox<>();
		lbMaPhieuTra = new javax.swing.JLabel();
		lbNgayTra = new javax.swing.JLabel();
		lbSoSachTra = new javax.swing.JLabel();
		lbSoSachChuaTra = new javax.swing.JLabel();
		txtPhieuTra = new javax.swing.JTextField();
		txtNgayTra = new javax.swing.JTextField();
		txtSoSachTra = new javax.swing.JTextField();
		txtSoSachChuaTra = new javax.swing.JTextField();
		lbMaPhieuMuon = new javax.swing.JLabel();
		lbMaThe = new javax.swing.JLabel();
		lbMaThuThu = new javax.swing.JLabel();
		lbMaSach = new javax.swing.JLabel();
		txtMaPhieuMuon = new javax.swing.JTextField();
		txtMaThe = new javax.swing.JTextField();
		txtMaThuThu = new javax.swing.JTextField();
		txtMaSach = new javax.swing.JTextField();
		btAdd = new javax.swing.JButton();
		btInsert = new javax.swing.JButton();
		btDelete = new javax.swing.JButton();

		pnTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout gl_pnTable = new javax.swing.GroupLayout(pnTable);
		pnTable.setLayout(gl_pnTable);
		gl_pnTable.setHorizontalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 734, Short.MAX_VALUE));
		gl_pnTable.setVerticalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 298, Short.MAX_VALUE));

		btFind.setText("Tìm Kiếm");

		txtFind.setText("");

		jComboBox1.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		lbMaPhieuTra.setText("Mã Phiếu Trả : ");

		lbNgayTra.setText("Ngày Trả :");

		lbSoSachTra.setText("Số Sách Trả :");

		lbSoSachChuaTra.setText("Số Sach Chưa Trả :");

		txtPhieuTra.setText("");

		txtNgayTra.setText("");

		txtSoSachTra.setText("");

		txtSoSachChuaTra.setText("");

		lbMaPhieuMuon.setText("Mã Phiếu Mượn");

		lbMaThe.setText("Mã Thẻ :");

		lbMaThuThu.setText("Mã Thủ Thư :");

		lbMaSach.setText("Mã Sách :");

		txtMaPhieuMuon.setText("");

		txtMaThe.setText("");

		txtMaThuThu.setText("");

		txtMaSach.setText("");

		btAdd.setText("Thêm");

		btInsert.setText("Sửa ");

		btDelete.setText("Xóa ");

		javax.swing.GroupLayout gl_pnQuery = new javax.swing.GroupLayout(pnQuery);
		gl_pnQuery.setHorizontalGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup().addGap(0)
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnQuery.createSequentialGroup().addGap(144)
										.addComponent(btFind, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE).addGap(58)
										.addComponent(txtFind, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
										.addGap(46).addComponent(jComboBox1, 0, 130, Short.MAX_VALUE).addGap(43))
								.addGroup(gl_pnQuery.createSequentialGroup().addGroup(gl_pnQuery
										.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnQuery.createSequentialGroup().addGap(58)
												.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING, false)
														.addComponent(lbMaPhieuTra, GroupLayout.DEFAULT_SIZE, 122,
																Short.MAX_VALUE)
														.addComponent(lbNgayTra, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lbSoSachTra, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lbSoSachChuaTra, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
														.addComponent(txtPhieuTra, GroupLayout.DEFAULT_SIZE, 148,
																Short.MAX_VALUE)
														.addComponent(txtNgayTra).addComponent(txtSoSachTra)
														.addComponent(txtSoSachChuaTra))
												.addGap(26)
												.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
														.addComponent(lbMaPhieuMuon, GroupLayout.DEFAULT_SIZE, 139,
																Short.MAX_VALUE)
														.addComponent(lbMaThe, GroupLayout.DEFAULT_SIZE, 139,
																Short.MAX_VALUE)
														.addComponent(lbMaThuThu, GroupLayout.DEFAULT_SIZE, 139,
																Short.MAX_VALUE)
														.addComponent(lbMaSach, GroupLayout.DEFAULT_SIZE, 139,
																Short.MAX_VALUE)))
										.addGroup(gl_pnQuery.createSequentialGroup().addGap(113)
												.addComponent(btAdd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addGap(123)
												.addComponent(btInsert, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
												.addGap(125)))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnQuery.createSequentialGroup()
														.addComponent(btDelete, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGap(77))
												.addGroup(Alignment.TRAILING,
														gl_pnQuery.createParallelGroup(Alignment.LEADING)
																.addComponent(txtMaPhieuMuon, GroupLayout.DEFAULT_SIZE,
																		148, Short.MAX_VALUE)
																.addComponent(txtMaThe).addComponent(txtMaThuThu)
																.addComponent(txtMaSach)))))
						.addGap(29)));
		gl_pnQuery.setVerticalGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING).addGroup(gl_pnQuery
				.createSequentialGroup().addContainerGap().addGroup(gl_pnQuery
						.createParallelGroup(Alignment.TRAILING).addGroup(gl_pnQuery
								.createSequentialGroup()
								.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE).addComponent(btFind)
										.addComponent(txtFind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
										.addGroup(gl_pnQuery.createSequentialGroup().addGap(6).addComponent(
												lbMaPhieuTra, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
										.addComponent(txtPhieuTra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lbMaPhieuMuon).addComponent(txtMaPhieuMuon,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
										.addGroup(gl_pnQuery.createSequentialGroup().addGap(6).addComponent(
												lbNgayTra, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
										.addComponent(txtNgayTra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lbMaThe).addComponent(txtMaThe, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18).addComponent(lbSoSachTra, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE))
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtSoSachTra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lbMaThuThu).addComponent(txtMaThuThu, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGap(18)
				.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_pnQuery.createSequentialGroup().addGap(6).addComponent(lbSoSachChuaTra,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(txtSoSachChuaTra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lbMaSach).addComponent(txtMaSach, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE).addComponent(btAdd)
						.addComponent(btInsert).addComponent(btDelete))
				.addGap(20)));
		pnQuery.setLayout(gl_pnQuery);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(pnQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnQuery, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	}

}