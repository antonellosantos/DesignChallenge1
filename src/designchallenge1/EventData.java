package designchallenge1;
import java.awt.color.*;
public class EventData {

	private int month,day,year;
	private String eventName;
	private String color;
	
	public EventData(int month, int day, int year) {
		
		setDate(month,day,year);
		
		eventName = "";
		color = "Green";
		
	}
	
	
	public void setDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		
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
