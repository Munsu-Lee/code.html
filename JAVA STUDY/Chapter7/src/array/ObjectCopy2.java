package array;

public class ObjectCopy2 {

	public static void main(String[] args) {                          // 깊은 복사
		
		Book[] bookArray3 = new Book[3];                              // 새로운 생성자
		Book[] bookArray4 = new Book[3];
		
		bookArray3[0] = new Book("태맥산맥1", "조정래");                   // 배열3 정보 입력
		bookArray3[1] = new Book("태맥산맥2", "조정래");
		bookArray3[2] = new Book("태맥산맥3", "조정래");
		
		bookArray4[0] = new Book();                                   // 배열4의 주소를 따로 생성
		bookArray4[1] = new Book();
		bookArray4[2] = new Book();
		
		//System.arraycopy(bookArray3, 0, bookArray4, 0, 3);
		
		for(int i = 0; i < bookArray3.length; i++) {
			bookArray4[i].setAuthor(bookArray3[i].getAuthor());       // 배열 3의 정보를 가져와서 배열4에 세팅 
			bookArray4[i].setBookName(bookArray3[i].getBookName());
		}
		
		bookArray3[0].setBookName("나목");                              // 이때는 배열3과 4의 주소가 다르기 떄문에 배열 3의 정보를 수정해도 배열 4가 바뀌지 않음
		bookArray3[0].setAuthor("박완서");
		
		for(int i = 0; i < bookArray3.length; i++) {
			bookArray3[i].showBookInfo();
		
		}
		
		System.out.println("=======================================");
		
		for(int i = 0; i < bookArray4.length; i++) {
			bookArray4[i].showBookInfo();
		}
		
	}

}
