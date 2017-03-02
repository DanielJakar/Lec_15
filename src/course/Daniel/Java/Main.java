package course.Daniel.Java;

import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Library lib = new Library();


        //String uid = UUID.randomUUID().toString();
        //System.out.println(uid);


        //init 2 books
        Book b1 = new Book("Java Software Solutions 8th Edition", "2112322-42331");
        Book b2 = new Book("Java in a nutshell 6th Edition", "2342342-34331");

        //add the books to the library:
        lib.addBook(b1);
        lib.addBook(b2);

        lib.printBooks();




    }
}
