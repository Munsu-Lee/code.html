package reference;

public class StudentTest {                                         // 학생에 대한 정보를 출력하는 class

	public static void main(String[] args) {                         
		Student studentJames = new Student(100, "James" );         // james의 과목 점수 셋팅
		studentJames.setKorea("국어", 100);
		studentJames.setMath("수학", 90);
		
		Student studentTomas = new Student(101, "Tomas" );         // Tomas의 과목 점수 셋팅
		studentTomas.setKorea("국어", 90);
		studentTomas.setMath("수학", 80);
		
		studentJames.showStudentInfo();                            // 각각의 과목과 점수를 출력
		studentTomas.showStudentInfo();
	}

}
