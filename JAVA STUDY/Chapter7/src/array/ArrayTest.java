package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];                              //배열의 length를 지정, 3개의 항목이 들어갈 수 있다. 
		
		// int[] numbers = new int[] {0, 1, 2} ;                   배열 초기화(꺾쇠 안에 length를 넣지 않고, 요소들을 중괄호 안에 넣는다.)
		
		numbers[0] = 1;                                          //각각의 항목을 직접 지정 
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i = 0; i<numbers.length; i++) {                   //배열의 항목들을 전부 출력하는 방법, for문과 배열길이를 통해 배열을 활용할 수 있다.
			System.out.println(numbers[i]);
		}
		
		int[] studentsIDs = new int[5];
		for(int i = 0; i<studentsIDs.length; i++) {
			System.out.println(studentsIDs[i]);
		}
	}

}
