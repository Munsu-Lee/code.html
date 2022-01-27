package array;

public class ObjectCopy {

	public static void main(String[] args) {                        // ���� ���� 
		
		Book[] bookArray1 = new Book[3];                            // ���ο� �����ڸ� �����.
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���1", "������");                 // ������ ����� ���ڸ� �������ش�.
		bookArray1[1] = new Book("�¹���2", "������");
		bookArray1[2] = new Book("�¹���3", "������");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);          // �迭2�� �迭1�� �����Ѵ�.
		
		for(int i = 0; i < bookArray2.length; i++) {                // �迭 2�� �� ������ Ȯ��
		bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("����");                           // �迭1�� ���� �ϳ��� �ٲ۴�.
		bookArray1[0].setAuthor("�ڿϼ�");
		
		for(int i = 0; i < bookArray2.length; i++) {                // ��ü�� �迭�� �ּҸ� �����ϴ� ���̱� ������ 
 			bookArray2[i].showBookInfo();                           // �迭1�� ������ �ٲ�� �迭2�� ������ �ٲ��.
			}
	}

}
