package cooperation;

public class Student {                                 
	String studentName;
	int grage;
	int money;

	public Student(String studentName, int money) {    // 생성자 오버라이딩 / 학생 이름과 돈을 입력해야 형식이 완성됨  
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);                                // 버스 클래스의 매서드를 호출해서 스튜던트 클래스에 사용 (객체간의 협력)
		money -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);                             // 지하철 클래스의 매서드를 호출해서 스튜던트 클래스에 사용 (객체간의 협력)
		money -= 1500;
	}

	public void showInfo() {                           // 학생 정보 출력 메서드 
		System.out.println(studentName + "님의 남은 금액은 " + money + "입니다.");
	}
}
