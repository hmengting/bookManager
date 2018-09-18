package bookmanager.chalmers.edu.bookmanagerfinal;

public class Book {
    private String author;
    private String title;
    private int price;
    private String isbn;
    private String course;

    public Book(String author, String title, int price, String isbn, String course) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.isbn = isbn;
        this.course = course;
    }

    public Book(){

    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }




}
