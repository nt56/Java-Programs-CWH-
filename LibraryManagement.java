package MyPackage;

class Library{
	
	String[] books;
	int no_of_books;
	
	Library(){
		this.books = new String[100];
		this.no_of_books = 0;
	}
	
	void addBooks(String book) {
		this.books[no_of_books] = book;
		no_of_books ++;
		System.out.println(book+ " has been added");
	}
	
	void showBook() {
		System.out.println("Available books are: ");
		for (String book : this.books) {
			if (book == null) {
				continue;
			}
			System.out.println("* " +book);
		}
	}
	
	void issuBook(String book) {
		for (int i=0; i<this.books.length; i++) {
			if (this.books[i].equals(book)) {
				System.out.println(book+ " has been issued");
				this.books[i] = null;
				return;
			}
		}
		System.out.println("Book does not exist");
	}
	
	void returnBook(String book) {
		addBooks(book);
	}
}

public class LibraryManagement {

	public static void main(String[] args) {
		
		Library l = new Library();
		
		l.addBooks("Think and Grow Rich");
		l.addBooks("Rich Dad & Poor dad");
		l.addBooks("JAVA");
		l.addBooks("Python");
		l.addBooks("Data Structures");
		
		l.showBook();
		
		l.issuBook("Python");
		l.issuBook("JAVA");
		
		l.showBook();
		
		l.returnBook("Python");
		
		l.showBook();

	}

}
