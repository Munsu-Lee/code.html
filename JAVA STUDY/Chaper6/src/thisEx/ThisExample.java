package thisEx;

class Birthday{                                  // Birthday Ŭ���� ����
	int day;
	int month;
	int year;
	
	public void setYear(int year) {              // setYear(���� ����) �޼��� ����
		this.year = year;                        // this = class Birthday(������)
	}
	
	public void printThis() {                    // printThis(�ڽ��� �޸� �ּҸ� ȣ��) �޼��� ����
		System.out.println(this);
	}
	
}
public class ThisExample {

	public static void main(String[] args) {
		Birthday b1 = new Birthday();            // �����ڸ� ȣ���ؼ� ��ü���� ����
		Birthday b2 = new Birthday();
		
		System.out.println(b1);                  // �����ڸ� ���� ������ b1�� �ּҿ� this�� ���� ������ Birthday.b1�� �ּҴ� ����.
		b1.printThis();

		System.out.println(b2);
		b2.printThis();
	}

}
