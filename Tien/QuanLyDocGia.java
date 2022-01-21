package Tien;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class QuanLyDocGia extends JPanel {

	/**
	 * Create the panel.
	 */
	public QuanLyDocGia() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		add(panel);

	}

}
