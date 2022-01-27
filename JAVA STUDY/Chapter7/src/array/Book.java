package array;

public class Book {                                                        // ��ü�� �迭�� ����� ���
	
	private String bookName;
	private String author;
	
	public Book() {}                                                       // �����ڵ��� �����Ѵ�.
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() {                                          // getter, setter �޼���� å�� ������ �̸��� �����Ѵ�.
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
	
	public void showBookInfo() {                                            // å�� ���ڸ� ����ϴ� �޼���
		System.out.println(bookName + "," + author);
	}

}
