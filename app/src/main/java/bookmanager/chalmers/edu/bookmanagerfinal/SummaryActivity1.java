package bookmanager.chalmers.edu.bookmanagerfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SummaryActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary1);

        SimpleBookManager manageBook = new SimpleBookManager();
        ArrayList<Book> bookList = manageBook.getAllBooks();

        String.format("%d books in your library ",
                bookList.size());

        TextView popTextView = (TextView) findViewById(R.id.popText);
        popTextView.setText(String.format("%d books in your library ", bookList.size()));
        TextView totalcostTextView = (TextView) findViewById(R.id.totalCost);
        totalcostTextView.setText(String.format("%d SEK", manageBook.getTotalCost()));
        TextView maxPriceTextView = (TextView) findViewById(R.id.maxPrice);
        maxPriceTextView.setText(String.format("%d SEK", manageBook.getMaxPrice()));
        TextView minPriceTextView = (TextView) findViewById(R.id.minPrice);
        minPriceTextView.setText(String.format("%d SEK", manageBook.getMinPrice()));
        TextView meanPriceTextView = (TextView) findViewById(R.id.meanPrice);
        meanPriceTextView.setText(String.format("%.2f SEK", manageBook.getMeanPrice()));

    }
}
