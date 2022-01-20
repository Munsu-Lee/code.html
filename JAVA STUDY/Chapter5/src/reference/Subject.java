package reference;

public class Subject {                                            // 과목에 대한 정보는 참조변수 이용
	
	String subjectName;
	int score;
	
	public String getSubjectName() {                              // 과목 이름 호출
		return subjectName;
	}
	public void setSubjectName(String subjectName) {              // 과목 이름 셋팅(초기화)
		this.subjectName = subjectName;
	}
	public int getScore() {                                       // 점수 호츨
		return score;
	}
	public void setScore(int score) {                             // 점수 셋팅(초기화)
		this.score = score;
	}

}
