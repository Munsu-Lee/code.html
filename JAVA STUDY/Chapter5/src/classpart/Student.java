package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.print(studentName +  "," + address);
		System.out.println();
	}
	
	public String getStudentName() {
		return studentName; 
	}                                                        //�л� �̸� ȣ��
	
	public void setStudentName(String name) {
		studentName = name;                                  //�л� �̸� �缼��
	}
	
	public static void main(String[] args) {
		Student studentLee = new Student();                  //Lee ���� �Է�
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "����� �������� ���ǵ���";
				
		Student studentKim = new Student();                  //Kim ���� �Է�
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "�̱� ��ȣ��";
				
		studentLee.showStudentInfor();                       //���� ȣ��
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);                      //���� ����(studentLee)�� ���� ��(classpart.Student@b4c966a) 
	}
}
