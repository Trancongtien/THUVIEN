package Tien;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;


import Controller.QuanLyThongKeController;

import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class ThongKe extends JPanel {
	private static final long serialVersionUID = 1L;
private 	QuanLyThongKeController controller;
	public ThongKe() {
		setLayout(new BorderLayout());
		
		JPanel pnView = new JPanel();
		pnView.setBorder(new LineBorder(new Color(0, 0, 0)));
		JPanel pnQuery = new JPanel();
		
		JLabel lblNewLabel = new JLabel("Chọn dữ liệu để thống kê");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnNewButton = new JButton("Xác nhận");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(pnView);
		add(pnQuery,BorderLayout.NORTH);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Sách", "Mượn", "Trả"}));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==0) {
					controller= new QuanLyThongKeController();
					controller.setDateToChart2(pnView);
				}else if(comboBox.getSelectedIndex()==1) {
					controller= new QuanLyThongKeController();
					controller.setDateToChart1(pnView);
				}else if(comboBox.getSelectedIndex()==2) {
					controller= new QuanLyThongKeController();
					controller.setDateToChart3(pnView);
				}
			}
		});
		GroupLayout gl_pnQuery = new GroupLayout(pnQuery);
		gl_pnQuery.setHorizontalGroup(
			gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(comboBox, 0, 177, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
					.addGap(0))
		);
		gl_pnQuery.setVerticalGroup(
			gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		pnQuery.setLayout(gl_pnQuery);
   
		
		
		
		
	}
}

