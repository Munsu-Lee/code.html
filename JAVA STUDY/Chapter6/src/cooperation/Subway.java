package cooperation;

public class Subway {                             // ����ö Ŭ���� ����
	int lineNumber;
	int passangerCount;
	int money;

public Subway(int lineNumber) {                   // ����ö ȣ�� ��ȣ�� �Է��ؾ߸� ������ ȣ�� 
	this.lineNumber = lineNumber;
}

	public void take(int money) {                 // Ÿ�ٶ�� ���� ȣ��(�ż���) / �°����� �ð� ���� �پ���.
		passangerCount++;
		this.money += money;
	}

	public void showInfo() {                      // ����ö�� ������ ��� 
		System.out.println("����ö " + lineNumber + "ȣ���� �°��� " + passangerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}

}
