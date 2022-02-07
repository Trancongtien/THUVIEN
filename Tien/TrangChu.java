package Tien;

import javax.swing.*;
import java.awt.*;
public class TrangChu extends JPanel {
	private static final long serialVersionUID = 1L;

	public TrangChu() {
		
		
		 
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lb = new JLabel("");
		lb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setIcon(new ImageIcon(TrangChu.class.getResource("/Image/main.jpg")));
		lb.setHorizontalTextPosition(JLabel.CENTER);
		lb.setVerticalTextPosition(JLabel.TOP);
		panel.add(lb);
	}

}
