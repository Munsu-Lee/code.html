package cooperation;

public class Subway {                             // 지하철 클래스 생성
	int lineNumber;
	int passangerCount;
	int money;

public Subway(int lineNumber) {                   // 지하철 호선 번호를 입력해야만 생성자 호출 
	this.lineNumber = lineNumber;
}

	public void take(int money) {                 // 타다라는 행위 호출(매서드) / 승객수는 늘고 돈은 줄어든다.
		passangerCount++;
		this.money += money;
	}

	public void showInfo() {                      // 지하철의 정보를 출력 
		System.out.println("지하철 " + lineNumber + "호선의 승객은 " + passangerCount + "명이고, 수입은 " + money + "입니다.");
	}

}
