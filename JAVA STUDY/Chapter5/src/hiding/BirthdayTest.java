package hiding;

class Birthday {                                             // default class ���� (package �������� �۵�)
	
	private int day;                                         // private member variable ���� (class �������� �۵�)
	private int month;
	private int year;
	
	public int getMonth() {                                  // getter, setter method�� ��, ��, ���� �ʱ�ȭ�ϰ� ȣ���ϴ� �Լ� ����
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {                             // 2�� �޿��� 28�ϱ��� �����Ƿ� �̸� ��� �� ��¥ ���� ȣ��
		if ( month == 2) {
			if( day < 1 || day > 28) {
				System.out.println("��¥ �����Դϴ�.");
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
	
	public void showBirthdayInfo(){                            // ��¥ ��� �Լ� ���� 
		System.out.println(getYear() + "." + getMonth() + "." + getDay());
	}
	
}

public class BirthdayTest{
	
	public static void main(String[] args) {                   // ��¥�� �ʱ�ȭ�Ͽ� ��� 
		
		Birthday bDay = new Birthday();
		bDay.setMonth(2);
		bDay.setYear(2018);
		bDay.setDay(25);
		
		bDay.showBirthdayInfo();
		}
	}
	
}
