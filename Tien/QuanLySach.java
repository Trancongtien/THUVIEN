package Tien;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class QuanLySach extends JPanel {
	 private javax.swing.JButton btFind;
	    private javax.swing.JButton btAdd;
	    private javax.swing.JButton brInsert;
	    private javax.swing.JButton btDelete;
	    private javax.swing.JComboBox<String> cb;
	    private javax.swing.JLabel lbMaSach;
	    private javax.swing.JLabel lbMaNXB;
	    private javax.swing.JLabel lbTenSach;
	    private javax.swing.JLabel lbTomTat;
	    private javax.swing.JLabel lbSoTrang;
	    private javax.swing.JLabel lbDonGia;
	    private javax.swing.JLabel lbNamXB;
	    private javax.swing.JLabel lbTrangThai;
	    private javax.swing.JLabel lbTacGia;
	    private javax.swing.JLabel lbMaTheLoai;
	    private javax.swing.JPanel pnQuery;
	    private javax.swing.JPanel pnTable;
	    private javax.swing.JTextField txtTacGia;
	    private javax.swing.JTextField txtMaTheLoai;
	    private javax.swing.JTextField txtMaNXB;
	    private javax.swing.JTextField txtFind;
	    private javax.swing.JTextField txtMaSach;
	    private javax.swing.JTextField txtTenSach;
	    private javax.swing.JTextField txtTomTat;
	    private javax.swing.JTextField txtSoTrang;
	    private javax.swing.JTextField txtDonGia;
	    private javax.swing.JTextField txtNamXB;
	    private javax.swing.JTextField txtTrangThai;
	public QuanLySach() {

        pnTable = new javax.swing.JPanel();
        pnTable.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnQuery = new javax.swing.JPanel();
        btFind = new javax.swing.JButton();
        txtFind = new javax.swing.JTextField();
        cb = new javax.swing.JComboBox<>();
        lbMaSach = new javax.swing.JLabel();
        lbTenSach = new javax.swing.JLabel();
        lbTomTat = new javax.swing.JLabel();
        lbSoTrang = new javax.swing.JLabel();
        lbDonGia = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtTomTat = new javax.swing.JTextField();
        txtSoTrang = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        lbNamXB = new javax.swing.JLabel();
        lbTrangThai = new javax.swing.JLabel();
        lbTacGia = new javax.swing.JLabel();
        lbMaTheLoai = new javax.swing.JLabel();
        lbMaNXB = new javax.swing.JLabel();
        txtNamXB = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        txtTacGia = new javax.swing.JTextField();
        txtMaTheLoai = new javax.swing.JTextField();
        txtMaNXB = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        brInsert = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();

        javax.swing.GroupLayout gl_pnTable = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(gl_pnTable);
        gl_pnTable.setHorizontalGroup(
            gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gl_pnTable.setVerticalGroup(
            gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        btFind.setText("Tìm Kiếm");

        txtFind.setText("");

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbMaSach.setText("Mã Sách :");

        lbTenSach.setText("Tên Sách :");

        lbTomTat.setText("Tóm Tắt :");

        lbSoTrang.setText("Số Trang :");

        lbDonGia.setText("Đơn Giá :");

        txtMaSach.setText("");

        txtTenSach.setText("");

        txtTomTat.setText("");

        txtSoTrang.setText("");

        txtDonGia.setText("");

        lbNamXB.setText("Năm Xuất Bản :");

        lbTrangThai.setText("Trạng Thái :");

        lbTacGia.setText("Tác Giả :");

        lbMaTheLoai.setText("Mã Thể Loại :");

        lbMaNXB.setText("Mã Nhà Xuất Bản :");

        txtNamXB.setText("");

        txtTrangThai.setText("");

        txtTacGia.setText("");

        txtMaTheLoai.setText("");

        txtMaNXB.setText("");

        btAdd.setText("Thêm");

        brInsert.setText("Sửa");

        btDelete.setText("Xóa");

        javax.swing.GroupLayout gl_pnQuery = new javax.swing.GroupLayout(pnQuery);
        gl_pnQuery.setHorizontalGroup(
        	gl_pnQuery.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnQuery.createSequentialGroup()
        			.addGap(39)
        			.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_pnQuery.createSequentialGroup()
        					.addGap(121)
        					.addComponent(btFind, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        					.addGap(65)
        					.addComponent(txtFind, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        					.addGap(71)
        					.addComponent(cb, 0, 125, Short.MAX_VALUE))
        				.addGroup(gl_pnQuery.createSequentialGroup()
        					.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lbMaSach, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        						.addComponent(lbTenSach, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lbTomTat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lbSoTrang, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lbDonGia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtMaSach, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        						.addComponent(txtTenSach)
        						.addComponent(txtTomTat)
        						.addComponent(txtSoTrang)
        						.addComponent(txtDonGia))
        					.addGap(30)
        					.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lbNamXB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lbTrangThai, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lbTacGia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lbMaTheLoai, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lbMaNXB, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtNamXB)
        						.addComponent(txtTrangThai)
        						.addComponent(txtTacGia, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        						.addComponent(txtMaTheLoai)
        						.addComponent(txtMaNXB))))
        			.addGap(27)
        			.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
        				.addComponent(btAdd, Alignment.TRAILING)
        				.addComponent(brInsert, Alignment.TRAILING)
        				.addComponent(btDelete, Alignment.TRAILING))
        			.addGap(24))
        );
        gl_pnQuery.setVerticalGroup(
        	gl_pnQuery.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnQuery.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btFind)
        				.addComponent(txtFind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_pnQuery.createSequentialGroup()
        					.addGap(18)
        					.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE, false)
        						.addComponent(lbMaSach)
        						.addComponent(txtMaSach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbNamXB)
        						.addComponent(txtNamXB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
        						.addGroup(gl_pnQuery.createSequentialGroup()
        							.addGap(6)
        							.addComponent(lbTenSach, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        						.addComponent(txtTenSach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbTrangThai)
        						.addComponent(txtTrangThai)))
        				.addGroup(gl_pnQuery.createSequentialGroup()
        					.addGap(35)
        					.addComponent(btAdd)))
        			.addGap(18)
        			.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbTomTat)
        				.addComponent(txtTomTat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbTacGia)
        				.addGroup(gl_pnQuery.createSequentialGroup()
        					.addGap(2)
        					.addComponent(txtTacGia))
        				.addComponent(brInsert))
        			.addGap(18)
        			.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbSoTrang)
        				.addComponent(txtSoTrang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbMaTheLoai)
        				.addComponent(txtMaTheLoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbDonGia)
        				.addComponent(txtDonGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbMaNXB)
        				.addGroup(gl_pnQuery.createSequentialGroup()
        					.addGap(2)
        					.addComponent(txtMaNXB))
        				.addComponent(btDelete))
        			.addGap(49))
        );
        pnQuery.setLayout(gl_pnQuery);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
	}