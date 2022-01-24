package Tien;


import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
public class QuanLyMuon extends JPanel {
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btFind;
	private javax.swing.JButton btAdd;
	private javax.swing.JButton btInsert;
	private javax.swing.JButton btDelete;
	private javax.swing.JComboBox<String> cb;
	private javax.swing.JLabel lbMaPhieuMuon;
	private javax.swing.JLabel lbNgayMuon;
	private javax.swing.JLabel lbSoSachMuon;
	private javax.swing.JLabel SlbSachHienDat;
	private javax.swing.JLabel lbMaThe;
	private javax.swing.JLabel lbMaThuThu;
	private javax.swing.JLabel lbMaSach;
	private javax.swing.JPanel pnTable;
	private javax.swing.JPanel pnQuery;
	private javax.swing.JTextField txtFind;
	private javax.swing.JTextField txtMaPhieuMuon;
	private javax.swing.JTextField txtNgayMuon;
	private javax.swing.JTextField txtSoSachMuon;
	private javax.swing.JTextField txtSachHienDat;
	private javax.swing.JTextField txtMaThe;
	private javax.swing.JTextField txtMaThuThu;
	private javax.swing.JTextField txtMaSach;

	public QuanLyMuon() {
		pnTable = new javax.swing.JPanel();
		pnTable.setBackground(UIManager.getColor("Button.background"));
		pnQuery = new javax.swing.JPanel();
		pnQuery.setBackground(UIManager.getColor("Button.shadow"));
		btFind = new javax.swing.JButton();
		txtFind = new javax.swing.JTextField();
		cb = new javax.swing.JComboBox<>();
		lbMaPhieuMuon = new javax.swing.JLabel();
		lbNgayMuon = new javax.swing.JLabel();
		lbSoSachMuon = new javax.swing.JLabel();
		SlbSachHienDat = new javax.swing.JLabel();
		txtMaPhieuMuon = new javax.swing.JTextField();
		txtNgayMuon = new javax.swing.JTextField();
		txtSoSachMuon = new javax.swing.JTextField();
		txtSachHienDat = new javax.swing.JTextField();
		lbMaThe = new javax.swing.JLabel();
		lbMaThuThu = new javax.swing.JLabel();
		lbMaSach = new javax.swing.JLabel();
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
		gl_pnTable.setVerticalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
				298, Short.MAX_VALUE));

		btFind.setText("Tìm Kiếm");

		txtFind.setText("");

		cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		lbMaPhieuMuon.setText("Mã Phiếu Mượn : ");

		lbNgayMuon.setText("Ngày Mượn :");

		lbSoSachMuon.setText("Số Sách Mượn :");

		SlbSachHienDat.setText("Sách Hiện Đặt");

		txtMaPhieuMuon.setText("");

		txtNgayMuon.setText("");

		txtSoSachMuon.setText("");

		txtSachHienDat.setText("");

		lbMaThe.setText("Mã Thể :");

		lbMaThuThu.setText("Mã Thủ Thư :");

		lbMaSach.setText("Mã Sách :");

		txtMaThe.setText("");

		txtMaThuThu.setText("");

		txtMaSach.setText("");

		btAdd.setText("Thêm");

		btInsert.setText("Sửa");

		btDelete.setText("Xóa");

		javax.swing.GroupLayout gl_pnQuery = new javax.swing.GroupLayout(pnQuery);
		gl_pnQuery.setHorizontalGroup(
			gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup()
					.addGap(0)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(144)
							.addComponent(btFind, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
							.addGap(58)
							.addComponent(txtFind, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
							.addGap(46)
							.addComponent(cb, 0, 138, Short.MAX_VALUE)
							.addGap(43))
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(58)
									.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lbMaPhieuMuon, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
										.addComponent(lbNgayMuon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lbSoSachMuon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(SlbSachHienDat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
										.addComponent(txtMaPhieuMuon, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
										.addComponent(txtNgayMuon, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
										.addComponent(txtSoSachMuon, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
										.addComponent(txtSachHienDat, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
									.addGap(26)
									.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
										.addComponent(lbMaThe, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
										.addComponent(lbMaThuThu, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
										.addComponent(lbMaSach, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(113)
									.addComponent(btAdd, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
									.addGap(123)
									.addComponent(btInsert, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
									.addGap(125)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addComponent(btDelete, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
									.addGap(77))
								.addComponent(txtMaThe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
								.addComponent(txtMaThuThu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
								.addComponent(txtMaSach, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
					.addGap(29))
		);
		gl_pnQuery.setVerticalGroup(
			gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addComponent(btFind)
								.addComponent(txtFind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(6)
									.addComponent(lbMaPhieuMuon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(txtMaPhieuMuon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbMaThe)
								.addComponent(txtMaThe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(6)
									.addComponent(lbNgayMuon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(txtNgayMuon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbMaThuThu)
								.addComponent(txtMaThuThu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(lbSoSachMuon, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE))
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtSoSachMuon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lbMaSach)
							.addComponent(txtMaSach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(6)
							.addComponent(SlbSachHienDat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(txtSachHienDat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
						.addComponent(btAdd)
						.addComponent(btInsert)
						.addComponent(btDelete))
					.addGap(20))
		);
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
