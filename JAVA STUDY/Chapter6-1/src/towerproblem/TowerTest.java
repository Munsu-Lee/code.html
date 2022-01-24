package towerproblem;

public class TowerTest {

	public static void main(String[] args) {
		
		Tower myTower = new Tower();
		Tower seoulTower = new Tower(100);
		
		System.out.println("높이는 " + myTower.getHeight() + "미터");
		System.out.println("높이는 " + seoulTower.getHeight() + "미터");
	}

}
