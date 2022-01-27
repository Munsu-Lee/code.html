package arrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee");                      // 새로운 생성자 
		studentLee.addSubject("국어", 100);                            // 과목을 생성하여 배열에 추가 
		studentLee.addSubject("수학", 90);
		
		studentLee.showStudentInfo();
		
		System.out.println("=========================");
		
		Student studentKim = new Student("Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 80);
		
		studentKim.showStudentInfo();
	}

}
