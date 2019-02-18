package designchallenge1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import designchallenge1.CalendarProgram.btnPrev_Action;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddEvent extends JFrame {

	private JPanel contentPane;
	private JTextField titleName;
	JComboBox dayDate, monthDate, yearDate, labelColor;
	
	public AddEvent() {
		setTitle("Event Adder");
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
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(174, 11, 120, 50);
		panel.add(lblNewLabel);
		
		JLabel titleLabel = new JLabel("Title");
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		titleLabel.setBounds(27, 61, 46, 14);
		panel.add(titleLabel);
		
		titleName = new JTextField();
		titleName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		titleName.setBounds(27, 86, 416, 50);
		panel.add(titleName);
		titleName.setColumns(10);
		
		JLabel Date = new JLabel("Date");
		Date.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Date.setBounds(27, 156, 46, 14);
		panel.add(Date);
		
		 dayDate = new JComboBox();
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
		for(int year=1964;year<=2022;year++){
	        yearDate.addItem(year);
		}
		
		JLabel labelColor = new JLabel("Label");
		labelColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelColor.setBounds(27, 237, 46, 14);
		panel.add(labelColor);
		
		JComboBox choosingColor = new JComboBox();
		choosingColor.setMaximumRowCount(31);
		choosingColor.setBounds(27, 262, 110, 33);
		panel.add(choosingColor);
		choosingColor.addItem("Red");
		choosingColor.addItem("Green");
		choosingColor.addItem("Yellow");
		choosingColor.addItem("Blue");
		
		
		
		JButton finishButton = new JButton("Done!");
		finishButton.setBounds(371, 332, 89, 23);
		panel.add(finishButton);
		
		finishButton.addActionListener(new doneButton());
		
	} 
	
	class doneButton implements ActionListener
	{
	public void actionPerformed (ActionEvent event)
		{
//			storingEvent se = new storingEvent();
//			se.setEventName(titleName.getText());
			String name = titleName.getText();
			int eventDay = Integer.parseInt(dayDate.getSelectedItem().toString());
			int eventMonth = Integer.parseInt(monthDate.getSelectedItem().toString());
			int eventYear = Integer.parseInt(yearDate.getSelectedItem().toString());
			String eventColor = labelColor.getSelectedItem().toString();
			
		}
}

	}
		