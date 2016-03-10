package prob3;

public class Book {
	private int bookNo;	// 번호
	private String title;	// 제목
	private String author;	// 작가
	private int stateCode;	// 상태코드(대여유무를 나타내는  상태코드)
	
	//books[0] = new Book( 1, "트와일라잇", "스테파니메이어" );
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	// bookNo, title, author의 getter & setter
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	// 대여
	public void rent() {
		System.out.println(this.title+"이(가) 대여 됐습니다.");
		this.stateCode = 0;
	}
	
	// 책 정보 출력
	public void print() {
		System.out.printf("책 제목:%s, 작가:%s, 대여 유무:",this.title, this.author);
		if(this.stateCode == 0)
			System.out.println("대여중");
		else
			System.out.println("재고있음");
	}
}
