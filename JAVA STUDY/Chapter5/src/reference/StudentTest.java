package reference;

public class StudentTest {                                         // �л��� ���� ������ ����ϴ� class

	public static void main(String[] args) {                         
		Student studentJames = new Student(100, "James" );         // james�� ���� ���� ����
		studentJames.setKorea("����", 100);
		studentJames.setMath("����", 90);
		
		Student studentTomas = new Student(101, "Tomas" );         // Tomas�� ���� ���� ����
		studentTomas.setKorea("����", 90);
		studentTomas.setMath("����", 80);
		
		studentJames.showStudentInfo();                            // ������ ����� ������ ���
		studentTomas.showStudentInfo();
	}

}
