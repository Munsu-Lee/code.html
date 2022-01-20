package reference;

public class Student {                                        // �л��� ���� ������ �Լ��� �����ϴ� class
	
	int studentID;
	String studentName;
	
	Subject korea;                                            // ���� ���� ������ �������� �̿� (Subject)
	Subject math;
	
	public Student(int id, String name) {                     // �л��� ���� ������ 
		studentID = id;
		studentName = name;
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {            // ���� ���� ���� �Լ�
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(String name, int score) {             // ���� ���� ���� �Լ�
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {                           // ��¿� ���� �Լ�
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
	}
	}
