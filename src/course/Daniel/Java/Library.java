package course.Daniel.Java;

import java.util.ArrayList;

/**
 * Created by Jakars on 28/02/2017.
 */
public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Book> booksCopy = new ArrayList<>();

    public Library(){

    }

    void addBook(Book b){
        books.add(b);
        booksCopy.add(b);


    }

    //getAllBooks//printAllBooks
    void printBooks (){
        for (Book b: booksCopy) {
            System.out.println(b.getAuthorCopy());
            System.out.println(b.getNameCopy());
            System.out.println(b.getSummaryCopy()+"\n\n");
        }
    }

    public ArrayList<Book> getBooks() {

        return booksCopy;
    }
}
