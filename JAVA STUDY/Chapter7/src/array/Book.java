package array;

public class Book {                                                        // 객체를 배열로 만드는 방법
	
	private String bookName;
	private String author;
	
	public Book() {}                                                       // 생성자들을 형성한다.
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() {                                          // getter, setter 메서드로 책과 저자의 이름을 세팅한다.
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {                                            // 책과 저자를 출력하는 메서드
		System.out.println(bookName + "," + author);
	}

}
