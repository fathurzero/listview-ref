package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

     /*
     Menginisialisasi variablle object  (words) dengan ArrayList
    Step 1
      */
        ArrayList<String> words = new ArrayList<String>();
// Step 2  Menambahkan data
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
     /*
     Menginisialisasi ArrayAdapter dari var object (items Adapter) dengan menggunakan object data (words)
     Step 3
      */

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

     /*
     Step 4
     Menampilkan data (words) yang ada di variable object (itemsAdapter)
     ke dalam tampilan
     container ListView
      */
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

//        GridView gridView = (GridView)findViewById(R.id.list);
//        gridView.setAdapter(itemsAdapter);


    }


}
