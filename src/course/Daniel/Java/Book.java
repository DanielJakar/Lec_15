package course.Daniel.Java;

/**
 * Created by Jakars on 28/02/2017.
 */
public class Book {
    //Properties
    private String author;
    private String name;
    private String summary;
    private String authorCopy;
    private String nameCopy;
    private String summaryCopy;




    public Book(String author, String name, String summary) {
        this.author = author;
        this.name = name;
        this.summary = summary;

    }

    public Book (Book b) {
        this.authorCopy = b.author;
        this.nameCopy = b.name;
        this.summaryCopy = b.summary;
    }




    public String getAuthorCopy() {
        return authorCopy;
    }

    public void setAuthorCopy(String authorCopy) {
        this.authorCopy = authorCopy;
    }

    public String getNameCopy() {
        return nameCopy;
    }

    public void setNameCopy(String nameCopy) {
        this.nameCopy = nameCopy;
    }

    public String getSummaryCopy() {
        return summaryCopy;
    }

    public void setSummaryCopy(String summaryCopy) {
        this.summaryCopy = summaryCopy;
    }
}
