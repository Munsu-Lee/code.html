package arrayList;

public class Subject {                                        // Subject class 생성
	
	private String name;                                      // 멤버변수 생성
	private int scorePoint;
	
	public String getName() {                                 // getter, setter method로 과목 이름과 점수 셋팅
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	

}
