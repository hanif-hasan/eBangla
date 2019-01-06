package com.hanifhasan007.ebangla;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    private Button buttonA, buttonB, buttonC, buttonD;
    private Bundle bundle;
    private List<Book> getData, categorizedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonD = (Button) findViewById(R.id.buttonD);

        bundle = getIntent().getExtras();
        getData = bundle.getParcelableArrayList("data");


        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categorizedList = new ArrayList<Book>();
                for(Book book: getData){
                    if(book.getCategory().equals("History")){
                        categorizedList.add(book);
                    }
                }

                moveToFilteredPage(categorizedList);
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categorizedList = new ArrayList<Book>();
                for(Book book: getData){
                    if(book.getCategory().equals("Story")){
                        categorizedList.add(book);
                    }
                }

                moveToFilteredPage(categorizedList);
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categorizedList = new ArrayList<Book>();
                for(Book book: getData){
                    if(book.getCategory().equals("Romance")){
                        categorizedList.add(book);
                    }
                }

                moveToFilteredPage(categorizedList);
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categorizedList = new ArrayList<Book>();
                for(Book book: getData){
                    if(book.getCategory().equals("Other")){
                        categorizedList.add(book);
                    }
                }

                moveToFilteredPage(categorizedList);
            }
        });


    }

    private void moveToFilteredPage(List<Book> list){
        Intent mainActivity_intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) list);
        mainActivity_intent.putExtras(bundle);
        startActivity(mainActivity_intent);
    }
}
