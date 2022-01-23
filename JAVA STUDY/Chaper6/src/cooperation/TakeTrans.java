package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000 );                   // 새로운 객체 생성 
		Student tomas = new Student("Tomas", 10000 );
		
		Bus bus100 = new Bus(100);                                     // 새로운 객체 생성
		james.takeBus(bus100);                                         // '타다' 라는 메서드를 통해 각 클래스들의 승객, 돈의 정보가 업데이트 됨 
		james.showInfo();                                              // 업데이트 된 정보들을 출력 
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
	}

}
