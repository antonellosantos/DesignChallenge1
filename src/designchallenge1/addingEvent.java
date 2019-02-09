package designchallenge1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class addingEvent extends JFrame {

	private JPanel contentPane;
	private JTextField titleName;
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
		
		titleName = new JTextField();
		titleName.setBounds(27, 86, 416, 50);
		panel.add(titleName);
		titleName.setColumns(10);
		
		JLabel Date = new JLabel("Date");
		Date.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Date.setBounds(27, 156, 46, 14);
		panel.add(Date);
		
		JComboBox dayDate = new JComboBox();
		dayDate.setMaximumRowCount(31);
		dayDate.setBounds(27, 181, 110, 33);
		panel.add(dayDate);
		for(int day=1;day<=31;day++){
	        dayDate.addItem(day);
		}
		
		JComboBox monthDate = new JComboBox();
		monthDate.setMaximumRowCount(12);
		monthDate.setBounds(184, 181, 110, 33);
		panel.add(monthDate);
		for(int month=1;month<=12;month++){
	        monthDate.addItem(month);
		}
		
		JComboBox yearDate = new JComboBox();
		yearDate.setMaximumRowCount(12);
		yearDate.setBounds(333, 181, 110, 33);
		panel.add(yearDate);
		for(int year=1964;year<=2020;year++){
	        yearDate.addItem(year);
		}
	}
}
