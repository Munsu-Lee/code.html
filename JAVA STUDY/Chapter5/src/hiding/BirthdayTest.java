package hiding;

class Birthday {                                             // default class 생성 (package 내에서만 작동)
	
	private int day;                                         // private member variable 생성 (class 내에서만 작동)
	private int month;
	private int year;
	
	public int getMonth() {                                  // getter, setter method로 연, 월, 일을 초기화하고 호출하는 함수 생성
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {                             // 2월 달에는 28일까지 있으므로 이를 벗어날 시 날짜 오류 호출
		if ( month == 2) {
			if( day < 1 || day > 28) {
				System.out.println("날짜 오류입니다.");
			}
			else { 
				this.day = day;
			}
		}
		else {
			this.day = day;	
		}
		
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showBirthdayInfo(){                            // 날짜 출력 함수 생성 
		System.out.println(getYear() + "." + getMonth() + "." + getDay());
	}
	
}

public class BirthdayTest{
	
	public static void main(String[] args) {                   // 날짜를 초기화하여 출력 
		
		Birthday bDay = new Birthday();
		bDay.setMonth(2);
		bDay.setYear(2018);
		bDay.setDay(25);
		
		bDay.showBirthdayInfo();
		}
	}
	
}
