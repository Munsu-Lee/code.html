package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();                 // new를 통해 새로운 객체를 만든것이 아니라, static 메모리의 생성자를 메서드를 통해 호출 
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
