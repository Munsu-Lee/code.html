package array;

public class AdvancedFor {

	public static void main(String[] args) {
		
		String[] strArr = {"Java", "Android", "C++"};
		
		for (String s : strArr) {                                // �迭 ���� ���θ� ����� �� ����ϴ� ��� 
			System.out.println(s);                               // s�� �迭�� �ְ� �ٽ� ��� 
		}
		
		int[] intArr = {1, 2, 3};                                // �ڷ����� ������� ��� ��� ����  
		
		for (int i : intArr) {
			System.out.println(i);
		}
	}

}
