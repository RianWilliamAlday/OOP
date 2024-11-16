public class Main
{
	public static void main(String[] args) {
	 Student student1 = new Student();
	 student1.setId(7919);
	 student1.setname("Kai");
	 
	 System.out.println("Student Id: " + student1.getId());
	 	 System.out.println("Student Id: " + student1.getname());
	 	 
	 Book book1 = new Book();
	 book1.setbooknumber(1);
	 book1.setTitle("Harry Potter and The Half Blood Price");
	 book1.setname("J.K Rowling");
	 book1.setprice( 899.00f);
	 
	 System.out.println("Book number: " + book1.getBookNumber());
	 	 System.out.println("Book Title: " + book1.getTitle());
	 	 System.out.println("Author: " + book1.getAuthor());
	 	 	 	 System.out.println("Book Price: " + book1.getPrice());
	}
}