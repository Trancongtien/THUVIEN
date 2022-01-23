package Controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.*;

import Tien.*;
import bean.DanhMucBean;

public class ChuyenManHinhController extends JFrame {
	private JPanel root;
	private String kindSelected = "";
	private List<DanhMucBean> listItem= null;

	public ChuyenManHinhController(JPanel jpnRoot) {
		this.root = jpnRoot;
	}

	public void setView(JPanel jpnItem, JLabel jlbItem) {
		kindSelected = "TrangChu";
		jpnItem.setBackground(new Color(96, 100, 191));
		jlbItem.setBackground(new Color(96, 100, 191));

		root.removeAll();
		root.setLayout(new BorderLayout());
		root.add(new TrangChu());
		root.validate();
		root.repaint();
	}

	public void setEvent(List<DanhMucBean> listDanhMuc) {
		this.listItem = listDanhMuc;
		for (DanhMucBean item : listDanhMuc) {
			item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
		}
	}

	class LabelEvent implements MouseListener {
		private JPanel node;
		private String kind;
		
		private JPanel jpnItem;
		private JLabel jlbItem;

		public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
			this.kind = kind;
			this.jpnItem = jpnItem;
			this.jlbItem = jlbItem;
		}

		@Override
		public void mouseClicked(MouseEvent e) {

			switch (kind) {
			case "TrangChinh":
				node = new TrangChu();
				break;
			case "QuanLyDocGia":
				node = new QuanLyDocGia();
				break;
			case "QuanLySach":
				node = new QuanLySach();
				break;
			case "QuanLyMuon":
				node = new QuanLyMuon();
				break;
			case"ThongKe":
				node= new ThongKe();
				break;
			case"QuanLyKho":
				node= new QuanLyKho();
				break;
			case"QuanLyTra":
				node= new QuanLyTra();
				break;
			default:
				break;
			}
			root.removeAll();
			root.setLayout(new BorderLayout());
			root.add(node);
			root.validate();
			root.repaint();
			setChangeBackground(kind);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			kindSelected = kind;
			jpnItem.setBackground(new Color(96, 100, 191));
			jlbItem.setBackground(new Color(96, 100, 191));

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			jpnItem.setBackground(new Color(96, 100, 191));
			jlbItem.setBackground(new Color(96, 100, 191));

		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!kindSelected.equalsIgnoreCase(kind)) {
				jpnItem.setBackground(new Color(0, 250,0));
				jlbItem.setBackground(new Color(0, 250, 0));
			}

		}
	}

	private void setChangeBackground(String kind) {
	
		for (DanhMucBean item : listItem) {
			if (item.getKind().equalsIgnoreCase(kind)) {
				item.getJpn().setBackground(new Color(96, 100, 191));
				item.getJlb().setBackground(new Color(96, 100, 191));
				
			} else {
				item.getJpn().setBackground(new Color(0, 250, 0));
				item.getJlb().setBackground(new Color(0, 250, 0));
			}
		}
	}
}
