package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5];                         // �迭 �ʱ�ȭ 
		num[0] = 10.0;
		num[1] = 20.0;
		num[2] = 30.0;
		
		double total = 0.0;
		for(int i = 0; i < num.length; i++) {
			total += num[i];                                  // total�� �迭�� �׸���� ������� �����ش�.
		}
		
		System.out.println(total);
	}

}
