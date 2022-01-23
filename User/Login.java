package User;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	private JPanel pnRoot;
	private JPanel pnView;

	JScrollPane sp;
	JTable tb;

	JPanel pnMenu;
	private JPanel panel;
	private JLabel lbTitle;
	private JTextField txtuser;
	private JPasswordField txtpass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {

		setTitle("LOG IN");

		pnRoot = new JPanel();
		this.setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnRoot.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(pnRoot);
		pnRoot.setLayout(new BorderLayout());

		pnView = new JPanel();
		pnView.setBackground(Color.GREEN);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 496);

		pnMenu = new JPanel();
		pnMenu.setBackground(new Color(204, 0, 204));
		pnMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnView.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnRoot.add(pnView);

		JLabel lbuser = new JLabel("Username : ");
		lbuser.setIcon(new ImageIcon(Login.class.getResource("/Image/icons8_male_user_24px.png")));
		lbuser.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lbpass = new JLabel("Password : ");
		lbpass.setIcon(new ImageIcon(Login.class.getResource("/Image/icons8_password_1_24px.png")));
		lbpass.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton btLogin = new JButton("Login");
		btLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton btCancel = new JButton("Cancel");
		btCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));

		txtuser = new JTextField();
		txtuser.setColumns(10);

		txtpass = new JPasswordField();
		
		JButton btExit = new JButton("");
		btExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btExit.setForeground(Color.WHITE);
		btExit.setBackground(Color.GREEN);
		btExit.setIcon(new ImageIcon(Login.class.getResource("/Image/icons8_Close_20px.png")));
		GroupLayout gl_pnView = new GroupLayout(pnView);
		gl_pnView.setHorizontalGroup(
			gl_pnView.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnView.createSequentialGroup()
					.addGap(110)
					.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnView.createSequentialGroup()
							.addComponent(btLogin)
							.addPreferredGap(ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
							.addComponent(btCancel)
							.addGap(55))
						.addGroup(gl_pnView.createSequentialGroup()
							.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
								.addComponent(lbpass, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
								.addComponent(lbuser, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
							.addGap(28)
							.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtpass)
								.addComponent(txtuser, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
							.addContainerGap())))
				.addGroup(gl_pnView.createSequentialGroup()
					.addContainerGap(421, Short.MAX_VALUE)
					.addComponent(btExit, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
		);
		gl_pnView.setVerticalGroup(
			gl_pnView.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnView.createSequentialGroup()
					.addComponent(btExit)
					.addGap(137)
					.addGroup(gl_pnView.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbuser, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtuser, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(77)
					.addGroup(gl_pnView.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbpass, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpass, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(61)
					.addGroup(gl_pnView.createParallelGroup(Alignment.BASELINE)
						.addComponent(btLogin)
						.addComponent(btCancel))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		pnView.setLayout(gl_pnView);
		pnRoot.add(pnMenu, BorderLayout.WEST);

		panel = new JPanel();
		panel.setBackground(new Color(204, 0, 204));
		GroupLayout gl_pnMenu = new GroupLayout(pnMenu);
		gl_pnMenu.setHorizontalGroup(gl_pnMenu.createParallelGroup(Alignment.LEADING).addComponent(panel,
				GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE));
		gl_pnMenu.setVerticalGroup(gl_pnMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMenu.createSequentialGroup().addGap(84)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(97, Short.MAX_VALUE)));
		panel.setLayout(new BorderLayout(0, 0));

		lbTitle = new JLabel("Quan Ly Thu Vien");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setHorizontalTextPosition(JLabel.CENTER);
		lbTitle.setVerticalTextPosition(JLabel.BOTTOM);
		lbTitle.setIcon(new ImageIcon(Login.class.getResource("/Image/icons8_library_building_100px.png")));
		panel.add(lbTitle, BorderLayout.CENTER);

		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 24));
		pnMenu.setLayout(gl_pnMenu);
	}
}
