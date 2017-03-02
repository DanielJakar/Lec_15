package course.Daniel.Java;

/**
 * Created by Jakars on 28/02/2017.
 */
public class Book {
    //Properties
    private String author;
    private String name;
    private String summary;




    public Book(String author, String name, String summary) {
        this.author = author;
        this.name = name;
        this.summary = summary;
    }



    //Property getter


    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    //Property setter

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
