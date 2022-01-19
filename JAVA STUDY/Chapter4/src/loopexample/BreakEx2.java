package loopexample;

public class BreakEx2 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		for(num = 0; ;num++) {
			sum += num;

			if (sum > 100) {
				break;
			}
	
		}
		System.out.println(num);
	}

}
