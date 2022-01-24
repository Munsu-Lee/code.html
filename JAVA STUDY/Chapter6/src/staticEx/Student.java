package staticEx;

public class Student {
	
	private static int serialNum = 10000;         // 스태틱 변수 설정 , 스태틱 변수는 바뀌면 안되는 값일 경우가 많아 private으로 설정되는 경우가 있다.
	
	int studentId;
	String studentName;
	
	public Student() {                            // 생성자가 호출될 때 마다 번호가 1씩 증가 
		serialNum ++;
		studentId = serialNum;
	}

	public static int getSerialNum() {            // 초기 번호의 변경을 막기 위해 setter를 없애고 getter만 남겼다.
		return serialNum;
	}

}
