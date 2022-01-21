package Tien;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class TrangChu extends JPanel {

	/**
	 * Create the panel.
	 */
	public TrangChu() {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		add(panel);

	}

}
