package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];                              //�迭�� length�� ����, 3���� �׸��� �� �� �ִ�. 
		
		// int[] numbers = new int[] {0, 1, 2} ;                   �迭 �ʱ�ȭ(���� �ȿ� length�� ���� �ʰ�, ��ҵ��� �߰�ȣ �ȿ� �ִ´�.)
		
		numbers[0] = 1;                                          //������ �׸��� ���� ���� 
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i = 0; i<numbers.length; i++) {                   //�迭�� �׸���� ���� ����ϴ� ���, for���� �迭���̸� ���� �迭�� Ȱ���� �� �ִ�.
			System.out.println(numbers[i]);
		}
		
		int[] studentsIDs = new int[5];
		for(int i = 0; i<studentsIDs.length; i++) {
			System.out.println(studentsIDs[i]);
		}
	}

}
