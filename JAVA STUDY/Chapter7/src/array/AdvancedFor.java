package array;

public class AdvancedFor {

	public static void main(String[] args) {
		
		String[] strArr = {"Java", "Android", "C++"};
		
		for (String s : strArr) {                                // 배열 순서 전부를 출력할 때 사용하는 방법 
			System.out.println(s);                               // s에 배열을 넣고 다시 출력 
		}
		
		int[] intArr = {1, 2, 3};                                // 자료형에 관계없이 모두 사용 가능  
		
		for (int i : intArr) {
			System.out.println(i);
		}
	}

}
