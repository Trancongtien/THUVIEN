package Tien;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class QuanLyDocGia extends JPanel {
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btFind;
	private javax.swing.JButton btAdd;
	private javax.swing.JButton btInsert;
	private javax.swing.JButton btDelete;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel lbMaDocGia;
	private javax.swing.JLabel lbHoDem;
	private javax.swing.JLabel lbTen;
	private javax.swing.JLabel GioiTinh;
	private javax.swing.JLabel lbNgaySinh;
	private javax.swing.JLabel lbSDT;
	private javax.swing.JLabel lbDiaChi;
	private javax.swing.JLabel lbMaLoaiDocGia;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField txtMaDocGia;
	private javax.swing.JTextField txtHoDem;
	private javax.swing.JTextField txtTen;
	private javax.swing.JTextField txtGioiTinh;
	private javax.swing.JTextField txtNgaySinh;
	private javax.swing.JTextField txtSDT;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtMaLoaiDocGia;

	public QuanLyDocGia() {
		setBackground(UIManager.getColor("Button.background"));
		jPanel2 = new javax.swing.JPanel();
		jPanel2.setBackground(UIManager.getColor("Button.background"));
		jPanel3 = new javax.swing.JPanel();
		jPanel3.setBackground(UIManager.getColor("Button.shadow"));
		btFind = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jComboBox1 = new javax.swing.JComboBox<>();
		lbMaDocGia = new javax.swing.JLabel();
		lbHoDem = new javax.swing.JLabel();
		lbTen = new javax.swing.JLabel();
		GioiTinh = new javax.swing.JLabel();
		txtMaDocGia = new javax.swing.JTextField();
		txtHoDem = new javax.swing.JTextField();
		txtTen = new javax.swing.JTextField();
		txtGioiTinh = new javax.swing.JTextField();
		lbNgaySinh = new javax.swing.JLabel();
		lbSDT = new javax.swing.JLabel();
		lbDiaChi = new javax.swing.JLabel();
		lbMaLoaiDocGia = new javax.swing.JLabel();
		txtNgaySinh = new javax.swing.JTextField();
		txtSDT = new javax.swing.JTextField();
		txtDiaChi = new javax.swing.JTextField();
		txtMaLoaiDocGia = new javax.swing.JTextField();
		btAdd = new javax.swing.JButton();
		btInsert = new javax.swing.JButton();
		btDelete = new javax.swing.JButton();

		jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 734, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 298, Short.MAX_VALUE));

		btFind.setText("Tìm Kiếm");

		jTextField1.setText("");

		jComboBox1.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		lbMaDocGia.setText("Mã Độc Giả :");

		lbHoDem.setText("Họ Đệm :");

		lbTen.setText("Tên :");

		GioiTinh.setText("Giới Tính");

		txtMaDocGia.setText("");

		txtHoDem.setText("");

		txtTen.setText("");

		txtGioiTinh.setText("");

		lbNgaySinh.setText("Ngày Sinh :");

		lbSDT.setText("Số Điện Thoại");

		lbDiaChi.setText("Địa Chỉ");

		lbMaLoaiDocGia.setText("Mã Loại Độc Giả");

		txtNgaySinh.setText("");

		txtSDT.setText("");

		txtDiaChi.setText("");

		txtMaLoaiDocGia.setText("");

		btAdd.setText("Thêm");

		btInsert.setText("Sửa");

		btDelete.setText("Xóa");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout
				.setHorizontalGroup(
						jPanel3Layout
								.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup()
										.addGap(0).addGroup(jPanel3Layout
												.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout
														.createSequentialGroup().addGap(144)
														.addComponent(
																btFind, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
														.addGap(58)
														.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 169,
																Short.MAX_VALUE)
														.addGap(46).addComponent(jComboBox1, 0, 130, Short.MAX_VALUE)
														.addGap(43))
												.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
														.createParallelGroup(Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup().addGap(58)
																.addGroup(jPanel3Layout
																		.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(lbMaDocGia,
																				GroupLayout.DEFAULT_SIZE, 122,
																				Short.MAX_VALUE)
																		.addComponent(lbHoDem, GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lbTen, GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				GioiTinh, GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addGroup(jPanel3Layout
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(txtMaDocGia,
																				GroupLayout.DEFAULT_SIZE, 148,
																				Short.MAX_VALUE)
																		.addComponent(txtHoDem).addComponent(txtTen)
																		.addComponent(txtGioiTinh))
																.addGap(26)
																.addGroup(jPanel3Layout
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(lbNgaySinh,
																				GroupLayout.DEFAULT_SIZE, 139,
																				Short.MAX_VALUE)
																		.addComponent(lbSDT, GroupLayout.DEFAULT_SIZE,
																				139, Short.MAX_VALUE)
																		.addComponent(
																				lbDiaChi, GroupLayout.DEFAULT_SIZE, 139,
																				Short.MAX_VALUE)
																		.addComponent(lbMaLoaiDocGia,
																				GroupLayout.DEFAULT_SIZE, 139,
																				Short.MAX_VALUE)))
														.addGroup(jPanel3Layout.createSequentialGroup().addGap(113)
																.addComponent(btAdd, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addGap(123)
																.addComponent(btInsert, GroupLayout.DEFAULT_SIZE, 71,
																		Short.MAX_VALUE)
																.addGap(125)))
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
																.addGroup(jPanel3Layout.createSequentialGroup()
																		.addComponent(btDelete,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(77))
																.addGroup(Alignment.TRAILING, jPanel3Layout
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(txtNgaySinh,
																				GroupLayout.DEFAULT_SIZE, 148,
																				Short.MAX_VALUE)
																		.addComponent(txtSDT).addComponent(txtDiaChi)
																		.addComponent(txtMaLoaiDocGia)))))
										.addGap(29)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout
				.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout
						.createParallelGroup(Alignment.TRAILING).addGroup(jPanel3Layout
								.createSequentialGroup()
								.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(btFind)
										.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
										.addGroup(jPanel3Layout.createSequentialGroup().addGap(6).addComponent(
												lbMaDocGia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
										.addComponent(txtMaDocGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lbNgaySinh).addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
										.addGroup(jPanel3Layout.createSequentialGroup().addGap(6).addComponent(lbHoDem,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(txtHoDem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lbSDT).addComponent(txtSDT, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18).addComponent(lbTen, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE))
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lbDiaChi).addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGap(18)
				.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(6).addComponent(GioiTinh,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(txtGioiTinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lbMaLoaiDocGia).addComponent(txtMaLoaiDocGia, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(btAdd)
						.addComponent(btInsert).addComponent(btDelete))
				.addGap(20)));
		jPanel3.setLayout(jPanel3Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE).addContainerGap()));
		this.setLayout(layout);
	}

}
