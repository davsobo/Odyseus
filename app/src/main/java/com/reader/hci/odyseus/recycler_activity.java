package com.reader.hci.odyseus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 10-Dec-16.
 */

public class recycler_activity extends AppCompatActivity {
    private RecyclerView rv;
    private List<Person> persons;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private LinearLayoutManager llm;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_xml_cardview);
        rv = (RecyclerView) findViewById(R.id.cv);
        rv.setHasFixedSize(true);

        //use a linear layout manager
        llm = new LinearLayoutManager(this);
        mLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
    }


    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.emma));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.lavery));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.lillie));
    }

    private void initializeAdapter(){
        MyAdapter adapter = new MyAdapter(persons);
        rv.setAdapter(adapter);
    }
}
