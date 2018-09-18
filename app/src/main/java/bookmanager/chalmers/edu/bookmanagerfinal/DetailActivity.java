package bookmanager.chalmers.edu.bookmanagerfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        SimpleBookManager manageBook = new SimpleBookManager();
        ArrayList<Book> bookList = manageBook.getAllBooks();
        Book book = bookList.get(0);

        TextView titleTextView = (TextView) findViewById(R.id.title);
        titleTextView.setText(book.getTitle());
        TextView authorTextView = (TextView) findViewById(R.id.author);
        authorTextView.setText(book.getAuthor());
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(Integer.toString(book.getPrice()));
        TextView isbnTextView = (TextView) findViewById(R.id.isbn);
        isbnTextView.setText(book.getIsbn());
        TextView courseTextView = (TextView) findViewById(R.id.course);
        courseTextView.setText(book.getCourse());

    }
}
