package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];                              // 2���� �迭 ����, ũ�����ϱ�
		
		int[][] arr2 = {{1,2,3}, {4,5,6}};                        // 2���� �迭 �ʱ�ȭ 
		
		System.out.println(arr.length);                           // ���� ũ��� �迭�� length
		System.out.println(arr[0].length);                        // ���� ũ��� [i]���� length
		
		for(int i = 0; i < arr2.length; i++) {                    // 2�� for���� ���� 2���� �迭 ���� 
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		char[][] alphabets = new char[13][2];
		char ch = 'A';
		
		for (int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch++ ;
				
				System.out.print(alphabets[i][j] + " ");         // 0�� ���
			}
			System.out.println();                                // �ణ�� �ٹٲ��� ���� ��ĭ ���
		}
		
		
		
		
	}

}
