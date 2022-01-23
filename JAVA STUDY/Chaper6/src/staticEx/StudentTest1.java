package staticEx;

public class StudentTest1 {

	public static void main(String[] args) {
		
		System.out.println(Student.getSerialNum());
		
		Student james = new Student();                         // 생성자가 선언되는 순간 학생번호의 수가 1 증가한다.
		System.out.println(Student.getSerialNum());            // 스태틱 변수를 호출 할때는 매개변수가 아닌 클래스 명을 이용하는게 일반적이다. 
		
		Student tomas = new Student();
		System.out.println(Student.getSerialNum());
		
	
	}

}
