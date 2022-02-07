package Tien;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import bean.DanhMucBean;
import view.DangNhapDia;
import view.DieuKhoan;

import java.util.*;
import Controller.ChuyenManHinhController;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btAbout;
	private javax.swing.JButton btLogout;
	private javax.swing.JLabel lbMain;
	private javax.swing.JLabel lbTrangChu;
	private javax.swing.JLabel lbQuanLyThe;
	private javax.swing.JLabel lbQuanLyDocGia;
	private javax.swing.JLabel lbQuanLyMuon;
	private javax.swing.JLabel lbQuanLyTra;
	private javax.swing.JLabel lbQuanlySach;
	private javax.swing.JLabel lbThuThu;
	private javax.swing.JPanel pnMain;
	private javax.swing.JPanel pnMenu;
	private javax.swing.JPanel pnQuanLyDocGia;
	private javax.swing.JPanel pnQuanLyMuon;
	private javax.swing.JPanel pnQuanLySach;
	private javax.swing.JPanel pnQuanLyThe;
	private javax.swing.JPanel pnQuanLyThuThu;
	private javax.swing.JPanel pnQuanLyTra;
	private javax.swing.JPanel pnRoot;
	private javax.swing.JPanel pnTrangChu;
	private javax.swing.JPanel pnView;
	private JPanel pnThongKe;
	private JLabel lbThongKe;

	public MainFrame() {
		setTitle("Quan Ly Thu Vien");

		pnRoot = new javax.swing.JPanel();
		pnMenu = new javax.swing.JPanel();
		pnMain = new javax.swing.JPanel();
		pnMain.setBackground(Color.RED);
		lbMain = new javax.swing.JLabel();
		lbMain.setIcon(new ImageIcon(MainFrame.class.getResource("/Image/icons8_business_network_40px.png")));
		lbMain.setBackground(Color.WHITE);
		pnTrangChu = new javax.swing.JPanel();
		pnTrangChu.setBackground(Color.GREEN);
		lbTrangChu = new javax.swing.JLabel();
		pnQuanLyThe = new javax.swing.JPanel();
		pnQuanLyThe.setBackground(Color.GREEN);
		lbQuanLyThe = new javax.swing.JLabel();
		lbQuanLyThe.setText("QUẢN LÝ THẺ");
		pnQuanLyDocGia = new javax.swing.JPanel();
		pnQuanLyDocGia.setBackground(Color.GREEN);
		lbQuanLyDocGia = new javax.swing.JLabel();
		pnQuanLyMuon = new javax.swing.JPanel();
		pnQuanLyMuon.setBackground(Color.GREEN);
		lbQuanLyMuon = new javax.swing.JLabel();
		pnQuanLyTra = new javax.swing.JPanel();
		pnQuanLyTra.setBackground(Color.GREEN);
		lbQuanLyTra = new javax.swing.JLabel();
		pnQuanLySach = new javax.swing.JPanel();
		pnQuanLySach.setBackground(Color.GREEN);
		lbQuanlySach = new javax.swing.JLabel();
		pnQuanLyThuThu = new javax.swing.JPanel();
		pnQuanLyThuThu.setBackground(Color.GREEN);
		lbThuThu = new javax.swing.JLabel();
		btLogout = new javax.swing.JButton();
		btLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				DangNhapDia dialog= new DangNhapDia(null, true);
				dialog.setTitle("Đăng Nhập Hệ Thống");
				dialog.setResizable(false);
				dialog.setLocationRelativeTo(null);
				dialog.setVisible(true);
			}
		});
		btAbout = new javax.swing.JButton();
		btAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DieuKhoan dk= new DieuKhoan(null,true);
				dk.setTitle("Điều khoản người dùng");
				dk.setResizable(false);
				dk.setLocationRelativeTo(null);
				dk.setVisible(true);
			}
		});
		pnView = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		pnMenu.setBackground(new java.awt.Color(0, 51, 51));
		pnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		lbMain.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		lbMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lbMain.setText("QUẢN LÝ THƯ VIỆN");

		javax.swing.GroupLayout gl_pnMain = new javax.swing.GroupLayout(pnMain);
		pnMain.setLayout(gl_pnMain);
		gl_pnMain.setHorizontalGroup(
				gl_pnMain.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lbMain,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		gl_pnMain.setVerticalGroup(gl_pnMain.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(lbMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						60, Short.MAX_VALUE));

		lbTrangChu.setFont(new Font("Times New Roman", Font.BOLD, 16)); // NOI18N
		lbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lbTrangChu.setText("TRANG CHỦ");

		javax.swing.GroupLayout pnTrangChuLayout = new javax.swing.GroupLayout(pnTrangChu);
		pnTrangChu.setLayout(pnTrangChuLayout);
		pnTrangChuLayout.setHorizontalGroup(
				pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lbTrangChu,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pnTrangChuLayout
				.setVerticalGroup(pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

		lbQuanLyThe.setFont(new Font("Times New Roman", Font.BOLD, 16)); // NOI18N
		lbQuanLyThe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		javax.swing.GroupLayout pnQuanLyTheLayout = new javax.swing.GroupLayout(pnQuanLyThe);
		pnQuanLyThe.setLayout(pnQuanLyTheLayout);
		pnQuanLyTheLayout.setHorizontalGroup(pnQuanLyTheLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lbQuanLyThe,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pnQuanLyTheLayout
				.setVerticalGroup(pnQuanLyTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lbQuanLyThe, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

		lbQuanLyDocGia.setFont(new Font("Times New Roman", Font.BOLD, 16)); // NOI18N
		lbQuanLyDocGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lbQuanLyDocGia.setText("ĐỘC GIẢ");

		javax.swing.GroupLayout pnQuanLyDocGiaLayout = new javax.swing.GroupLayout(pnQuanLyDocGia);
		pnQuanLyDocGia.setLayout(pnQuanLyDocGiaLayout);
		pnQuanLyDocGiaLayout.setHorizontalGroup(pnQuanLyDocGiaLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lbQuanLyDocGia,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pnQuanLyDocGiaLayout
				.setVerticalGroup(pnQuanLyDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lbQuanLyDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

		lbQuanLyMuon.setFont(new Font("Times New Roman", Font.BOLD, 16)); // NOI18N
		lbQuanLyMuon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lbQuanLyMuon.setText("QUẢN LÝ MƯỢN");

		javax.swing.GroupLayout pnQuanLyMuonLayout = new javax.swing.GroupLayout(pnQuanLyMuon);
		pnQuanLyMuon.setLayout(pnQuanLyMuonLayout);
		pnQuanLyMuonLayout.setHorizontalGroup(pnQuanLyMuonLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lbQuanLyMuon,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pnQuanLyMuonLayout
				.setVerticalGroup(pnQuanLyMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lbQuanLyMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

		lbQuanLyTra.setFont(new Font("Times New Roman", Font.BOLD, 16)); // NOI18N
		lbQuanLyTra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lbQuanLyTra.setText("QUẢN LÝ TRẢ");

		javax.swing.GroupLayout pnQuanLyTraLayout = new javax.swing.GroupLayout(pnQuanLyTra);
		pnQuanLyTra.setLayout(pnQuanLyTraLayout);
		pnQuanLyTraLayout.setHorizontalGroup(pnQuanLyTraLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lbQuanLyTra,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pnQuanLyTraLayout
				.setVerticalGroup(pnQuanLyTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lbQuanLyTra, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE));

		lbQuanlySach.setFont(new Font("Times New Roman", Font.BOLD, 16)); // NOI18N
		lbQuanlySach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lbQuanlySach.setText("QUẢN LÝ SÁCH");

		javax.swing.GroupLayout pnQuanLySachLayout = new javax.swing.GroupLayout(pnQuanLySach);
		pnQuanLySach.setLayout(pnQuanLySachLayout);
		pnQuanLySachLayout.setHorizontalGroup(pnQuanLySachLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lbQuanlySach,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pnQuanLySachLayout
				.setVerticalGroup(pnQuanLySachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lbQuanlySach, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

		lbThuThu.setFont(new Font("Times New Roman", Font.BOLD, 16)); // NOI18N
		lbThuThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lbThuThu.setText("THỦ THƯ");

		javax.swing.GroupLayout pnQuanLyThuThuLayout = new javax.swing.GroupLayout(pnQuanLyThuThu);
		pnQuanLyThuThu.setLayout(pnQuanLyThuThuLayout);
		pnQuanLyThuThuLayout.setHorizontalGroup(pnQuanLyThuThuLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lbThuThu,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pnQuanLyThuThuLayout
				.setVerticalGroup(pnQuanLyThuThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lbThuThu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

		btLogout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		btLogout.setText("LogOut");

		btAbout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		btAbout.setText("Điều Khoản Người Dùng");

		pnThongKe = new JPanel();
		pnThongKe.setBackground(Color.GREEN);

		javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
		pnMenuLayout.setHorizontalGroup(pnMenuLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(pnMain, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
				.addComponent(pnTrangChu, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
				.addComponent(pnQuanLyThe, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
				.addComponent(pnQuanLyDocGia, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
				.addComponent(pnQuanLyMuon, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
				.addComponent(pnQuanLyTra, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
				.addComponent(pnQuanLySach, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
				.addComponent(pnQuanLyThuThu, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
				.addGroup(pnMenuLayout.createSequentialGroup().addContainerGap()
						.addComponent(btAbout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(18).addComponent(btLogout).addContainerGap())
				.addComponent(pnThongKe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE));
		pnMenuLayout.setVerticalGroup(pnMenuLayout.createParallelGroup(Alignment.LEADING).addGroup(pnMenuLayout
				.createSequentialGroup()
				.addComponent(pnMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(pnTrangChu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(pnQuanLyThe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(pnQuanLyDocGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(pnQuanLyMuon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(pnQuanLyTra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(pnQuanLySach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(pnQuanLyThuThu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(pnThongKe, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(pnMenuLayout.createParallelGroup(Alignment.BASELINE).addComponent(btLogout)
						.addComponent(btAbout))
				.addContainerGap()));
		pnThongKe.setLayout(new BorderLayout(0, 0));

		lbThongKe = new JLabel("THỐNG KÊ");
		lbThongKe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		pnThongKe.add(lbThongKe);
		pnMenu.setLayout(pnMenuLayout);

		pnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout pnViewLayout = new javax.swing.GroupLayout(pnView);
		pnView.setLayout(pnViewLayout);
		pnViewLayout.setHorizontalGroup(pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 555, Short.MAX_VALUE));
		pnViewLayout.setVerticalGroup(pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		javax.swing.GroupLayout pnRootLayout = new javax.swing.GroupLayout(pnRoot);
		pnRoot.setLayout(pnRootLayout);
		pnRootLayout.setHorizontalGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnRootLayout.createSequentialGroup()
						.addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(0, 0, 0)));
		pnRootLayout.setVerticalGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				pnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				pnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();

		ChuyenManHinhController controller = new ChuyenManHinhController(pnView);
		controller.setView(pnTrangChu, lbTrangChu);
		List<DanhMucBean> listItem = new ArrayList<>();
		listItem.add(new DanhMucBean("TrangChu", pnTrangChu, lbTrangChu));
		listItem.add(new DanhMucBean("QuanLyThe", pnQuanLyThe, lbQuanLyThe));
		listItem.add(new DanhMucBean("QuanLyMuon", pnQuanLyMuon, lbQuanLyMuon));
		listItem.add(new DanhMucBean("QuanLySach", pnQuanLySach, lbQuanlySach));
		listItem.add(new DanhMucBean("QuanLyThuThu", pnQuanLyThuThu, lbThuThu));
		listItem.add(new DanhMucBean("ThongKe", pnThongKe, lbThongKe));
		listItem.add(new DanhMucBean("QuanLyTra", pnQuanLyTra, lbQuanLyTra));
		listItem.add(new DanhMucBean("QuanLyDocGia", pnQuanLyDocGia, lbQuanLyDocGia));
		controller.setEvent(listItem);
	}
}
