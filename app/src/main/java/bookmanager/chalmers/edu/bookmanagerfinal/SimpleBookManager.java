package bookmanager.chalmers.edu.bookmanagerfinal;

import java.util.ArrayList;

public class SimpleBookManager {

    private ArrayList<Book> bookList = new ArrayList<Book>();

    public SimpleBookManager() {
        bookList.add(new Book("Matt J", "Art history", 100, "001", "Course 1"));
        bookList.add(new Book("Jenny K","Music history", 200, "002","Course 2"));
        bookList.add(new Book("Peter P", "Library history",300,"003","Course 3"));
        bookList.add(new Book("Olivia R", "Furniture history", 400,"004","Course 4"));
        bookList.add(new Book("Adam T","Computer history",500,"005","Course 5"));
    }

    public int count(){
        return bookList.size();

    }

    public Book getBook(int index){
        return bookList.get(index);

    }

    public Book createBook(String author, String title, int price, String isbn, String course){
        Book book = new Book(author, title, price, isbn, course);
        bookList.add(book);
        return book;


    }


    public ArrayList<Book> getAllBooks(){
        return  bookList;

    }
    public void removeBook(Book book){
        int bookPos = bookList.indexOf(book);
        bookList.remove(bookPos);

    }
    public void moveBook (int from, int to){
        Book temp = bookList.get(from);
        bookList.remove(from);
        bookList.add(to, temp);
    }

    public int getMinPrice(){
        int N = bookList.size();

        if (N==0){
            throw new java.lang.Error("No book in the list");
        }
        else{
            int minPrice = bookList.get(0).getPrice();
            while(N>1){
                int currentPrice = bookList.get(N-1).getPrice();
                if (minPrice > currentPrice){
                    minPrice = currentPrice;
                }
                N--;
            }
            return minPrice;
        }

    }
    public int getMaxPrice(){
        int N = bookList.size();

        if (N==0){
            throw new java.lang.Error("No book in the list");
        }
        else{
            int maxPrice = bookList.get(0).getPrice();
            while(N>1){
                int currentPrice = bookList.get(N-1).getPrice();
                if (maxPrice < currentPrice){
                    maxPrice = currentPrice;
                }
                N--;
            }
            return maxPrice;
        }

    }

    public float getMeanPrice(){
        float meanPrice = getTotalCost()/count();
        return meanPrice;
    }

    public int getTotalCost(){
        int totalCost = 0;
        for (int i=0; i<bookList.size(); i++){
            totalCost = totalCost + bookList.get(i).getPrice();
        }
        return totalCost;
    }

    public void saveChanges(){

    }
}
