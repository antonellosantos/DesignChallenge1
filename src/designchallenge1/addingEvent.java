package designchallenge1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class addingEvent extends JFrame {

	private JPanel contentPane;
	public addingEvent() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 496, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add An Event!");
		lblNewLabel.setBounds(196, 11, 87, 14);
		panel.add(lblNewLabel);
		
		JLabel titleLabel = new JLabel("Title");
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		titleLabel.setBounds(27, 61, 46, 14);
		panel.add(titleLabel);
	}
}
