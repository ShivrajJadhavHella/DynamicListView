package com.example.dynamiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listItems=new ArrayList<String>();
    private int count = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mListView = (ListView) findViewById(R.id.list);

        Button button = findViewById(R.id.addBtn);
        listItems.add("Rohit");
        listItems.add("Virat");
        listItems.add("Dhawan");
        listItems.add("Bumrah");

        final String[] values = {"Rohit","Virat","Dhawan","Bumrah"};
        final ManageItemsAdapter adapter = new ManageItemsAdapter(this,listItems);

        mListView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                listItems.add("Count value is" + count);

                adapter.notifyDataSetChanged();


            }
        });
    }
}
