package Ch08;
class C02Book{
	int bookNumber;
	String bookTitle;
	
	C02Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	@Override
	public String toString() {
		return bookNumber+" "+bookTitle;
	}
	
}
public class C02Bookmain {

	public static void main(String[] args) {
		C02Book book1 = new C02Book(200,"개미");
		System.out.println(book1);
		System.out.println(book1.toString());
		
		C02Book book2 = new C02Book(201,"자바");
		System.out.println(book2);
	}

	

}
