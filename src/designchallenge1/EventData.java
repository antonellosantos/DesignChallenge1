package designchallenge1;

import java.awt.color.*;
public class EventData {

	private int month,day,year;
	private String eventName;
	private String color;
	
	public EventData(String name, int month, int day, int year, String label) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.eventName = name;
		this.color = label;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int Day) {
		this.day = Day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int Year) {
		this.year = Year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int Month) {
		this.month = Month;
	}
	public String geteventName() {
		return eventName;
	}
	public void seteventName(String EventName) {
		this.eventName = EventName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
