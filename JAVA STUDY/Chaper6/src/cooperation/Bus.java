package cooperation;

public class Bus {                            // 버스 클래스 생성 
	int busNumber;
	int passangerCount;
	int money;

	public Bus(int busNumber) {               // 버스 번호를 입력해야 버스생성자 호출됨 
		this.busNumber = busNumber;
	}
	
	public void take(int money) {             // 돈을 입력해야 타다라는 행위가 호출 (매서드) / 승객수는 늘어나고 돈은 줄어든다 
		passangerCount ++ ;
		this.money += money;
	}
	
	public void showInfo() {                  // 버스의 정보가 출력 
		System.out.println(
				"버스 " + busNumber + "번의 승객은 " + passangerCount + "명이고, 수입은 " + money + "입니다.");
	}
	
}
