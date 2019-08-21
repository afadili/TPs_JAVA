
import java.util.ArrayList;
	public class Main{
	public static void main(String[] args) {
		/*var book = new Book("ptitle","pauthor");
		System.out.println(book.getTitle() + ' ' + book.getAuthor());*/
		
		/*var b1 = new Book("Da Java Code", "Duke Brown");
		var b2 = b1;
		var b3 = new Book("Da Java Code", "Duke Brown");
	System.out.println(b1 == b2);
	System.out.println(b1 == b3);*/

	/*var b1 = new Book("Da Java Code", "Duke Brown");
	var b2 = b1;
	var b3 = new Book("Da Java Code", "Duke Brown");
	var list = new ArrayList();
	list.add(b1);
	System.out.println(list.indexOf(b2));
	System.out.println(list.indexOf(b3));*/

	var aBook = new Book(null, null);
	var anotherBook = new Book(null, null);
	var list = new ArrayList();
	list.add(aBook);
	System.out.println(list.indexOf(anotherBook));
	}
}