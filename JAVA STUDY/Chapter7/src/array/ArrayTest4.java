package array;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];                       // 문자열도 정수로 나타낼 수 있다.
		char ch = 'A';
		
		
		for(int i = 0; i < alphabets.length; i++, ch++) {      // 문자에 1씩 더해나가면 다음 순서의 문자를 출력할 수 있다.
			alphabets[i] = ch;
			System.out.println(alphabets[i]);
		}
		
		
	}

}
