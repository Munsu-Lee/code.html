package array;

public class ObjectCopy2 {

	public static void main(String[] args) {                          // ���� ����
		
		Book[] bookArray3 = new Book[3];                              // ���ο� ������
		Book[] bookArray4 = new Book[3];
		
		bookArray3[0] = new Book("�¸ƻ��1", "������");                   // �迭3 ���� �Է�
		bookArray3[1] = new Book("�¸ƻ��2", "������");
		bookArray3[2] = new Book("�¸ƻ��3", "������");
		
		bookArray4[0] = new Book();                                   // �迭4�� �ּҸ� ���� ����
		bookArray4[1] = new Book();
		bookArray4[2] = new Book();
		
		//System.arraycopy(bookArray3, 0, bookArray4, 0, 3);
		
		for(int i = 0; i < bookArray3.length; i++) {
			bookArray4[i].setAuthor(bookArray3[i].getAuthor());       // �迭 3�� ������ �����ͼ� �迭4�� ���� 
			bookArray4[i].setBookName(bookArray3[i].getBookName());
		}
		
		bookArray3[0].setBookName("����");                              // �̶��� �迭3�� 4�� �ּҰ� �ٸ��� ������ �迭 3�� ������ �����ص� �迭 4�� �ٲ��� ����
		bookArray3[0].setAuthor("�ڿϼ�");
		
		for(int i = 0; i < bookArray3.length; i++) {
			bookArray3[i].showBookInfo();
		
		}
		
		System.out.println("=======================================");
		
		for(int i = 0; i < bookArray4.length; i++) {
			bookArray4[i].showBookInfo();
		}
		
	}

}
