package com.hanifhasan007.ebangla;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.GravityCompat;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity{

    public DrawerLayout drawerLayout;
    List<Book> lsBook, lsBook_filtered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_1);

        if(getIntent().getExtras() == null){
            lsBook = new ArrayList<>();
            lsBook.add(new Book("Deyal","humayun ahmed","Unknown","History","200 tk","2013","1st","Deyal is a Bengali political novel written by Humayun Ahmed. It is Ahmed's last book and is considered to be one of the best works by him.",R.drawable.deyal));
            lsBook.add(new Book("Gitanjali","Rabindranath Tagore","Macmillan Publishers","Other","300 tk","1910","1st","Gitanjali is a collection of poems by the Bengali poet Rabindranath Tagore. Tagore received the Nobel Prize for Literature, largely for the book. It is part of the UNESCO Collection of Representative Works.",R.drawable.gitanjali));
            lsBook.add(new Book("Ami Topu","Muhammed Zafar Iqbal","Unknown","Story","100 tk","2005","1st","Story of a teen age boy",R.drawable.ami_topu));
            lsBook.add(new Book("Pandab Goyenda","Unknown","Unknown","Story","250 tk","Unknown","1st","Unknown",R.drawable.pandab_goyenda));
            lsBook.add(new Book("Prem omnibus","Sunil Gangopadhyay","Unknown","Romance","400 tk","Unknown","1st","Unknown",R.drawable.prem_omnibash));
            lsBook.add(new Book("Pather Panchali","Bibhutibhushan Bandyopadhyay","Unknown","Story","500 tk","1929","1st","Pather Panchali is a novel written by Bibhutibhushan Bandyopadhyay and was later adapted into a film of the same name by Satyajit Ray.",R.drawable.pather_panchali));

            lsBook.add(new Book("Deyal","humayun ahmed","Unknown","History","200 tk","2013","1st","Deyal is a Bengali political novel written by Humayun Ahmed. It is Ahmed's last book and is considered to be one of the best works by him.",R.drawable.deyal));
            lsBook.add(new Book("Gitanjali","Rabindranath Tagore","Macmillan Publishers","Other","300 tk","1910","1st","Gitanjali is a collection of poems by the Bengali poet Rabindranath Tagore. Tagore received the Nobel Prize for Literature, largely for the book. It is part of the UNESCO Collection of Representative Works.",R.drawable.gitanjali));
            lsBook.add(new Book("Ami Topu","Muhammed Zafar Iqbal","Unknown","Story","100 tk","2005","1st","Story of a teen age boy",R.drawable.ami_topu));
            lsBook.add(new Book("Pandab Goyenda","Unknown","Unknown","Story","250 tk","Unknown","1st","Unknown",R.drawable.pandab_goyenda));
            lsBook.add(new Book("Prem omnibus","Sunil Gangopadhyay","Unknown","Romance","400 tk","Unknown","1st","Unknown",R.drawable.prem_omnibash));
            lsBook.add(new Book("Pather Panchali","Bibhutibhushan Bandyopadhyay","Unknown","Story","500 tk","1929","1st","Pather Panchali is a novel written by Bibhutibhushan Bandyopadhyay and was later adapted into a film of the same name by Satyajit Ray.",R.drawable.pather_panchali));

            lsBook.add(new Book("Deyal","humayun ahmed","Unknown","History","200 tk","2013","1st","Deyal is a Bengali political novel written by Humayun Ahmed. It is Ahmed's last book and is considered to be one of the best works by him.",R.drawable.deyal));
            lsBook.add(new Book("Gitanjali","Rabindranath Tagore","Macmillan Publishers","Other","300 tk","1910","1st","Gitanjali is a collection of poems by the Bengali poet Rabindranath Tagore. Tagore received the Nobel Prize for Literature, largely for the book. It is part of the UNESCO Collection of Representative Works.",R.drawable.gitanjali));
            lsBook.add(new Book("Ami Topu","Muhammed Zafar Iqbal","Unknown","Story","100 tk","2005","1st","Story of a teen age boy",R.drawable.ami_topu));
            lsBook.add(new Book("Pandab Goyenda","Unknown","Unknown","Story","250 tk","Unknown","1st","Unknown",R.drawable.pandab_goyenda));
            lsBook.add(new Book("Prem omnibus","Sunil Gangopadhyay","Unknown","Romance","400 tk","Unknown","1st","Unknown",R.drawable.prem_omnibash));
            lsBook.add(new Book("Pather Panchali","Bibhutibhushan Bandyopadhyay","Unknown","Story","500 tk","1929","1st","Pather Panchali is a novel written by Bibhutibhushan Bandyopadhyay and was later adapted into a film of the same name by Satyajit Ray.",R.drawable.pather_panchali));



            RecyclerView myrv = (RecyclerView) findViewById(R.id.recycler_view);
            RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lsBook);
            myrv.setLayoutManager(new GridLayoutManager(this, 3));
            myrv.setAdapter(myAdapter);
        }
        else{
            if(!(getIntent().getExtras() == null)){
                lsBook_filtered = new ArrayList<>();
                Bundle bundle = getIntent().getExtras();
                lsBook_filtered = bundle.getParcelableArrayList("data");
                RecyclerView myrv = (RecyclerView) findViewById(R.id.recycler_view);
                RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lsBook_filtered);
                myrv.setLayoutManager(new GridLayoutManager(this, 3));
                myrv.setAdapter(myAdapter);
            }
        }


    }

    public void btnFuncHome(View view){
        drawerLayout.closeDrawer(GravityCompat.START, false);
        Toast.makeText(this, "btnFuncHome called", Toast.LENGTH_SHORT).show();
    }
    public void btnFuncCategory(View view){
        drawerLayout.closeDrawer(GravityCompat.START, false);
        Intent category_intent = new Intent(this, CategoryActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) lsBook);
        category_intent.putExtras(bundle);
        startActivity(category_intent);


    }
    public void btnFuncCart(View view){
        drawerLayout.closeDrawer(GravityCompat.START, false);
        Toast.makeText(this, "btnFuncCart called", Toast.LENGTH_SHORT).show();
    }
}
