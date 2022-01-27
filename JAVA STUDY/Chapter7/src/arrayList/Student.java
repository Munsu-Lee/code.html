package arrayList;

import java.util.ArrayList;                                      // ArrayList 클래스 가져오기(자바에서 제공)

public class Student {                                           // Student 클래스 생성
	
	private static int studentID = 10000;                        // 학번의 시작 숫자를 스태틱변수를 통해 생성 
	private String studentName;                                  // 멤버변수 생성 (이름)
	private ArrayList<Subject> subjectList;                      // 과목리스트를 ArrayList 클래스로 가져오기 
	
	public Student(String studentName) {                         // 생성자 만들기 
		studentID ++;                                            // 생성자가 호출되면 자동으로 학번이 올라감
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();                  // 새로운 ArrayList 생성 
	}
	
	public void addSubject(String name, int score) {             // 배열에 과목을 추가하는 메서드 생성
		Subject subject = new Subject();                         // 새로운 생성자 생성하여 과목명과 점수 세팅 
		subject.setName(name);                                     
		subject.setScorePoint(score);                     
		
		subjectList.add(subject);                                // 생성자의 추가된 항목을 배열에 추가하기(ArrayList 클래스의 기본 method)
	}
	
	public void showStudentInfo() {                              // 학생과 과목에 대한 정보 출력 
		
		int total = 0;
		for(Subject subject : subjectList) {                     // 배열의 갯수만큼 subject가 형성 
			total += subject.getScorePoint();
			System.out.println("학생 " + studentName + "(" + studentID +")" +"님의 " + subject.getName() + "과목 성적은" + subject.getScorePoint() + "점입니다." );
		}
		System.out.println("학생 " + studentName + "님의 총점은" + total + "입니다.");
	}
		
	
}
