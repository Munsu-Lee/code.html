package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		double total = 1.0;
		double[] num = new double[5];
		int size = 0;

		num[0] = 10.0; size++;                                 // 배열의 길이대로 출력을 하면 자료가 없는 곳은 0으로 출력 된다.
		num[1] = 20.0; size++;                                 // 따라서 필요할 경우 size를 새로 지정하여 다음과 같이 활용한다. 
		num[2] = 30.0; size++;
		
		for(int i = 0; i < size; i++) {
			total *= num[i];                                    // 곱셈을 활용할 경우 0이 곱해지면 무조건 0이 되기 때문에 size로 출력되는 항목을 통제해준다.
		}
		
		System.out.println("total =" + total);
		
		
	}

}
