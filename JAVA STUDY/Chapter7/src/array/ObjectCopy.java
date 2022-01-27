package array;

public class ObjectCopy {

	public static void main(String[] args) {                        // 얕은 복사 
		
		Book[] bookArray1 = new Book[3];                            // 새로운 생성자를 만든다.
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");                 // 각각의 제목과 저자를 지정해준다.
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);          // 배열2에 배열1을 복사한다.
		
		for(int i = 0; i < bookArray2.length; i++) {                // 배열 2에 잘 들어갔는지 확인
		bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");                           // 배열1의 정보 하나를 바꾼다.
		bookArray1[0].setAuthor("박완서");
		
		for(int i = 0; i < bookArray2.length; i++) {                // 객체의 배열은 주소를 복사하는 것이기 때문에 
 			bookArray2[i].showBookInfo();                           // 배열1의 정보가 바뀌면 배열2의 정보도 바뀐다.
			}
	}

}
