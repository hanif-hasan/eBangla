package com.hanifhasan007.ebangla;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory,tvwritter,tvpublication,tvrelease,tvprice;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);




        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView) findViewById(R.id.txtdescription);
        tvcategory = (TextView) findViewById(R.id.txtcategory);
        tvwritter = (TextView) findViewById(R.id.txtWritter);
        tvpublication = (TextView) findViewById(R.id.txtPublication);
        tvrelease = (TextView) findViewById(R.id.txtReleaseDate);
        tvprice = (TextView) findViewById(R.id.txtprice);
        img = (ImageView) findViewById(R.id.bookthumbnail);


        //Recieve Data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        String Writter = intent.getExtras().getString("Writter");
        String Publication = intent.getExtras().getString("Publication");
        String ReleaseDate = intent.getExtras().getString("Release");
        String Price = intent.getExtras().getString("Price");
        int image = intent.getExtras().getInt("Thumbnail");

        //setting value
        tvtitle.setText(Title);
        tvdescription.setText(Description);
        tvwritter.setText(Writter);
        tvpublication.setText(Publication);
        tvrelease.setText(ReleaseDate);
        tvprice.setText(Price);
        img.setImageResource(image);
    }
}
