package Tien;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class TrangChu extends JPanel {
	private static final long serialVersionUID = 1L;
	public TrangChu() {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		add(panel);

	}

}
