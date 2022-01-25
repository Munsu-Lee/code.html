package singleton;

public class Company {
	
	private static Company instance = new Company();           // 2. instance ��� ��ü ���� (������ ��ü)
	
	private Company() {}                                       // 1. �����ڸ� private���� ���� (�ٲ�� �ȵǴ� ��, ������ ���� ���)
	                                                           //    �����ڸ� �����س��� ������ ����Ʈ �����ڰ� ��������� ������ ��ü���� ������� �� �ִ�.
	                                                           //    ���� �����ڸ� ����� �ٲ��� ���ϵ��� private ������ �Ѵ�.
	
	public static Company getInstance() {                      // 3. Company�� ȣ���� �� �ִ� �޼��� ����
		if(instance == null)
			instance = new Company();
		return instance;
	}
}