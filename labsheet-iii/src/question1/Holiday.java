package question1;

public class Holiday {
	private String name;
	private int day;
	private String month;
	private boolean holiday;
	
	public Holiday() {
		
	}
	
	public Holiday(String name, int day, String month, boolean holiday) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.holiday = holiday;
	}

	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public String getName() {
		return this.name ;
	}
	
	public String getMonth() {
		return this.month;
	}
	
	public boolean getHoliday() {
		return this.holiday;
	}
	
	public boolean isHoliday() {
		return this.holiday;
	}
	
	
}
