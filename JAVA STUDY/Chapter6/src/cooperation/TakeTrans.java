package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000 );                   // ���ο� ��ü ���� 
		Student tomas = new Student("Tomas", 10000 );
		
		Bus bus100 = new Bus(100);                                     // ���ο� ��ü ����
		james.takeBus(bus100);                                         // 'Ÿ��' ��� �޼��带 ���� �� Ŭ�������� �°�, ���� ������ ������Ʈ �� 
		james.showInfo();                                              // ������Ʈ �� �������� ��� 
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
	}

}
