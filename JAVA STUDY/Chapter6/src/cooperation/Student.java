package cooperation;

public class Student {                                 
	String studentName;
	int grage;
	int money;

	public Student(String studentName, int money) {    // ������ �������̵� / �л� �̸��� ���� �Է��ؾ� ������ �ϼ���  
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);                                // ���� Ŭ������ �ż��带 ȣ���ؼ� ��Ʃ��Ʈ Ŭ������ ��� (��ü���� ����)
		money -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);                             // ����ö Ŭ������ �ż��带 ȣ���ؼ� ��Ʃ��Ʈ Ŭ������ ��� (��ü���� ����)
		money -= 1500;
	}

	public void showInfo() {                           // �л� ���� ��� �޼��� 
		System.out.println(studentName + "���� ���� �ݾ��� " + money + "�Դϴ�.");
	}
}
