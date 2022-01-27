package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];                              // 2차원 배열 선언, 크기정하기
		
		int[][] arr2 = {{1,2,3}, {4,5,6}};                        // 2차원 배열 초기화 
		
		System.out.println(arr.length);                           // 행의 크기는 배열의 length
		System.out.println(arr[0].length);                        // 열의 크기는 [i]행의 length
		
		for(int i = 0; i < arr2.length; i++) {                    // 2중 for문을 통해 2차원 배열 생성 
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
				
				System.out.print(alphabets[i][j] + " ");         // 0열 출력
			}
			System.out.println();                                // 행간의 줄바꿈을 위해 빈칸 출력
		}
		
		
		
		
	}

}
