package com.aaperteam.listadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create person objects
        Person john = new Person("John","10-10-10","Male");
        Person kathey = new Person("Kathey","10-10-10","Male");
        Person tony = new Person("Tony","10-10-10","Male");


        //Add person object to an ArrayList
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(john);
        peopleList.add(kathey);
        peopleList.add(tony);

        //Adapter for ArrayList
        PersonListAdapter adapter = new PersonListAdapter(this,R.layout.list_views,peopleList);
        mListView.setAdapter(adapter);
    }
}
