package course.Daniel.Java;

import java.util.ArrayList;

/**
 * Created by Jakars on 28/02/2017.
 */
public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public Library(){

    }

    void addBook(Book b){
        books.add(b);
    }

    //getAllBooks//printAllBooks
    void printBooks (){
        for (Book b: books) {
            System.out.println(b.getAuthor());
            System.out.println(b.getName());
            System.out.println(b.getSummary()+"\n\n");
        }
    }

    public ArrayList<Book> getBooks() {

        return books;
    }
}
