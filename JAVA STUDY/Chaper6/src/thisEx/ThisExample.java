package thisEx;

class Birthday{                                  // Birthday 클래스 생성
	int day;
	int month;
	int year;
	
	public void setYear(int year) {              // setYear(연도 설정) 메서드 생성
		this.year = year;                        // this = class Birthday(생성자)
	}
	
	public void printThis() {                    // printThis(자신의 메모리 주소를 호출) 메서드 생성
		System.out.println(this);
	}
	
}
public class ThisExample {

	public static void main(String[] args) {
		Birthday b1 = new Birthday();            // 생성자를 호출해서 객체들을 생성
		Birthday b2 = new Birthday();
		
		System.out.println(b1);                  // 생성자를 통해 가져온 b1의 주소와 this를 통해 가져온 Birthday.b1의 주소는 같다.
		b1.printThis();

		System.out.println(b2);
		b2.printThis();
	}

}
