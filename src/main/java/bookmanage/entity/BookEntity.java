package bookmanage.entity;

public class BookEntity {
	private Integer book_isbn;
	private String book_name;
	private Double book_price;
	private String book_type;
	private String book_author;
	private Integer book_totalnum;
	private Integer book_avanum;
	
	public Integer getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(Integer book_isbn) {
		this.book_isbn = book_isbn;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public Double getBook_price() {
		return book_price;
	}
	public void setBook_price(Double book_price) {
		this.book_price = book_price;
	}
	public String getBook_type() {
		return book_type;
	}
	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}
	public Integer getBook_totalnum() {
		return book_totalnum;
	}
	public void setBook_totalnum(Integer book_totalnum) {
		this.book_totalnum = book_totalnum;
	}
	public Integer getBook_avanum() {
		return book_avanum;
	}
	public void setBook_avanum(Integer book_avanum) {
		this.book_avanum = book_avanum;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
}