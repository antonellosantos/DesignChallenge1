package designchallenge1;

public class StoringEvent {
	String eventName;
	int Day;
	int Month;
	int Year;
	String Label;
	
	public StoringEvent(String eventName, int Day, int Month, int Year, String Label) {
		setDate(Day, Month, Year);
		
		this.eventName = "";
		}
	
	public void setDate(int Day, int Month, int Year) {
		this.Day = Day;
		this.Month = Month;
		this.Year = Year;
		
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}
	
}
