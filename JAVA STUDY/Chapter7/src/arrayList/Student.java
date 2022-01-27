package arrayList;

import java.util.ArrayList;                                      // ArrayList Ŭ���� ��������(�ڹٿ��� ����)

public class Student {                                           // Student Ŭ���� ����
	
	private static int studentID = 10000;                        // �й��� ���� ���ڸ� ����ƽ������ ���� ���� 
	private String studentName;                                  // ������� ���� (�̸�)
	private ArrayList<Subject> subjectList;                      // ���񸮽�Ʈ�� ArrayList Ŭ������ �������� 
	
	public Student(String studentName) {                         // ������ ����� 
		studentID ++;                                            // �����ڰ� ȣ��Ǹ� �ڵ����� �й��� �ö�
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();                  // ���ο� ArrayList ���� 
	}
	
	public void addSubject(String name, int score) {             // �迭�� ������ �߰��ϴ� �޼��� ����
		Subject subject = new Subject();                         // ���ο� ������ �����Ͽ� ������ ���� ���� 
		subject.setName(name);                                     
		subject.setScorePoint(score);                     
		
		subjectList.add(subject);                                // �������� �߰��� �׸��� �迭�� �߰��ϱ�(ArrayList Ŭ������ �⺻ method)
	}
	
	public void showStudentInfo() {                              // �л��� ���� ���� ���� ��� 
		
		int total = 0;
		for(Subject subject : subjectList) {                     // �迭�� ������ŭ subject�� ���� 
			total += subject.getScorePoint();
			System.out.println("�л� " + studentName + "(" + studentID +")" +"���� " + subject.getName() + "���� ������" + subject.getScorePoint() + "���Դϴ�." );
		}
		System.out.println("�л� " + studentName + "���� ������" + total + "�Դϴ�.");
	}
		
	
}
