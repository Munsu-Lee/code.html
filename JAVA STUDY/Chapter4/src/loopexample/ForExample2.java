package loopexample;

public class ForExample2 {

	public static void main(String[] args) {
		int num;
		int sum;
		
		for (num = 1, sum = 0; num <= 10; num++) {
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
