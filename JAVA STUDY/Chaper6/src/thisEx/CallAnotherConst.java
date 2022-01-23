package thisEx;

class Person{                                            // Person Ŭ���� ����
	
	String name;
	int age;
	
	public Person() {                                   // ����Ʈ �������϶��� �̸������� 1�� ��� 
		this("�̸�����", 1);                               // this�� ����ϸ� ���� ��ó�� �ְ� ������ ��ġ�ϴ� �����ڸ� ȣ��  
	}
	
	public Person(String name, int age) {               // ������ �����ε�(constructor overloading) / �̸��� ������ ������ �޶�� �Ѵ�. 
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {                        // �ڱ� �ڽ��� �ּҸ� ��ȯ�ϴ� �޼��� ���� 
		return this;
	}
}
	

public class CallAnotherConst {

	public static void main(String[] args) {
		 
		Person p1 = new Person();                       // �����ڸ� ���� ��ü ����  
		System.out.println(p1.name);                    // ��ü�� �̸��� �ּҸ� ���
		System.out.println(p1.returnSelf());
		
	}

}

