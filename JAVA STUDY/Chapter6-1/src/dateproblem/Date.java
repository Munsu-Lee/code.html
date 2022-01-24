package dateproblem;

public class Date {
	String specialdate;
	int year;
	int month;
	int day;
	
	public Date(String specialdate) {
		this.specialdate = specialdate;
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void show() {
		System.out.println(specialdate);
	}
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

}
