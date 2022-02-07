package Tien;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Controller.QuanLyTraController;

import java.awt.Font;
import com.toedter.calendar.JDateChooser;

public class QuanLyTra extends JPanel {

	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btAdd;
	private javax.swing.JButton btInsert;
	private javax.swing.JButton btDelete;
	private javax.swing.JLabel lbMaThe;
	private javax.swing.JLabel lbSoSachTra;
	private javax.swing.JLabel lbNgayTra;
	private javax.swing.JLabel lbMaThuThu;
	private javax.swing.JLabel lbMaSach;
	private javax.swing.JPanel pnTable;
	private javax.swing.JPanel pnQuery;
	private javax.swing.JTextField txtFind;
	private javax.swing.JTextField txtMaThe;
	private javax.swing.JTextField txtSoSachTra;
	private javax.swing.JTextField txtMaThuThu;
	private javax.swing.JTextField txtMaSach;
	private JLabel lblNewLabel;

	public QuanLyTra() {
		pnTable = new javax.swing.JPanel();
		pnTable.setBackground(UIManager.getColor("Button.background"));
		pnQuery = new javax.swing.JPanel();
		pnQuery.setBackground(UIManager.getColor("Button.shadow"));
		txtFind = new javax.swing.JTextField();
		txtFind.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbMaThe = new javax.swing.JLabel();
		lbMaThe.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbSoSachTra = new javax.swing.JLabel();
		lbSoSachTra.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbNgayTra = new javax.swing.JLabel();
		lbNgayTra.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtMaThe = new javax.swing.JTextField();
		txtMaThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtSoSachTra = new javax.swing.JTextField();
		txtSoSachTra.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbMaThuThu = new javax.swing.JLabel();
		lbMaThuThu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbMaSach = new javax.swing.JLabel();
		lbMaSach.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtMaThuThu = new javax.swing.JTextField();
		txtMaThuThu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtMaSach = new javax.swing.JTextField();
		txtMaSach.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btAdd = new javax.swing.JButton();
		btAdd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btInsert = new javax.swing.JButton();
		btInsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btDelete = new javax.swing.JButton();
		btDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));

		pnTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout gl_pnTable = new javax.swing.GroupLayout(pnTable);
		pnTable.setLayout(gl_pnTable);
		gl_pnTable.setHorizontalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 734, Short.MAX_VALUE));
		gl_pnTable.setVerticalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
				298, Short.MAX_VALUE));

		txtFind.setText("");

		lbMaThe.setText("Mã Thẻ :");

		lbSoSachTra.setText("Số Sách Trả : ");

		lbNgayTra.setText("Ngày Trả :");

		txtMaThe.setText("");

		txtSoSachTra.setText("");

		lbMaSach.setText("Mã Sách: ");

		lbMaThuThu.setText("Mã Thủ Thư :");

		txtMaSach.setText("");

		txtMaThuThu.setText("");

		btAdd.setText("Thêm");

		btInsert.setText("Sửa");

		btDelete.setText("Xóa");

		lblNewLabel = new JLabel("Nhập kí tự mà bạn muốn tìm :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));

		JDateChooser txtNgayTra = new com.toedter.calendar.JDateChooser();
		txtNgayTra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		txtNgayTra.setDateFormatString("dd/MM/yyyy");

		javax.swing.GroupLayout gl_pnQuery = new javax.swing.GroupLayout(pnQuery);
		gl_pnQuery.setHorizontalGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING).addGroup(gl_pnQuery
				.createSequentialGroup().addGap(0)
				.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnQuery.createSequentialGroup().addGap(58)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE).addGap(44)
								.addComponent(txtFind, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE).addGap(217))
						.addGroup(gl_pnQuery.createSequentialGroup().addGroup(gl_pnQuery
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnQuery.createSequentialGroup().addGap(58)
										.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
												.addComponent(lbMaThe, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
												.addComponent(lbSoSachTra, GroupLayout.DEFAULT_SIZE, 126,
														Short.MAX_VALUE)
												.addComponent(lbNgayTra, GroupLayout.DEFAULT_SIZE, 126,
														Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
												.addComponent(txtNgayTra, GroupLayout.DEFAULT_SIZE, 152,
														Short.MAX_VALUE)
												.addComponent(txtMaThe, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														152, Short.MAX_VALUE)
												.addComponent(txtSoSachTra, GroupLayout.DEFAULT_SIZE, 152,
														Short.MAX_VALUE))
										.addGap(26)
										.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
												.addComponent(lbMaThuThu, GroupLayout.DEFAULT_SIZE, 144,
														Short.MAX_VALUE)
												.addComponent(lbMaSach, GroupLayout.DEFAULT_SIZE, 144,
														Short.MAX_VALUE)))
								.addGroup(gl_pnQuery.createSequentialGroup().addGap(113)
										.addComponent(btAdd, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE).addGap(123)
										.addComponent(btInsert, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
										.addGap(125)))
								.addPreferredGap(ComponentPlacement.UNRELATED).addGroup(
										gl_pnQuery.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnQuery.createSequentialGroup()
														.addComponent(btDelete, GroupLayout.DEFAULT_SIZE, 83,
																Short.MAX_VALUE)
														.addGap(77))
												.addComponent(txtMaThuThu, GroupLayout.DEFAULT_SIZE, 160,
														Short.MAX_VALUE)
												.addComponent(txtMaSach, GroupLayout.DEFAULT_SIZE, 160,
														Short.MAX_VALUE))))
				.addGap(29)));
		gl_pnQuery.setVerticalGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtFind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
						.addGap(18)
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_pnQuery.createSequentialGroup().addGap(6).addComponent(lbMaThe,
										GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(txtMaThe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lbMaThuThu).addComponent(txtMaThuThu, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_pnQuery.createSequentialGroup().addGap(6).addComponent(lbSoSachTra,
										GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(txtSoSachTra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lbMaSach).addComponent(txtMaSach, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnQuery.createSequentialGroup()
										.addComponent(lbNgayTra, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(55))
								.addGroup(gl_pnQuery.createSequentialGroup()
										.addComponent(txtNgayTra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE).addComponent(btAdd)
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
		QuanLyTraController controller = new QuanLyTraController(pnTable, txtFind, txtSoSachTra, txtMaThe, txtMaThuThu,
				txtMaSach, btAdd, btDelete, btInsert, txtNgayTra);
		controller.setDateToTable();
	}
}
