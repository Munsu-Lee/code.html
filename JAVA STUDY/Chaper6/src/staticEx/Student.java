package staticEx;

public class Student {
	
	private static int serialNum = 10000;         // ����ƽ ���� ���� , ����ƽ ������ �ٲ�� �ȵǴ� ���� ��찡 ���� private���� �����Ǵ� ��찡 �ִ�.
	
	int studentId;
	String studentName;
	
	public Student() {                            // �����ڰ� ȣ��� �� ���� ��ȣ�� 1�� ���� 
		serialNum ++;
		studentId = serialNum;
	}

	public static int getSerialNum() {            // �ʱ� ��ȣ�� ������ ���� ���� setter�� ���ְ� getter�� �����.
		return serialNum;
	}

}
