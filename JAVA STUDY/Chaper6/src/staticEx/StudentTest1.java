package staticEx;

public class StudentTest1 {

	public static void main(String[] args) {
		
		System.out.println(Student.getSerialNum());
		
		Student james = new Student();                         // �����ڰ� ����Ǵ� ���� �л���ȣ�� ���� 1 �����Ѵ�.
		System.out.println(Student.getSerialNum());            // ����ƽ ������ ȣ�� �Ҷ��� �Ű������� �ƴ� Ŭ���� ���� �̿��ϴ°� �Ϲ����̴�. 
		
		Student tomas = new Student();
		System.out.println(Student.getSerialNum());
		
	
	}

}
