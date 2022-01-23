package thisEx;

class Person{                                            // Person 클래스 생성
	
	String name;
	int age;
	
	public Person() {                                   // 디폴트 생성자일때는 이름없음과 1을 출력 
		this("이름없음", 1);                               // this를 사용하면 가장 근처에 있고 형식이 일치하는 생성자를 호출  
	}
	
	public Person(String name, int age) {               // 생성자 오버로딩(constructor overloading) / 이름은 같으나 형식은 달라야 한다. 
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {                        // 자기 자신의 주소를 반환하는 메서드 생성 
		return this;
	}
}
	

public class CallAnotherConst {

	public static void main(String[] args) {
		 
		Person p1 = new Person();                       // 생성자를 통해 객체 생성  
		System.out.println(p1.name);                    // 객체의 이름과 주소를 출력
		System.out.println(p1.returnSelf());
		
	}

}

