package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		double total = 1.0;
		double[] num = new double[5];
		int size = 0;

		num[0] = 10.0; size++;                                 // �迭�� ���̴�� ����� �ϸ� �ڷᰡ ���� ���� 0���� ��� �ȴ�.
		num[1] = 20.0; size++;                                 // ���� �ʿ��� ��� size�� ���� �����Ͽ� ������ ���� Ȱ���Ѵ�. 
		num[2] = 30.0; size++;
		
		for(int i = 0; i < size; i++) {
			total *= num[i];                                    // ������ Ȱ���� ��� 0�� �������� ������ 0�� �Ǳ� ������ size�� ��µǴ� �׸��� �������ش�.
		}
		
		System.out.println("total =" + total);
		
		
	}

}
