package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		// int[] numbers = new int[] {0, 1, 2} ;                   배열 초기화(꺾쇠 안에 length를 넣지 않고, 요소들을 중괄호 안에 넣는다.)
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] studentsIDs = new int[5];
		for(int i = 0; i<studentsIDs.length; i++) {
			System.out.println(studentsIDs[i]);
		}
	}

}
