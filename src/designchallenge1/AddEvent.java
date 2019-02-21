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
import java.util.GregorianCalendar;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddEvent extends JFrame {

	private JPanel contentPane;
	private JTextField titleName;
	JComboBox dayDate, monthDate, yearDate, choosingColor;
	EventData storingEvent;
	CalendarProgram program;
	Events events;
	private JLabel lblNewLabel_1;
	private JLabel lblMonth;
	private JLabel lblYear;
	GregorianCalendar gregorianCalendar = new GregorianCalendar();   
	
	public AddEvent(Events events) {
		this.events = events;
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
		dayDate.setBounds(27, 201, 110, 33);
		panel.add(dayDate);
		for(int day=1;day<=31;day++){
	        dayDate.addItem(day);
		}
		dayDate.setSelectedItem(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));  
		
		monthDate = new JComboBox();
		monthDate.setMaximumRowCount(12);
		monthDate.setBounds(184, 201, 110, 33);
		panel.add(monthDate);
		for(int month=1;month<=12;month++){
	        monthDate.addItem(month);
		}
		monthDate.setSelectedItem(gregorianCalendar.get(GregorianCalendar.MONTH) + 1);  
		
		yearDate = new JComboBox();
		yearDate.setMaximumRowCount(12);
		yearDate.setBounds(333, 201, 110, 33);
		panel.add(yearDate);
		for(int year=1964;year<=2022;year++){
	        yearDate.addItem(year);
		}
		yearDate.setSelectedItem(gregorianCalendar.get(GregorianCalendar.YEAR));  
		
		choosingColor = new JComboBox();
		choosingColor.setMaximumRowCount(31);
		choosingColor.setBounds(27, 283, 110, 33);
		panel.add(choosingColor);
		choosingColor.addItem("Red");
		choosingColor.addItem("Green");
		choosingColor.addItem("Yellow");
		choosingColor.addItem("Blue");
		
		
		
		JButton finishButton = new JButton("Done!");
		finishButton.setBounds(371, 332, 89, 23);
		panel.add(finishButton);
		
		
		JLabel colorLabel = new JLabel("Color");
		colorLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		colorLabel.setBounds(27, 256, 46, 14);
		panel.add(colorLabel);
		
		lblNewLabel_1 = new JLabel("Day");
		lblNewLabel_1.setBounds(27, 181, 46, 14);
		panel.add(lblNewLabel_1);
		
		lblMonth = new JLabel("Month");
		lblMonth.setBounds(184, 181, 46, 14);
		panel.add(lblMonth);
		
		lblYear = new JLabel("Year");
		lblYear.setBounds(333, 181, 46, 14);
		panel.add(lblYear);
		
		finishButton.addActionListener(new doneButton());
		
		
		
	} 
	
	class doneButton implements ActionListener
	{
	public void actionPerformed (ActionEvent event)
		{
			String name = titleName.getText();
			int eventDay = Integer.parseInt(dayDate.getSelectedItem().toString());
			int eventMonth = Integer.parseInt(monthDate.getSelectedItem().toString());
			int eventYear = Integer.parseInt(yearDate.getSelectedItem().toString());
			String labelColor = choosingColor.getSelectedItem().toString();
			
			storingEvent = new EventData(name, eventMonth, eventDay, eventYear, labelColor);
			events.addEvent(storingEvent);
			events.addNotification(storingEvent);
			
			program.refreshCalendar();
			closingWindow();
		}
}
	public void closingWindow() {
		this.setVisible(false);
	}
	public void controllerProgram(CalendarProgram program){
		this.program = program;
		}
	}
		