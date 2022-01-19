package ifexample;

public class SwitchExample {

	public static void main(String[] args) {
			
		int month = 4;
		int day;
		
		switch(month) {
		case 1 : case 3 : case 5 :
			day = 31;
			break;
		case 2 :
			day = 28;
			break;
		case 4 : case 6 : case 9 :
			day = 30;
			break;
		default :
			day = 0;
			break;
		}
		System.out.println(month + "월의 일수는 " + day + "일 입니다.");
	}

}
