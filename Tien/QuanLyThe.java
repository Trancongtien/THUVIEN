package Tien;

import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class QuanLyThe extends JPanel {
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btAdd;
	private javax.swing.JButton btDelete;
	private javax.swing.JButton btInsert;
	private javax.swing.JPanel pnTable;
	private javax.swing.JPanel pnRoot;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lbghichu;
	private javax.swing.JLabel lbmadocgia;
	private javax.swing.JLabel lbmathe;
	private javax.swing.JLabel lbngaybatdau;
	private javax.swing.JLabel lbngayketthuc;
	private javax.swing.JTextField txtFind;
	private javax.swing.JTextArea txtghichu;
	private javax.swing.JTextField txtmadocgia;
	private javax.swing.JTextField txtmathe;
	private javax.swing.JTextField txtngaybatdau;
	private javax.swing.JTextField txtngayketthuc;

	public QuanLyThe() {
		pnTable = new javax.swing.JPanel();
		pnTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnRoot = new javax.swing.JPanel();
		txtFind = new javax.swing.JTextField();
		txtFind.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmathe = new javax.swing.JLabel();
		lbmathe.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbngaybatdau = new javax.swing.JLabel();
		lbngaybatdau.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbngayketthuc = new javax.swing.JLabel();
		lbngayketthuc.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtmathe = new javax.swing.JTextField();
		txtmathe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtngaybatdau = new javax.swing.JTextField();
		txtngaybatdau.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtngayketthuc = new javax.swing.JTextField();
		txtngayketthuc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmadocgia = new javax.swing.JLabel();
		lbmadocgia.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtmadocgia = new javax.swing.JTextField();
		txtmadocgia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbghichu = new javax.swing.JLabel();
		lbghichu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		jScrollPane1 = new javax.swing.JScrollPane();
		txtghichu = new javax.swing.JTextArea();
		txtghichu.setTabSize(13);
		txtghichu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btAdd = new javax.swing.JButton();
		btInsert = new javax.swing.JButton();
		btDelete = new javax.swing.JButton();

		javax.swing.GroupLayout gl_pnTable = new javax.swing.GroupLayout(pnTable);
		pnTable.setLayout(gl_pnTable);
		gl_pnTable.setHorizontalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		gl_pnTable.setVerticalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 411, Short.MAX_VALUE));

		txtFind.setText("");

		lbmathe.setText("Mã Thẻ :");

		lbngaybatdau.setText("Ngày Bắt Đầu : ");

		lbngayketthuc.setText("Ngày Kết Thúc :");

		txtmathe.setText("");

		txtngaybatdau.setText("");

		txtngayketthuc.setText("");

		lbmadocgia.setText("         Mã Độc Giả :");

		txtmadocgia.setText("");

		lbghichu.setText("         Ghi Chú");

		txtghichu.setColumns(20);
		txtghichu.setRows(5);
		jScrollPane1.setViewportView(txtghichu);

		btAdd.setText("Thêm");

		btInsert.setText("Sửa  ");

		btDelete.setText("Xóa  ");

		javax.swing.GroupLayout gl_pnRoot = new javax.swing.GroupLayout(pnRoot);
		gl_pnRoot.setHorizontalGroup(
			gl_pnRoot.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnRoot.createSequentialGroup()
					.addGap(0)
					.addGroup(gl_pnRoot.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnRoot.createSequentialGroup()
							.addGap(66)
							.addGroup(gl_pnRoot.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lbngayketthuc, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
								.addComponent(lbngaybatdau, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lbmathe, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnRoot.createParallelGroup(Alignment.LEADING)
								.addComponent(txtmathe, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
								.addComponent(txtngaybatdau, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
								.addComponent(txtngayketthuc, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnRoot.createParallelGroup(Alignment.LEADING)
								.addComponent(lbmadocgia, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addComponent(lbghichu, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
						.addGroup(gl_pnRoot.createSequentialGroup()
							.addGap(134)
							.addComponent(btAdd, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
							.addGap(118)
							.addComponent(btInsert, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
							.addGap(99)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnRoot.createParallelGroup(Alignment.LEADING)
						.addComponent(txtmadocgia, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
						.addComponent(jScrollPane1)
						.addGroup(gl_pnRoot.createSequentialGroup()
							.addComponent(btDelete, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
							.addGap(62)))
					.addGap(86))
				.addGroup(gl_pnRoot.createSequentialGroup()
					.addGap(274)
					.addComponent(txtFind, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(253))
		);
		gl_pnRoot.setVerticalGroup(
			gl_pnRoot.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnRoot.createSequentialGroup()
					.addGap(21)
					.addComponent(txtFind, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_pnRoot.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtmadocgia)
						.addComponent(lbmathe, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(txtmathe, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(lbmadocgia, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_pnRoot.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnRoot.createSequentialGroup()
							.addGroup(gl_pnRoot.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbngaybatdau, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtngaybatdau, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbghichu, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnRoot.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbngayketthuc, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtngayketthuc, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnRoot.createParallelGroup(Alignment.LEADING)
						.addComponent(btAdd)
						.addGroup(gl_pnRoot.createParallelGroup(Alignment.BASELINE)
							.addComponent(btInsert)
							.addComponent(btDelete)))
					.addContainerGap())
		);
		pnRoot.setLayout(gl_pnRoot);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnRoot, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	}
}