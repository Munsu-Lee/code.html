package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();                 // new�� ���� ���ο� ��ü�� ������� �ƴ϶�, static �޸��� �����ڸ� �޼��带 ���� ȣ�� 
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
