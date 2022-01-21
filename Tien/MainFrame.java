package Tien;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import Controller.ChuyenManHinhController;
import bean.DanhMucBean;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.*;

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
	private JPanel pnQuanLyKho;
	private JPanel pnQuanLyDocGia;
	private JPanel pnQuanLyMuonTra;
	private JPanel pnThongKe;
	private JLabel lbTrangChu;
	private JLabel lbQuanLySach;
	private JLabel lbQuanLyKho;
	private JLabel lbQuanLyDocGia;
	private JLabel lbQuanLyMuonTra;
	private JLabel lbThongKe;

	public MainFrame() {
		setTitle("Quan Ly Thu Vien");

		pnRoot = new JPanel();

		this.getContentPane().add(pnRoot);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 496);
		pnRoot.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(pnRoot);
		pnRoot.setLayout(new BorderLayout());

		pnView = new JPanel();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 496);

		pnMenu = new JPanel();
		pnMenu.setBackground(Color.DARK_GRAY);
		pnMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnView.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnRoot.add(pnView);
//				contentPane.setLayout(null);

		JButton btLohgin = new JButton("Sign In");
		pnRoot.add(pnMenu, BorderLayout.WEST);

		panel = new JPanel();
		panel.setBackground(Color.RED);

		pnTrangChu = new JPanel();
		pnTrangChu.setBackground(Color.GREEN);

		pnQuanLySach = new JPanel();
		pnQuanLySach.setBackground(Color.GREEN);

		pnQuanLyKho = new JPanel();
		pnQuanLyKho.setBackground(Color.GREEN);

		pnQuanLyDocGia = new JPanel();
		pnQuanLyDocGia.setBackground(Color.GREEN);

		pnQuanLyMuonTra = new JPanel();
		pnQuanLyMuonTra.setBackground(Color.GREEN);

		pnThongKe = new JPanel();
		pnThongKe.setBackground(Color.GREEN);

		JButton btLogout = new JButton("Logout");
		GroupLayout gl_pnMenu = new GroupLayout(pnMenu);
		gl_pnMenu.setHorizontalGroup(gl_pnMenu.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
				.addGroup(gl_pnMenu.createSequentialGroup().addContainerGap().addComponent(btLohgin)
						.addPreferredGap(ComponentPlacement.RELATED, 109, Short.MAX_VALUE).addComponent(btLogout)
						.addContainerGap())
				.addComponent(pnTrangChu, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnQuanLySach, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnQuanLyKho, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnQuanLyDocGia, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnQuanLyMuonTra, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
				.addComponent(pnThongKe, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE));
		gl_pnMenu.setVerticalGroup(gl_pnMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMenu.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnTrangChu, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnQuanLySach, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnQuanLyKho, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnQuanLyDocGia, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnQuanLyMuonTra, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnThongKe, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
						.addGroup(gl_pnMenu.createParallelGroup(Alignment.BASELINE)
								.addComponent(btLohgin, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(btLogout))
						.addContainerGap()));
		pnThongKe.setLayout(new BorderLayout(0, 0));

		lbThongKe = new JLabel("Th\u1ED1ng K\u00EA");
		lbThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		pnThongKe.add(lbThongKe);
		pnQuanLyMuonTra.setLayout(new BorderLayout(0, 0));

		lbQuanLyMuonTra = new JLabel("Qu\u1EA3n L\u00FD M\u01B0\u1EE3n Tr\u1EA3");
		lbQuanLyMuonTra.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbQuanLyMuonTra.setHorizontalAlignment(SwingConstants.CENTER);
		pnQuanLyMuonTra.add(lbQuanLyMuonTra);
		pnQuanLyDocGia.setLayout(new BorderLayout(0, 0));

		lbQuanLyDocGia = new JLabel("Qu\u1EA3n L\u00FD \u0110\u1ED9c Gi\u1EA3");
		lbQuanLyDocGia.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbQuanLyDocGia.setHorizontalAlignment(SwingConstants.CENTER);
		pnQuanLyDocGia.add(lbQuanLyDocGia);
		pnQuanLyKho.setLayout(new BorderLayout(0, 0));

		lbQuanLyKho = new JLabel("Qu\u1EA3n L\u00FD Kho");
		lbQuanLyKho.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbQuanLyKho.setHorizontalAlignment(SwingConstants.CENTER);
		pnQuanLyKho.add(lbQuanLyKho);
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
		listItem.add(new DanhMucBean("TrangChinh", pnTrangChu, lbTrangChu));
		listItem.add(new DanhMucBean("QuanLyKho", pnQuanLyKho, lbQuanLyKho));
		listItem.add(new DanhMucBean("QuanLyMuonTra", pnQuanLyMuonTra, lbQuanLyMuonTra));
		listItem.add(new DanhMucBean("QuanLySach", pnQuanLySach, lbQuanLySach));
		listItem.add(new DanhMucBean("ThongKe", pnThongKe, lbThongKe));
		listItem.add(new DanhMucBean("QuanLyDocGia", pnQuanLyDocGia, lbQuanLyDocGia));
		controller.setEvent(listItem);

	}
}
