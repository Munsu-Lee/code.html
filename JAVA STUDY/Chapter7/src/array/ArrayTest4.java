package array;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];                       // ���ڿ��� ������ ��Ÿ�� �� �ִ�.
		char ch = 'A';
		
		
		for(int i = 0; i < alphabets.length; i++, ch++) {      // ���ڿ� 1�� ���س����� ���� ������ ���ڸ� ����� �� �ִ�.
			alphabets[i] = ch;
			System.out.println(alphabets[i]);
		}
		
		
	}

}
