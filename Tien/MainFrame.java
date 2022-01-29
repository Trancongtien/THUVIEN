package Tien;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import Controller.ChuyenManHinhController;
import bean.DanhMucBean;
import view.DangNhapDia;

import java.awt.Color;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel pnRoot;
	private JPanel pnView;

	JScrollPane sp;
	JTable tb;

	JPanel pnMenu;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JPanel pnTrangChu;
	private JPanel pnQuanLySach;
	private JPanel pnQuanLyThe;
	private JPanel pnQuanLyDocGia;
	private JPanel pnQuanLyMuon;
	private JPanel pnQuanLyTra;
	private JLabel lbTrangChu;
	private JLabel lbQuanLySach;
	private JLabel lbQuanLyThe;
	private JLabel lbQuanLyDocGia;
	private JLabel lbQuanLyMuon;
	private JLabel lbQuanLyTra;
	private JPanel pnThuThu;
	private JLabel lbThuThu;

	public MainFrame() {
		setTitle("Quan Ly Thu Vien");

		pnRoot = new JPanel();

		this.getContentPane().add(pnRoot);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		pnRoot.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(pnRoot);
		pnRoot.setLayout(new BorderLayout());

		pnView = new JPanel();




		pnMenu = new JPanel();
		pnMenu.setBackground(Color.DARK_GRAY);
		pnMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnView.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnRoot.add(pnView);

		JButton btAbout = new JButton("Điều khoản người dùng");
		pnRoot.add(pnMenu, BorderLayout.WEST);

		panel = new JPanel();
		panel.setBackground(Color.RED);

		pnTrangChu = new JPanel();
		pnTrangChu.setBackground(Color.GREEN);

		pnQuanLySach = new JPanel();
		pnQuanLySach.setBackground(Color.GREEN);

		pnQuanLyThe = new JPanel();
		pnQuanLyThe.setBackground(Color.GREEN);

		pnQuanLyDocGia = new JPanel();
		pnQuanLyDocGia.setBackground(Color.GREEN);

		pnQuanLyMuon = new JPanel();
		pnQuanLyMuon.setBackground(Color.GREEN);

		pnQuanLyTra = new JPanel();
		pnQuanLyTra.setBackground(Color.GREEN);

		JButton btLogout = new JButton("Logout");
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
		
		pnThuThu = new JPanel();
		pnThuThu.setBackground(Color.GREEN);
		
		JPanel pnThongKe = new JPanel();
		pnThongKe.setBackground(Color.GREEN);
		GroupLayout gl_pnMenu = new GroupLayout(pnMenu);
		gl_pnMenu.setHorizontalGroup(
			gl_pnMenu.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addGroup(gl_pnMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(btAbout)
					.addPreferredGap(ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
					.addComponent(btLogout)
					.addContainerGap())
				.addComponent(pnTrangChu, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnQuanLySach, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnQuanLyThe, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnQuanLyDocGia, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnQuanLyMuon, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnQuanLyTra, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnThuThu, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnThongKe, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
		);
		gl_pnMenu.setVerticalGroup(
			gl_pnMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMenu.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnTrangChu, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnQuanLySach, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnQuanLyThe, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnQuanLyDocGia, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnQuanLyMuon, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnQuanLyTra, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnThuThu, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnThongKe, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
					.addGroup(gl_pnMenu.createParallelGroup(Alignment.BASELINE)
						.addComponent(btAbout, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(btLogout))
					.addContainerGap())
		);
		pnThongKe.setLayout(new BorderLayout(0, 0));
		
		JLabel lbThongKe = new JLabel("Th\u1ED1ng K\u00EA");
		lbThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		pnThongKe.add(lbThongKe);
		pnThuThu.setLayout(new BorderLayout(0, 0));
		
		lbThuThu = new JLabel("Qu\u1EA3n L\u00FD Th\u1EE7 Th\u01B0");
		lbThuThu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbThuThu.setHorizontalAlignment(SwingConstants.CENTER);
		pnThuThu.add(lbThuThu);
		pnQuanLyTra.setLayout(new BorderLayout(0, 0));

		lbQuanLyTra = new JLabel("Qu\u1EA3n L\u00FD Tr\u1EA3");
		lbQuanLyTra.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbQuanLyTra.setHorizontalAlignment(SwingConstants.CENTER);
		pnQuanLyTra.add(lbQuanLyTra);
		pnQuanLyMuon.setLayout(new BorderLayout(0, 0));

		lbQuanLyMuon = new JLabel("Qu\u1EA3n L\u00FD M\u01B0\u1EE3n ");
		lbQuanLyMuon.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbQuanLyMuon.setHorizontalAlignment(SwingConstants.CENTER);
		pnQuanLyMuon.add(lbQuanLyMuon);
		pnQuanLyDocGia.setLayout(new BorderLayout(0, 0));

		lbQuanLyDocGia = new JLabel("Qu\u1EA3n L\u00FD \u0110\u1ED9c Gi\u1EA3");
		lbQuanLyDocGia.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbQuanLyDocGia.setHorizontalAlignment(SwingConstants.CENTER);
		pnQuanLyDocGia.add(lbQuanLyDocGia);
		pnQuanLyThe.setLayout(new BorderLayout(0, 0));

		lbQuanLyThe = new JLabel("Qu\u1EA3n L\u00FD Th\u1EBB");
		lbQuanLyThe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbQuanLyThe.setHorizontalAlignment(SwingConstants.CENTER);
		pnQuanLyThe.add(lbQuanLyThe);
		pnQuanLySach.setLayout(new BorderLayout(0, 0));

		lbQuanLySach = new JLabel("Qu\u1EA3n L\u00FD S\u00E1ch");
		lbQuanLySach.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbQuanLySach.setBackground(Color.GREEN);
		lbQuanLySach.setHorizontalAlignment(SwingConstants.CENTER);
		pnQuanLySach.add(lbQuanLySach);
		pnTrangChu.setLayout(new BorderLayout(0, 0));

		lbTrangChu = new JLabel("Trang Ch\u1EE7");
		lbTrangChu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbTrangChu.setHorizontalAlignment(SwingConstants.CENTER);
		pnTrangChu.add(lbTrangChu);
		panel.setLayout(new BorderLayout(0, 0));

		lblNewLabel_1 = new JLabel("Qu\u1EA3n L\u00FD Th\u01B0 Vi\u1EC7n");
		lblNewLabel_1.setIcon(new ImageIcon(MainFrame.class.getResource("/Image/icons8_business_network_40px.png")));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1, BorderLayout.CENTER);
		pnMenu.setLayout(gl_pnMenu);
		ChuyenManHinhController controller = new ChuyenManHinhController(pnView);
		controller.setView(pnTrangChu, lbTrangChu);
		List<DanhMucBean> listItem = new ArrayList<>();
		listItem.add(new DanhMucBean("TrangChu", pnTrangChu, lbTrangChu));
		listItem.add(new DanhMucBean("QuanLyThe", pnQuanLyThe, lbQuanLyThe));
		listItem.add(new DanhMucBean("QuanLyMuon", pnQuanLyMuon, lbQuanLyMuon));
		listItem.add(new DanhMucBean("QuanLySach", pnQuanLySach, lbQuanLySach));
		listItem.add(new DanhMucBean("QuanLyThuThu", pnThuThu, lbThuThu));
		listItem.add(new DanhMucBean("ThongKe",pnThongKe,lbThongKe));
		listItem.add(new DanhMucBean("QuanLyTra", pnQuanLyTra, lbQuanLyTra));
		listItem.add(new DanhMucBean("QuanLyDocGia", pnQuanLyDocGia, lbQuanLyDocGia));
		controller.setEvent(listItem);

	}
}
