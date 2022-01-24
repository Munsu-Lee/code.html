package dateproblem;

public class DateTest {

	public static void main(String[] args) {
		Date independenceday = new Date("1945/8/15");
		Date virth = new Date(2014, 3, 20);
		
		independenceday.show();
		System.out.println(virth.getYear() + "." + virth.getMonth() + "." + virth.getDay());
	}

}
