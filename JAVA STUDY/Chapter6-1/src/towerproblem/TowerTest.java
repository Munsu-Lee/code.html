package towerproblem;

public class TowerTest {

	public static void main(String[] args) {
		
		Tower myTower = new Tower();
		Tower seoulTower = new Tower(100);
		
		System.out.println("���̴� " + myTower.getHeight() + "����");
		System.out.println("���̴� " + seoulTower.getHeight() + "����");
	}

}
