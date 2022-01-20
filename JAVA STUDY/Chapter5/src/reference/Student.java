package reference;

public class Student {                                        // 학생에 대한 정보와 함수를 셋팅하는 class
	
	int studentID;
	String studentName;
	
	Subject korea;                                            // 과목에 대한 정보는 참조변수 이용 (Subject)
	Subject math;
	
	public Student(int id, String name) {                     // 학생에 대한 정보들 
		studentID = id;
		studentName = name;
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {            // 국어 과목에 대한 함수
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(String name, int score) {             // 수학 과목에 대한 함수
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {                           // 출력에 대한 함수
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
	}
