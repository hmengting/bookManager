package bookmanager.chalmers.edu.bookmanagerfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {
    //print a book method
    void printABook(Book book){
        Log.d("Book", String.format("author %s, title %s, price %d, isbn %s, course %s \n",
                book.getAuthor(), book.getTitle(), book.getPrice(), book.getIsbn(), book.getCourse()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        SimpleBookManager manageBook = new SimpleBookManager();

        ArrayList<Book> bookList = manageBook.getAllBooks();


        //Print booklist
        for(int i=0; i<bookList.size(); i++)
        {
            Book book = bookList.get(i);
            printABook(book);

        }

        //create a book
        Book aNewBook = manageBook.createBook("newauthor","newtitle",350,"837","newcourse");
        printABook(aNewBook);

        //get total price
        Log.d("Book", String.format("Total price of books: %d \n", manageBook.getTotalCost()));

        //get max price
        Log.d("Book", String.format("Max price: %d \n", manageBook.getMaxPrice()));

        //get min price
        Log.d("Book", String.format("Minimun price: %d \n", manageBook.getMinPrice()));

        //remove book
        manageBook.removeBook(aNewBook);
        Log.d("Book", "After removal:\n");
        //Print booklist
        for(int i=0; i<bookList.size(); i++)
        {
            Book book = bookList.get(i);
            printABook(book);

        }

    }
}
