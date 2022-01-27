package array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i ++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("태백산맥1", "조정래");               // 객체배열은 각각의 항목을 직접 지정해주어야 한다.
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
	
		for(int i = 0; i < library.length; i ++) {
			System.out.println(library[i]);                     // library 객체 배열의 주소를 출력한다.
		}
		
		for(int i = 0; i < library.length; i ++) {
			library[i].showBookInfo();                          // 각 항목의 저자와 책 제목을 출력한다.
		} 
	}

}
