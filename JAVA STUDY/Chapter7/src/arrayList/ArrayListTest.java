package arrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee");                      // ���ο� ������ 
		studentLee.addSubject("����", 100);                            // ������ �����Ͽ� �迭�� �߰� 
		studentLee.addSubject("����", 90);
		
		studentLee.showStudentInfo();
		
		System.out.println("=========================");
		
		Student studentKim = new Student("Kim");
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 80);
		
		studentKim.showStudentInfo();
	}

}
