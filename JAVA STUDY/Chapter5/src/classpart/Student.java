package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.print(studentName +  "," + address);
		System.out.println();
	}
	
	public String getStudentName() {
		return studentName; 
	}                                                        //학생 이름 호출
	
	public void setStudentName(String name) {
		studentName = name;                                  //학생 이름 재세팅
	}
	
	public static void main(String[] args) {
		Student studentLee = new Student();                  //Lee 정보 입력
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";
				
		Student studentKim = new Student();                  //Kim 정보 입력
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";
				
		studentLee.showStudentInfor();                       //정보 호출
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);                      //참조 변수(studentLee)와 참조 값(classpart.Student@b4c966a) 
	}
}
