package cooperation;

public class Bus {                            // ���� Ŭ���� ���� 
	int busNumber;
	int passangerCount;
	int money;

	public Bus(int busNumber) {               // ���� ��ȣ�� �Է��ؾ� ���������� ȣ��� 
		this.busNumber = busNumber;
	}
	
	public void take(int money) {             // ���� �Է��ؾ� Ÿ�ٶ�� ������ ȣ�� (�ż���) / �°����� �þ�� ���� �پ��� 
		passangerCount ++ ;
		this.money += money;
	}
	
	public void showInfo() {                  // ������ ������ ��� 
		System.out.println(
				"���� " + busNumber + "���� �°��� " + passangerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}
	
}
