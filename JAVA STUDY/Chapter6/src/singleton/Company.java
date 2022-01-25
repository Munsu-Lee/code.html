package singleton;

public class Company {
	
	private static Company instance = new Company();           // 2. instance 라는 객체 생성 (유일한 객체)
	
	private Company() {}                                       // 1. 생성자를 private으로 생성 (바뀌면 안되는 값, 유일한 값에 사용)
	                                                           //    생성자를 선언해놓지 않으면 디폴트 생성자가 만들어져서 수많은 객체들이 만들어질 수 있다.
	                                                           //    따라서 생성자를 만들고 바꾸지 못하도록 private 선언을 한다.
	
	public static Company getInstance() {                      // 3. Company를 호출할 수 있는 메서드 생성
		if(instance == null)
			instance = new Company();
		return instance;
	}
}